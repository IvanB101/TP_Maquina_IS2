/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.tp_maquina_is2.Interfaces.Paneles.Estudiante;

import com.mycompany.tp_maquina_is2.Logica.Excepciones.ManagementException;
import com.mycompany.tp_maquina_is2.Logica.Managers.ExamenManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.PlanEstudiosManager;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.Examen;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.Experiencia;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan_
 */
public class AgregarExpPanel extends javax.swing.JPanel {

    private int nroRegistro;
    private int caso;

    /**
     * Creates new form AgregarExpPanel
     */
    public AgregarExpPanel(int nroRegistro) {
        this.nroRegistro = nroRegistro;
        initComponents();
        TablaExamenes.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        TablaExamenes.getTableHeader().setOpaque(true);
        TablaExamenes.getTableHeader().setBackground(new Color(0, 153, 153));
        TablaExamenes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.getViewport().setBackground(new Color(255, 255, 255)); //tabla color blanc
        this.PanelDatosExp.setVisible(false);
        this.BotConfirmarBorrar.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        panelExamRendidos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaExamenes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BotConfirmarBorrar = new javax.swing.JButton();
        AgregarButton = new javax.swing.JPanel();
        estudianteBL = new javax.swing.JLabel();
        EliminarButton = new javax.swing.JPanel();
        estudianteBL1 = new javax.swing.JLabel();
        ModificarButton = new javax.swing.JPanel();
        estudianteBL2 = new javax.swing.JLabel();
        PanelDatosExp = new javax.swing.JPanel();
        SliderDif = new javax.swing.JSlider();
        SliderDedi = new javax.swing.JSlider();
        DificultadL = new javax.swing.JLabel();
        DificultadL1 = new javax.swing.JLabel();
        DificultadL2 = new javax.swing.JLabel();
        ConfirmarDatosExp = new javax.swing.JButton();
        Datos = new javax.swing.JLabel();
        DatosDed = new javax.swing.JLabel();
        DiasDeEstudio = new javax.swing.JTextField();

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setPreferredSize(new java.awt.Dimension(920, 500));

        panelExamRendidos.setBackground(new java.awt.Color(255, 255, 255));

        TablaExamenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaExamenes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaExamenes.setFocusable(false);
        TablaExamenes.setRowHeight(25);
        TablaExamenes.setSelectionBackground(new java.awt.Color(118, 35, 47));
        TablaExamenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaExamenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaExamenes);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Lista de Examenes");

