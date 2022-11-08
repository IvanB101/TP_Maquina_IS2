/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.tp_maquina_is2.Interfaces.Paneles.Estudiante;

import com.mycompany.tp_maquina_is2.Logica.Excepciones.ManagementException;
import com.mycompany.tp_maquina_is2.Logica.Managers.HistoriaAcademicaManager;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.Materia;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

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
    public InscripcionPanel(int nroRegistro, String codPlanEstudios,String codMateria) {
        this.nroRegistro = nroRegistro;
        this.codPlanEstudios = codPlanEstudios;
        this.codMateria= codMateria;
        initComponents();
        TablaMaterias.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        TablaMaterias.getTableHeader().setOpaque(true);
        TablaMaterias.getTableHeader().setBackground(new Color(0, 153, 153));
        jScrollPane1.getViewport().setBackground(new Color(255, 255, 255)); //tabla color blanco
        TablaMaterias.getTableHeader().setReorderingAllowed(false);
        //doy aceptar
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
        TablaMaterias = new javax.swing.JTable();
        Inscripcion = new javax.swing.JPanel();
        estudianteBL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaMaterias1 = new javax.swing.JTable();

        PanelCambiable.setBackground(new java.awt.Color(255, 255, 255));
        PanelCambiable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TURNO", "AÑO", "MATERIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaMaterias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaMaterias.setFocusable(false);
        TablaMaterias.setRowHeight(25);
        TablaMaterias.setSelectionBackground(new java.awt.Color(118, 35, 47));
        TablaMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaMaterias);
        if (TablaMaterias.getColumnModel().getColumnCount() > 0) {
            TablaMaterias.getColumnModel().getColumn(0).setResizable(false);
            TablaMaterias.getColumnModel().getColumn(1).setResizable(false);
            TablaMaterias.getColumnModel().getColumn(2).setResizable(false);
        }

        PanelCambiable.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 330, 330));

        Inscripcion.setBackground(new java.awt.Color(118, 35, 47));
        Inscripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Inscripcion.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Inscripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InscripcionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InscripcionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InscripcionMouseExited(evt);
            }
        });

        estudianteBL.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        estudianteBL.setForeground(new java.awt.Color(255, 255, 255));
        estudianteBL.setText("Inscribirse a examen");
        estudianteBL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout InscripcionLayout = new javax.swing.GroupLayout(Inscripcion);
        Inscripcion.setLayout(InscripcionLayout);
        InscripcionLayout.setHorizontalGroup(
            InscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estudianteBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InscripcionLayout.setVerticalGroup(
            InscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InscripcionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estudianteBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelCambiable.add(Inscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        TablaMaterias1.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaMaterias1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaMaterias1.setFocusable(false);
        TablaMaterias1.setRowHeight(25);
        TablaMaterias1.setSelectionBackground(new java.awt.Color(118, 35, 47));
        TablaMaterias1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMaterias1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaMaterias1);
        if (TablaMaterias1.getColumnModel().getColumnCount() > 0) {
            TablaMaterias1.getColumnModel().getColumn(0).setResizable(false);
            TablaMaterias1.getColumnModel().getColumn(1).setResizable(false);
        }

        PanelCambiable.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 330, 330));

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

    private void TablaMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMateriasMouseClicked

    }//GEN-LAST:event_TablaMateriasMouseClicked

    private void InscripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InscripcionMouseClicked
       
    }//GEN-LAST:event_InscripcionMouseClicked

    private void InscripcionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InscripcionMouseEntered

    }//GEN-LAST:event_InscripcionMouseEntered

    private void InscripcionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InscripcionMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_InscripcionMouseExited

    private void TablaMaterias1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMaterias1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaMaterias1MouseClicked

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Inscripcion;
    private javax.swing.JPanel PanelCambiable;
    private javax.swing.JTable TablaMaterias;
    private javax.swing.JTable TablaMaterias1;
    private javax.swing.JLabel estudianteBL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
