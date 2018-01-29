
package MenuRegistro;

import BaseDatos.ConexionMySQL;
import MenuRegistro.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroEnfermedades extends javax.swing.JPanel {
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public RegistroEnfermedades() {
        initComponents();
        modelo.addColumn("Nombre Enfermedad");
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre Enfermedad");
    }

    public void RegistroEnfermedades()
    {
        String[] titulos={"Codigo de enfermedad","Nombre de Enfermedad","tipo de enfermedad"} ;
        String[] registro=new String[3];      
        String asql="";
        modelo=new DefaultTableModel(null,titulos);
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asql="SELECT * FROM lista_total_enfermedades";
        
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);
            
            while(rs.next())
            {
                registro[0]=rs.getString("cod_enf");
                registro[1]=rs.getString("nom_enf");
                registro[2]=rs.getString("tipo_enf");
                
                modelo.addRow(registro);
            }
            tablaEnfermedades.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
    
    public void RegistroEnfermedadesCardiovascular()
    {     
        String[] titulos={"Codigo de enfermedad","Nombre de Enfermedad","tipo de enfermedad"};
        String[] registro=new String[3];            
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
 
        modelo=new DefaultTableModel(null,titulos);
        String a = "Enfermedades del Sistema Circulatorio";
        asql="SELECT * FROM lista_total_enfermedades "
                +"WHERE CONCAT(tipo_enf) LIKE '%"+a+"%'";         
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {          
                registro[0]=rs.getString("cod_enf");
                registro[1]=rs.getString("nom_enf");
                registro[2]=rs.getString("tipo_enf");
                 
                modelo.addRow(registro);
            }
            tablaEnfermedades.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        }  
    }
    
    public void RegistroEnfermedadesDigestivas(){
        String[] titulos={"Codigo de enfermedad","Nombre de Enfermedad","tipo de enfermedad"};
        String[] registro=new String[3];            
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
 
        modelo=new DefaultTableModel(null,titulos);
        String a = "Enfermedades del Sistema Disgestivo";
        asql="SELECT * FROM lista_total_enfermedades "
                +"WHERE CONCAT(tipo_enf) LIKE '%"+a+"%'";         
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {          
                registro[0]=rs.getString("cod_enf");
                registro[1]=rs.getString("nom_enf");
                registro[2]=rs.getString("tipo_enf");
                 
                modelo.addRow(registro);
            }
            tablaEnfermedades.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
    }
    public void RegistroEnfermedadesSiEndo(){
        String[] titulos={"Codigo de enfermedad","Nombre de Enfermedad","tipo de enfermedad"};
        String[] registro=new String[3];            
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
 
        modelo=new DefaultTableModel(null,titulos);
        String a = "Enfermedades Endocrinológicas";
        asql="SELECT * FROM lista_total_enfermedades "
                +"WHERE CONCAT(tipo_enf) LIKE '%"+a+"%'";         
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {          
                registro[0]=rs.getString("cod_enf");
                registro[1]=rs.getString("nom_enf");
                registro[2]=rs.getString("tipo_enf");
                 
                modelo.addRow(registro);
            }
            tablaEnfermedades.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
    }
    public void RegistroEnfermedadesInf(){
        String[] titulos={"Codigo de enfermedad","Nombre de Enfermedad","tipo de enfermedad"};
        String[] registro=new String[3];            
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
 
        modelo=new DefaultTableModel(null,titulos);
        String a = "Enfermedades Infecciosas";
        asql="SELECT * FROM lista_total_enfermedades "
                +"WHERE CONCAT(tipo_enf) LIKE '%"+a+"%'";         
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {          
                registro[0]=rs.getString("cod_enf");
                registro[1]=rs.getString("nom_enf");
                registro[2]=rs.getString("tipo_enf");
                 
                modelo.addRow(registro);
            }
            tablaEnfermedades.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
    }
    public void RegistroEnfermedadesNeo(){
        String[] titulos={"Codigo de enfermedad","Nombre de Enfermedad","tipo de enfermedad"};
        String[] registro=new String[3];            
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
 
        modelo=new DefaultTableModel(null,titulos);
        String a = "Enfermedades Neoplásicas";
        asql="SELECT * FROM lista_total_enfermedades "
                +"WHERE CONCAT(tipo_enf) LIKE '%"+a+"%'";         
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {          
                registro[0]=rs.getString("cod_enf");
                registro[1]=rs.getString("nom_enf");
                registro[2]=rs.getString("tipo_enf");
                 
                modelo.addRow(registro);
            }
            tablaEnfermedades.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
    }
    public void RegistroEnfermedadesPiel(){
        String[] titulos={"Codigo de enfermedad","Nombre de Enfermedad","tipo de enfermedad"};
        String[] registro=new String[3];            
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
 
        modelo=new DefaultTableModel(null,titulos);
        String a = "Enfermedades de la Piel";
        asql="SELECT * FROM lista_total_enfermedades "
                +"WHERE CONCAT(tipo_enf) LIKE '%"+a+"%'";         
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {          
                registro[0]=rs.getString("cod_enf");
                registro[1]=rs.getString("nom_enf");
                registro[2]=rs.getString("tipo_enf");
                 
                modelo.addRow(registro);
            }
            tablaEnfermedades.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
    }
    public void RegistroEnfermedadesPsi(){
        String[] titulos={"Codigo de enfermedad","Nombre de Enfermedad","tipo de enfermedad"};
        String[] registro=new String[3];            
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
 
        modelo=new DefaultTableModel(null,titulos);
        String a = "Transtornos Mentales y del Comportamiento";
        asql="SELECT * FROM lista_total_enfermedades "
                +"WHERE CONCAT(tipo_enf) LIKE '%"+a+"%'";         
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {          
                registro[0]=rs.getString("cod_enf");
                registro[1]=rs.getString("nom_enf");
                registro[2]=rs.getString("tipo_enf");
                 
                modelo.addRow(registro);
            }
            tablaEnfermedades.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
    }
    public void RegistroEnfermedadesRen(){
        String[] titulos={"Codigo de enfermedad","Nombre de Enfermedad","tipo de enfermedad"};
        String[] registro=new String[3];            
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
 
        modelo=new DefaultTableModel(null,titulos);
        String a = "Enfermedades del Sistema Urinario";
        asql="SELECT * FROM lista_total_enfermedades "
                +"WHERE CONCAT(tipo_enf) LIKE '%"+a+"%'";         
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {          
                registro[0]=rs.getString("cod_enf");
                registro[1]=rs.getString("nom_enf");
                registro[2]=rs.getString("tipo_enf");
                 
                modelo.addRow(registro);
            }
            tablaEnfermedades.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
    }
    public void RegistroEnfermedadesSiResp(){
        String[] titulos={"Codigo de enfermedad","Nombre de Enfermedad","tipo de enfermedad"};
        String[] registro=new String[3];            
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
 
        modelo=new DefaultTableModel(null,titulos);
        String a = "Enfermedades del Sistema Respiratorio";
        asql="SELECT * FROM lista_total_enfermedades "
                +"WHERE CONCAT(tipo_enf) LIKE '%"+a+"%'";         
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {          
                registro[0]=rs.getString("cod_enf");
                registro[1]=rs.getString("nom_enf");
                registro[2]=rs.getString("tipo_enf");
                 
                modelo.addRow(registro);
            }
            tablaEnfermedades.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
    }
    public void RegistroEnfermedadesReu(){
        String[] titulos={"Codigo de enfermedad","Nombre de Enfermedad","tipo de enfermedad"};
        String[] registro=new String[3];            
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
 
        modelo=new DefaultTableModel(null,titulos);
        String a = "Enfermedades Reumatológicas";
        asql="SELECT * FROM lista_total_enfermedades "
                +"WHERE CONCAT(tipo_enf) LIKE '%"+a+"%'";         
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {          
                registro[0]=rs.getString("cod_enf");
                registro[1]=rs.getString("nom_enf");
                registro[2]=rs.getString("tipo_enf");
                 
                modelo.addRow(registro);
            }
            tablaEnfermedades.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
    }
    public void RegistroEnfermedadesSangre(){
        String[] titulos={"Codigo de enfermedad","Nombre de Enfermedad","tipo de enfermedad"};
        String[] registro=new String[3];            
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
 
        modelo=new DefaultTableModel(null,titulos);
        String a = "Enfermedades de la Sangre";
        asql="SELECT * FROM lista_total_enfermedades "
                +"WHERE CONCAT(tipo_enf) LIKE '%"+a+"%'";         
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {          
                registro[0]=rs.getString("cod_enf");
                registro[1]=rs.getString("nom_enf");
                registro[2]=rs.getString("tipo_enf");
                 
                modelo.addRow(registro);
            }
            tablaEnfermedades.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        } 
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEnfermedades = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cbxTipoBusqueda = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxRelacion = new javax.swing.JComboBox<>();
        btnTipoBus = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/virus_2.png"))); // NOI18N
        jLabel1.setText("LISTA DE ENFERMEDADES");
        add(jLabel1);
        jLabel1.setBounds(20, 20, 290, 32);

        tablaEnfermedades.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        tablaEnfermedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaEnfermedades.setGridColor(new java.awt.Color(255, 255, 255));
        tablaEnfermedades.setSelectionBackground(new java.awt.Color(33, 169, 155));
        tablaEnfermedades.setShowHorizontalLines(false);
        tablaEnfermedades.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tablaEnfermedades);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 240, 700, 213);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Tipo de Busqueda");
        add(jLabel3);
        jLabel3.setBounds(70, 110, 99, 15);

        cbxTipoBusqueda.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cbxTipoBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su opcion...", "Busqueda por Tipo de Enfermedad", "TODAS LAS ENFERMEDADES" }));
        cbxTipoBusqueda.setBorder(null);
        add(cbxTipoBusqueda);
        cbxTipoBusqueda.setBounds(220, 110, 430, 19);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Tipo de Enfermedades");
        jLabel4.setEnabled(false);
        add(jLabel4);
        jLabel4.setBounds(70, 150, 123, 15);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar 16.png"))); // NOI18N
        jLabel5.setEnabled(false);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5);
        jLabel5.setBounds(680, 150, 24, 24);

        cbxRelacion.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cbxRelacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su Tipo de Enfermedad...", "SISTEMA CARDIOVASCULAR", "SISTEMA DIGESTIVO", "SISTEMA ENDOCRINO", "ENFERMEDADES INFECCIOSAS", "NEOPLAGIAS", "ENFERMEDADES DE LA PIEL", "ENFERMEDADES PQSIQUIATRIA", "ENFEMERDADES RENALES", "ENFERMEDADES DEL SISTEMA RESPIRATORIO", "ENFERMEDADES REUMATOLOGICA", "ENFERMEDADES DE LA SANGRE" }));
        cbxRelacion.setBorder(null);
        cbxRelacion.setEnabled(false);
        add(cbxRelacion);
        cbxRelacion.setBounds(220, 150, 430, 19);

        btnTipoBus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar 16.png"))); // NOI18N
        btnTipoBus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTipoBusMouseClicked(evt);
            }
        });
        add(btnTipoBus);
        btnTipoBus.setBounds(680, 100, 24, 24);
        add(jSeparator1);
        jSeparator1.setBounds(180, 80, 560, 17);
        add(jSeparator4);
        jSeparator4.setBounds(40, 80, 50, 30);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setToolTipText("");
        add(jSeparator5);
        jSeparator5.setBounds(40, 80, 20, 110);
        add(jSeparator6);
        jSeparator6.setBounds(40, 190, 700, 10);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setToolTipText("");
        add(jSeparator8);
        jSeparator8.setBounds(740, 80, 20, 110);

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel25.setText("BUSQUEDA");
        add(jLabel25);
        jLabel25.setBounds(100, 70, 90, 19);
        add(jSeparator7);
        jSeparator7.setBounds(20, 470, 740, 20);

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel24.setText("REGISTRO");
        add(jLabel24);
        jLabel24.setBounds(70, 210, 90, 19);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");
        add(jSeparator3);
        jSeparator3.setBounds(20, 220, 20, 250);
        add(jSeparator10);
        jSeparator10.setBounds(20, 220, 40, 30);
        add(jSeparator2);
        jSeparator2.setBounds(140, 220, 620, 10);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setToolTipText("");
        add(jSeparator9);
        jSeparator9.setBounds(760, 220, 20, 250);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTipoBusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTipoBusMouseClicked
        
        if(cbxTipoBusqueda.getSelectedItem().toString().equals("Busqueda por Tipo de Enfermedad")){
            
            jLabel4.setEnabled(true);
            jLabel5.setEnabled(true);
            cbxRelacion.setEnabled(true);
           
        }else{
            
            jLabel4.setEnabled(false);
            jLabel5.setEnabled(false);
            cbxRelacion.setEnabled(false);
            
            if(cbxTipoBusqueda.getSelectedItem().toString().equals("TODAS LAS ENFERMEDADES")){
                RegistroEnfermedades();             
            }
        }
        
            
    }//GEN-LAST:event_btnTipoBusMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        String valor=cbxRelacion.getSelectedItem().toString();
        if(valor.equals("SISTEMA CARDIOVASCULAR")){
            RegistroEnfermedadesCardiovascular();
        }else if(valor.equals("SISTEMA DIGESTIVO")){
            RegistroEnfermedadesDigestivas();
        }else if(valor.equals("SISTEMA ENDOCRINO")){
            RegistroEnfermedadesSiEndo();
        }else if(valor.equals("ENFERMEDADES INFECCIOSAS")){
            RegistroEnfermedadesInf();
        }else if(valor.equals("NEOPLAGIAS")){
            RegistroEnfermedadesNeo();
        }else if(valor.equals("ENFERMEDADES DE LA PIEL")){
            RegistroEnfermedadesPiel();
        }else if(valor.equals("ENFERMEDADES PQSIQUIATRIA")){
            RegistroEnfermedadesPsi();
        }else if(valor.equals("ENFEMERDADES RENALES")){
            RegistroEnfermedadesRen();
        }else if(valor.equals("ENFERMEDADES DEL SISTEMA RESPIRATORIO")){
            RegistroEnfermedadesSiResp();
        }else if(valor.equals("ENFERMEDADES REUMATOLOGICA")){
            RegistroEnfermedadesReu();
        }else if(valor.equals("ENFERMEDADES DE LA SANGRE")){
            RegistroEnfermedadesSangre();
        }
    }//GEN-LAST:event_jLabel5MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnTipoBus;
    private javax.swing.JComboBox<String> cbxRelacion;
    private javax.swing.JComboBox<String> cbxTipoBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JTable tablaEnfermedades;
    // End of variables declaration//GEN-END:variables
}
