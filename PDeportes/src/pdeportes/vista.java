/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pdeportes;

import java.lang.System.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mi pc
 */
public final class vista extends javax.swing.JFrame {

    //PDeportes Deportes = new PDeportes();
    PDeportes clase;
    int contador = 0;

    /**
     * Creates new form vista
     */
    public vista() {
        initComponents();
        llenarEstatura();
        llenarPeso();
    }

    public void llenarEstatura() {
        for (int i = 1; i <= 200; i++) {
            estatura.addItem(String.valueOf(i));
        }
    }

    public void llenarPeso() {
        for (int i = 0; i <= 400; i++) {
            peso.addItem(String.valueOf(i));
        }
    }

    /* Metodo para error de mensaje */
    public void mensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /*Metodo para mostrar en la tabla*/
    public void mostrarEnTabla() {
        DefaultTableModel tabla = (DefaultTableModel) TablaDeportes.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        masculino = new javax.swing.JRadioButton();
        femenino = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        estatura = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeportes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        nacimiento = new com.toedter.calendar.JDateChooser();
        peso = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tam = new javax.swing.JTextField();
        mostrarEnTabla = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        guardarEnArreglo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(60, 135, 56));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SELECCION NACIONAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 670, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha de nacimiento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sexo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));

        masculino.setBackground(new java.awt.Color(60, 135, 56));
        buttonGroup1.add(masculino);
        masculino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        masculino.setForeground(new java.awt.Color(0, 0, 0));
        masculino.setText("M");
        jPanel1.add(masculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        femenino.setBackground(new java.awt.Color(60, 135, 56));
        buttonGroup1.add(femenino);
        femenino.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        femenino.setForeground(new java.awt.Color(0, 0, 0));
        femenino.setText("F");
        jPanel1.add(femenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Estatura (cm)");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, -1));

        estatura.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        estatura.setForeground(new java.awt.Color(0, 0, 0));
        estatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estaturaActionPerformed(evt);
            }
        });
        jPanel1.add(estatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(462, 130, 80, -1));

        TablaDeportes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TablaDeportes.setForeground(new java.awt.Color(0, 0, 0));
        TablaDeportes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Sexo", "Estatura", "Peso", "Deporte"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaDeportes);
        if (TablaDeportes.getColumnModel().getColumnCount() > 0) {
            TablaDeportes.getColumnModel().getColumn(0).setResizable(false);
            TablaDeportes.getColumnModel().getColumn(1).setResizable(false);
            TablaDeportes.getColumnModel().getColumn(2).setResizable(false);
            TablaDeportes.getColumnModel().getColumn(3).setResizable(false);
            TablaDeportes.getColumnModel().getColumn(4).setResizable(false);
            TablaDeportes.getColumnModel().getColumn(5).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 650, 250));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Peso (Kg)");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));
        jPanel1.add(nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 120, -1));

        peso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        peso.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(562, 130, 80, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cant. Personas:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));
        jPanel1.add(tam, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 80, -1));

        mostrarEnTabla.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mostrarEnTabla.setForeground(new java.awt.Color(0, 0, 0));
        mostrarEnTabla.setText("Mostrar los Seleccionados");
        mostrarEnTabla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostrarEnTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarEnTablaActionPerformed(evt);
            }
        });
        jPanel1.add(mostrarEnTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        jButton3.setText("Asignar");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        guardarEnArreglo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        guardarEnArreglo.setForeground(new java.awt.Color(0, 0, 0));
        guardarEnArreglo.setText("Inscribir");
        guardarEnArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarEnArregloActionPerformed(evt);
            }
        });
        jPanel1.add(guardarEnArreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void estaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estaturaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Guardar Tama??o
        try {
            int tama??o = Integer.parseInt(tam.getText());
            clase = new PDeportes(tama??o);
            tam.setEnabled(false);
        } catch (Exception e) {
            mensajeError("Complete el campo para continuar");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void mostrarEnTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarEnTablaActionPerformed
        //Mostar en la tabla el arreglo guardado previamente
        DefaultTableModel actualModel = (DefaultTableModel) TablaDeportes.getModel();

        actualModel.setRowCount(0);

        for (int i = 0; i < clase.getNroelementos(); i++) {

            if (clase.getNombre(i) == null || clase.getPeso(i) == 0 || clase.getEdad(i) == 0 || clase.getEstatura(i) == 0 || clase.getSexo(i) == null || clase.getDeporte(i) == null) {
                continue;
            }

            Object[] datosParticipantes = new Object[6];

            /*Nombre*/
            datosParticipantes[0] = clase.getNombre(i);
            /*Edad*/
            datosParticipantes[1] = clase.getEdad(i);
            /*Sexo*/
            datosParticipantes[2] = clase.getSexo(i);
            /*Estatura*/
            datosParticipantes[3] = clase.getEstatura(i);
            /*Peso*/
            datosParticipantes[4] = clase.getPeso(i);
            /*Deporte*/
            datosParticipantes[5] = clase.getDeporte(i);

            actualModel.addRow(datosParticipantes);
        }

        TablaDeportes.setModel(actualModel);
    }//GEN-LAST:event_mostrarEnTablaActionPerformed

    private void guardarEnArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarEnArregloActionPerformed
        try {
            if (contador < clase.getNroelementos()) {
                /*Guardar nombre*/
                String name = nombre.getText();
                clase.setNombre(name, contador);

                /*Guardar el sexo*/
                String sex;
                if (masculino.isSelected()) {
                    sex = "M";
                } else {
                    sex = "F";
                }
                clase.setSexo(sex, contador);

                /*Guardar Edad*/
                int edad = clase.edadPersona(nacimiento.getDate());
                clase.setEdad(edad, contador);

                /*Guardar Estatura*/
                int est = Integer.parseInt(estatura.getSelectedItem().toString());
                clase.setEstatura(est, contador);

                /*Guardar Peso*/
                int pes = Integer.parseInt(peso.getSelectedItem().toString());
                clase.setPeso(pes, contador);

                /*Guardar Deporte*/
                String deporte = clase.evaluarAdmitidos(contador);
                clase.setDeporte(deporte, contador);

                contador++;
                
                nombre.setText("");
               
                
            } else {
                mensajeError("Los campos estan completados.");
            }
        } catch (Exception e) {
            mensajeError("Faltan campos por completar.");
        }
    }//GEN-LAST:event_guardarEnArregloActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDeportes;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> estatura;
    private javax.swing.JRadioButton femenino;
    private javax.swing.JButton guardarEnArreglo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton masculino;
    private javax.swing.JButton mostrarEnTabla;
    private com.toedter.calendar.JDateChooser nacimiento;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> peso;
    private javax.swing.JTextField tam;
    // End of variables declaration//GEN-END:variables
}
