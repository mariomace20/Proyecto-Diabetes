
package MenuRegistro;

import java.awt.BorderLayout;

public class PrincipalRegistro extends javax.swing.JPanel {

    
    public PrincipalRegistro() {
        initComponents();
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PacienteSecundarioMenu = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btnListadoPacientes = new javax.swing.JButton();
        btnPastillas = new javax.swing.JButton();
        btnEnfermedades = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        PacienteSecundarioMenu.setBackground(new java.awt.Color(255, 255, 255));
        PacienteSecundarioMenu.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        btnListadoPacientes.setBackground(new java.awt.Color(33, 169, 155));
        btnListadoPacientes.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnListadoPacientes.setForeground(new java.awt.Color(255, 255, 255));
        btnListadoPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paciente.png"))); // NOI18N
        btnListadoPacientes.setText("Listado de Pacientes");
        btnListadoPacientes.setBorder(null);
        btnListadoPacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListadoPacientes.setFocusPainted(false);
        btnListadoPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoPacientesActionPerformed(evt);
            }
        });
        jPanel5.add(btnListadoPacientes);
        btnListadoPacientes.setBounds(20, 10, 230, 30);

        btnPastillas.setBackground(new java.awt.Color(33, 169, 155));
        btnPastillas.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnPastillas.setForeground(new java.awt.Color(255, 255, 255));
        btnPastillas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pildora_1.png"))); // NOI18N
        btnPastillas.setText("Pastillas");
        btnPastillas.setBorder(null);
        btnPastillas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPastillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPastillasActionPerformed(evt);
            }
        });
        jPanel5.add(btnPastillas);
        btnPastillas.setBounds(270, 10, 230, 30);

        btnEnfermedades.setBackground(new java.awt.Color(33, 169, 155));
        btnEnfermedades.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnEnfermedades.setForeground(new java.awt.Color(255, 255, 255));
        btnEnfermedades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/virus_1.png"))); // NOI18N
        btnEnfermedades.setText("Enfermedades");
        btnEnfermedades.setBorder(null);
        btnEnfermedades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnfermedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnfermedadesActionPerformed(evt);
            }
        });
        jPanel5.add(btnEnfermedades);
        btnEnfermedades.setBounds(520, 10, 230, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
            .addComponent(PacienteSecundarioMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PacienteSecundarioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnListadoPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoPacientesActionPerformed
        RegistroPacientes p1 = new RegistroPacientes();
        p1.setSize(780, 600);
        p1.setLocation(5, 5);
        PacienteSecundarioMenu.removeAll();
        PacienteSecundarioMenu.add(p1,BorderLayout.CENTER);
        PacienteSecundarioMenu.revalidate();
        PacienteSecundarioMenu.repaint();
    }//GEN-LAST:event_btnListadoPacientesActionPerformed

    private void btnPastillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPastillasActionPerformed
        RegistroPastillas p1 = new RegistroPastillas();
        p1.setSize(780, 600);
        p1.setLocation(5, 5);
        PacienteSecundarioMenu.removeAll();
        PacienteSecundarioMenu.add(p1,BorderLayout.CENTER);
        PacienteSecundarioMenu.revalidate();
        PacienteSecundarioMenu.repaint();

    }//GEN-LAST:event_btnPastillasActionPerformed

    private void btnEnfermedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnfermedadesActionPerformed
        RegistroEnfermedades p1 = new RegistroEnfermedades();
        p1.setSize(780, 600);
        p1.setLocation(5, 5);
        PacienteSecundarioMenu.removeAll();
        PacienteSecundarioMenu.add(p1,BorderLayout.CENTER);
        PacienteSecundarioMenu.revalidate();
        PacienteSecundarioMenu.repaint();

    }//GEN-LAST:event_btnEnfermedadesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PacienteSecundarioMenu;
    private javax.swing.JButton btnEnfermedades;
    private javax.swing.JButton btnListadoPacientes;
    private javax.swing.JButton btnPastillas;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
