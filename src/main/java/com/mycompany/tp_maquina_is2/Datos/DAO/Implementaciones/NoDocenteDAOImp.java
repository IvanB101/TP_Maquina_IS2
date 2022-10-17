/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_maquina_is2.Datos.DAO.Implementaciones;

import com.mycompany.tp_maquina_is2.Datos.Conexion;
import com.mycompany.tp_maquina_is2.Datos.DAO.Interfaces.NoDocenteDAOInter;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.NoDocente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author ivanb
 */
public class NoDocenteDAOImp implements NoDocenteDAOInter {

    Conexion conexion;

    public NoDocenteDAOImp(Conexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean create(NoDocente noDocente) {
        try {
            Connection con = conexion.getConnection();
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO Persona (codigo, dni, nombre, apellido) VALUES (?,?,?,?)");

            ps.setString(1, noDocente.getCodigo());
            ps.setInt(2, noDocente.getDni());
            ps.setString(3, noDocente.getNombre());
            ps.setString(4, noDocente.getApellido());

            ps.executeUpdate();
            ps = con.prepareStatement("INSERT INTO NoDocente (nroLegajo, Persona_codigo) VALUES (?,?)");

            ps.setInt(1, noDocente.getNroLegajo());
            ps.setString(2, noDocente.getCodigo());

            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }

        return true;
    }

    @Override
    public HashMap<Integer, NoDocente> read() {
        HashMap<Integer, NoDocente> noDocentes = new HashMap<>();

        try {
            Connection con = conexion.getConnection();
            
            PreparedStatement ps = con.prepareStatement("SELECT nroLegajo, codigo, nombre, apellido,"
                    + " dni FROM NoDocente, Persona WHERE Persona_codigo = codigo");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                noDocentes.put(rs.getInt("nroLegajo"), new NoDocente(
                        rs.getInt("nroLegajo"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getInt("dni")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }

        return noDocentes;
    }

    @Override
    public boolean update(int nroLegajo, NoDocente noDocente) {
        if (delete(nroLegajo)) {
            return create(noDocente);
        }

        return false;
    }

    @Override
    public boolean delete(int nroLegajo) {
        PreparedStatement ps;
        String codigo = "n" + nroLegajo;
        // Control existencia del consumo con código a eliminar
        try {
            Connection con = conexion.getConnection();
            
            ps = con.prepareStatement("SELECT * FROM Persona WHERE codigo=?");
            ps.setString(1, codigo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            rs.getString(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No hay ningún noDocente cargado con el código: " + codigo);
        }

        try {
            Connection con = conexion.getConnection();
            
            ps = con.prepareStatement("DELETE FROM Persona WHERE codigo=?");
            ps.setString(1, codigo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "El noDocente no puede ser eliminado");
            return false;
        }

        return true;
    }

}
