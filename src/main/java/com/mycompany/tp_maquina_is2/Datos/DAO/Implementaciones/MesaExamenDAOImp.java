/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tp_maquina_is2.Datos.DAO.Implementaciones;

import com.mycompany.tp_maquina_is2.Datos.Conexion;
import com.mycompany.tp_maquina_is2.Datos.DAO.Interfaces.MesaExamenDAOInter;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.MesaExamen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ivanb
 */
public class MesaExamenDAOImp implements MesaExamenDAOInter {

    Conexion conexion;

    public MesaExamenDAOImp(Conexion conexion) {
        this.conexion = conexion;
    }

    @Override
    public void create(MesaExamen mesaExamen) throws SQLException {
        Connection con = conexion.getConnection();

        PreparedStatement ps = con.prepareStatement("INSERT INTO MesaExamen (Materia_PlanEstudios_codigo, turno, anio, Materia_codigo) VALUES (?,?,?,?)");

        ps.setString(1, mesaExamen.getCodPlanEstudios());
        ps.setInt(2, mesaExamen.getTurno());
        ps.setInt(3, mesaExamen.getAnio());
        ps.setString(4, mesaExamen.getCodMateria());

        ps.executeUpdate();
    }

    @Override
    public MesaExamen read(String codigo) throws SQLException {
        ArrayList<Integer> nroInscriptos = new ArrayList();

        String[] datos = codigo.split("-");
        String codPlanEstudios = datos[0], codMateria = datos[1];
        int anio = Integer.parseInt(datos[2]), turno = Integer.parseInt(datos[3]);

        Connection con = conexion.getConnection();

        PreparedStatement ps = con.prepareStatement("SELECT * "
                + "FROM MesaExamen "
                + "WHERE turno=? AND anio=? AND Materia_codigo=? "
                + "AND Materia_PlanEstudios_codigo=?");
        ps.setInt(1, turno);
        ps.setInt(2, anio);
        ps.setString(3, codMateria);
        ps.setString(4, codPlanEstudios);

        ResultSet rs = ps.executeQuery();

        rs.next();
        rs.getInt("turno");

        ps = con.prepareStatement("SELECT FROM Inscripcion "
                + "WHERE MesaExamen_turno=? AND MesaExamen_anio=? AND MesaExamen_Materia_codigo=? "
                + "AND MesaExamen_Materia_PlanEstudios_codigo=?");
        ps.setInt(1, turno);
        ps.setInt(2, anio);
        ps.setString(3, codMateria);
        ps.setString(4, codPlanEstudios);

        rs = ps.executeQuery();
        
        while(rs.next()) {
            nroInscriptos.add(rs.getInt("Estudiante_nroRegistro"));
        }

        return new MesaExamen(turno, anio, nroInscriptos, codMateria, codPlanEstudios);
    }

    @Override
    public void update(String codigo, MesaExamen mesaExamen) throws SQLException {
    }

    @Override
    public void delete(String codigo) throws SQLException {
        String[] datos = codigo.split("-");
        String codPlanEstudios = datos[0], codMateria = datos[1];
        int anio = Integer.parseInt(datos[2]), turno = Integer.parseInt(datos[3]);

        Connection con = conexion.getConnection();

        PreparedStatement ps = con.prepareStatement("DELETE FROM MesaExamen "
                + "WHERE turno=? AND anio=? AND Materia_codigo=? "
                + "AND Materia_PlanEstudios_codigo=?");
        ps.setInt(1, turno);
        ps.setInt(2, anio);
        ps.setString(3, codMateria);
        ps.setString(4, codPlanEstudios);
        
        ps.executeUpdate();
    }
    
    public void createInscripcion(String codigo, int nroRegistro) {
        // TODO
    }
    
    public void deleteInscricion(String codigo, int nroRegistro) {
        // TODO
    }

}
