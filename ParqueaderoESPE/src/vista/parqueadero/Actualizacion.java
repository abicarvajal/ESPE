/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.parqueadero;

import controlador.parqueadero.CRUD;
import controlador.parqueadero.ControladorArchivos;
import controlador.parqueadero.ControladorAsignacion;
import java.util.ArrayList;
import modelo.parqueadero.Cliente;
import controlador.parqueadero.Validaciones;
import javax.swing.JOptionPane;

/**
 *
 * @author Cheshire
 */
public class Actualizacion extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Actualizacion() {
        initComponents();
        noPermitirEditarDatos();
    }
    CRUD crud = new CRUD();

    public void noPermitirEditarDatos() {
        txtApellidos.setEditable(false);
        txtNombre.setEditable(false);
        txtSeccion.setEditable(false);
        //cbDiscapacidad.setEditable(false);
        cbDiscapacidad.disable();
        btnGuardar.setEnabled(false);

    }

    public void permitirEditarDatos() {
        txtApellidos.setEditable(true);
        txtNombre.setEditable(true);
        txtSeccion.setEditable(true);
        // cbDiscapacidad.setEditable(true);
        cbDiscapacidad.enable();
        btnGuardar.setEnabled(true);
    }

    private void colocarDatos(ArrayList<String> datos) {
        txtNombre.setText(datos.get(0));
        txtApellidos.setText(datos.get(1)); //Nombre
        if (datos.get(2) == "S") {
            cbDiscapacidad.setSelectedItem("S"); //Movilidad Reducida
        } else {
            cbDiscapacidad.setSelectedItem("N");;
        }
        txtSeccion.setText(datos.get(3)); //Unidad de Trabajo
    }

    private void limpiarDatos() {
        txtID.setEditable(true);
        txtNombre.setText("");
        txtApellidos.setText("");
        txtSeccion.setText("");
        txtID.setText("");
    }

    public void validarSoloNumeros(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();
        if (!Character.isLetterOrDigit(validar) || !Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            //JOptionPane.showMessageDialog(rootPane, "No ingrese letras");
        }
    }

    public void validarSoloLetras(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();
        if (!Character.isLetterOrDigit(validar) || Character.isDigit(validar)) {
            getToolkit().beep();
            evt.consume();
            //JOptionPane.showMessageDialog(rootPane, "No ingrese letras");
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

        jPanel1 = new javax.swing.JPanel();
        btnInicion = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAsigna = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtSeccion = new javax.swing.JTextField();
        cbDiscapacidad = new javax.swing.JComboBox<String>();
        btnGuardar = new javax.swing.JButton();
        lblApellidos = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        btnNuevaConsulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(853, 567));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(90, 90, 90));
        jPanel1.setForeground(new java.awt.Color(69, 69, 69));
        jPanel1.setMaximumSize(new java.awt.Dimension(853, 46));
        jPanel1.setPreferredSize(new java.awt.Dimension(853, 46));

        btnInicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/btnInicio.png"))); // NOI18N
        btnInicion.setBorder(null);
        btnInicion.setMaximumSize(new java.awt.Dimension(90, 46));
        btnInicion.setMinimumSize(new java.awt.Dimension(90, 46));
        btnInicion.setPreferredSize(new java.awt.Dimension(90, 46));
        btnInicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicionActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/btnEditar.png"))); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setMaximumSize(new java.awt.Dimension(90, 46));
        btnEditar.setMinimumSize(new java.awt.Dimension(90, 46));
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAsigna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/btnAsignar.png"))); // NOI18N
        btnAsigna.setBorder(null);
        btnAsigna.setMaximumSize(new java.awt.Dimension(90, 46));
        btnAsigna.setMinimumSize(new java.awt.Dimension(90, 46));
        btnAsigna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignaActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/btnBuscar.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setMaximumSize(new java.awt.Dimension(90, 46));
        jButton5.setMinimumSize(new java.awt.Dimension(90, 46));

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/btnEliminar.png"))); // NOI18N
        btnEliminar.setAlignmentX(698.0F);
        btnEliminar.setAlignmentY(150.0F);
        btnEliminar.setBorder(null);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnInicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnAsigna, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(btnAsigna, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnInicion.getAccessibleContext().setAccessibleName("btnInicio");
        btnEditar.getAccessibleContext().setAccessibleName("btnEditar");
        btnAsigna.getAccessibleContext().setAccessibleName("btnAsignar");
        jButton5.getAccessibleContext().setAccessibleName("btnBuscar");
        btnEliminar.getAccessibleContext().setAccessibleName("btnEliminar");

        jLabel1.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel1.setText("Actualizar Usuario");

        lblId.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        lblId.setText("Ingrese ID");

        jLabel3.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel3.setText("Nombres");

        jLabel4.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel4.setText("Movilidad Reducida");

        jLabel5.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabel5.setText("Unidad de Trabajo");

        txtApellidos.setBackground(new java.awt.Color(229, 229, 229));
        txtApellidos.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtApellidos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 5, true));
        txtApellidos.setPreferredSize(new java.awt.Dimension(364, 47));
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        txtID.setBackground(new java.awt.Color(229, 229, 229));
        txtID.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtID.setToolTipText("Ingrese su cédula");
        txtID.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 5, true));
        txtID.setPreferredSize(new java.awt.Dimension(364, 47));
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        txtSeccion.setBackground(new java.awt.Color(229, 229, 229));
        txtSeccion.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtSeccion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 1, true));
        txtSeccion.setPreferredSize(new java.awt.Dimension(364, 47));
        txtSeccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeccionActionPerformed(evt);
            }
        });
        txtSeccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSeccionKeyTyped(evt);
            }
        });

        cbDiscapacidad.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        cbDiscapacidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "S", "N" }));
        cbDiscapacidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 5, true));
        cbDiscapacidad.setPreferredSize(new java.awt.Dimension(229, 47));

        btnGuardar.setBackground(new java.awt.Color(0, 107, 229));
        btnGuardar.setFont(new java.awt.Font("Lato", 0, 11)); // NOI18N
        btnGuardar.setForeground(javax.swing.UIManager.getDefaults().getColor("CheckBoxMenuItem.selectionBackground"));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/btnGuardar.png"))); // NOI18N
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 127, 229), 6, true));
        btnGuardar.setPreferredSize(new java.awt.Dimension(188, 25));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        lblApellidos.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        lblApellidos.setText("Apellidos");

        txtNombre.setBackground(new java.awt.Color(229, 229, 229));
        txtNombre.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        txtNombre.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(229, 229, 229), 5, true));
        txtNombre.setPreferredSize(new java.awt.Dimension(364, 47));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(lblApellidos)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevaConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(303, 303, 303))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblId)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btnNuevaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDiscapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(59, 59, 59)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel1.getAccessibleContext().setAccessibleName("lblAsignar");
        lblId.getAccessibleContext().setAccessibleName("lblCI");
        jLabel3.getAccessibleContext().setAccessibleName("lblNombre");
        jLabel4.getAccessibleContext().setAccessibleName("lblMovilidad");
        jLabel5.getAccessibleContext().setAccessibleName("lblUnidad");
        txtApellidos.getAccessibleContext().setAccessibleName("txtNombre");
        txtID.getAccessibleContext().setAccessibleName("txtCI");
        txtSeccion.getAccessibleContext().setAccessibleName("txtUnidad");
        txtSeccion.getAccessibleContext().setAccessibleDescription("");
        cbDiscapacidad.getAccessibleContext().setAccessibleName("cbMovilidad");
        btnGuardar.getAccessibleContext().setAccessibleName("btnGuardar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignaActionPerformed
        Asigna asigna = new Asigna();
        asigna.show();
    }//GEN-LAST:event_btnAsignaActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        Actualizacion actualizacion = new Actualizacion();
        actualizacion.show();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Elimina eliminar = new Elimina();
        eliminar.show();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Validaciones validar = new Validaciones();
        Cliente cliente = new Cliente();
        cliente.setCliente_Nombre(txtNombre.getText());
        cliente.setCliente_Apellido(txtApellidos.getText());
        cliente.setCliente_Ubicacion(txtSeccion.getText());
        String discapacidad = (String) cbDiscapacidad.getSelectedItem();
        char discapa = discapacidad.charAt(0);
        cliente.setCliente_Discapacidad(discapa);
        if ((validar.validarDato(txtNombre.getText()) && validar.validarDato(txtApellidos.getText())) && validar.validarDato(txtSeccion.getText())) {
            crud.actualizarUsuario(txtID.getText(), cliente);
        }


    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnInicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicionActionPerformed
        dispose();
        Home home = new Home();
        home.show();        // TODO add your handling code here:
    }//GEN-LAST:event_btnInicionActionPerformed

    private void txtSeccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeccionActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        String idCliente;
        ArrayList<String> datosCliente = new ArrayList<>();
        ControladorAsignacion controladorAsignacion = new ControladorAsignacion();
        idCliente = txtID.getText();
        Validaciones validar = new Validaciones();

        if (validar.validarCampoCedula(idCliente)) {
            datosCliente = controladorAsignacion.obtenerDatosCliente(idCliente);
            datosCliente.add(idCliente);
            /*  datosCliente.add("1");
             datosCliente.add("2");
             datosCliente.add("S");
             datosCliente.add("4");
             datosCliente.add("5");*/
            colocarDatos(datosCliente);
            permitirEditarDatos();
            txtID.setEditable(false);
        } else {
            txtID.setText("");
        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnNuevaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaConsultaActionPerformed
        // TODO add your handling code here:
        limpiarDatos();
        noPermitirEditarDatos();
        txtID.setEditable(true);
    }//GEN-LAST:event_btnNuevaConsultaActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        // TODO add your handling code here:
        validarSoloNumeros(evt);
    }//GEN-LAST:event_txtIDKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        validarSoloLetras(evt);
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        validarSoloLetras(evt);
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtSeccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeccionKeyTyped
        // TODO add your handling code here:
        validarSoloLetras(evt);
    }//GEN-LAST:event_txtSeccionKeyTyped

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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
            java.util.logging.Logger.getLogger(Actualizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAsigna;
    private javax.swing.JButton btnConsultar;
    public static javax.swing.JButton btnEditar;
    public static javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public static javax.swing.JButton btnInicion;
    private javax.swing.JButton btnNuevaConsulta;
    public javax.swing.JComboBox<String> cbDiscapacidad;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblId;
    public javax.swing.JTextField txtApellidos;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtSeccion;
    // End of variables declaration//GEN-END:variables
}
