/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_maquina_is2.Datos.DAO.Implementaciones;

import com.mycompany.tp_maquina_is2.Datos.Conexion;
import com.mycompany.tp_maquina_is2.Datos.DAO.Interfaces.MateriaDAOInter;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author ginopaoletti
 */
public class MateriaDAOImp implements MateriaDAOInter {

    Conexion conexion;

    public MateriaDAOImp(Conexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public boolean create(Materia materia) {
        try {
            Connection con = conexion.getConnection();
            
            PreparedStatement ps = con.prepareStatement("INSERT INTO Materia (codigo, nombre, PlanEstudios_codigo) VALUES (?,?,?)");
            ps.setInt(1, materia.getCodigo());
            ps.setString(2, materia.getNombre());
            ps.setString(3, materia.getCodPlanDeEstudios());

            ps.executeUpdate();

            if (!materia.getCorrelativas().isEmpty()) {
                for (int k = 0; k < materia.getCorrelativas().size(); k++) {
                    ps = con.prepareStatement("INSERT INTO Correlativas (correlativa_codigo, materia_codigo) VALUES (?,?)");
                    ps.setInt(1, materia.getCorrelativas().get(k).getCodigo());
                    ps.setInt(2, materia.getCodigo());
                    ps.executeUpdate();
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public HashMap<Integer, Materia> read() {
        HashMap<Integer, Materia> materias = new HashMap();//todas las mat de todos los planes
        ArrayList<Integer> codCorrelativas = new ArrayList(); // todos los codigos de las correlativas
        try {
            Connection con = conexion.getConnection();
            
            // Carga de las materias sin sus correlativas
            PreparedStatement ps = con.prepareStatement("SELECT * from Materia");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                materias.put(rs.getInt("codigo"), new Materia(
                        rs.getInt("codigo"),
                        rs.getString("nombre"),
                        rs.getString("PlanEstudios_codigo"),
                        new ArrayList()));
            }

            // Carga de las correlativas de cada materia
            ps = con.prepareStatement("SELECT * from Correlativas");
            rs = ps.executeQuery();
            while (rs.next()) {
                materias.get(rs.getInt("Materia_codigo")).getCorrelativas().add(materias.get(rs.getInt("Correlativa_codigo")));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return materias;
    }

    @Override
    public boolean update(int codigo, Materia materia) {
        if (delete(codigo)) {
            return create(materia);
        }

        return false;
    }

    @Override
    public boolean delete(int codigo) {
        PreparedStatement ps;
        try {
            Connection con = conexion.getConnection();
            
            ps = con.prepareStatement("SELECT * FROM Materia WHERE codigo=?");
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            rs.next();
            rs.getString(1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No hay ninguna Materia cargada con el código: " + codigo);
        }

        try {
            Connection con = conexion.getConnection();
            
            ps = con.prepareStatement("DELETE FROM Materia WHERE codigo=?");
            ps.setInt(1, codigo);
            ps.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }

        return true;
    }

    public ArrayList<Materia> buscarMat(Materia[] materias, ArrayList<Integer> codigos) {
        ArrayList<Materia> correlativas = new ArrayList();
        for (int i = 0; i < materias.length; i++) {
            for (int j = 0; i < codigos.size(); j++) {
                if (materias[i].getCodigo() == codigos.get(j)) {
                    correlativas.add(materias[i]);
                }
            }
        }
        return correlativas;
    }
}
