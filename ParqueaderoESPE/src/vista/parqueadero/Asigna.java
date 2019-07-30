/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.parqueadero;

import controlador.parqueadero.ControladorAsignacion;
import controlador.parqueadero.Validaciones;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.parqueadero.AsignacionDAO;
import modelo.parqueadero.AsignacionPlaza;

/**
 *
 * @author Cheshire
 */
public class Asigna extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    ArrayList<String> datosCliente = new ArrayList<>();
    Date date = new Date();
    Date hora = new Date();

    public Asigna() {
        initComponents();
        btnAsignaPlaza.setEnabled(false);
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
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        txtidCliente = new javax.swing.JTextField();
        txtUnidadTrabajo = new javax.swing.JTextField();
        btnAsignaPlaza = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnNuevaConsulta = new javax.swing.JButton();
        txtMovilidadReducida = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(853, 567));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(90, 90, 90));
        jPanel1.setForeground(new java.awt.Color(69, 69, 69));
        jPanel1.setMaximumSize(new java.awt.Dimension(853, 46));
        jPanel1.setPreferredSize(new java.awt.Dimension(853, 46));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/btnInicio.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setMaximumSize(new java.awt.Dimension(90, 46));
        jButton2.setMinimumSize(new java.awt.Dimension(90, 46));
        jButton2.setPreferredSize(new java.awt.Dimension(90, 46));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/btnEditar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setMaximumSize(new java.awt.Dimension(90, 46));
        jButton3.setMinimumSize(new java.awt.Dimension(90, 46));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/btnAsignar.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setMaximumSize(new java.awt.Dimension(90, 46));
        jButton4.setMinimumSize(new java.awt.Dimension(90, 46));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/btnBuscar.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setMaximumSize(new java.awt.Dimension(90, 46));
        jButton5.setMinimumSize(new java.awt.Dimension(90, 46));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/btnEliminar.png"))); // NOI18N
        jButton1.setAlignmentX(698.0F);
        jButton1.setAlignmentY(150.0F);
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton2.getAccessibleContext().setAccessibleName("btnInicio");
        jButton3.getAccessibleContext().setAccessibleName("btnEditar");
        jButton4.getAccessibleContext().setAccessibleName("btnAsignar");
        jButton5.getAccessibleContext().setAccessibleName("btnBuscar");
        jButton1.getAccessibleContext().setAccessibleName("btnEliminar");

        jLabel1.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel1.setText("Asignación de Parqueadero");

        jLabel2.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese CI");

        jLabel3.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel4.setText("Movilidad Reducida");

        jLabel5.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel5.setText("Unidad de Trabajo");

        txtNombreCliente.setEditable(false);
        txtNombreCliente.setBackground(new java.awt.Color(229, 229, 229));
        txtNombreCliente.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtNombreCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 5, true));
        txtNombreCliente.setPreferredSize(new java.awt.Dimension(364, 47));

        txtidCliente.setBackground(new java.awt.Color(229, 229, 229));
        txtidCliente.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtidCliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 5, true));
        txtidCliente.setPreferredSize(new java.awt.Dimension(364, 47));
        txtidCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidClienteKeyTyped(evt);
            }
        });

        txtUnidadTrabajo.setEditable(false);
        txtUnidadTrabajo.setBackground(new java.awt.Color(229, 229, 229));
        txtUnidadTrabajo.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtUnidadTrabajo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtUnidadTrabajo.setPreferredSize(new java.awt.Dimension(364, 47));

        btnAsignaPlaza.setBackground(new java.awt.Color(0, 107, 229));
        btnAsignaPlaza.setFont(new java.awt.Font("Lato", 0, 11)); // NOI18N
        btnAsignaPlaza.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        btnAsignaPlaza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/btnAsignarP.png"))); // NOI18N
        btnAsignaPlaza.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 229), 6, true));
        btnAsignaPlaza.setPreferredSize(new java.awt.Dimension(188, 25));
        btnAsignaPlaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignaPlazaActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnNuevaConsulta.setText("Nueva Consulta");
        btnNuevaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaConsultaActionPerformed(evt);
            }
        });

        txtMovilidadReducida.setEditable(false);
        txtMovilidadReducida.setBackground(new java.awt.Color(229, 229, 229));
        txtMovilidadReducida.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtMovilidadReducida.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtMovilidadReducida.setPreferredSize(new java.awt.Dimension(364, 47));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUnidadTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                    .addComponent(txtMovilidadReducida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1)))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(btnAsignaPlaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtidCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMovilidadReducida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUnidadTrabajo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btnAsignaPlaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("lblAsignar");
        jLabel2.getAccessibleContext().setAccessibleName("lblCI");
        jLabel3.getAccessibleContext().setAccessibleName("lblNombre");
        jLabel4.getAccessibleContext().setAccessibleName("lblMovilidad");
        jLabel5.getAccessibleContext().setAccessibleName("lblUnidad");
        txtNombreCliente.getAccessibleContext().setAccessibleName("txtNombre");
        txtidCliente.getAccessibleContext().setAccessibleName("txtCI");
        txtUnidadTrabajo.getAccessibleContext().setAccessibleName("txtUnidad");
        txtUnidadTrabajo.getAccessibleContext().setAccessibleDescription("");
        btnAsignaPlaza.getAccessibleContext().setAccessibleName("btnDesignar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void colocarDatos(ArrayList<String> datos) {
        txtNombreCliente.setText(datos.get(0) + " " + datos.get(1)); //Nombre
        if (datos.get(2).compareTo("S") == 1) {
            txtMovilidadReducida.setText("Si"); //Movilidad Reducida
        } else {
            txtMovilidadReducida.setText("No");
        }
        txtUnidadTrabajo.setText(datos.get(3)); //Unidad de Trabajo
    }

    public void validarSoloNumeros(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();
        if (!Character.isLetterOrDigit(validar) || !Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            //JOptionPane.showMessageDialog(rootPane, "No ingrese letras");
        }
    }

    private void limpiarDatos() {
        txtidCliente.setText("");//id
        txtNombreCliente.setText(""); //Nombre
        txtMovilidadReducida.setText(""); //Movilidad Reducida
        txtUnidadTrabajo.setText(""); //Unidad de Trabajo
    }
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        Validaciones validar = new Validaciones();
        String idCliente;
        ControladorAsignacion controladorAsignacion = new ControladorAsignacion();
        idCliente = txtidCliente.getText();
        //datosCliente = controladorAsignacion.obtenerDatosCliente(idCliente);
        //datosCliente.add(idCliente);
        //colocarDatos(datosCliente);
        if (validar.validarCampoCedula(idCliente)) {
            datosCliente = controladorAsignacion.obtenerDatosCliente(idCliente);
            datosCliente.add(idCliente);
            /*datosCliente.add("1");
             datosCliente.add("2");
             datosCliente.add("S");
             datosCliente.add("4");
             datosCliente.add("5");*/
            colocarDatos(datosCliente);
            btnAsignaPlaza.setEnabled(true);
            txtidCliente.setEditable(false);
        } else {
            txtidCliente.setText("");
        }


    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnNuevaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConsultaActionPerformed
        // TODO add your handling code here:
        limpiarDatos();
        datosCliente.clear();
        btnAsignaPlaza.setEnabled(false);
        txtidCliente.setEditable(true);
    }//GEN-LAST:event_btnNuevaConsultaActionPerformed

    private void btnAsignaPlazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignaPlazaActionPerformed
        // TODO add your handling code here:
        ControladorAsignacion nuevaAsignacion = new ControladorAsignacion();
        AsignacionDAO asignacion = new AsignacionDAO();
        ArrayList<String> datosAsignacion = new ArrayList<>();
        System.out.println(datosCliente);

        if (!datosCliente.isEmpty()) {
            datosAsignacion = asignacion.asignarPlaza(datosCliente);
            System.out.println(datosAsignacion);
            JOptionPane.showMessageDialog(null, "Seccion: " + datosAsignacion.get(0) + "\nLugar: Edicio " + datosAsignacion.get(1) + "\nN° de Plaza: " + datosAsignacion.get(2));
            asignacion.cambiarDisponibilidad(datosAsignacion.get(2));
            DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy");
            DateFormat houri = new SimpleDateFormat("HH:mm:ss");
            System.out.println("Hora y fecha: " + hourdateFormat.format(date));
            System.out.println("Hora y fecha: " + houri.format(hora));
            asignacion.insertarAsignacion(asignacion.obtenerPlazasAsignadas(), datosCliente.get(3), Integer.valueOf(datosAsignacion.get(2)), date, hora);
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese el ID del usuario");
        }


    }//GEN-LAST:event_btnAsignaPlazaActionPerformed

    private void txtidClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidClienteKeyTyped
        // TODO add your handling code here:
        validarSoloNumeros(evt);
    }//GEN-LAST:event_txtidClienteKeyTyped

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
            java.util.logging.Logger.getLogger(Asigna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Asigna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Asigna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Asigna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Asigna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAsignaPlaza;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnNuevaConsulta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMovilidadReducida;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtUnidadTrabajo;
    private javax.swing.JTextField txtidCliente;
    // End of variables declaration//GEN-END:variables
}
