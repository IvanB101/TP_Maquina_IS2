/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package com.mycompany.tp_maquina_is2.Interfaces;

import com.mycompany.tp_maquina_is2.Interfaces.Paneles.Estudiante.InicioEstudiante;
import com.mycompany.tp_maquina_is2.Interfaces.Paneles.NoDocente.InicioNoDocente;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.Estudiante;
import javax.swing.JPanel;

/**
 *
 * @author ivanb
 */
public class InicioPrincipal extends javax.swing.JPanel {

    private Estudiante user;
    private String codPlan;
    /** Creates new form Inicio */
    public InicioPrincipal(Estudiante user, String codPlan) {
        this.user = user;
        this.codPlan = codPlan;
        
        initComponents();
    }
    
    private void changePane(JPanel jPanel) {
        contenedor.setLayout(new java.awt.CardLayout());
        contenedor.removeAll();
        contenedor.add(jPanel);
        contenedor.revalidate();
        contenedor.repaint();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        estudianteBP = new javax.swing.JPanel();
        estudianteBL = new javax.swing.JLabel();
        noDocenteBP = new javax.swing.JPanel();
        noDocenteBL = new javax.swing.JLabel();

        contenedor.setBackground(new java.awt.Color(255, 255, 255));
        contenedor.setPreferredSize(new java.awt.Dimension(950, 500));
        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        estudianteBP.setBackground(new java.awt.Color(118, 35, 47));
        estudianteBP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        estudianteBP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        estudianteBP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estudianteBPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                estudianteBPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                estudianteBPMouseExited(evt);
            }
        });

        estudianteBL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        estudianteBL.setForeground(new java.awt.Color(255, 255, 255));
        estudianteBL.setText("Estudiante");
        estudianteBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout estudianteBPLayout = new javax.swing.GroupLayout(estudianteBP);
        estudianteBP.setLayout(estudianteBPLayout);
        estudianteBPLayout.setHorizontalGroup(
            estudianteBPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estudianteBPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estudianteBL)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        estudianteBPLayout.setVerticalGroup(
            estudianteBPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(estudianteBPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estudianteBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenedor.add(estudianteBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, -1));

        noDocenteBP.setBackground(new java.awt.Color(118, 35, 47));
        noDocenteBP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        noDocenteBP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        noDocenteBP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noDocenteBPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                noDocenteBPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                noDocenteBPMouseExited(evt);
            }
        });

        noDocenteBL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        noDocenteBL.setForeground(new java.awt.Color(255, 255, 255));
        noDocenteBL.setText("NoDocente");
        noDocenteBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout noDocenteBPLayout = new javax.swing.GroupLayout(noDocenteBP);
        noDocenteBP.setLayout(noDocenteBPLayout);
        noDocenteBPLayout.setHorizontalGroup(
            noDocenteBPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noDocenteBPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noDocenteBL)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        noDocenteBPLayout.setVerticalGroup(
            noDocenteBPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(noDocenteBPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(noDocenteBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contenedor.add(noDocenteBP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 921, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 921, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void estudianteBPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudianteBPMouseClicked
        changePane(new InicioEstudiante(user, codPlan));
    }//GEN-LAST:event_estudianteBPMouseClicked

    private void estudianteBPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudianteBPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_estudianteBPMouseEntered

    private void estudianteBPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudianteBPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_estudianteBPMouseExited

    private void noDocenteBPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noDocenteBPMouseClicked
        changePane(new InicioNoDocente());
    }//GEN-LAST:event_noDocenteBPMouseClicked

    private void noDocenteBPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noDocenteBPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_noDocenteBPMouseEntered

    private void noDocenteBPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noDocenteBPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_noDocenteBPMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel estudianteBL;
    private javax.swing.JPanel estudianteBP;
    private javax.swing.JLabel noDocenteBL;
    private javax.swing.JPanel noDocenteBP;
    // End of variables declaration//GEN-END:variables

}
