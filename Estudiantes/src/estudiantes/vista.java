/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estudiantes;

import javax.swing.JOptionPane;

/**
 *
 * @author mi pc
 */
public class vista extends javax.swing.JFrame {

    Estudiantes estudiantes;
    ListaEstudiante listaEstudiantes;
    int numest = 0;
    int contador = 0;

    public vista() {
        initComponents();
    }

    public void mensajeError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tcodigo = new javax.swing.JTextField();
        tnombre = new javax.swing.JTextField();
        tmateria = new javax.swing.JTextField();
        tnota = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        mostrar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        tamano = new javax.swing.JTextField();
        Asignar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(52, 136, 41));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Estudiantes");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 580, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 70));

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 400, 200));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Materia:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nota:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));
        jPanel1.add(tcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 90, -1));
        jPanel1.add(tnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 100, -1));
        jPanel1.add(tmateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 90, -1));
        jPanel1.add(tnota, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 100, -1));

        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        jPanel1.add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        jPanel1.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, -1, -1));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));
        jPanel1.add(tamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 80, -1));

        Asignar.setText("Asignar");
        Asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarActionPerformed(evt);
            }
        });
        jPanel1.add(Asignar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Tamaño:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        if (numest < listaEstudiantes.getTam()) {
            try {
                int cod = Integer.parseInt(tcodigo.getText());
                float note = Float.parseFloat(tnota.getText());
                String materia = tmateria.getText();
                String name = tnombre.getText();

                if (listaEstudiantes.validarEstudiantes(cod, numest) == false) {
                    
                    if (note >= 0 && note <= 5) {
                        listaEstudiantes.setEstudiantes(cod, name, materia, note, contador);
                        
                        
                        tcodigo.setText("");
                        tnota.setText("");
                        tmateria.setText("");
                        tnombre.setText("");
                        

                        numest++;
                        contador++;

                    } else {
                        mensajeError("El valor de la nota no esta en un rango valido");
                    }
                } else {
                    mensajeError("El codigo ya existe");
                }

            } catch (Exception e) {
                mensajeError("Hubo un error \n Revise la informacion ingresada");
            }
        } else {
            mensajeError("Lista completa, no puede agregar mas datos");
        }
    }//GEN-LAST:event_registrarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try {
            int cod = Integer.parseInt(tcodigo.getText());
            int pos = listaEstudiantes.buscarEstudiante(cod, numest);

            if (pos != -1) {
                String nom = listaEstudiantes.getEstudiate(pos).getNombre();
                tnombre.setText(nom);
                String mat = listaEstudiantes.getEstudiate(pos).getMateria();
                tmateria.setText(mat);
                float nota = listaEstudiantes.getEstudiate(pos).getNota();
                tnota.setText(Float.toString(nota));
            } else {
                mensajeError("No se encontro al estudiante con el codigo digitado.");
            }

        } catch (Exception e) {
            mensajeError("El valor ingresado en el codigo es invalido.");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        tmateria.setText("");
        tnombre.setText("");
        tnota.setText("");
        tcodigo.setText("");

        for (int i = 0; i < numest; i++) {
            textArea.append(i + "--> " + listaEstudiantes.getEstudiate(i).getCodigo() + "  "+ listaEstudiantes.getEstudiate(i).getNombre() +"  " + listaEstudiantes.getEstudiate(i).getMateria() + "  " + listaEstudiantes.getEstudiate(i).getNota() + " .\n");
        }

    }//GEN-LAST:event_mostrarActionPerformed

    private void AsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarActionPerformed
        int tam = Integer.parseInt(tamano.getText());
        listaEstudiantes = new ListaEstudiante(tam);
        tamano.setEnabled(false);
    }//GEN-LAST:event_AsignarActionPerformed

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
    private javax.swing.JButton Asignar;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mostrar;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField tamano;
    private javax.swing.JTextField tcodigo;
    private javax.swing.JTextArea textArea;
    private javax.swing.JTextField tmateria;
    private javax.swing.JTextField tnombre;
    private javax.swing.JTextField tnota;
    // End of variables declaration//GEN-END:variables

    private void JOptionPaneShowMessage(String texto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
