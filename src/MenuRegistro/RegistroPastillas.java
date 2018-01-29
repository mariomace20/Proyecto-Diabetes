
package MenuRegistro;

import BaseDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class RegistroPastillas extends javax.swing.JPanel {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public RegistroPastillas() {
        initComponents();
                
    }
    
    public void TablaRegistrosSisCirculatorio()
    {     
        String[] titulos={"Nombre de la Pastilla","Codigo de enfermedad","Enfermedad","Sistema Relacionado"};
        String[] registro=new String[4];            
        String asql="";
        modelo=new DefaultTableModel(null,titulos);
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
   
        asql="SELECT * FROM e_c_pastillas ";    
        
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next()){
                registro[0]=rs.getString("pastilla");
                registro[1]=rs.getString("cod_enf");
                registro[2]=rs.getString("nom_e");
                registro[3]="CIRCULATORIO";
                
                modelo.addRow(registro);
            }
            tablaPastillas.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        }  
    }
    
    public void TablaRegistrosSisEndocrino(){
        
        String[] titulos={"Nombre de la Pastilla","Codigo de enfermedad","Enfermedad","Sistema Relacionado"};
        String[] registro=new String[4];      
        String asq="";
        modelo=new DefaultTableModel(null,titulos);
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asq="SELECT * FROM e_e_pastillas";
        
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asq);
            
            while(rs.next()){
                registro[0]=rs.getString("pastilla");
                registro[1]=rs.getString("cod_enf");
                registro[2]=rs.getString("nom_e");
                registro[3]="ENDOCRINO";
                
                modelo.addRow(registro);
            }
            tablaPastillas.setModel(modelo);
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public void TablaRegistrosSisInmunologico(){
        String[] titulos={"Nombre de la Pastilla","Codigo de enfermedad","Enfermedad","Sistema Relacionado"};
        String[] registro=new String[4];      
        String asq="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        modelo=new DefaultTableModel(null,titulos);
        asq="SELECT * FROM e_i_pastillas";
        
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asq);
            
            while(rs.next()){
                registro[0]=rs.getString("pastilla");
                registro[1]=rs.getString("cod_enf");
                registro[2]=rs.getString("nom_e");
                registro[3]="INMUNOLOGICO";
                
                modelo.addRow(registro);
            }
            tablaPastillas.setModel(modelo);
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public void TablaRegistrosNeoplagias(){
        
        String[] titulos={"Nombre de la Pastilla","Codigo de enfermedad","Enfermedad","Sistema Relacionado"};
        String[] registro=new String[4];      
        String asq="";
        modelo=new DefaultTableModel(null,titulos);
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asq="SELECT * FROM e_n_pastillas";
        
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asq);
            
            while(rs.next()){
                registro[0]=rs.getString("pastilla");
                registro[1]=rs.getString("cod_enf");
                registro[2]=rs.getString("nom_e");
                registro[3]="NEOPLAGIAS";
                
                modelo.addRow(registro);
            }
            tablaPastillas.setModel(modelo);
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public void TablaRegistrosPiel(){
        
        String[] titulos={"Nombre de la Pastilla","Codigo de enfermedad","Enfermedad","Sistema Relacionado"};
        String[] registro=new String[4];      
        String asq="";
        modelo=new DefaultTableModel(null,titulos);
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asq="SELECT * FROM e_pi_pastillas";
        
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asq);
            
            while(rs.next()){
                registro[0]=rs.getString("pastilla");
                registro[1]=rs.getString("cod_enf");
                registro[2]=rs.getString("nom_e");
                registro[3]="PIEL";
                
                modelo.addRow(registro);
            }
            tablaPastillas.setModel(modelo);
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    
    public void TablaRegistrosPsicologicas(){

        String[] titulos={"Nombre de la Pastilla","Codigo de enfermedad","Enfermedad","Sistema Relacionado"};
        String[] registro=new String[4];      
        String asq="";
        modelo=new DefaultTableModel(null,titulos);
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asq="SELECT * FROM e_ps_pastillas";
        
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asq);
            
            while(rs.next()){
                registro[0]=rs.getString("pastilla");
                registro[1]=rs.getString("cod_enf");
                registro[2]=rs.getString("nom_e");
                registro[3]="PSIQUIATRIA";
                
                modelo.addRow(registro);
            }
            tablaPastillas.setModel(modelo);
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    
    public void TablaRegistrosRenal(){

        String[] titulos={"Nombre de la Pastilla","Codigo de enfermedad","Enfermedad","Sistema Relacionado"};
        String[] registro=new String[4];      
        String asq="";
        modelo=new DefaultTableModel(null,titulos);
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asq="SELECT * FROM e_r_pastillas";
        
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asq);
            
            while(rs.next()){
                registro[0]=rs.getString("pastilla");
                registro[1]=rs.getString("cod_enf");
                registro[2]=rs.getString("nom_e");
                registro[3]="RENAL";
                
                modelo.addRow(registro);
            }
            tablaPastillas.setModel(modelo);
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    
    public void TablaRegistrosSangre(){
        
        String[] titulos={"Nombre de la Pastilla","Codigo de enfermedad","Enfermedad","Sistema Relacionado"};
        String[] registro=new String[4];      
        String asq="";
        modelo=new DefaultTableModel(null,titulos);
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asq="SELECT * FROM e_pi_pastillas";
        
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asq);
            
            while(rs.next()){
                registro[0]=rs.getString("pastilla");
                registro[1]=rs.getString("cod_enf");
                registro[2]=rs.getString("nom_e");
                registro[3]="PIEL";
                
                modelo.addRow(registro);
            }
            tablaPastillas.setModel(modelo);
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public void TablaRegistrosSiDigestivo(){
        
        String[] titulos={"Nombre de la Pastilla","Codigo de enfermedad","Enfermedad","Sistema Relacionado"};
        String[] registro=new String[4];      
        String asq="";
        modelo=new DefaultTableModel(null,titulos);
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asq="SELECT * FROM e_sid_pastillas";
        
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asq);
            
            while(rs.next()){
                registro[0]=rs.getString("pastilla");
                registro[1]=rs.getString("cod_enf");
                registro[2]=rs.getString("nom_e");
                registro[3]="SID";
                
                modelo.addRow(registro);
            }
            tablaPastillas.setModel(modelo);
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public void TablaRegistrosSiRespiratorio(){

        String[] titulos={"Nombre de la Pastilla","Codigo de enfermedad","Enfermedad","Sistema Relacionado"};
        String[] registro=new String[4];      
        String asq="";
        modelo=new DefaultTableModel(null,titulos);
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asq="SELECT * FROM e_sir_pastillas";
        
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asq);
            
            while(rs.next()){
                registro[0]=rs.getString("pastilla");
                registro[1]=rs.getString("cod_enf");
                registro[2]=rs.getString("nom_e");
                registro[3]="SIR";
                
                modelo.addRow(registro);
            }
            tablaPastillas.setModel(modelo);
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public void TablaRegistrosSiUrinario(){

        String[] titulos={"Nombre de la Pastilla","Codigo de enfermedad","Enfermedad","Sistema Relacionado"};
        String[] registro=new String[4];      
        String asq="";
        modelo=new DefaultTableModel(null,titulos);
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asq="SELECT * FROM e_siu_pastillas";
        
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asq);
            
            while(rs.next()){
                registro[0]=rs.getString("pastilla");
                registro[1]=rs.getString("cod_enf");
                registro[2]=rs.getString("nom_e");
                registro[3]="PIEL";
                
                modelo.addRow(registro);
            }
            tablaPastillas.setModel(modelo);
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPastillas = new javax.swing.JTable();
        buscar2 = new javax.swing.JLabel();
        buscar1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxRelacion = new javax.swing.JComboBox<>();
        cbxSelecOpc = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pildora_2.png"))); // NOI18N
        jLabel1.setText("LISTA DE PASTILLAS");
        add(jLabel1);
        jLabel1.setBounds(37, 23, 186, 24);
        add(jLabel2);
        jLabel2.setBounds(749, 53, 0, 0);

        tablaPastillas.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        tablaPastillas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaPastillas.setSelectionBackground(new java.awt.Color(0, 153, 153));
        tablaPastillas.setShowHorizontalLines(false);
        tablaPastillas.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tablaPastillas);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 250, 690, 200);

        buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar 16.png"))); // NOI18N
        buscar2.setEnabled(false);
        buscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar2MouseClicked(evt);
            }
        });
        add(buscar2);
        buscar2.setBounds(680, 150, 24, 24);

        buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar 16.png"))); // NOI18N
        buscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar1MouseClicked(evt);
            }
        });
        add(buscar1);
        buscar1.setBounds(680, 110, 24, 24);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Pastillas relacionadas con");
        jLabel4.setEnabled(false);
        add(jLabel4);
        jLabel4.setBounds(60, 150, 141, 15);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Tipo de Busqueda");
        add(jLabel3);
        jLabel3.setBounds(60, 110, 99, 15);

        cbxRelacion.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cbxRelacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la relacion", "...", "SISTEMA CARDIOVASCULAR", "SISTEMA DIGESTIVO", "SISTEMA ENDOCRINO", "ENFERMEDADES INFECCIOSAS", "NEOPLAGIAS", "ENFERMEDADES DE LA PIEL", "ENFERMEDADES PQSIQUIATRIA", "ENFERMEDADES RENALES", "ENFERMEDADES DEL SISTEMA RESPIRATORIO", "ENFERMEDADES REUMATOLOGICA", "ENFERMEDADES DE LA SANGRE" }));
        cbxRelacion.setBorder(null);
        cbxRelacion.setEnabled(false);
        add(cbxRelacion);
        cbxRelacion.setBounds(230, 150, 430, 19);

        cbxSelecOpc.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cbxSelecOpc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su opcion...", "Relacionadas en un area especifica", "TODAS LAS PASTILLAS" }));
        cbxSelecOpc.setBorder(null);
        add(cbxSelecOpc);
        cbxSelecOpc.setBounds(230, 110, 430, 19);
        add(jSeparator4);
        jSeparator4.setBounds(30, 80, 50, 30);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setToolTipText("");
        add(jSeparator5);
        jSeparator5.setBounds(30, 80, 20, 110);
        add(jSeparator6);
        jSeparator6.setBounds(30, 190, 720, 10);
        add(jSeparator1);
        jSeparator1.setBounds(168, 80, 580, 17);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setToolTipText("");
        add(jSeparator8);
        jSeparator8.setBounds(750, 80, 20, 110);

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel25.setText("BUSQUEDA");
        add(jLabel25);
        jLabel25.setBounds(90, 70, 90, 19);

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel24.setText("REGISTRO");
        add(jLabel24);
        jLabel24.setBounds(70, 210, 90, 19);
        add(jSeparator10);
        jSeparator10.setBounds(20, 220, 40, 30);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");
        add(jSeparator3);
        jSeparator3.setBounds(20, 220, 20, 250);
        add(jSeparator2);
        jSeparator2.setBounds(140, 220, 620, 10);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setToolTipText("");
        add(jSeparator9);
        jSeparator9.setBounds(760, 220, 20, 250);
        add(jSeparator7);
        jSeparator7.setBounds(20, 470, 740, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void buscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar1MouseClicked
        
        if(cbxSelecOpc.getSelectedItem().toString().equals("Relacionadas en un area especifica")){
            
            cbxRelacion.setEnabled(true);
            buscar2.setEnabled(true);
            jLabel4.setEnabled(true);  
            
        }else{
            
            if(!cbxSelecOpc.getSelectedItem().toString().equals("Seleccione su opcion...")){
                //METEMOS TODOS
                TablaRegistrosSisInmunologico();  
                TablaRegistrosNeoplagias();
                TablaRegistrosSangre();
                TablaRegistrosSisEndocrino();
                TablaRegistrosPsicologicas();
                TablaRegistrosSisCirculatorio();
                TablaRegistrosSiRespiratorio();
                TablaRegistrosSiDigestivo();
                TablaRegistrosPiel();
                TablaRegistrosRenal();
                TablaRegistrosSiUrinario();                  
            }               
        }      
    }//GEN-LAST:event_buscar1MouseClicked
      
    private void buscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar2MouseClicked
        if(cbxRelacion.getSelectedItem().toString().equals("SISTEMA CARDIOVASCULAR")){
            TablaRegistrosSisCirculatorio();
        }else if(cbxRelacion.getSelectedItem().toString().equals("SISTEMA DIGESTIVO")){
            TablaRegistrosSiDigestivo();;
        }else if(cbxRelacion.getSelectedItem().toString().equals("SISTEMA ENDOCRINO")){
            TablaRegistrosSisEndocrino();
        }else if(cbxRelacion.getSelectedItem().toString().equals("ENFERMEDADES INFECCIOSAS")){
            TablaRegistrosSisInmunologico();
        }else if(cbxRelacion.getSelectedItem().toString().equals("NEOPLAGIAS")){
            TablaRegistrosNeoplagias();
        }else if(cbxRelacion.getSelectedItem().toString().equals("ENFERMEDADES DE LA PIEL")){
            TablaRegistrosPiel();
        }else if(cbxRelacion.getSelectedItem().toString().equals("ENFERMEDADES PQSIQUIATRIA")){
            TablaRegistrosPsicologicas();
        }else if(cbxRelacion.getSelectedItem().toString().equals("ENFERMEDADES RENALES")){
            TablaRegistrosRenal();
        }else if(cbxRelacion.getSelectedItem().toString().equals("ENFERMEDADES DEL SISTEMA RESPIRATORIO")){
            TablaRegistrosSiRespiratorio();
        }else if(cbxRelacion.getSelectedItem().toString().equals("ENFERMEDADES REUMATOLOGICA")){
            TablaRegistrosSiUrinario();
        }
    }//GEN-LAST:event_buscar2MouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscar1;
    private javax.swing.JLabel buscar2;
    private javax.swing.JComboBox<String> cbxRelacion;
    private javax.swing.JComboBox<String> cbxSelecOpc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable tablaPastillas;
    // End of variables declaration//GEN-END:variables
}
