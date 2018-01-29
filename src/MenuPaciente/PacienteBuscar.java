
package MenuPaciente;

import BaseDatos.ConexionMySQL;
import Algoritmos.Algoritmos;
import Algoritmos.PrintPdf;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*; 
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PacienteBuscar extends javax.swing.JPanel {
    double rimc;
    public PacienteBuscar() {
        initComponents();
    }
    
    
    public void buscarPaciente(String valor){    
        String asql="";
        String s,e;
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asql="SELECT * FROM paciente";
        
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);
            
            while(rs.next())
            {
                if(rs.getString("num_hisc").equals(valor)){
                    jTextField1.setText(rs.getString("num_hisc"));
                    jTextField9.setText(rs.getString("nom_pac"));
                    jTextField2.setText(rs.getString("apep_pac"));
                    jTextField3.setText(rs.getString("apem_pac"));
                    jTextField6.setText(rs.getString("talla"));
                    jTextField7.setText(rs.getString("peso"));
                    jTextField10.setText(rs.getString("ocupacion"));
                    jTextField11.setText(rs.getString("telefono"));
                    jTextField12.setText(rs.getString("dni_pac"));
                    jTextField5.setText(rs.getString("direccion"));
                    jTextField8.setText(rs.getString("fec_nac"));
                    s = rs.getString("sexo");
                    if(s.equals("Masculino")){
                        jComboBox2.setSelectedItem("Masculino");
                    }else if(s.equals("Femenino")){
                        jComboBox2.setSelectedItem("Femenino");
                    }
                    e=rs.getString("etnia");
                    if(e.equals("Latinos")){
                        jComboBox1.setSelectedItem("Latinos");
                    }else if(e.equals("Africa subsahariana")){
                        jComboBox1.setSelectedItem("Africa subsahariana");
                    }else if(e.equals("Oceanía")){
                        jComboBox1.setSelectedItem("Oceanía");
                    }else if(e.equals("Asia Oriental y del Sudeste")){
                        jComboBox1.setSelectedItem("Asia Oriental y del Sudeste");
                    }else if(e.equals("Europa y Medio Oriente")){
                        jComboBox1.setSelectedItem("Europa y Medio Oriente");
        
                    }else if(e.equals("India")){
                        jComboBox1.setSelectedItem("India");
                    }
                }
                
            }
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public void modificarDatos(){
        //CALCULO DE IMC
        double p,t;
        p=Double.parseDouble(jTextField7.getText());
        t=Double.parseDouble(jTextField6.getText());
        Algoritmos cimc = new Algoritmos();
        Algoritmos ri = new Algoritmos();
        rimc = ri.calculoIMC(p, t);
        
        String asql="";
        String mensaje="";
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asql="UPDATE paciente SET talla='"+jTextField6.getText()+"',peso='"
               +jTextField7.getText()+"',ocupacion='"+jTextField10.getText()
                +"',telefono='"+jTextField11.getText()+"',direccion='"+jTextField5.getText()+"',imc='"+rimc+"' WHERE num_hisc LIKE'%"+jTextField1.getText()+"%'";
        mensaje="Los Datos se han guardado de manera Satisfactoria...";
        
        try{
            PreparedStatement pst=cn.prepareStatement(asql);
            pst.executeUpdate();
            int n=pst.executeUpdate();
            
            if(n>0)
            {            
                JOptionPane.showMessageDialog(null,mensaje,"Guardando",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRecetas = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        pacienteLabel = new javax.swing.JLabel();
        pastilla2 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        pastilla1 = new javax.swing.JLabel();
        enfermedad = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField5 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jTextField10 = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jTextField11 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btnRecetar = new javax.swing.JLabel();
        lblActulizarDatos = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();
        jSeparator23 = new javax.swing.JSeparator();
        jSeparator24 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        jTextField8 = new javax.swing.JTextField();
        txtNHC = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jSeparator27 = new javax.swing.JSeparator();
        jSeparator28 = new javax.swing.JSeparator();
        jTextField13 = new javax.swing.JTextField();
        jSeparator29 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator30 = new javax.swing.JSeparator();
        jSeparator31 = new javax.swing.JSeparator();
        jSeparator33 = new javax.swing.JSeparator();
        jSeparator34 = new javax.swing.JSeparator();
        jTextField14 = new javax.swing.JTextField();
        jSeparator35 = new javax.swing.JSeparator();
        jLabel28 = new javax.swing.JLabel();
        jSeparator36 = new javax.swing.JSeparator();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator38 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        jSeparator40 = new javax.swing.JSeparator();
        jTextField15 = new javax.swing.JTextField();
        btnPrint = new javax.swing.JLabel();

        panelRecetas.setMinimumSize(new java.awt.Dimension(371, 283));
        panelRecetas.setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(54, 63, 74));
        jPanel1.setLayout(null);

        pacienteLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        pacienteLabel.setForeground(new java.awt.Color(0, 153, 153));
        pacienteLabel.setText("paciente");
        jPanel1.add(pacienteLabel);
        pacienteLabel.setBounds(130, 30, 170, 40);

        pastilla2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        pastilla2.setForeground(new java.awt.Color(0, 153, 153));
        pastilla2.setText("propil");
        jPanel1.add(pastilla2);
        pastilla2.setBounds(60, 190, 290, 20);

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Paciente: ");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(30, 30, 65, 40);

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Debe tomar las siguientes pastillas:");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(30, 100, 270, 50);

        pastilla1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        pastilla1.setForeground(new java.awt.Color(0, 153, 153));
        pastilla1.setText("axil");
        jPanel1.add(pastilla1);
        pastilla1.setBounds(60, 140, 290, 50);

        enfermedad.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        enfermedad.setForeground(new java.awt.Color(0, 153, 153));
        enfermedad.setText("enfermedad");
        jPanel1.add(enfermedad);
        enfermedad.setBounds(170, 70, 110, 50);

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Para tratar su:");
        jPanel1.add(jLabel30);
        jLabel30.setBounds(30, 70, 110, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar (1).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 10, 34, 14);

        panelRecetas.getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(780, 600));
        setMinimumSize(new java.awt.Dimension(780, 600));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel3.setText("Nombres");
        add(jLabel3);
        jLabel3.setBounds(60, 180, 60, 40);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel4.setText("Apellido Paterno");
        add(jLabel4);
        jLabel4.setBounds(60, 210, 110, 40);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel5.setText("Apellido Materno");
        add(jLabel5);
        jLabel5.setBounds(60, 240, 98, 40);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel6.setText("Sexo");
        add(jLabel6);
        jLabel6.setBounds(60, 290, 30, 20);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel7.setText("Fecha de Nacimiento");
        add(jLabel7);
        jLabel7.setBounds(60, 330, 122, 16);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel8.setText("Etnia");
        add(jLabel8);
        jLabel8.setBounds(300, 230, 30, 20);

        jTextField1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField1.setBorder(null);
        jTextField1.setEnabled(false);
        jTextField1.setOpaque(false);
        add(jTextField1);
        jTextField1.setBounds(210, 160, 70, 20);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1);
        jSeparator1.setBounds(210, 180, 70, 10);

        jTextField2.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField2.setBorder(null);
        jTextField2.setEnabled(false);
        jTextField2.setOpaque(false);
        add(jTextField2);
        jTextField2.setBounds(170, 220, 110, 20);

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2);
        jSeparator2.setBounds(170, 240, 110, 10);

        jTextField3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField3.setBorder(null);
        jTextField3.setEnabled(false);
        jTextField3.setOpaque(false);
        add(jTextField3);
        jTextField3.setBounds(170, 250, 110, 20);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3);
        jSeparator3.setBounds(170, 270, 110, 10);

        jTextField5.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField5.setBorder(null);
        jTextField5.setOpaque(false);
        add(jTextField5);
        jTextField5.setBounds(130, 370, 130, 20);

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator5);
        jSeparator5.setBounds(130, 390, 130, 10);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Latinos", "Africa subsahariana", "Oceanía", "Asia Oriental y del Sudeste", "Europa y Medio Oriente", "India" }));
        jComboBox1.setEnabled(false);
        add(jComboBox1);
        jComboBox1.setBounds(350, 230, 90, 20);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel9.setText("Resultados de las pruebas");
        add(jLabel9);
        jLabel9.setBounds(520, 160, 160, 50);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel10.setText("Peso");
        add(jLabel10);
        jLabel10.setBounds(300, 180, 27, 40);

        jTextField6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField6.setBorder(null);
        jTextField6.setOpaque(false);
        add(jTextField6);
        jTextField6.setBounds(340, 160, 50, 20);

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator6);
        jSeparator6.setBounds(340, 180, 50, 10);

        jTextField7.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField7.setBorder(null);
        jTextField7.setOpaque(false);
        add(jTextField7);
        jTextField7.setBounds(340, 190, 40, 20);

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator7);
        jSeparator7.setBounds(340, 210, 40, 10);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel12.setText("cm");
        add(jLabel12);
        jLabel12.setBounds(400, 170, 40, 16);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel13.setText("kg");
        add(jLabel13);
        jLabel13.setBounds(390, 190, 60, 20);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel14.setText("Buscar Paciente");
        add(jLabel14);
        jLabel14.setBounds(60, 50, 92, 40);

        jTextField9.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField9.setBorder(null);
        jTextField9.setEnabled(false);
        jTextField9.setOpaque(false);
        add(jTextField9);
        jTextField9.setBounds(130, 190, 150, 20);

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator9);
        jSeparator9.setBounds(190, 350, 90, 10);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel15.setText("Telf. de Referencia:");
        add(jLabel15);
        jLabel15.setBounds(60, 400, 118, 40);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel16.setText("Ocupación:");
        add(jLabel16);
        jLabel16.setBounds(60, 470, 65, 40);

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator10);
        jSeparator10.setBounds(140, 500, 100, 10);

        jTextField10.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField10.setBorder(null);
        jTextField10.setOpaque(false);
        add(jTextField10);
        jTextField10.setBounds(140, 480, 100, 20);

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator11);
        jSeparator11.setBounds(190, 430, 90, 10);

        jTextField11.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField11.setBorder(null);
        jTextField11.setOpaque(false);
        add(jTextField11);
        jTextField11.setBounds(190, 410, 90, 20);

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel23.setText("DNI");
        add(jLabel23);
        jLabel23.setBounds(60, 440, 40, 30);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel17.setText("Dirección:");
        add(jLabel17);
        jLabel17.setBounds(60, 370, 59, 20);

        jTextField12.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField12.setBorder(null);
        jTextField12.setEnabled(false);
        jTextField12.setOpaque(false);
        add(jTextField12);
        jTextField12.setBounds(100, 440, 120, 20);

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator12);
        jSeparator12.setBounds(100, 460, 120, 10);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        jComboBox2.setEnabled(false);
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2);
        jComboBox2.setBounds(120, 290, 100, 20);

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel21.setText("DATOS PERSONALES");
        add(jLabel21);
        jLabel21.setBounds(60, 130, 150, 19);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/historial-medico.png"))); // NOI18N
        jLabel18.setText("  Ver Diagnostico");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        add(jLabel18);
        jLabel18.setBounds(530, 240, 130, 30);

        btnRecetar.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnRecetar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuidado-de-la-salud.png"))); // NOI18N
        btnRecetar.setText("Ver Recetas Medicas");
        btnRecetar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRecetar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRecetarMouseClicked(evt);
            }
        });
        add(btnRecetar);
        btnRecetar.setBounds(530, 350, 150, 30);

        lblActulizarDatos.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblActulizarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        lblActulizarDatos.setText("  Actualizar Datos");
        lblActulizarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActulizarDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActulizarDatosMouseClicked(evt);
            }
        });
        add(lblActulizarDatos);
        lblActulizarDatos.setBounds(310, 270, 150, 30);
        add(jSeparator13);
        jSeparator13.setBounds(30, 30, 40, 20);
        add(jSeparator4);
        jSeparator4.setBounds(150, 30, 540, 10);

        jSeparator15.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator15);
        jSeparator15.setBounds(460, 140, 20, 380);

        jSeparator16.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator16);
        jSeparator16.setBounds(690, 30, 10, 80);
        add(jSeparator17);
        jSeparator17.setBounds(210, 140, 250, 20);

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel22.setText("DIAGNOSTICO");
        add(jLabel22);
        jLabel22.setBounds(520, 140, 100, 20);

        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator20);
        jSeparator20.setBounds(40, 140, 10, 380);
        add(jSeparator21);
        jSeparator21.setBounds(40, 140, 20, 20);
        add(jSeparator22);
        jSeparator22.setBounds(40, 520, 420, 20);
        add(jSeparator23);
        jSeparator23.setBounds(30, 110, 660, 10);

        jSeparator24.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator24);
        jSeparator24.setBounds(30, 30, 10, 80);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel19.setText("N° de Historial Clinico:");
        add(jLabel19);
        jLabel19.setBounds(60, 160, 135, 30);

        jComboBox3.addItem("Seleccionar Paciente");
        String asql="";
        String nh="",n="",ap="",am="";

        ConexionMySQL mysql=new ConexionMySQL();
        Connection cn=mysql.conectar();

        asql="SELECT * FROM paciente";

        try
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {
                nh=rs.getString("num_hisc");
                n=rs.getString("nom_pac");
                ap=rs.getString("apep_pac");
                am=rs.getString("apem_pac");
                //jComboBox3.addItem(ap+" "+am+" "+n+" ("+nh+")");
                jComboBox3.addItem(nh);
            }

        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        add(jComboBox3);
        jComboBox3.setBounds(180, 60, 410, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar 16.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        add(jLabel1);
        jLabel1.setBounds(620, 50, 40, 40);

        jSeparator19.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator19);
        jSeparator19.setBounds(130, 210, 150, 10);

        jTextField8.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField8.setBorder(null);
        jTextField8.setEnabled(false);
        jTextField8.setOpaque(false);
        add(jTextField8);
        jTextField8.setBounds(190, 330, 90, 20);

        txtNHC.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtNHC.setBorder(null);
        txtNHC.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNHC.setEnabled(false);
        txtNHC.setOpaque(false);
        add(txtNHC);
        txtNHC.setBounds(180, 80, 380, 30);
        add(jSeparator8);
        jSeparator8.setBounds(500, 150, 20, 60);

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel24.setText("BUSQUEDA");
        add(jLabel24);
        jLabel24.setBounds(70, 20, 150, 19);

        jSeparator25.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator25);
        jSeparator25.setBounds(700, 150, 20, 140);
        add(jSeparator26);
        jSeparator26.setBounds(500, 290, 200, 20);
        add(jSeparator27);
        jSeparator27.setBounds(620, 150, 80, 60);

        jSeparator28.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator28);
        jSeparator28.setBounds(500, 150, 60, 140);

        jTextField13.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField13.setBorder(null);
        jTextField13.setOpaque(false);
        add(jTextField13);
        jTextField13.setBounds(530, 200, 130, 20);

        jSeparator29.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator29);
        jSeparator29.setBounds(530, 220, 130, 10);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 13)); // NOI18N
        jLabel11.setText("Talla");
        add(jLabel11);
        jLabel11.setBounds(300, 150, 28, 40);

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel27.setText("RECETAS");
        add(jLabel27);
        jLabel27.setBounds(520, 310, 100, 20);
        add(jSeparator30);
        jSeparator30.setBounds(500, 320, 20, 60);

        jSeparator31.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator31);
        jSeparator31.setBounds(700, 320, 60, 80);
        add(jSeparator33);
        jSeparator33.setBounds(590, 320, 110, 60);

        jSeparator34.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator34);
        jSeparator34.setBounds(500, 320, 60, 80);

        jTextField14.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField14.setBorder(null);
        jTextField14.setOpaque(false);
        add(jTextField14);
        jTextField14.setBounds(540, 390, 130, 20);
        add(jSeparator35);
        jSeparator35.setBounds(500, 400, 200, 10);

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel28.setText("REPORTE");
        add(jLabel28);
        jLabel28.setBounds(520, 420, 100, 20);
        add(jSeparator36);
        jSeparator36.setBounds(500, 430, 20, 60);

        jSeparator37.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator37);
        jSeparator37.setBounds(700, 430, 20, 80);
        add(jSeparator38);
        jSeparator38.setBounds(500, 510, 200, 40);
        add(jSeparator39);
        jSeparator39.setBounds(590, 430, 110, 60);

        jSeparator40.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator40);
        jSeparator40.setBounds(500, 430, 60, 80);

        jTextField15.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jTextField15.setBorder(null);
        jTextField15.setOpaque(false);
        add(jTextField15);
        jTextField15.setBounds(540, 500, 130, 20);

        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro.png"))); // NOI18N
        btnPrint.setText("Generar PDF");
        btnPrint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPrintMouseClicked(evt);
            }
        });
        add(btnPrint);
        btnPrint.setBounds(530, 460, 150, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void btnRecetarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRecetarMouseClicked
        panelRecetas.setLocationRelativeTo(null);
        panelRecetas.setResizable(false);
        panelRecetas.setVisible(true);
        
    }//GEN-LAST:event_btnRecetarMouseClicked

    private void lblActulizarDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActulizarDatosMouseClicked
        modificarDatos();
    }//GEN-LAST:event_lblActulizarDatosMouseClicked

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        String asql="";
        String nh,n,ap,am;
        ConexionMySQL mysql=new ConexionMySQL();
        Connection cn=mysql.conectar();

        asql="SELECT * FROM paciente";

        try
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);

            while(rs.next())
            {
                nh=rs.getString("num_hisc");
                n=rs.getString("nom_pac");
                ap=rs.getString("apep_pac");
                am=rs.getString("apem_pac");
                if(jComboBox3.getSelectedItem().equals(rs.getString("num_hisc"))){
                    txtNHC.setText(ap+" "+am+" "+n);
                }
            }

        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        if(jComboBox3.getSelectedItem().equals("Seleccionar Paciente")){
            txtNHC.setText("");
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        String valor=jComboBox3.getSelectedItem().toString();
        buscarPaciente(valor);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        
        String historial = jTextField1.getText();
        
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asql="SELECT resultado FROM diagnostico WHERE num_hcdiag LIKE  '%"+historial+"%' ";
        
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);
            
            while(rs.next()){
                String resulDiag = rs.getString("resultado");
                jTextField13.setText(resulDiag);
            }
            
            
            
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        }        
                
        
        
        
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        panelRecetas.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrintMouseClicked
 
        String historial = jTextField1.getText();
        PrintPdf p1 = new PrintPdf();
        String mensaje="Se ha creado el reporte";
        JOptionPane.showMessageDialog(null,mensaje,"Reporte",JOptionPane.INFORMATION_MESSAGE);
        try {
            p1.print(historial);
        } catch (Exception ex) {
            Logger.getLogger(PacienteBuscar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPrintMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnPrint;
    private javax.swing.JLabel btnRecetar;
    private javax.swing.JLabel enfermedad;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel lblActulizarDatos;
    private javax.swing.JLabel pacienteLabel;
    private javax.swing.JDialog panelRecetas;
    private javax.swing.JLabel pastilla1;
    private javax.swing.JLabel pastilla2;
    private javax.swing.JTextField txtNHC;
    // End of variables declaration//GEN-END:variables
}
