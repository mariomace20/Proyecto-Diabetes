
package MenuPaciente;

import java.awt.BorderLayout;


public class PrincipalPaciente extends javax.swing.JPanel {

    
    public PrincipalPaciente() {
        initComponents();
  
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PacienteSecundarioMenu = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnNuevoPaciente = new javax.swing.JButton();
        btnBuscarPaciente = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(792, 600));
        setMinimumSize(new java.awt.Dimension(792, 600));
        setPreferredSize(new java.awt.Dimension(792, 600));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        PacienteSecundarioMenu.setBackground(new java.awt.Color(255, 255, 255));
        PacienteSecundarioMenu.setMaximumSize(new java.awt.Dimension(792, 546));
        PacienteSecundarioMenu.setMinimumSize(new java.awt.Dimension(792, 546));
        PacienteSecundarioMenu.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        btnNuevoPaciente.setBackground(new java.awt.Color(33, 169, 155));
        btnNuevoPaciente.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnNuevoPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar-usuario.png"))); // NOI18N
        btnNuevoPaciente.setText("Nuevo Paciente");
        btnNuevoPaciente.setBorder(null);
        btnNuevoPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNuevoPaciente.setFocusPainted(false);
        btnNuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPacienteActionPerformed(evt);
            }
        });
        jPanel5.add(btnNuevoPaciente);
        btnNuevoPaciente.setBounds(30, 10, 330, 30);

        btnBuscarPaciente.setBackground(new java.awt.Color(33, 169, 155));
        btnBuscarPaciente.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnBuscarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa-rastreadora.png"))); // NOI18N
        btnBuscarPaciente.setText("Actualizar Datos/Reportes");
        btnBuscarPaciente.setBorder(null);
        btnBuscarPaciente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });
        jPanel5.add(btnBuscarPaciente);
        btnBuscarPaciente.setBounds(380, 10, 360, 30);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
            .addComponent(PacienteSecundarioMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PacienteSecundarioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPacienteActionPerformed
        PacienteNuevo p1 = new PacienteNuevo();
        p1.setSize(780, 600);
        p1.setLocation(5, 5);
        PacienteSecundarioMenu.removeAll();
        PacienteSecundarioMenu.add(p1,BorderLayout.CENTER);
        PacienteSecundarioMenu.revalidate(); 
        PacienteSecundarioMenu.repaint();
    }//GEN-LAST:event_btnNuevoPacienteActionPerformed

    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        
        PacienteBuscar p1 = new PacienteBuscar();
        p1.setSize(780, 600);
        p1.setLocation(5, 5);
        PacienteSecundarioMenu.removeAll();
        PacienteSecundarioMenu.add(p1,BorderLayout.CENTER);
        PacienteSecundarioMenu.revalidate(); 
        PacienteSecundarioMenu.repaint();
        
        
        
        
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PacienteSecundarioMenu;
    private javax.swing.JButton btnBuscarPaciente;
    private javax.swing.JButton btnNuevoPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
