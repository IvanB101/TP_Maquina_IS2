/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tp_maquina_is2.Datos.DAO.Interfaces;

import com.mycompany.tp_maquina_is2.Logica.Transferencia.HistoriaAcademica;

/**
 *
 * @author ivanb
 */
public interface HistoriaAcademicaDAOInter {

    public boolean create(HistoriaAcademica historiaAcademica);

    public HistoriaAcademica read(int nroRegistro, String codPlanEstudios);

    public boolean update(int codigo, String codPlanEstudios, HistoriaAcademica historiaAcademica);

    public boolean delete(int codigo, String codPlanEstudios);

}
