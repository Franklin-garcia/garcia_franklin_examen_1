
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Franklin Garcia
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_agregar = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        tf_profesion = new javax.swing.JTextField();
        tf_edad = new javax.swing.JTextField();
        tf_password = new javax.swing.JTextField();
        tf_username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jd_listar = new javax.swing.JDialog();
        cb_usuario = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jd_modificar = new javax.swing.JDialog();
        cb_usuario1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_profesion1 = new javax.swing.JTextField();
        tf_password1 = new javax.swing.JTextField();
        tf_nombre1 = new javax.swing.JTextField();
        tf_usuario1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jd_eliminar = new javax.swing.JDialog();
        cb_usuario2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        log_in = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel1.setText("Agregar");

        jLabel2.setText("Nombre");

        jLabel3.setText("Edad");

        jLabel4.setText("Profesion");

        jLabel5.setText("Username");

        jLabel6.setText("Password");

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_agregarLayout = new javax.swing.GroupLayout(jd_agregar.getContentPane());
        jd_agregar.getContentPane().setLayout(jd_agregarLayout);
        jd_agregarLayout.setHorizontalGroup(
            jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarLayout.createSequentialGroup()
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_agregarLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1))
                    .addGroup(jd_agregarLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45)
                        .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_agregarLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jButton1)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jd_agregarLayout.setVerticalGroup(
            jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_agregarLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_profesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_agregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jd_listar.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jd_listarWindowActivated(evt);
            }
        });

        cb_usuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_usuarioItemStateChanged(evt);
            }
        });
        cb_usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_usuarioMouseClicked(evt);
            }
        });

        jLabel7.setText("Nombre");

        Tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Profesion", "Username", "Password"
            }
        ));
        jScrollPane1.setViewportView(Tabla1);

        jLabel8.setText("Listar");

        javax.swing.GroupLayout jd_listarLayout = new javax.swing.GroupLayout(jd_listar.getContentPane());
        jd_listar.getContentPane().setLayout(jd_listarLayout);
        jd_listarLayout.setHorizontalGroup(
            jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarLayout.createSequentialGroup()
                .addGroup(jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_listarLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_listarLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel7)
                        .addGap(27, 27, 27)
                        .addComponent(cb_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_listarLayout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel8)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jd_listarLayout.setVerticalGroup(
            jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel8)
                .addGap(67, 67, 67)
                .addGroup(jd_listarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jd_modificar.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jd_modificarWindowActivated(evt);
            }
        });

        cb_usuario1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_usuario1ItemStateChanged(evt);
            }
        });
        cb_usuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_usuario1MouseClicked(evt);
            }
        });

        jLabel9.setText("Nombre");

        jLabel10.setText("Modificar");

        jLabel11.setText("Nombre");

        jLabel12.setText("Usuario");

        jLabel14.setText("Profesion");

        jLabel15.setText("Password");

        tf_password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_password1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_modificarLayout = new javax.swing.GroupLayout(jd_modificar.getContentPane());
        jd_modificar.getContentPane().setLayout(jd_modificarLayout);
        jd_modificarLayout.setHorizontalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel10))
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel9)
                        .addGap(27, 27, 27)
                        .addComponent(cb_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(37, 37, 37)
                        .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_profesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_password1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jd_modificarLayout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jButton2)))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        jd_modificarLayout.setVerticalGroup(
            jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_modificarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel10)
                .addGap(67, 67, 67)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(39, 39, 39)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tf_nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(tf_profesion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_usuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jd_modificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(47, 47, 47)
                .addComponent(jButton2)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jd_eliminar.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                jd_eliminarWindowActivated(evt);
            }
        });

        cb_usuario2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_usuario2ItemStateChanged(evt);
            }
        });
        cb_usuario2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_usuario2MouseClicked(evt);
            }
        });

        jLabel16.setText("Nombre");

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Edad", "Profesion", "Username", "Password"
            }
        ));
        jScrollPane2.setViewportView(tabla2);

        jLabel17.setText("Listar");

        jButton3.setText("Eliminar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_eliminarLayout = new javax.swing.GroupLayout(jd_eliminar.getContentPane());
        jd_eliminar.getContentPane().setLayout(jd_eliminarLayout);
        jd_eliminarLayout.setHorizontalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarLayout.createSequentialGroup()
                .addGroup(jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_eliminarLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_eliminarLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel16)
                        .addGap(27, 27, 27)
                        .addComponent(cb_usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_eliminarLayout.createSequentialGroup()
                        .addGap(339, 339, 339)
                        .addComponent(jLabel17))
                    .addGroup(jd_eliminarLayout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jButton3)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jd_eliminarLayout.setVerticalGroup(
            jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_eliminarLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel17)
                .addGap(67, 67, 67)
                .addGroup(jd_eliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_usuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButton3)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jLabel18.setText("Log in");

        jLabel19.setText("Username");

        jLabel20.setText("Password");

        jButton4.setText("Entrar");

        javax.swing.GroupLayout log_inLayout = new javax.swing.GroupLayout(log_in.getContentPane());
        log_in.getContentPane().setLayout(log_inLayout);
        log_inLayout.setHorizontalGroup(
            log_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(log_inLayout.createSequentialGroup()
                .addGroup(log_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(log_inLayout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jLabel18))
                    .addGroup(log_inLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(log_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19))
                        .addGap(28, 28, 28)
                        .addGroup(log_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(log_inLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jButton4)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        log_inLayout.setVerticalGroup(
            log_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(log_inLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(log_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(log_inLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jButton4)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Menu principal");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Agregar usuarios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Modificar usuarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Eliminar usuario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Listar usuario");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Log in");
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String nombre;
        int edad;
        String profesion;
        String username;
        String password;

        nombre = tf_nombre.getText();
        edad = Integer.parseInt(tf_edad.getText());
        profesion = tf_profesion.getText();
        username = tf_username.getText();
        password = tf_password.getText();

        tf_nombre.setText("");
        tf_edad.setText("");
        tf_profesion.setText("");
        tf_username.setText("");
        tf_password.setText("");

        lista_usuarios.add(new Usuario(nombre, edad, profesion, username, password));
        JOptionPane.showMessageDialog(null, "Se agrego con exito");
    }//GEN-LAST:event_jButton1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jd_agregar.setModal(true);
        jd_agregar.pack(); //acoplar el tamaño de la ventan a los objetos que estan incluidos en ella
        jd_agregar.setLocationRelativeTo(this);
        jd_agregar.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jd_listarWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_listarWindowActivated
        if (jd_listar.isActive()) {
            DefaultComboBoxModel modelo
                    = new DefaultComboBoxModel();
            for (Usuario t : lista_usuarios) {
                modelo.addElement(t);
            }
            cb_usuario.setModel(modelo);

        }
    }//GEN-LAST:event_jd_listarWindowActivated

    private void cb_usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_usuarioMouseClicked

    }//GEN-LAST:event_cb_usuarioMouseClicked

    private void cb_usuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_usuarioItemStateChanged
        if (evt.getStateChange() == 2) {
            Usuario Persona = (Usuario) cb_usuario.getSelectedItem();
            Object[] newrow = {Persona.getNombre(), Persona.getEdad(), Persona.getProfesión(), Persona.getUsername(), Persona.getPassword()};
            DefaultTableModel Modelo = (DefaultTableModel) Tabla1.getModel();
            Modelo.addRow(newrow);
            Tabla1.setModel(Modelo);
        }
    }//GEN-LAST:event_cb_usuarioItemStateChanged

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        jd_listar.setModal(true);
        jd_listar.pack(); //acoplar el tamaño de la ventan a los objetos que estan incluidos en ella
        jd_listar.setLocationRelativeTo(this);
        jd_listar.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void cb_usuario1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_usuario1ItemStateChanged

    }//GEN-LAST:event_cb_usuario1ItemStateChanged

    private void cb_usuario1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_usuario1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_usuario1MouseClicked

    private void jd_modificarWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_modificarWindowActivated
        if (jd_modificar.isActive()) {
            DefaultComboBoxModel modelo
                    = new DefaultComboBoxModel();
            for (Usuario t : lista_usuarios) {
                modelo.addElement(t);
            }
            cb_usuario1.setModel(modelo);

        }
    }//GEN-LAST:event_jd_modificarWindowActivated

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jd_modificar.setModal(true);
        jd_modificar.pack(); //acoplar el tamaño de la ventan a los objetos que estan incluidos en ella
        jd_modificar.setLocationRelativeTo(this);
        jd_modificar.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        ((Usuario) lista_usuarios.get(cb_usuario1.getSelectedIndex())).setNombre(tf_nombre1.getText());
        ((Usuario) lista_usuarios.get(cb_usuario1.getSelectedIndex()-1)).setPassword(tf_password1.getText());
        ((Usuario) lista_usuarios.get(cb_usuario1.getSelectedIndex()-1)).setProfesión(tf_profesion1.getText());
        ((Usuario) lista_usuarios.get(cb_usuario1.getSelectedIndex()-1)).setUsername(tf_usuario1.getText());
        JOptionPane.showMessageDialog(null, "Se modifico con exito");
    }//GEN-LAST:event_jButton2MouseClicked

    private void cb_usuario2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_usuario2ItemStateChanged
        if (evt.getStateChange() == 2) {
            Usuario Persona = (Usuario) cb_usuario2.getSelectedItem();
            Object[] newrow = {Persona.getNombre(), Persona.getEdad(), Persona.getProfesión(), Persona.getUsername(), Persona.getPassword()};
            DefaultTableModel Modelo = (DefaultTableModel) tabla2.getModel();
            Modelo.addRow(newrow);
            tabla2.setModel(Modelo);
        }
    }//GEN-LAST:event_cb_usuario2ItemStateChanged

    private void cb_usuario2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_usuario2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_usuario2MouseClicked

    private void jd_eliminarWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jd_eliminarWindowActivated
        if (jd_eliminar.isActive()) {
            DefaultComboBoxModel modelo
                    = new DefaultComboBoxModel();
            for (Usuario t : lista_usuarios) {
                modelo.addElement(t);
            }
            cb_usuario2.setModel(modelo);

        }
    }//GEN-LAST:event_jd_eliminarWindowActivated

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        lista_usuarios.remove(tabla2.getSelectedRow());
        jd_eliminar.setVisible(false);
        JOptionPane.showMessageDialog(null, "Se elimino con exito");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jd_eliminar.setModal(true);
        jd_eliminar.pack(); //acoplar el tamaño de la ventan a los objetos que estan incluidos en ella
        jd_eliminar.setLocationRelativeTo(this);
        jd_eliminar.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void tf_password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_password1ActionPerformed

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
                if ("Linux".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla1;
    private javax.swing.JComboBox<String> cb_usuario;
    private javax.swing.JComboBox<String> cb_usuario1;
    private javax.swing.JComboBox<String> cb_usuario2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JDialog jd_agregar;
    private javax.swing.JDialog jd_eliminar;
    private javax.swing.JDialog jd_listar;
    private javax.swing.JDialog jd_modificar;
    private javax.swing.JDialog log_in;
    private javax.swing.JTable tabla2;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombre1;
    private javax.swing.JTextField tf_password;
    private javax.swing.JTextField tf_password1;
    private javax.swing.JTextField tf_profesion;
    private javax.swing.JTextField tf_profesion1;
    private javax.swing.JTextField tf_username;
    private javax.swing.JTextField tf_usuario1;
    // End of variables declaration//GEN-END:variables
    ArrayList<Usuario> lista_usuarios = new ArrayList();
}
