
package MenuInicio;

import MenuPaciente.PrincipalPaciente;
import MenuRegistro.PrincipalRegistro;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MenuPrincipal extends javax.swing.JFrame {

    
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/circunferencia64.png")).getImage());
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbllPacientes = new javax.swing.JLabel();
        lblRegistros = new javax.swing.JLabel();
        lblInicio = new javax.swing.JLabel();
        lblAcerca = new javax.swing.JLabel();
        lblSalir = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblAcerca1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        maximizar = new javax.swing.JLabel();
        lblCerrar = new javax.swing.JLabel();
        minimizar = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(889, 562));
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(54, 63, 74));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lbllPacientes.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lbllPacientes.setForeground(new java.awt.Color(255, 255, 255));
        lbllPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cirujano.png"))); // NOI18N
        lbllPacientes.setText("Pacientes");
        lbllPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbllPacientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbllPacientesMousePressed(evt);
            }
        });

        lblRegistros.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblRegistros.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/portafolios-con-lapiz.png"))); // NOI18N
        lblRegistros.setText("Registros");
        lblRegistros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblRegistrosMouseReleased(evt);
            }
        });

        lblInicio.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio-de-una-pagina-web.png"))); // NOI18N
        lblInicio.setText("Inicio");
        lblInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblInicioMousePressed(evt);
            }
        });

        lblAcerca.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblAcerca.setForeground(new java.awt.Color(255, 255, 255));
        lblAcerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuentas.png"))); // NOI18N
        lblAcerca.setText("Acerca de la App");
        lblAcerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAcerca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAcercaMousePressed(evt);
            }
        });

        lblSalir.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblSalir.setForeground(new java.awt.Color(255, 255, 255));
        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/potencia.png"))); // NOI18N
        lblSalir.setText("Salir");
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circunferencia.png"))); // NOI18N
        jLabel2.setText("DIACARE");

        lblAcerca1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        lblAcerca1.setForeground(new java.awt.Color(255, 255, 255));
        lblAcerca1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/copyright.png"))); // NOI18N
        lblAcerca1.setText("Derechos Reservados");
        lblAcerca1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAcerca1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblAcerca1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(lblSalir)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 16, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAcerca, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbllPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblAcerca1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblInicio)
                .addGap(28, 28, 28)
                .addComponent(lbllPacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblRegistros)
                .addGap(29, 29, 29)
                .addComponent(lblAcerca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSalir)
                .addGap(38, 38, 38)
                .addComponent(lblAcerca1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        maximizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/multi-tab (1).png"))); // NOI18N
        maximizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizarMouseClicked(evt);
            }
        });
        jPanel3.add(maximizar);
        maximizar.setBounds(730, 0, 20, 30);

        lblCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/x.png"))); // NOI18N
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });
        jPanel3.add(lblCerrar);
        lblCerrar.setBounds(760, 0, 20, 30);

        minimizar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        minimizar.setText("__");
        minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarMouseClicked(evt);
            }
        });
        jPanel3.add(minimizar);
        minimizar.setBounds(700, 0, 30, 30);

        PanelPrincipal.setBackground(new java.awt.Color(89, 199, 198));
        PanelPrincipal.setMaximumSize(new java.awt.Dimension(792, 600));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(792, 600));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(792, 600));
        PanelPrincipal.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DIACARE te de la bienvenida");
        PanelPrincipal.add(jLabel4);
        jLabel4.setBounds(120, 70, 540, 90);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel5.setText("¡Bienvenido a nuestro Sistema de Informacion!");
        PanelPrincipal.add(jLabel5);
        jLabel5.setBounds(150, -10, 540, 90);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/circunferencia (1).png"))); // NOI18N
        PanelPrincipal.add(jLabel6);
        jLabel6.setBounds(200, 80, 80, 70);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nota.png"))); // NOI18N
        PanelPrincipal.add(jLabel7);
        jLabel7.setBounds(280, 200, 280, 290);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario-medico-simbolo.png"))); // NOI18N
        PanelPrincipal.add(jLabel9);
        jLabel9.setBounds(70, 160, 160, 200);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ambulancia.png"))); // NOI18N
        PanelPrincipal.add(jLabel10);
        jLabel10.setBounds(580, 180, 140, 160);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblInicioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInicioMousePressed
        
        setLblColor(lblInicio);
        resetLblColor(lblRegistros);
        resetLblColor(lblAcerca);
        resetLblColor(lbllPacientes);
        
        Inicio p1 = new Inicio();
        p1.setSize(792, 600);
        p1.setLocation(5, 5);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(p1,BorderLayout.CENTER);
        PanelPrincipal.revalidate(); 
        PanelPrincipal.repaint();
        
        
        
    }//GEN-LAST:event_lblInicioMousePressed

    private void lbllPacientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbllPacientesMousePressed
        setLblColor(lbllPacientes);
        resetLblColor(lblInicio);
        resetLblColor(lblRegistros);
        resetLblColor(lblAcerca);
        
        PrincipalPaciente p1 = new PrincipalPaciente();
        p1.setSize(792, 600);
        p1.setLocation(5, 5);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(p1,BorderLayout.CENTER);
        PanelPrincipal.revalidate(); 
        PanelPrincipal.repaint();
        
    }//GEN-LAST:event_lbllPacientesMousePressed

    private void lblRegistrosMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrosMouseReleased
        setLblColor(lblRegistros);
        resetLblColor(lblInicio);
        resetLblColor(lbllPacientes);
        resetLblColor(lblAcerca);
        
        PrincipalRegistro p1 = new PrincipalRegistro();
        p1.setSize(792, 600);
        p1.setLocation(5, 5);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(p1,BorderLayout.CENTER);
        PanelPrincipal.revalidate(); 
        PanelPrincipal.repaint();
        
        
    }//GEN-LAST:event_lblRegistrosMouseReleased

    private void lblAcercaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcercaMousePressed
        setLblColor(lblAcerca);
        resetLblColor(lblInicio);
        resetLblColor(lblRegistros);
        resetLblColor(lbllPacientes);
        
        AcercaNosotros p1 = new AcercaNosotros();
        p1.setSize(792, 600);
        p1.setLocation(5, 5);
        PanelPrincipal.removeAll();
        PanelPrincipal.add(p1,BorderLayout.CENTER);
        PanelPrincipal.revalidate(); 
        PanelPrincipal.repaint();
        
        
        
    }//GEN-LAST:event_lblAcercaMousePressed

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblAcerca1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAcerca1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAcerca1MousePressed

    private void minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarMouseClicked

    private void maximizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizarMouseClicked
        //this.setExtendedState(6);
    }//GEN-LAST:event_maximizarMouseClicked

    public void setLblColor(JLabel lbl){
        lbl.setForeground(new Color(0,196,204));
    }
    
    public void resetLblColor(JLabel lbl){
        lbl.setForeground(new Color(255,255,255));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblAcerca;
    private javax.swing.JLabel lblAcerca1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblRegistros;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lbllPacientes;
    private javax.swing.JLabel maximizar;
    private javax.swing.JLabel minimizar;
    // End of variables declaration//GEN-END:variables
}
