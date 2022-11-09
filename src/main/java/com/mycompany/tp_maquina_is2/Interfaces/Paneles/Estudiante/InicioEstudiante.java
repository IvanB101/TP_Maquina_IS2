/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.tp_maquina_is2.Interfaces.Paneles.Estudiante;

import com.mycompany.tp_maquina_is2.Datos.Conexion;
import com.mycompany.tp_maquina_is2.Logica.Excepciones.ManagementException;
import com.mycompany.tp_maquina_is2.Logica.Managers.EstudianteManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.ExamenManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.HistoriaAcademicaManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.PlanEstudiosManager;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.Estudiante;
import com.mycompany.tp_maquina_is2.Logica.Util.ArchivosManager;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ivanb
 */
public class InicioEstudiante extends javax.swing.JPanel {

    private Estudiante user;
    private String codPlan;

    /**
     * Creates new form Inicio
     */
    public InicioEstudiante(Estudiante user, String codPlan) {
        this.user = user;
        this.codPlan = codPlan;
        
        initComponents();

        try {
            Conexion conn = Conexion.getInstance();

            // Inicializacion de Managers
            ExamenManager.init(conn);
            EstudianteManager.init(conn);
            HistoriaAcademicaManager.init(conn);
            PlanEstudiosManager.init(conn);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema conectando a la Base de Datos");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Archivo = new javax.swing.JFileChooser();
        Cambiable = new javax.swing.JPanel();
        PrincipalL = new javax.swing.JLabel();
        PrincipalL1 = new javax.swing.JLabel();
        MenuTop = new javax.swing.JPanel();
        insertButtonP = new javax.swing.JPanel();
        insertButtonL = new javax.swing.JLabel();
        deleteButtonP = new javax.swing.JPanel();
        deleteButtonL = new javax.swing.JLabel();
        tablesButtonP = new javax.swing.JPanel();
        tablesButtonL = new javax.swing.JLabel();
        AñadirExp = new javax.swing.JPanel();
        queryButtonL = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cambiable.setBackground(new java.awt.Color(255, 255, 255));
        Cambiable.setPreferredSize(new java.awt.Dimension(950, 500));
        Cambiable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PrincipalL.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        PrincipalL.setText("Bienvenido al sistema de asistencia universitaria");
        Cambiable.add(PrincipalL, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 60, -1, 37));

        PrincipalL1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        PrincipalL1.setText("Seleccione la operacion que desee realizar");
        Cambiable.add(PrincipalL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 103, 419, 45));