        BotConfirmarBorrar.setBackground(new java.awt.Color(255, 0, 0));
        BotConfirmarBorrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BotConfirmarBorrar.setText("Borrar Experiencia");
        BotConfirmarBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotConfirmarBorrarActionPerformed(evt);
            }
        });

        AgregarButton.setBackground(new java.awt.Color(118, 35, 47));
        AgregarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AgregarButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        AgregarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarButtonMouseExited(evt);
            }
        });

        estudianteBL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        estudianteBL.setForeground(new java.awt.Color(255, 255, 255));
        estudianteBL.setText("Agregar");
        estudianteBL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout AgregarButtonLayout = new javax.swing.GroupLayout(AgregarButton);
        AgregarButton.setLayout(AgregarButtonLayout);
        AgregarButtonLayout.setHorizontalGroup(
            AgregarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estudianteBL)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        AgregarButtonLayout.setVerticalGroup(
            AgregarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estudianteBL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        EliminarButton.setBackground(new java.awt.Color(118, 35, 47));
        EliminarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EliminarButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        EliminarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EliminarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EliminarButtonMouseExited(evt);
            }
        });

        estudianteBL1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        estudianteBL1.setForeground(new java.awt.Color(255, 255, 255));
        estudianteBL1.setText("Eliminar");
        estudianteBL1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout EliminarButtonLayout = new javax.swing.GroupLayout(EliminarButton);
        EliminarButton.setLayout(EliminarButtonLayout);
        EliminarButtonLayout.setHorizontalGroup(
            EliminarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estudianteBL1)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        EliminarButtonLayout.setVerticalGroup(
            EliminarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EliminarButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estudianteBL1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ModificarButton.setBackground(new java.awt.Color(118, 35, 47));
        ModificarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ModificarButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        ModificarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ModificarButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ModificarButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ModificarButtonMouseExited(evt);
            }
        });

        estudianteBL2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        estudianteBL2.setForeground(new java.awt.Color(255, 255, 255));
        estudianteBL2.setText("Modificar");
        estudianteBL2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout ModificarButtonLayout = new javax.swing.GroupLayout(ModificarButton);
        ModificarButton.setLayout(ModificarButtonLayout);
        ModificarButtonLayout.setHorizontalGroup(
            ModificarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estudianteBL2)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        ModificarButtonLayout.setVerticalGroup(
            ModificarButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ModificarButtonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estudianteBL2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelExamRendidosLayout = new javax.swing.GroupLayout(panelExamRendidos);
        panelExamRendidos.setLayout(panelExamRendidosLayout);
        panelExamRendidosLayout.setHorizontalGroup(
            panelExamRendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExamRendidosLayout.createSequentialGroup()
                .addGroup(panelExamRendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelExamRendidosLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(panelExamRendidosLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelExamRendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelExamRendidosLayout.createSequentialGroup()
                                .addComponent(AgregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(EliminarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ModificarButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExamRendidosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BotConfirmarBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        panelExamRendidosLayout.setVerticalGroup(
            panelExamRendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExamRendidosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelExamRendidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AgregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModificarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EliminarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotConfirmarBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        PanelDatosExp.setBackground(new java.awt.Color(255, 255, 255));

        SliderDif.setMaximum(10);
        SliderDif.setValue(5);
        SliderDif.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SliderDif.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderDifStateChanged(evt);
            }
        });

        SliderDedi.setMaximum(10);
        SliderDedi.setValue(5);
        SliderDedi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SliderDedi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SliderDediStateChanged(evt);
            }
        });

        DificultadL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DificultadL.setText("Dificultad:");

        DificultadL1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DificultadL1.setText("Días de Estudio:");

        DificultadL2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DificultadL2.setText("Dedicación:");

        ConfirmarDatosExp.setBackground(new java.awt.Color(102, 255, 102));
        ConfirmarDatosExp.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ConfirmarDatosExp.setText("Confirmar Experiencia");
        ConfirmarDatosExp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ConfirmarDatosExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarDatosExpActionPerformed(evt);
            }
        });

        Datos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Datos.setPreferredSize(new java.awt.Dimension(20, 10));

        DatosDed.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DatosDed.setPreferredSize(new java.awt.Dimension(20, 15));

        DiasDeEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiasDeEstudioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDatosExpLayout = new javax.swing.GroupLayout(PanelDatosExp);
        PanelDatosExp.setLayout(PanelDatosExpLayout);
        PanelDatosExpLayout.setHorizontalGroup(
            PanelDatosExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosExpLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(PanelDatosExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosExpLayout.createSequentialGroup()
                        .addGroup(PanelDatosExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DificultadL, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DificultadL1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DificultadL2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(PanelDatosExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelDatosExpLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(DiasDeEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelDatosExpLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelDatosExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SliderDedi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SliderDif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ConfirmarDatosExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(115, 115, 115))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosExpLayout.createSequentialGroup()
                        .addComponent(DatosDed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDatosExpLayout.createSequentialGroup()
                        .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))))
        );
        PanelDatosExpLayout.setVerticalGroup(
            PanelDatosExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDatosExpLayout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(PanelDatosExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DificultadL)
                    .addComponent(SliderDif, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Datos, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelDatosExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DiasDeEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DificultadL1))
                .addGap(37, 37, 37)
                .addGroup(PanelDatosExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DificultadL2)
                    .addComponent(SliderDedi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DatosDed, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConfirmarDatosExp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(panelExamRendidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDatosExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelExamRendidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelDatosExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmarDatosExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarDatosExpActionPerformed
        int diasEstudio = 0;
        try {
            diasEstudio = Integer.parseInt(DiasDeEstudio.getText().trim());
            int dificultad = SliderDif.getValue();
            int dedicacion = SliderDedi.getValue();
            String codExamen = (String) TablaExamenes.getValueAt(TablaExamenes.getSelectedRow(), 0);
            if(caso==1){
                ExamenManager.agregarExperiencia(new Experiencia(dificultad, diasEstudio, dedicacion, codExamen));
                JOptionPane.showMessageDialog(null, "Experiencia cargada exitosamente!.");
                LlenarTablaExamenesSinExp();
            }else{
                ExamenManager.ModificarExperiencia(codExamen,new Experiencia(dificultad, diasEstudio, dedicacion, codExamen));
                JOptionPane.showMessageDialog(null, "Experiencia modificada exitosamente!.");
                LlenarTablaExamenesConExp();
            }

        } catch (ManagementException | HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_ConfirmarDatosExpActionPerformed

    private void SliderDifStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderDifStateChanged
        Datos.setText(String.valueOf(SliderDif.getValue()));
    }//GEN-LAST:event_SliderDifStateChanged

    private void SliderDediStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SliderDediStateChanged
        DatosDed.setText(String.valueOf(SliderDedi.getValue()));
    }//GEN-LAST:event_SliderDediStateChanged

    private void DiasDeEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiasDeEstudioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiasDeEstudioActionPerformed

    private void TablaExamenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaExamenesMouseClicked
        if(caso==1 || caso==3){
            PanelDatosExp.setVisible(true);
        }
    }//GEN-LAST:event_TablaExamenesMouseClicked

    private void BotConfirmarBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotConfirmarBorrarActionPerformed
        String codExamen = (String) TablaExamenes.getValueAt(TablaExamenes.getSelectedRow(), 0);
        try{
        ExamenManager.EliminarExperiencia(codExamen);
        JOptionPane.showMessageDialog(null, "Experiencia eliminada exitosamente!.");
        }catch (ManagementException | HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        LlenarTablaExamenesConExp();
        
    }//GEN-LAST:event_BotConfirmarBorrarActionPerformed

    private void AgregarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarButtonMouseClicked
        BotConfirmarBorrar.setVisible(false);
        PanelDatosExp.setVisible(true);
        LlenarTablaExamenesSinExp();
        caso=1;
    }//GEN-LAST:event_AgregarButtonMouseClicked

    private void AgregarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarButtonMouseEntered

    private void AgregarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarButtonMouseExited

    private void EliminarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarButtonMouseClicked
        PanelDatosExp.setVisible(false);
        BotConfirmarBorrar.setVisible(true);
        LlenarTablaExamenesConExp();
        caso=2;
    }//GEN-LAST:event_EliminarButtonMouseClicked

    private void EliminarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarButtonMouseEntered

    private void EliminarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarButtonMouseExited

    private void ModificarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarButtonMouseClicked
        BotConfirmarBorrar.setVisible(false);
        PanelDatosExp.setVisible(true);
        LlenarTablaExamenesConExp();
        caso=3;
    }//GEN-LAST:event_ModificarButtonMouseClicked

    private void ModificarButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarButtonMouseEntered

    private void ModificarButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ModificarButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarButtonMouseExited

    public void LlenarTablaExamenesSinExp() {
        try {
            ArrayList<Examen> examenes = ExamenManager.examenesEstudianteSinExp(nroRegistro);
            DefaultTableModel modelo = (DefaultTableModel) TablaExamenes.getModel();
            modelo.setRowCount(0);
            for (Examen examen : examenes) {
                if (examen.getExperiencia() == null) {
                    String[]datos = examen.getCodHistoriaAcademica().split("-");
                    modelo.addRow(new Object[]{examen.getCodigo(),
                        PlanEstudiosManager.buscarMateria(examen.getCodMateria(), datos[1]).getNombre(),
                        examen.getFecha().toString()});
                }
            }
        } catch (ManagementException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

        public void LlenarTablaExamenesConExp() {
        try {
            TablaExamenes.repaint();
            ArrayList<Examen> examenes = ExamenManager.examenesEstudiante(nroRegistro);
            DefaultTableModel modelo = (DefaultTableModel) TablaExamenes.getModel();
            for (Examen examen : examenes) {
                if (examen.getExperiencia() != null) {
                    String[]datos = examen.getCodHistoriaAcademica().split("-");
                    
                    modelo.addRow(new Object[]{examen.getCodigo(),
                        PlanEstudiosManager.buscarMateria(examen.getCodMateria(), datos[1]).getNombre(),
                        examen.getFecha().toString(),examen.getExperiencia().getDificultad(),examen.getExperiencia().getDias(),examen.getExperiencia().getDedicacion()});
                }
            }
        } catch (ManagementException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AgregarButton;
    private javax.swing.JButton BotConfirmarBorrar;
    private javax.swing.JButton ConfirmarDatosExp;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JLabel Datos;
    private javax.swing.JLabel DatosDed;
    private javax.swing.JTextField DiasDeEstudio;
    private javax.swing.JLabel DificultadL;
    private javax.swing.JLabel DificultadL1;
    private javax.swing.JLabel DificultadL2;
    private javax.swing.JPanel EliminarButton;
    private javax.swing.JPanel ModificarButton;
    private javax.swing.JPanel PanelDatosExp;
    private javax.swing.JSlider SliderDedi;
    private javax.swing.JSlider SliderDif;
    private javax.swing.JTable TablaExamenes;
    private javax.swing.JLabel estudianteBL;
    private javax.swing.JLabel estudianteBL1;
    private javax.swing.JLabel estudianteBL2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelExamRendidos;
    // End of variables declaration//GEN-END:variables
}
