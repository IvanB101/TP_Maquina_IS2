/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.tp_maquina_is2.Interfaces.Paneles.Estudiante;

import com.mycompany.tp_maquina_is2.Logica.Excepciones.ManagementException;
import com.mycompany.tp_maquina_is2.Logica.Managers.MesaManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.PlanEstudiosManager;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.Estudiante;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.Materia;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.MesaExamen;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan_
 */
public class InscripcionPanel extends javax.swing.JPanel {

    private int nroRegistro;
    private String codPlanEstudios;
    private String codMateria;

    /**
     * Creates new form ListaPanel
     */
    public InscripcionPanel(int nroRegistro, String codPlanEstudios,String codMateria,boolean ver) {
        this.nroRegistro = nroRegistro;
        this.codPlanEstudios = codPlanEstudios;
        this.codMateria= codMateria;
        initComponents();
        TablaMesasInscriptas.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        TablaMesasInscriptas.getTableHeader().setOpaque(true);
        TablaMesasInscriptas.getTableHeader().setBackground(new Color(0, 153, 153));
        jScrollPane1.getViewport().setBackground(new Color(255, 255, 255)); //tabla color blanco
        TablaInscriptos.getTableHeader().setReorderingAllowed(false);
        TablaInscriptos.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        TablaInscriptos.getTableHeader().setOpaque(true);
        TablaInscriptos.getTableHeader().setBackground(new Color(0, 153, 153));
        jScrollPane2.getViewport().setBackground(new Color(255, 255, 255)); //tabla color blanco
        TablaInscriptos.getTableHeader().setReorderingAllowed(false);
        if(!ver){
         AltaInscripcion();}
        LlenarTablas();
    }

    

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelCambiable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMesasInscriptas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaInscriptos = new javax.swing.JTable();
        jLabelMesasInscriptos = new javax.swing.JLabel();
        jLabelMesasInscriptos1 = new javax.swing.JLabel();
        jLabelExamenInscripto = new javax.swing.JLabel();
        nombreMateria = new javax.swing.JLabel();