        add(Cambiable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 62, 920, 560));

        MenuTop.setBackground(new java.awt.Color(118, 35, 47));
        MenuTop.setToolTipText("");
        MenuTop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MenuTopMouseDragged(evt);
            }
        });
        MenuTop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuTopMousePressed(evt);
            }
        });
        MenuTop.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        insertButtonP.setBackground(new java.awt.Color(118, 35, 47));
        insertButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        insertButtonP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        insertButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertButtonPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertButtonPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertButtonPMouseExited(evt);
            }
        });

        insertButtonL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        insertButtonL.setForeground(new java.awt.Color(255, 255, 255));
        insertButtonL.setText("Cargar historia academica");
        insertButtonL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout insertButtonPLayout = new javax.swing.GroupLayout(insertButtonP);
        insertButtonP.setLayout(insertButtonPLayout);
        insertButtonPLayout.setHorizontalGroup(
            insertButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertButtonPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertButtonL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insertButtonPLayout.setVerticalGroup(
            insertButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertButtonPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertButtonL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuTop.add(insertButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 230, -1));

        deleteButtonP.setBackground(new java.awt.Color(118, 35, 47));
        deleteButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deleteButtonP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        deleteButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteButtonPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteButtonPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteButtonPMouseExited(evt);
            }
        });

        deleteButtonL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deleteButtonL.setForeground(new java.awt.Color(255, 255, 255));
        deleteButtonL.setText("Ver Lista Finales");
        deleteButtonL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout deleteButtonPLayout = new javax.swing.GroupLayout(deleteButtonP);
        deleteButtonP.setLayout(deleteButtonPLayout);
        deleteButtonPLayout.setHorizontalGroup(
            deleteButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteButtonPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteButtonL, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );
        deleteButtonPLayout.setVerticalGroup(
            deleteButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteButtonPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(deleteButtonL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuTop.add(deleteButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 160, -1));

        tablesButtonP.setBackground(new java.awt.Color(118, 35, 47));
        tablesButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablesButtonP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        tablesButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablesButtonPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tablesButtonPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tablesButtonPMouseExited(evt);
            }
        });

        tablesButtonL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tablesButtonL.setForeground(new java.awt.Color(255, 255, 255));
        tablesButtonL.setText("Estadisticas");
        tablesButtonL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout tablesButtonPLayout = new javax.swing.GroupLayout(tablesButtonP);
        tablesButtonP.setLayout(tablesButtonPLayout);
        tablesButtonPLayout.setHorizontalGroup(
            tablesButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesButtonPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablesButtonL)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        tablesButtonPLayout.setVerticalGroup(
            tablesButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesButtonPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablesButtonL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuTop.add(tablesButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 120, -1));

        AñadirExp.setBackground(new java.awt.Color(118, 35, 47));
        AñadirExp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AñadirExp.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        AñadirExp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AñadirExpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AñadirExpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AñadirExpMouseExited(evt);
            }
        });

        queryButtonL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        queryButtonL.setForeground(new java.awt.Color(255, 255, 255));
        queryButtonL.setText("Añadir Experiencia examen");
        queryButtonL.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout AñadirExpLayout = new javax.swing.GroupLayout(AñadirExp);
        AñadirExp.setLayout(AñadirExpLayout);
        AñadirExpLayout.setHorizontalGroup(
            AñadirExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AñadirExpLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(queryButtonL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );
        AñadirExpLayout.setVerticalGroup(
            AñadirExpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AñadirExpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(queryButtonL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        MenuTop.add(AñadirExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 250, -1));

        add(MenuTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void insertButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonPMouseClicked
        int returnVal = Archivo.showOpenDialog(this);
        if (returnVal == Archivo.APPROVE_OPTION) {
            File file = Archivo.getSelectedFile();
            try {
                ArchivosManager.cargarHistoriaAcademica(user.getNroRegistro(),this.codPlan, file);

                JOptionPane.showMessageDialog(null, "Historia cargada correctamente");
            } catch (ManagementException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } else {
        }
    }//GEN-LAST:event_insertButtonPMouseClicked

    private void changePane(JPanel jPanel) {
        Cambiable.setLayout(new java.awt.CardLayout());
        Cambiable.removeAll();
        Cambiable.add(jPanel);
        Cambiable.revalidate();
        Cambiable.repaint();
    }
    
    private void insertButtonPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_insertButtonPMouseEntered

    private void insertButtonPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_insertButtonPMouseExited

    private void deleteButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonPMouseClicked
        changePane(new ListaPanel(user.getNroRegistro(), codPlan));
    }//GEN-LAST:event_deleteButtonPMouseClicked

    private void deleteButtonPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonPMouseEntered

    private void deleteButtonPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonPMouseExited

    private void tablesButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesButtonPMouseClicked
        JOptionPane.showMessageDialog(null, "En construccion");
    }//GEN-LAST:event_tablesButtonPMouseClicked

    private void tablesButtonPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesButtonPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tablesButtonPMouseEntered

    private void tablesButtonPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesButtonPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tablesButtonPMouseExited

    private void AñadirExpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirExpMouseClicked
        changePane(new ABMExpPanel(user.getNroRegistro()));
    }//GEN-LAST:event_AñadirExpMouseClicked

    private void AñadirExpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirExpMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AñadirExpMouseEntered

    private void AñadirExpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirExpMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AñadirExpMouseExited

    private void MenuTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTopMouseDragged

    }//GEN-LAST:event_MenuTopMouseDragged

    private void MenuTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTopMousePressed

    }//GEN-LAST:event_MenuTopMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser Archivo;
    private javax.swing.JPanel AñadirExp;
    private javax.swing.JPanel Cambiable;
    private javax.swing.JPanel MenuTop;
    private javax.swing.JLabel PrincipalL;
    private javax.swing.JLabel PrincipalL1;
    private javax.swing.JLabel deleteButtonL;
    private javax.swing.JPanel deleteButtonP;
    private javax.swing.JLabel insertButtonL;
    private javax.swing.JPanel insertButtonP;
    private javax.swing.JLabel queryButtonL;
    private javax.swing.JLabel tablesButtonL;
    private javax.swing.JPanel tablesButtonP;
    // End of variables declaration//GEN-END:variables
}
