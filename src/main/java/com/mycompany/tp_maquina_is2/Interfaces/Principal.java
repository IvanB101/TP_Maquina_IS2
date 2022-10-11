/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tp_maquina_is2.Interfaces;

import com.mycompany.tp_maquina_is2.Datos.Conexion;
import com.mycompany.tp_maquina_is2.Interfaces.Paneles.AgregarExpPanel;
import com.mycompany.tp_maquina_is2.Interfaces.Paneles.ListaPanel;
import com.mycompany.tp_maquina_is2.Logica.Managers.EstudianteManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.ExamenManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.HistoriaAcademicaManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.MateriaManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.PlanEstudiosManager;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.Estudiante;
import com.mycompany.tp_maquina_is2.Logica.Util.Excel;
import java.awt.Color;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ivanb
 */
public class Principal extends javax.swing.JFrame {
    private static final String DB_NAME = "finalDB";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/" + DB_NAME;
    private static final String DB_USER = "postgres";
    private static final String DB_PWD = "gino";
    private Conexion conn;
    Estudiante userprueba=new Estudiante(3010820,"Gino","Paoletti",44075067);
    private int xMouse, yMouse;
    
    

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.conn = new Conexion(DB_NAME, DB_URL, DB_USER, DB_PWD);

        try {
            // Conexion con la base de datos
            conn.getInstance();
        } catch (SQLException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        MateriaManager.init(conn);
        ExamenManager.init(conn);
        EstudianteManager.init(conn);
        HistoriaAcademicaManager.init(conn);
        PlanEstudiosManager.init(conn);
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
        Contenedor = new javax.swing.JPanel();
        MenuTop = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        insertButtonP = new javax.swing.JPanel();
        insertButtonL = new javax.swing.JLabel();
        deleteButtonP = new javax.swing.JPanel();
        deleteButtonL = new javax.swing.JLabel();
        tablesButtonP = new javax.swing.JPanel();
        tablesButtonL = new javax.swing.JLabel();
        AñadirExp = new javax.swing.JPanel();
        queryButtonL = new javax.swing.JLabel();
        closeButtonP = new javax.swing.JPanel();
        closeButtonL = new javax.swing.JLabel();
        Cambiable = new javax.swing.JPanel();
        PrincipalL = new javax.swing.JLabel();
        PrincipalL1 = new javax.swing.JLabel();

        Archivo.setCurrentDirectory(new java.io.File("C:\\Users\\juan_\\Desktop"));
        Archivo.setDialogTitle("Seleccionar Historia Academica");
        Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));

        MenuTop.setBackground(new java.awt.Color(0, 153, 153));
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

        titulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setText("Sistema de asistencia universitaria");
        MenuTop.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 18, 410, -1));

        insertButtonP.setBackground(new java.awt.Color(0, 153, 153));
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
        insertButtonL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        MenuTop.add(insertButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 230, -1));

        deleteButtonP.setBackground(new java.awt.Color(0, 153, 153));
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
        deleteButtonL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        MenuTop.add(deleteButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 160, -1));

        tablesButtonP.setBackground(new java.awt.Color(0, 153, 153));
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
        tablesButtonL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout tablesButtonPLayout = new javax.swing.GroupLayout(tablesButtonP);
        tablesButtonP.setLayout(tablesButtonPLayout);
        tablesButtonPLayout.setHorizontalGroup(
            tablesButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesButtonPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablesButtonL)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        tablesButtonPLayout.setVerticalGroup(
            tablesButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablesButtonPLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tablesButtonL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        MenuTop.add(tablesButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 120, -1));

        AñadirExp.setBackground(new java.awt.Color(0, 153, 153));
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
        queryButtonL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        MenuTop.add(AñadirExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 250, -1));

        closeButtonP.setBackground(new java.awt.Color(0, 153, 153));
        closeButtonP.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        closeButtonP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonPMouseExited(evt);
            }
        });

        closeButtonL.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        closeButtonL.setForeground(new java.awt.Color(255, 255, 255));
        closeButtonL.setText("x");

        javax.swing.GroupLayout closeButtonPLayout = new javax.swing.GroupLayout(closeButtonP);
        closeButtonP.setLayout(closeButtonPLayout);
        closeButtonPLayout.setHorizontalGroup(
            closeButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeButtonPLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(closeButtonL))
        );
        closeButtonPLayout.setVerticalGroup(
            closeButtonPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closeButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        MenuTop.add(closeButtonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 50, 50));

        Cambiable.setBackground(new java.awt.Color(255, 255, 255));

        PrincipalL.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        PrincipalL.setText("Bienvenido al sistema de asistencia universitaria");

        PrincipalL1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        PrincipalL1.setText("Seleccione la operacion que desee realizar");

        javax.swing.GroupLayout CambiableLayout = new javax.swing.GroupLayout(Cambiable);
        Cambiable.setLayout(CambiableLayout);
        CambiableLayout.setHorizontalGroup(
            CambiableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiableLayout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addGroup(CambiableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PrincipalL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PrincipalL1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CambiableLayout.setVerticalGroup(
            CambiableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiableLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(PrincipalL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PrincipalL1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(332, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ContenedorLayout = new javax.swing.GroupLayout(Contenedor);
        Contenedor.setLayout(ContenedorLayout);
        ContenedorLayout.setHorizontalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Cambiable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        ContenedorLayout.setVerticalGroup(
            ContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorLayout.createSequentialGroup()
                .addComponent(MenuTop, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Cambiable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void changePane(JPanel jPanel) {
        Cambiable.setLayout(new java.awt.CardLayout());
        Cambiable.removeAll();
        Cambiable.add(jPanel);
        Cambiable.revalidate();
        Cambiable.repaint();
    }
    private void insertButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonPMouseClicked
       int returnVal = Archivo.showOpenDialog(this);
        if (returnVal == Archivo.APPROVE_OPTION){
        File file = Archivo.getSelectedFile();
        archivoExcel(file);
        }
        else{
            JOptionPane.showMessageDialog(null, "Accion cancelada por el usuario");
        }
    }//GEN-LAST:event_insertButtonPMouseClicked
        
    
    private void insertButtonPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_insertButtonPMouseEntered

    private void insertButtonPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertButtonPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_insertButtonPMouseExited

    private void deleteButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonPMouseClicked
        changePane(new ListaPanel(3010820));
    }//GEN-LAST:event_deleteButtonPMouseClicked

    private void deleteButtonPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonPMouseEntered

    private void deleteButtonPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteButtonPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonPMouseExited

    private void tablesButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesButtonPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablesButtonPMouseClicked

    private void tablesButtonPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesButtonPMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tablesButtonPMouseEntered

    private void tablesButtonPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablesButtonPMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tablesButtonPMouseExited

    private void AñadirExpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirExpMouseClicked
       changePane(new AgregarExpPanel(userprueba.getNroRegistro()));
    }//GEN-LAST:event_AñadirExpMouseClicked

    private void AñadirExpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirExpMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_AñadirExpMouseEntered

    private void AñadirExpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AñadirExpMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_AñadirExpMouseExited

    private void closeButtonPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonPMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeButtonPMouseClicked

    private void closeButtonPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonPMouseEntered
        closeButtonP.setBackground(Color.red);
    }//GEN-LAST:event_closeButtonPMouseEntered

    private void closeButtonPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonPMouseExited
       closeButtonP.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_closeButtonPMouseExited

    private void MenuTopMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTopMouseDragged
        int x = evt.getXOnScreen(), y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MenuTopMouseDragged

    private void MenuTopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTopMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MenuTopMousePressed

    private void ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoActionPerformed
        }

        public void archivoExcel(File file){
            if(file.getName().equals("historia_academica.xls")){
                JOptionPane.showMessageDialog(null, "Archivo seleccionado correctamente!");
                Excel.cargarHistoriaAcademica(userprueba.getNroRegistro(),"32/12", file);
            }else{
                JOptionPane.showMessageDialog(null, "Archivo seleccionado invalido");
            }
    }//GEN-LAST:event_ArchivoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser Archivo;
    private javax.swing.JPanel AñadirExp;
    private javax.swing.JPanel Cambiable;
    private javax.swing.JPanel Contenedor;
    private javax.swing.JPanel MenuTop;
    private javax.swing.JLabel PrincipalL;
    private javax.swing.JLabel PrincipalL1;
    private javax.swing.JLabel closeButtonL;
    private javax.swing.JPanel closeButtonP;
    private javax.swing.JLabel deleteButtonL;
    private javax.swing.JPanel deleteButtonP;
    private javax.swing.JLabel insertButtonL;
    private javax.swing.JPanel insertButtonP;
    private javax.swing.JLabel queryButtonL;
    private javax.swing.JLabel tablesButtonL;
    private javax.swing.JPanel tablesButtonP;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