        PanelCambiable.setBackground(new java.awt.Color(255, 255, 255));
        PanelCambiable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaMesasInscriptas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TURNO", "AÑO", "NOMBRE", "COD MATERIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaMesasInscriptas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaMesasInscriptas.setFocusable(false);
        TablaMesasInscriptas.setRowHeight(25);
        TablaMesasInscriptas.setSelectionBackground(new java.awt.Color(118, 35, 47));
        TablaMesasInscriptas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMesasInscriptasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaMesasInscriptas);
        if (TablaMesasInscriptas.getColumnModel().getColumnCount() > 0) {
            TablaMesasInscriptas.getColumnModel().getColumn(0).setResizable(false);
            TablaMesasInscriptas.getColumnModel().getColumn(1).setResizable(false);
            TablaMesasInscriptas.getColumnModel().getColumn(2).setResizable(false);
            TablaMesasInscriptas.getColumnModel().getColumn(3).setResizable(false);
        }

        PanelCambiable.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 330, 330));

        TablaInscriptos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRE", "APELLIDO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaInscriptos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaInscriptos.setFocusable(false);
        TablaInscriptos.setRowHeight(25);
        TablaInscriptos.setSelectionBackground(new java.awt.Color(118, 35, 47));
        TablaInscriptos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaInscriptosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaInscriptos);
        if (TablaInscriptos.getColumnModel().getColumnCount() > 0) {
            TablaInscriptos.getColumnModel().getColumn(0).setResizable(false);
            TablaInscriptos.getColumnModel().getColumn(1).setResizable(false);
        }

        PanelCambiable.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 330));

        jLabelMesasInscriptos.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        jLabelMesasInscriptos.setText("Si selecciona uno se eliminara la inscripcion");
        PanelCambiable.add(jLabelMesasInscriptos, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 330, -1));

        jLabelMesasInscriptos1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabelMesasInscriptos1.setText("Examenes a los cuales esta inscripto:");
        PanelCambiable.add(jLabelMesasInscriptos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 310, -1));

        jLabelExamenInscripto.setFont(new java.awt.Font("Segoe UI Semibold", 1, 16)); // NOI18N
        jLabelExamenInscripto.setText("Estudiantes que rendiran el examen de: ");
        PanelCambiable.add(jLabelExamenInscripto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        nombreMateria.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        PanelCambiable.add(nombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelCambiable, javax.swing.GroupLayout.DEFAULT_SIZE, 913, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelCambiable, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMesasInscriptasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMesasInscriptasMouseClicked
        switch (JOptionPane.showConfirmDialog(this, "Esta seguro de que desea borrar la inscripcion a la mesa (materia: "
                + TablaMesasInscriptas.getValueAt(TablaMesasInscriptas.getSelectedRow(), 2)+")")){
            case JOptionPane.OK_OPTION:
        try {
            MesaManager.deleteInscripcion(codPlanEstudios,String.valueOf(TablaMesasInscriptas.getValueAt(TablaMesasInscriptas.getSelectedRow(),3)), nroRegistro);
            JOptionPane.showMessageDialog(null, "Inscripcion eliminada correctamente!");
            DefaultTableModel modelo = (DefaultTableModel)TablaMesasInscriptas.getModel();
            modelo.removeRow(TablaMesasInscriptas.getSelectedRow());
            TablaMesasInscriptas.setModel(modelo);
        } catch (ManagementException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        break;
        }

    }//GEN-LAST:event_TablaMesasInscriptasMouseClicked

    private void TablaInscriptosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaInscriptosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaInscriptosMouseClicked

    public void AltaInscripcion(){ 
        // TODO SELECCIONAR TURNO Y ANIO MESA
        String codigo=codPlanEstudios+"-"+codMateria+"-"+String.valueOf(LocalDate.now().getYear())+"-"+"12";
        try{
            MesaManager.agregarMesa(new MesaExamen(12,2022,codMateria,codPlanEstudios));
        } catch (ManagementException ex){}
        try {
            MesaManager.añadirInscripcion(codigo,nroRegistro);
        } catch (ManagementException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void LlenarTablas(){
        Materia materiaaux=null;
        try {
            materiaaux = PlanEstudiosManager.buscarMateria(codMateria, codPlanEstudios);
            nombreMateria.setText(materiaaux.getNombre());
        } catch (ManagementException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        String codigo=codPlanEstudios+"-"+codMateria+"-"+String.valueOf(LocalDate.now().getYear())+"-"+"12";
        try {
            ArrayList<Estudiante> estudiantes = MesaManager.obtenerInscriptosMesa(codigo);
            DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }};
            modelo.setRowCount(0);
            modelo.addColumn("NOMBRE");
            modelo.addColumn("APELLIDO");   
            for (Estudiante estudiante : estudiantes) {
                modelo.addRow(new Object[]{estudiante.getNombre(),estudiante.getApellido()});
            }
            TablaInscriptos.setModel(modelo);
        } catch (ManagementException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        try {
            ArrayList<MesaExamen> mesas = MesaManager.obtenerMesasEstudiante(nroRegistro);
            DefaultTableModel modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }};
            modelo.setRowCount(0);
            modelo.addColumn("TURNO");
            modelo.addColumn("AÑO");
            modelo.addColumn("NOMBRE"); 
            modelo.addColumn("COD MATERIA"); 
            for (MesaExamen mesa : mesas) {
                try {
                    materiaaux = PlanEstudiosManager.buscarMateria(mesa.getCodMateria(), mesa.getCodPlanEstudios());
                    } catch (ManagementException ex) {
                        JOptionPane.showMessageDialog(null, ex.getMessage());}
                modelo.addRow(new Object[]{mesa.getTurno(),mesa.getAnio(),materiaaux.getNombre(),mesa.getCodMateria()});
            }
            TablaMesasInscriptas.setModel(modelo);
        } catch (ManagementException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCambiable;
    private javax.swing.JTable TablaInscriptos;
    private javax.swing.JTable TablaMesasInscriptas;
    private javax.swing.JLabel jLabelExamenInscripto;
    private javax.swing.JLabel jLabelMesasInscriptos;
    private javax.swing.JLabel jLabelMesasInscriptos1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nombreMateria;
    // End of variables declaration//GEN-END:variables
}
