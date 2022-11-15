/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tp_maquina_is2.Interfaces;

import com.mycompany.tp_maquina_is2.Datos.Conexion;
import com.mycompany.tp_maquina_is2.Logica.Managers.EstudianteManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.ExamenManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.HistoriaAcademicaManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.MesaManager;
import com.mycompany.tp_maquina_is2.Logica.Managers.PlanEstudiosManager;
import com.mycompany.tp_maquina_is2.Logica.Transferencia.Estudiante;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ivanb tebo y tebiense
 */
public class Principal extends javax.swing.JFrame {

    //private Estudiante user = new Estudiante(3026224, "Franco", "Sarubbi", 44330220);
    //private Estudiante user = new Estudiante(3026225, "Ivan", "Brocas", 44330220);
    //private Estudiante user = new Estudiante(3026223, "Luciana", "Loyola", 44330220);
    private Estudiante user = new Estudiante(3027222, "Maximiliano", "Lopez", 44320210);
    //private Estudiante user = new Estudiante(3026222, "Santiago", "Polliti", 44330220);
    //private Estudiante user = new Estudiante(3010820, "Gino", "Paoletti", 44075067);
    //private Estudiante user = new Estudiante(3026220, "Juan", "Sanchez", 44330220);
    //private Estudiante user = new Estudiante(3026221, "Bianca", "Calderoni", 44330220);
    private String codPlan = "26/12";
    private int xMouse, yMouse;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
         this.setResizable(false);

        try {
            Conexion conn = Conexion.getInstance();

            // Inicializacion de Managers
            ExamenManager.init(conn);
            EstudianteManager.init(conn);
            HistoriaAcademicaManager.init(conn);
            PlanEstudiosManager.init(conn);
            MesaManager.init(conn);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha habido un problema conectando a la Base de Datos");
        }
        
        changePane(new InicioPrincipal(user, codPlan));
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
        Cambiable = new javax.swing.JPanel();

        Archivo.setCurrentDirectory(new java.io.File("C:\\Users\\juan_\\Desktop"));
        Archivo.setDialogTitle("Seleccionar Historia Academica");
        Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenedor.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cambiable.setBackground(new java.awt.Color(255, 255, 255));
        Cambiable.setPreferredSize(new java.awt.Dimension(950, 500));
        Cambiable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Contenedor.add(Cambiable, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 610));

        getContentPane().add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changePane(JPanel jPanel) {
        Cambiable.setLayout(new java.awt.CardLayout());
        Cambiable.removeAll();
        Cambiable.add(jPanel);
        Cambiable.revalidate();
        Cambiable.repaint();
    }

    private void ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoActionPerformed

    }//GEN-LAST:event_ArchivoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser Archivo;
    private javax.swing.JPanel Cambiable;
    private javax.swing.JPanel Contenedor;
    // End of variables declaration//GEN-END:variables
}
