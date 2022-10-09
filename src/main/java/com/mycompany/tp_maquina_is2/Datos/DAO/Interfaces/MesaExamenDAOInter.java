/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.tp_maquina_is2.Datos.DAO.Interfaces;

import com.mycompany.tp_maquina_is2.Logica.Transferencia.MesaExamen;
import java.util.HashMap;

/**
 *
 * @author ivanb
 */
public interface MesaExamenDAOInter {

    public boolean create(MesaExamen mesaExamen);

    public HashMap<Integer, MesaExamen> read();

    public boolean update(int codigo, MesaExamen mesaExamen);

    public boolean delete(int codigo);
}
