
package MenuInicio;

import MenuInicio.Cargando;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/circunferencia64.png")).getImage());
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        acerca = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        lblExit = new javax.swing.JLabel();
        acercaNosotros = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        doctora = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        txtUser = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        imagenFondo = new javax.swing.JLabel();

        acerca.setMaximumSize(new java.awt.Dimension(400, 300));
        acerca.setMinimumSize(new java.awt.Dimension(400, 300));
        acerca.setUndecorated(true);
        acerca.setPreferredSize(new java.awt.Dimension(400, 300));

        jPanel1.setBackground(new java.awt.Color(255, 152, 0));
        jPanel1.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FISI - UNMSM");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 250, 110, 19);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("-Ore Palomino Jack Eber");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 100, 188, 19);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("-Ruben Ruiz Flores Roy Roger");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(30, 120, 224, 19);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("-Robladillo Eric Miguel");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 130, 168, 40);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("-Vargas Rosas Francescca Cynthya A.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 190, 282, 40);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("-Orellana Ita Brian Gerad");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 180, 187, 19);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("-Cortez Escarate Mario Alberto");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 160, 236, 19);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("-Muñoz Zavaleta Karen Alisson");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 80, 230, 19);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("INTEGRANTES");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(160, 30, 120, 19);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar16.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(370, 6, 50, 20);

        acerca.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 393));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(170, 180, 170, 30);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(170, 230, 170, 30);

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        getContentPane().add(lblExit);
        lblExit.setBounds(660, 10, 80, 40);

        acercaNosotros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acercaNosotros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doctor (1).png"))); // NOI18N
        acercaNosotros.setText("Acerca de Nosotros");
        acercaNosotros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acercaNosotros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acercaNosotrosMouseClicked(evt);
            }
        });
        getContentPane().add(acercaNosotros);
        acercaNosotros.setBounds(20, 350, 190, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circunferencia (1).png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(120, 60, 90, 60);

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 28)); // NOI18N
        jLabel11.setText("DIACARE");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(160, 60, 290, 60);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        jLabel9.setText("Contraseña");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 210, 110, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        jLabel1.setText("Usuario");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 160, 100, 30);

        doctora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doctor.png"))); // NOI18N
        doctora.setText("jLabel11");
        getContentPane().add(doctora);
        doctora.setBounds(310, 0, 390, 400);

        txtPass.setBackground(new java.awt.Color(0, 131, 167));
        txtPass.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPass.setBorder(null);
        txtPass.setCaretColor(new java.awt.Color(0, 131, 167));
        txtPass.setSelectedTextColor(new java.awt.Color(0, 131, 167));
        txtPass.setSelectionColor(new java.awt.Color(0, 131, 167));
        getContentPane().add(txtPass);
        txtPass.setBounds(170, 210, 170, 18);

        txtUser.setBackground(new java.awt.Color(0, 131, 167));
        txtUser.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(null);
        txtUser.setCaretColor(new java.awt.Color(0, 131, 167));
        txtUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtUser.setSelectedTextColor(new java.awt.Color(0, 131, 167));
        txtUser.setSelectionColor(new java.awt.Color(0, 131, 167));
        getContentPane().add(txtUser);
        txtUser.setBounds(170, 160, 170, 18);

        btnIngresar.setBackground(new java.awt.Color(153, 153, 255));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 255), 3));
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(140, 260, 150, 30);

        imagenFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pueeserrr.png"))); // NOI18N
        imagenFondo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(imagenFondo);
        imagenFondo.setBounds(0, 0, 700, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        String user = txtUser.getText();
        String pass = new String(txtPass.getPassword());
        
        if( user.equals("admin") && pass.equals("123") ){
            this.dispose();
            Cargando cm = new Cargando();
            cm.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null,"Usuario o Constraseña incorrecta");
        }

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0); //cierra el programa, termina la ejecucion
    }//GEN-LAST:event_lblExitMouseClicked

    private void acercaNosotrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acercaNosotrosMouseClicked
        acerca.setLocationRelativeTo(null);
        acerca.setResizable(false);
        acerca.setVisible(true);
    }//GEN-LAST:event_acercaNosotrosMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        acerca.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog acerca;
    private javax.swing.JLabel acercaNosotros;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel doctora;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblExit;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
