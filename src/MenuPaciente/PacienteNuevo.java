package MenuPaciente;

import Algoritmos.Algoritmos;
import Enfermedades.*;
import BaseDatos.ConexionMySQL;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class PacienteNuevo extends javax.swing.JPanel {
    String historial;
    double rimc;
    
    public PacienteNuevo() {
        initComponents();
        campOs.setVisible(false);
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
   
        
    
    public void agregarPaciente(){
        ConexionMySQL  mysql=new ConexionMySQL();
        Connection cn=mysql.conectar();
        
        String num_hc,nom,apep,apem,sexo,fn,dni,tel,est_c,direc,peso,talla,cint,emb="NO",ocu,etn,f;
        
        num_hc=txtNumHistorial.getText();
        setHistorial(num_hc);
        nom=txtNombres.getText();
        apep=txtApellidoPa.getText();
        apem=txtApellidoMa.getText();
        sexo=cbxSexo.getSelectedItem().toString();
        Date fecha =jdc.getDate();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        f = formato.format(fecha).toString();
        dni=txtDni.getText();
        tel=txtTelefono.getText();
        est_c=cbxEstadoCivil.getSelectedItem().toString();
        direc=txtDireccion.getText();
        peso=txtPeso.getText();
        talla=txtTalla.getText();
        cint=txtDiaCintura.getText();
        do{
            if(rbEmbarazo_Si.isSelected()==true){
                emb="SI";
            }else if(rbEmbarazo_No.isSelected()==true){
                emb="NO";
            }
        }while(rbEmbarazo_Si.isSelected()==false && rbEmbarazo_No.isSelected()==false);
        
        ocu=txtOcupacion.getText();
        etn=cbxEtnia.getSelectedItem().toString();
        
        String asql="";
        String mensaje="";
        
        asql = "INSERT INTO paciente(num_hisc, nom_pac, apep_pac, apem_pac, sexo, fec_nac, dni_pac, telefono, est_civil, direccion, peso, talla, dia_cint, embarazo, ocupacion, etnia,imc)"+
                "VALUES(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?,? )";
        
        mensaje="Los Datos se han guardado de manera Satisfactoria...";
        try 
        {
            PreparedStatement pst=cn.prepareStatement(asql);
            pst.setString(1, num_hc);
            pst.setString(2, nom);
            pst.setString(3, apep);
            pst.setString(4, apem);
            pst.setString(5, sexo);
            pst.setString(6, f);
            pst.setString(7, dni);
            pst.setString(8, tel);
            pst.setString(9, est_c);
            pst.setString(10, direc);
            pst.setString(11, peso);
            pst.setString(12, talla);
            pst.setString(13, cint);
            pst.setString(14, emb);
            pst.setString(15, ocu);
            pst.setString(16, etn);
            pst.setDouble(17, rimc);
                    
            int n=pst.executeUpdate();
            
            if(n>0)
            {            
                JOptionPane.showMessageDialog(null,mensaje,"Guardando",JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void agregarAnteFarma(){
        ConexionMySQL  mysql=new ConexionMySQL();
        Connection cn=mysql.conectar();
        
        String nh,t1,t2,t3,t4,t5,t6,alo="NO",an="NO",est="NO",tir="NO",pem="NO",inte="NO",tia="NO",va="NO";
        
        nh = txtNumHistorial.getText();
        t1 = txtToma1.getText();
        t2 = txtToma2.getText();
        t3 = txtToma3.getText();
        t4 = txtToma4.getText();
        t5 = txtToma5.getText();
        t6 = txtToma6.getText();
        
        if(chbxAl.isSelected()==true){
            alo = "SI";
        }
        if(chbxAn.isSelected()==true){
            an = "SI";
        }
        if(chbxEs.isSelected()==true){
            est = "SI";
        }
        if(chbxTir.isSelected()==true){
            tir = "SI";
        }
        if(chbxPe.isSelected()==true){
            pem = "SI";
        }
        if(chbxIn.isSelected()==true){
            inte = "SI";
        }
        if(chbxTia.isSelected()==true){
            tia = "SI";
        }
        if(chbxVa.isSelected()==true){
            va = "SI";
        }
        
        String asql="";
        String mensaje=""; 
        
        asql = "INSERT INTO antece_farmacologicos(num_hiscaf,toma_1,toma_2,toma_3,toma_4,toma_5,toma_6,aloxano,estrepto,pentamidina,vacor,aci_nico,tiroxina,interferon,tiazidas)"+
                "VALUES(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? )";
        
        mensaje="Los Datos se han guardado de manera Satisfactoria...";
        try 
        {
            PreparedStatement pst=cn.prepareStatement(asql);
            pst.setString(1, nh);
            pst.setString(2, t1);
            pst.setString(3, t2);
            pst.setString(4, t3);
            pst.setString(5, t4);
            pst.setString(6, t5);
            pst.setString(7, t6);
            pst.setString(8, alo);
            pst.setString(9, est);
            pst.setString(10, pem);
            pst.setString(11, va);
            pst.setString(12, an);
            pst.setString(13, tir);
            pst.setString(14, inte);
            pst.setString(15, tia);

            int n=pst.executeUpdate();
            
            if(n>0)
            {            
                JOptionPane.showMessageDialog(null,mensaje,"Guardando",JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void agregarSintomas(){
        
        //DECLARACION DE VARIABLES
        String poliu = "NO",polif = "NO",polid = "NO",mia = "NO",aste = "NO",para = "NO",prur = "NO",diges = "NO",perdi = "NO",nacio = "NO",diagdia = "NO",famil = "NO",agudez = "NO",acanto ="NO";

        // NECESARIOS PARA TENER PREDIABETES "2 DE ELLOS O LOS 3"
        if(chbxPoliurea.isSelected()){
            poliu = "SI";
        }
        if(chbxPolifagia.isSelected()){
            polif = "SI";
        }
        if(chbxPolidipsia.isSelected()){
            polid = "SI";
        }

        // OBTENIENDO LOS OTROS ITEMS
        if(chbxMiastenia.isSelected()){
            mia = "SI";
        }
        if(chbxAstemia.isSelected()){
            aste = "SI";
        }
        if(chbxParaestesia.isSelected()){
            para = "SI";
        }
        if(chbxPrurito.isSelected()){
            prur = "SI";
        }
        if(chbxDigestesias.isSelected()){
            diges = "SI";
        }
        if(chbxPerdiPeso.isSelected()){
            perdi = "SI";
        }
        if(chbxNacioMas4_5kg.isSelected()){
            nacio = "SI";
        }
        if(chbxDiagDiabetGestacional.isSelected()){
            diagdia = "SI";
        }
        if(chbxFamiliaresConDM.isSelected()){
            famil = "SI";
        }
        if(chbxAgudezVisual.isSelected()){
            agudez = "SI";
        }
        if(chbxAcantosisMigricans.isSelected()){
            acanto = "SI";
        }

        // ASIGNANDO DIAGNOSTICO

        Algoritmos a = new Algoritmos();
//        boolean preDiabetes = a.tienePreDiabetes(chbxPoliurea.isSelected(),chbxPolifagia.isSelected(),chbxPolidipsia.isSelected());

        // CONEXION A MYSQL...

        ConexionMySQL  mysql=new ConexionMySQL();
        Connection cn=mysql.conectar();

        String asql="";
        String mensaje="";

        asql = "INSERT INTO sintomas(num_hiscs,poliurea,polifagia,polidipsia,perd_peso,astenia,fam_p_grado,nac_peso,diag_diages,acantosis,paraestesia,disestesia,dis_agu_visual,prurito,miastenia,pas,pad,fr,fc)"+
        "VALUES(?, ? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? )";

        mensaje="Los Datos se han guardado de manera Satisfactoria...";

        try{

            PreparedStatement pst=cn.prepareStatement(asql);
            pst.setString(1,txtNumHistorial.getText());
            pst.setString(2,poliu);
            pst.setString(3,polif);
            pst.setString(4,polid);
            pst.setString(5,mia);
            pst.setString(6,aste);
            pst.setString(7,para);
            pst.setString(8,prur);
            pst.setString(9,diges);
            pst.setString(10,perdi);
            pst.setString(11,nacio);
            pst.setString(12,famil);
            pst.setString(13,agudez);
            pst.setString(14,acanto);
            pst.setString(15,agudez);
            pst.setString(16,pastxt.getText());
            pst.setString(17,padtxt.getText());
            pst.setString(18,frtxt.getText());
            pst.setString(19,fctxt.getText());

            int n=pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,mensaje,"Guardando",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    public void agregarExamenesC(){
        String hgli,hdl,ldl,ct,ga,ttg,tri;
        
        hgli = txtGlico.getText();
        hdl = txtColeHDL.getText();
        ldl = txtColeLDL.getText();
        ct = txtColeT.getText();
        ga = txtGluAyu.getText();
        ttg = txtTot.getText();
        tri = txtTri.getText();
         
        ConexionMySQL  mysql=new ConexionMySQL();
        Connection cn=mysql.conectar();

        String asql="";
        String mensaje="";  
        
        asql = "INSERT INTO exam_complementario(num_hiscec,hb_glicosilada,hdl,ldl,col_total,tgc,gluco_ayu,total_gluco)"+
                "VALUES(? ,? ,? ,? ,? ,? ,? ,? )";
        
        mensaje="Los Datos se han guardado de manera Satisfactoria...";
        
        try{
            PreparedStatement pst=cn.prepareStatement(asql);
            pst.setString(1, txtNumHistorial.getText());
            pst.setString(2, hgli);
            pst.setString(3, hdl);
            pst.setString(4, ldl);
            pst.setString(5, ct);
            pst.setString(6, tri);
            pst.setString(7, ga);
            pst.setString(8, ttg);
            
            int n=pst.executeUpdate();

            if(n>0){
                JOptionPane.showMessageDialog(null,mensaje,"Guardando",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNumHistorial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxSexo = new javax.swing.JComboBox<>();
        txtNombres = new javax.swing.JTextField();
        txtApellidoPa = new javax.swing.JTextField();
        txtApellidoMa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rbEmbarazo_No = new javax.swing.JRadioButton();
        rbEmbarazo_Si = new javax.swing.JRadioButton();
        txtDiaCintura = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        txtTalla = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtOcupacion = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cbxEtnia = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cbxEstadoCivil = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jdc = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jSeparator17 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        antecePato = new javax.swing.JPanel();
        btnEnferSistemaCirculatorio = new javax.swing.JButton();
        btnEnferSistemaRespi = new javax.swing.JButton();
        btnEnferInfecciosas = new javax.swing.JButton();
        btnNeoplasias = new javax.swing.JButton();
        btnEnferSangre = new javax.swing.JButton();
        btnEnferSisteDiges = new javax.swing.JButton();
        btnEnferPiel = new javax.swing.JButton();
        btnEnferReumatologicas = new javax.swing.JButton();
        btnTransMental = new javax.swing.JButton();
        btnEnferEndocrinologicas = new javax.swing.JButton();
        btnEnferSisteUri = new javax.swing.JButton();
        anteceFarmatolo = new javax.swing.JPanel();
        chbxAn = new javax.swing.JCheckBox();
        chbxEs = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        chbxTir = new javax.swing.JCheckBox();
        txtToma1 = new javax.swing.JTextField();
        chbxPe = new javax.swing.JCheckBox();
        txtToma2 = new javax.swing.JTextField();
        chbxVa = new javax.swing.JCheckBox();
        txtToma6 = new javax.swing.JTextField();
        chbxIn = new javax.swing.JCheckBox();
        txtToma4 = new javax.swing.JTextField();
        chbxTia = new javax.swing.JCheckBox();
        txtToma5 = new javax.swing.JTextField();
        txtToma3 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        chbxAl = new javax.swing.JCheckBox();
        btnGuardarAF = new javax.swing.JButton();
        sintom = new javax.swing.JPanel();
        chbxPoliurea = new javax.swing.JCheckBox();
        chbxPolifagia = new javax.swing.JCheckBox();
        chbxPolidipsia = new javax.swing.JCheckBox();
        chbxNacioMas4_5kg = new javax.swing.JCheckBox();
        chbxPerdiPeso = new javax.swing.JCheckBox();
        chbxFamiliaresConDM = new javax.swing.JCheckBox();
        chbxAstemia = new javax.swing.JCheckBox();
        chbxAgudezVisual = new javax.swing.JCheckBox();
        chbxParaestesia = new javax.swing.JCheckBox();
        chbxDiagDiabetGestacional = new javax.swing.JCheckBox();
        chbxDigestesias = new javax.swing.JCheckBox();
        chbxPrurito = new javax.swing.JCheckBox();
        pastxt = new javax.swing.JTextField();
        frtxt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        chbxMiastenia = new javax.swing.JCheckBox();
        padtxt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        chbxAcantosisMigricans = new javax.swing.JCheckBox();
        btnGuardarS = new javax.swing.JButton();
        fctxt = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        examComp = new javax.swing.JPanel();
        btnGuardarEC = new javax.swing.JButton();
        txtGluAyu = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txtGlico = new javax.swing.JTextField();
        txtTot = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtTri = new javax.swing.JTextField();
        txtColeHDL = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txtColeLDL = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtColeT = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        campOs = new javax.swing.JLabel();
        generar = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        jSeparator20 = new javax.swing.JSeparator();
        jSeparator21 = new javax.swing.JSeparator();
        jSeparator22 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(780, 600));
        setMinimumSize(new java.awt.Dimension(780, 600));
        setPreferredSize(new java.awt.Dimension(780, 600));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel1.setText("N° de Historial Clinico:");
        add(jLabel1);
        jLabel1.setBounds(60, 40, 120, 20);

        txtNumHistorial.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNumHistorial.setAutoscrolls(false);
        txtNumHistorial.setBorder(null);
        txtNumHistorial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumHistorialKeyTyped(evt);
            }
        });
        add(txtNumHistorial);
        txtNumHistorial.setBounds(180, 40, 80, 14);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel2.setText("Nombres:");
        add(jLabel2);
        jLabel2.setBounds(60, 60, 60, 50);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel3.setText("Apellido Paterno:");
        add(jLabel3);
        jLabel3.setBounds(60, 100, 90, 30);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel4.setText("Apellido Materno:");
        add(jLabel4);
        jLabel4.setBounds(60, 120, 100, 40);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel5.setText("Sexo:");
        add(jLabel5);
        jLabel5.setBounds(60, 160, 40, 14);

        cbxSexo.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        cbxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        cbxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSexoActionPerformed(evt);
            }
        });
        add(cbxSexo);
        cbxSexo.setBounds(110, 160, 93, 20);

        txtNombres.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombres.setAutoscrolls(false);
        txtNombres.setBorder(null);
        add(txtNombres);
        txtNombres.setBounds(130, 70, 130, 14);

        txtApellidoPa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoPa.setAutoscrolls(false);
        txtApellidoPa.setBorder(null);
        add(txtApellidoPa);
        txtApellidoPa.setBounds(160, 100, 100, 14);

        txtApellidoMa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtApellidoMa.setBorder(null);
        add(txtApellidoMa);
        txtApellidoMa.setBounds(160, 130, 100, 20);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento:");
        add(jLabel6);
        jLabel6.setBounds(60, 190, 120, 20);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel7.setText("Peso:");
        add(jLabel7);
        jLabel7.setBounds(290, 60, 30, 30);

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel8.setText("Talla:");
        add(jLabel8);
        jLabel8.setBounds(440, 60, 26, 30);

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel9.setText("Diametro de Cintura:");
        add(jLabel9);
        jLabel9.setBounds(290, 30, 106, 30);

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel10.setText("Embarazo:");
        add(jLabel10);
        jLabel10.setBounds(60, 250, 60, 20);

        rbEmbarazo_No.setText("No");
        rbEmbarazo_No.setContentAreaFilled(false);
        rbEmbarazo_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEmbarazo_NoActionPerformed(evt);
            }
        });
        add(rbEmbarazo_No);
        rbEmbarazo_No.setBounds(160, 230, 42, 60);

        rbEmbarazo_Si.setText("Si");
        rbEmbarazo_Si.setContentAreaFilled(false);
        rbEmbarazo_Si.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEmbarazo_SiActionPerformed(evt);
            }
        });
        add(rbEmbarazo_Si);
        rbEmbarazo_Si.setBounds(120, 240, 41, 40);

        txtDiaCintura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDiaCintura.setAutoscrolls(false);
        txtDiaCintura.setBorder(null);
        add(txtDiaCintura);
        txtDiaCintura.setBounds(410, 30, 60, 20);

        txtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeso.setAutoscrolls(false);
        txtPeso.setBorder(null);
        add(txtPeso);
        txtPeso.setBounds(330, 60, 50, 14);

        txtTalla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTalla.setAutoscrolls(false);
        txtTalla.setBorder(null);
        add(txtTalla);
        txtTalla.setBounds(480, 60, 50, 14);

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel11.setText("Telf. de Referencia:");
        add(jLabel11);
        jLabel11.setBounds(290, 150, 110, 30);

        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setAutoscrolls(false);
        txtTelefono.setBorder(null);
        add(txtTelefono);
        txtTelefono.setBounds(400, 150, 98, 20);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel12.setText("Ocupación:");
        add(jLabel12);
        jLabel12.setBounds(290, 120, 60, 30);

        txtOcupacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtOcupacion.setAutoscrolls(false);
        txtOcupacion.setBorder(null);
        add(txtOcupacion);
        txtOcupacion.setBounds(360, 120, 140, 20);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel13.setText("Etnia:");
        add(jLabel13);
        jLabel13.setBounds(60, 220, 50, 20);

        cbxEtnia.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        cbxEtnia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Latinos", "Africa subsahariana", "Oceanía", "Asia Oriental y del Sudeste", "Europa y Medio Oriente", "India" }));
        add(cbxEtnia);
        cbxEtnia.setBounds(110, 220, 140, 20);

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel14.setText("Estado Civil:");
        add(jLabel14);
        jLabel14.setBounds(410, 90, 62, 20);

        cbxEstadoCivil.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        cbxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado" }));
        add(cbxEstadoCivil);
        cbxEstadoCivil.setBounds(480, 90, 75, 20);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel15.setText("Dirección:");
        add(jLabel15);
        jLabel15.setBounds(290, 210, 70, 30);

        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDireccion.setAutoscrolls(false);
        txtDireccion.setBorder(null);
        add(txtDireccion);
        txtDireccion.setBounds(350, 210, 200, 14);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel16.setText("Edad:");
        add(jLabel16);
        jLabel16.setBounds(290, 90, 40, 30);

        txtEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEdad.setAutoscrolls(false);
        txtEdad.setBorder(null);
        add(txtEdad);
        txtEdad.setBounds(330, 90, 40, 14);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel17.setText("cm.");
        add(jLabel17);
        jLabel17.setBounds(480, 40, 50, 20);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel18.setText("cm.");
        add(jLabel18);
        jLabel18.setBounds(540, 60, 40, 30);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel19.setText("kg.");
        add(jLabel19);
        jLabel19.setBounds(390, 60, 28, 30);

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel23.setText("DNI:");
        add(jLabel23);
        jLabel23.setBounds(290, 180, 40, 30);

        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDni.setAutoscrolls(false);
        txtDni.setBorder(null);
        add(txtDni);
        txtDni.setBounds(330, 180, 90, 14);

        btnRegistrar.setBackground(new java.awt.Color(126, 199, 213));
        btnRegistrar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Guardar datos");
        btnRegistrar.setToolTipText("");
        btnRegistrar.setBorder(null);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        add(btnRegistrar);
        btnRegistrar.setBounds(360, 250, 130, 30);
        add(jdc);
        jdc.setBounds(180, 190, 100, 20);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1);
        jSeparator1.setBounds(160, 150, 100, 10);
        add(jSeparator2);
        jSeparator2.setBounds(180, 20, 410, 10);

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel20.setText("AGREGAR PACIENTE");
        add(jLabel20);
        jLabel20.setBounds(60, 10, 130, 20);
        add(jSeparator3);
        jSeparator3.setBounds(30, 290, 560, 20);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4);
        jSeparator4.setBounds(590, 20, 20, 270);
        add(jSeparator5);
        jSeparator5.setBounds(30, 20, 20, 30);

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator6);
        jSeparator6.setBounds(30, 20, 40, 270);

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator7);
        jSeparator7.setBounds(410, 50, 60, 10);

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator8);
        jSeparator8.setBounds(180, 60, 80, 30);

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator9);
        jSeparator9.setBounds(130, 90, 130, 30);

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator10);
        jSeparator10.setBounds(480, 80, 50, 10);

        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator11);
        jSeparator11.setBounds(160, 120, 100, 10);

        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator12);
        jSeparator12.setBounds(350, 230, 200, 10);

        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator13);
        jSeparator13.setBounds(330, 80, 50, 10);

        jSeparator14.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator14);
        jSeparator14.setBounds(330, 110, 40, 10);

        jSeparator15.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator15);
        jSeparator15.setBounds(360, 140, 140, 10);

        jSeparator16.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator16);
        jSeparator16.setBounds(400, 170, 100, 10);

        jSeparator17.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator17);
        jSeparator17.setBounds(330, 200, 90, 10);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 204));
        jTabbedPane1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(750, 230));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(750, 230));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(750, 230));

        antecePato.setBackground(new java.awt.Color(255, 255, 255));
        antecePato.setLayout(null);

        btnEnferSistemaCirculatorio.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnEnferSistemaCirculatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cardiograma.png"))); // NOI18N
        btnEnferSistemaCirculatorio.setText("Sistema Circulatorio");
        btnEnferSistemaCirculatorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        btnEnferSistemaCirculatorio.setContentAreaFilled(false);
        btnEnferSistemaCirculatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnferSistemaCirculatorioActionPerformed(evt);
            }
        });
        antecePato.add(btnEnferSistemaCirculatorio);
        btnEnferSistemaCirculatorio.setBounds(28, 16, 148, 37);

        btnEnferSistemaRespi.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnEnferSistemaRespi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pulmones.png"))); // NOI18N
        btnEnferSistemaRespi.setText("Sistema Respiratorio");
        btnEnferSistemaRespi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 254)));
        btnEnferSistemaRespi.setContentAreaFilled(false);
        btnEnferSistemaRespi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnferSistemaRespiActionPerformed(evt);
            }
        });
        antecePato.add(btnEnferSistemaRespi);
        btnEnferSistemaRespi.setBounds(194, 16, 155, 37);

        btnEnferInfecciosas.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnEnferInfecciosas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/virus.png"))); // NOI18N
        btnEnferInfecciosas.setText("Infecciosas");
        btnEnferInfecciosas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        btnEnferInfecciosas.setContentAreaFilled(false);
        btnEnferInfecciosas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnferInfecciosasActionPerformed(evt);
            }
        });
        antecePato.add(btnEnferInfecciosas);
        btnEnferInfecciosas.setBounds(28, 68, 112, 39);

        btnNeoplasias.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnNeoplasias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lazos-de-enfermedades.png"))); // NOI18N
        btnNeoplasias.setText(" Neoplasias");
        btnNeoplasias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        btnNeoplasias.setContentAreaFilled(false);
        btnNeoplasias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNeoplasiasActionPerformed(evt);
            }
        });
        antecePato.add(btnNeoplasias);
        btnNeoplasias.setBounds(298, 129, 130, 35);

        btnEnferSangre.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnEnferSangre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jeringa (1).png"))); // NOI18N
        btnEnferSangre.setText("Sangre y Organos Omomafopofleticos");
        btnEnferSangre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        btnEnferSangre.setContentAreaFilled(false);
        btnEnferSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnferSangreActionPerformed(evt);
            }
        });
        antecePato.add(btnEnferSangre);
        btnEnferSangre.setBounds(239, 68, 280, 38);

        btnEnferSisteDiges.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnEnferSisteDiges.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estomago.png"))); // NOI18N
        btnEnferSisteDiges.setText("Sistema Digestivo");
        btnEnferSisteDiges.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        btnEnferSisteDiges.setContentAreaFilled(false);
        btnEnferSisteDiges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnferSisteDigesActionPerformed(evt);
            }
        });
        antecePato.add(btnEnferSisteDiges);
        btnEnferSisteDiges.setBounds(367, 16, 137, 37);

        btnEnferPiel.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnEnferPiel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pelo.png"))); // NOI18N
        btnEnferPiel.setText("Piel");
        btnEnferPiel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        btnEnferPiel.setContentAreaFilled(false);
        btnEnferPiel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnferPielActionPerformed(evt);
            }
        });
        antecePato.add(btnEnferPiel);
        btnEnferPiel.setBounds(150, 69, 79, 37);

        btnEnferReumatologicas.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnEnferReumatologicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/hueso.png"))); // NOI18N
        btnEnferReumatologicas.setText("Reumatologicas");
        btnEnferReumatologicas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        btnEnferReumatologicas.setContentAreaFilled(false);
        btnEnferReumatologicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnferReumatologicasActionPerformed(evt);
            }
        });
        antecePato.add(btnEnferReumatologicas);
        btnEnferReumatologicas.setBounds(550, 70, 132, 35);

        btnTransMental.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnTransMental.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerebro.png"))); // NOI18N
        btnTransMental.setText(" Transtornos Mentales y del Coportamiento");
        btnTransMental.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        btnTransMental.setContentAreaFilled(false);
        btnTransMental.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransMentalActionPerformed(evt);
            }
        });
        antecePato.add(btnTransMental);
        btnTransMental.setBounds(28, 125, 252, 42);

        btnEnferEndocrinologicas.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnEnferEndocrinologicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rinon.png"))); // NOI18N
        btnEnferEndocrinologicas.setText("Endocrinologicas");
        btnEnferEndocrinologicas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        btnEnferEndocrinologicas.setContentAreaFilled(false);
        btnEnferEndocrinologicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnferEndocrinologicasActionPerformed(evt);
            }
        });
        antecePato.add(btnEnferEndocrinologicas);
        btnEnferEndocrinologicas.setBounds(522, 17, 154, 35);

        btnEnferSisteUri.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnEnferSisteUri.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rinon.png"))); // NOI18N
        btnEnferSisteUri.setText("Sistema urinario");
        btnEnferSisteUri.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        btnEnferSisteUri.setContentAreaFilled(false);
        btnEnferSisteUri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnferSisteUriActionPerformed(evt);
            }
        });
        antecePato.add(btnEnferSisteUri);
        btnEnferSisteUri.setBounds(450, 128, 155, 36);

        jTabbedPane1.addTab("    Antecedentes Patologicos   ", antecePato);

        anteceFarmatolo.setBackground(new java.awt.Color(255, 255, 255));
        anteceFarmatolo.setLayout(null);

        chbxAn.setForeground(new java.awt.Color(51, 102, 255));
        chbxAn.setText("Ácido Nicotímico");
        anteceFarmatolo.add(chbxAn);
        chbxAn.setBounds(150, 100, 130, 23);

        chbxEs.setForeground(new java.awt.Color(51, 102, 255));
        chbxEs.setText("Estreptozotocina");
        chbxEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxEsActionPerformed(evt);
            }
        });
        anteceFarmatolo.add(chbxEs);
        chbxEs.setBounds(280, 100, 150, 23);

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel21.setText("Ingrese los medicamentos que esta consumiendo:");
        anteceFarmatolo.add(jLabel21);
        jLabel21.setBounds(20, 10, 280, 14);

        chbxTir.setForeground(new java.awt.Color(51, 102, 255));
        chbxTir.setText("Tiroxina");
        anteceFarmatolo.add(chbxTir);
        chbxTir.setBounds(430, 100, 90, 23);

        txtToma1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        anteceFarmatolo.add(txtToma1);
        txtToma1.setBounds(20, 30, 191, 16);

        chbxPe.setForeground(new java.awt.Color(51, 102, 255));
        chbxPe.setText("Pemtamidina");
        anteceFarmatolo.add(chbxPe);
        chbxPe.setBounds(30, 120, 120, 23);

        txtToma2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        anteceFarmatolo.add(txtToma2);
        txtToma2.setBounds(230, 30, 236, 16);

        chbxVa.setForeground(new java.awt.Color(51, 102, 255));
        chbxVa.setText("Vacor");
        anteceFarmatolo.add(chbxVa);
        chbxVa.setBounds(430, 120, 90, 23);

        txtToma6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        txtToma6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToma6ActionPerformed(evt);
            }
        });
        anteceFarmatolo.add(txtToma6);
        txtToma6.setBounds(490, 50, 206, 16);

        chbxIn.setForeground(new java.awt.Color(51, 102, 255));
        chbxIn.setText("Interferon");
        anteceFarmatolo.add(chbxIn);
        chbxIn.setBounds(150, 120, 130, 23);

        txtToma4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        anteceFarmatolo.add(txtToma4);
        txtToma4.setBounds(20, 50, 191, 16);

        chbxTia.setForeground(new java.awt.Color(51, 102, 255));
        chbxTia.setText("Tiazidas");
        anteceFarmatolo.add(chbxTia);
        chbxTia.setBounds(280, 120, 150, 23);

        txtToma5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        anteceFarmatolo.add(txtToma5);
        txtToma5.setBounds(230, 50, 236, 16);

        txtToma3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        anteceFarmatolo.add(txtToma3);
        txtToma3.setBounds(490, 30, 206, 16);

        jLabel22.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel22.setText("¿Ha  tomado alguno de estos medicamentos?");
        anteceFarmatolo.add(jLabel22);
        jLabel22.setBounds(20, 80, 260, 14);

        chbxAl.setForeground(new java.awt.Color(51, 102, 255));
        chbxAl.setText("Aloxano");
        anteceFarmatolo.add(chbxAl);
        chbxAl.setBounds(30, 100, 120, 23);

        btnGuardarAF.setBackground(new java.awt.Color(126, 199, 213));
        btnGuardarAF.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnGuardarAF.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarAF.setText("Guardar Datos");
        btnGuardarAF.setBorder(null);
        btnGuardarAF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAFActionPerformed(evt);
            }
        });
        anteceFarmatolo.add(btnGuardarAF);
        btnGuardarAF.setBounds(540, 100, 147, 30);

        jTabbedPane1.addTab("    Antecedentes Farmatologicos     ", anteceFarmatolo);

        sintom.setBackground(new java.awt.Color(255, 255, 255));
        sintom.setLayout(null);

        chbxPoliurea.setForeground(new java.awt.Color(102, 102, 255));
        chbxPoliurea.setText("Poliurea");
        chbxPoliurea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        chbxPoliurea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxPoliureaActionPerformed(evt);
            }
        });
        sintom.add(chbxPoliurea);
        chbxPoliurea.setBounds(21, 10, 80, 20);

        chbxPolifagia.setForeground(new java.awt.Color(102, 102, 255));
        chbxPolifagia.setText("Polifagia");
        sintom.add(chbxPolifagia);
        chbxPolifagia.setBounds(19, 28, 80, 30);

        chbxPolidipsia.setForeground(new java.awt.Color(102, 102, 255));
        chbxPolidipsia.setText("Polidipsia");
        sintom.add(chbxPolidipsia);
        chbxPolidipsia.setBounds(19, 54, 80, 30);

        chbxNacioMas4_5kg.setForeground(new java.awt.Color(102, 102, 255));
        chbxNacioMas4_5kg.setText("Nacio con mas de 4.5kg");
        sintom.add(chbxNacioMas4_5kg);
        chbxNacioMas4_5kg.setBounds(190, 33, 190, 30);

        chbxPerdiPeso.setForeground(new java.awt.Color(102, 102, 255));
        chbxPerdiPeso.setText("Perdida de peso");
        sintom.add(chbxPerdiPeso);
        chbxPerdiPeso.setBounds(190, 10, 190, 23);

        chbxFamiliaresConDM.setForeground(new java.awt.Color(102, 102, 255));
        chbxFamiliaresConDM.setText("Familiares de primer grado con D.M.(hijos-madre-padre)");
        sintom.add(chbxFamiliaresConDM);
        chbxFamiliaresConDM.setBounds(190, 80, 520, 30);

        chbxAstemia.setForeground(new java.awt.Color(102, 102, 255));
        chbxAstemia.setText("Astemia");
        sintom.add(chbxAstemia);
        chbxAstemia.setBounds(99, 8, 140, 23);

        chbxAgudezVisual.setForeground(new java.awt.Color(102, 102, 255));
        chbxAgudezVisual.setText("Disminición de la Agudez Visual");
        chbxAgudezVisual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxAgudezVisualActionPerformed(evt);
            }
        });
        sintom.add(chbxAgudezVisual);
        chbxAgudezVisual.setBounds(190, 60, 520, 23);

        chbxParaestesia.setForeground(new java.awt.Color(102, 102, 255));
        chbxParaestesia.setText("Paraestesia");
        sintom.add(chbxParaestesia);
        chbxParaestesia.setBounds(99, 28, 140, 30);

        chbxDiagDiabetGestacional.setForeground(new java.awt.Color(102, 102, 255));
        chbxDiagDiabetGestacional.setText("Diagnóstico anterior de Diabetes gestacional");
        sintom.add(chbxDiagDiabetGestacional);
        chbxDiagDiabetGestacional.setBounds(380, 10, 330, 30);

        chbxDigestesias.setForeground(new java.awt.Color(102, 102, 255));
        chbxDigestesias.setText("Digestesias");
        sintom.add(chbxDigestesias);
        chbxDigestesias.setBounds(100, 83, 90, 23);

        chbxPrurito.setForeground(new java.awt.Color(102, 102, 255));
        chbxPrurito.setText("Prurito");
        sintom.add(chbxPrurito);
        chbxPrurito.setBounds(98, 54, 140, 30);

        pastxt.setForeground(new java.awt.Color(51, 102, 255));
        pastxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sintom.add(pastxt);
        pastxt.setBounds(70, 120, 160, 16);

        frtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sintom.add(frtxt);
        frtxt.setBounds(70, 140, 160, 16);

        jLabel27.setText("PAD:");
        sintom.add(jLabel27);
        jLabel27.setBounds(250, 120, 30, 14);

        chbxMiastenia.setForeground(new java.awt.Color(102, 102, 255));
        chbxMiastenia.setText("Miastenia");
        sintom.add(chbxMiastenia);
        chbxMiastenia.setBounds(19, 84, 90, 23);

        padtxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sintom.add(padtxt);
        padtxt.setBounds(290, 120, 160, 16);

        jLabel25.setText("FC:");
        sintom.add(jLabel25);
        jLabel25.setBounds(250, 140, 30, 14);

        chbxAcantosisMigricans.setForeground(new java.awt.Color(102, 102, 255));
        chbxAcantosisMigricans.setText("Acantosis migricans");
        sintom.add(chbxAcantosisMigricans);
        chbxAcantosisMigricans.setBounds(380, 40, 330, 23);

        btnGuardarS.setBackground(new java.awt.Color(126, 199, 213));
        btnGuardarS.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnGuardarS.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarS.setText("Guardar Datos");
        btnGuardarS.setBorder(null);
        btnGuardarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSActionPerformed(evt);
            }
        });
        sintom.add(btnGuardarS);
        btnGuardarS.setBounds(490, 120, 125, 31);

        fctxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        sintom.add(fctxt);
        fctxt.setBounds(290, 140, 160, 16);

        jLabel26.setText("PAS:");
        sintom.add(jLabel26);
        jLabel26.setBounds(30, 120, 30, 14);

        jLabel28.setText("FR:");
        sintom.add(jLabel28);
        jLabel28.setBounds(30, 140, 30, 14);

        jTabbedPane1.addTab("      Sintomas     ", sintom);

        examComp.setBackground(new java.awt.Color(255, 255, 255));
        examComp.setLayout(null);

        btnGuardarEC.setBackground(new java.awt.Color(126, 199, 213));
        btnGuardarEC.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        btnGuardarEC.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarEC.setText("Guardar Datos");
        btnGuardarEC.setBorder(null);
        btnGuardarEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarECActionPerformed(evt);
            }
        });
        examComp.add(btnGuardarEC);
        btnGuardarEC.setBounds(560, 30, 147, 32);
        examComp.add(txtGluAyu);
        txtGluAyu.setBounds(390, 10, 84, 20);

        jLabel33.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel33.setText("Test de tolerancia a glucosa :");
        examComp.add(jLabel33);
        jLabel33.setBounds(280, 70, 147, 14);
        examComp.add(txtGlico);
        txtGlico.setBounds(140, 10, 84, 20);
        examComp.add(txtTot);
        txtTot.setBounds(440, 70, 84, 20);

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel24.setText("Hb. Glicosilada :");
        examComp.add(jLabel24);
        jLabel24.setBounds(21, 16, 90, 14);

        jLabel34.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel34.setText("Triglicéridos :");
        examComp.add(jLabel34);
        jLabel34.setBounds(280, 40, 69, 20);

        jLabel29.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel29.setText("Colesterol HDL :");
        examComp.add(jLabel29);
        jLabel29.setBounds(20, 40, 90, 20);
        examComp.add(txtTri);
        txtTri.setBounds(370, 40, 84, 20);
        examComp.add(txtColeHDL);
        txtColeHDL.setBounds(140, 40, 84, 20);

        jLabel30.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel30.setText("Colesterol LDL :");
        examComp.add(jLabel30);
        jLabel30.setBounds(20, 70, 100, 20);
        examComp.add(txtColeLDL);
        txtColeLDL.setBounds(140, 70, 84, 20);

        jLabel31.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel31.setText("Colesterol total :");
        examComp.add(jLabel31);
        jLabel31.setBounds(20, 100, 100, 20);
        examComp.add(txtColeT);
        txtColeT.setBounds(140, 100, 84, 20);

        jLabel32.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel32.setText("Glucosa en ayunas :");
        examComp.add(jLabel32);
        jLabel32.setBounds(280, 10, 98, 20);

        jTabbedPane1.addTab("     Examenes Complementarios   ", examComp);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(10, 300, 750, 260);

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jLabel35.setText("DIAGNOSTICO");
        add(jLabel35);
        jLabel35.setBounds(640, 10, 90, 40);

        campOs.setFont(new java.awt.Font("Trebuchet MS", 2, 11)); // NOI18N
        campOs.setForeground(new java.awt.Color(255, 0, 0));
        campOs.setText("*Campos llenos porfavor");
        campOs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campOsKeyTyped(evt);
            }
        });
        add(campOs);
        campOs.setBounds(620, 100, 130, 30);

        generar.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        generar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/historial-medico_2.png"))); // NOI18N
        generar.setText(" Generar");
        generar.setEnabled(false);
        generar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generarMouseClicked(evt);
            }
        });
        add(generar);
        generar.setBounds(640, 50, 100, 50);
        add(jSeparator18);
        jSeparator18.setBounds(720, 30, 30, 10);
        add(jSeparator19);
        jSeparator19.setBounds(610, 150, 140, 10);

        jSeparator20.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator20);
        jSeparator20.setBounds(750, 30, 10, 120);

        jSeparator21.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator21);
        jSeparator21.setBounds(610, 30, 70, 120);
        add(jSeparator22);
        jSeparator22.setBounds(610, 30, 20, 10);
    }// </editor-fold>//GEN-END:initComponents

    private void rbEmbarazo_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEmbarazo_NoActionPerformed
        this.rbEmbarazo_No.getSelectedIcon();
        this.rbEmbarazo_Si.setSelected(false);
    }//GEN-LAST:event_rbEmbarazo_NoActionPerformed

    private void rbEmbarazo_SiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEmbarazo_SiActionPerformed
        this.rbEmbarazo_Si.getSelectedIcon();
        this.rbEmbarazo_No.setSelected(false);
    }//GEN-LAST:event_rbEmbarazo_SiActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        double p,t;
        p=Double.parseDouble(txtPeso.getText());
        t=Double.parseDouble(txtTalla.getText());
        Algoritmos ri = new Algoritmos();
        rimc = ri.calculoIMC(p, t);
        agregarPaciente();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEnferSistemaCirculatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnferSistemaCirculatorioActionPerformed
        String a = txtNumHistorial.getText();
        Cardiovascular crv = new Cardiovascular(a);
        crv.setVisible(true);
        btnEnferSistemaCirculatorio.setEnabled(false);
    }//GEN-LAST:event_btnEnferSistemaCirculatorioActionPerformed

    private void btnEnferSistemaRespiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnferSistemaRespiActionPerformed
        String a = txtNumHistorial.getText();
        Respiratorio rp = new Respiratorio(a);
        rp.setVisible(true);
        btnEnferSistemaRespi.setEnabled(false);
    }//GEN-LAST:event_btnEnferSistemaRespiActionPerformed

    private void btnEnferInfecciosasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnferInfecciosasActionPerformed
        String a = txtNumHistorial.getText();
        Infecciosa i=new Infecciosa(a);
        i.setVisible(true);
        btnEnferInfecciosas.setEnabled(false);
    }//GEN-LAST:event_btnEnferInfecciosasActionPerformed

    private void btnNeoplasiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNeoplasiasActionPerformed
        String a = txtNumHistorial.getText();
        Neoplasia n = new Neoplasia(a);
        n.setVisible(true);
        btnNeoplasias.setEnabled(false);
    }//GEN-LAST:event_btnNeoplasiasActionPerformed

    private void btnEnferSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnferSangreActionPerformed
        String a = txtNumHistorial.getText();
        Sangre s = new Sangre(a);
        s.setVisible(true);
        btnEnferSangre.setEnabled(false);
    }//GEN-LAST:event_btnEnferSangreActionPerformed

    private void btnEnferSisteDigesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnferSisteDigesActionPerformed
        String a = txtNumHistorial.getText();
        Digestivo d = new Digestivo(a);
        d.setVisible(true);
        btnEnferSisteDiges.setEnabled(false);
    }//GEN-LAST:event_btnEnferSisteDigesActionPerformed

    private void btnEnferPielActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnferPielActionPerformed
        String a = txtNumHistorial.getText();
        Piel p = new Piel(a);
        p.setVisible(true);
        btnEnferPiel.setEnabled(false);
    }//GEN-LAST:event_btnEnferPielActionPerformed

    private void btnEnferReumatologicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnferReumatologicasActionPerformed
        String a = txtNumHistorial.getText();
        Reuma r = new Reuma(a);
        r.setVisible(true);
        btnEnferReumatologicas.setEnabled(false);
    }//GEN-LAST:event_btnEnferReumatologicasActionPerformed

    private void btnTransMentalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransMentalActionPerformed
        String a = txtNumHistorial.getText();
        Psiquiatria p = new Psiquiatria(a);
        p.setVisible(true);
        btnTransMental.setEnabled(false);
    }//GEN-LAST:event_btnTransMentalActionPerformed

    private void btnEnferEndocrinologicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnferEndocrinologicasActionPerformed
        String a = txtNumHistorial.getText();
        Endocrino e = new Endocrino(a);
        e.setVisible(true);
        btnEnferEndocrinologicas.setEnabled(false);
    }//GEN-LAST:event_btnEnferEndocrinologicasActionPerformed

    private void btnEnferSisteUriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnferSisteUriActionPerformed
        String a = txtNumHistorial.getText();
        Renal r = new Renal(a);
        r.setVisible(true);
        btnEnferSisteUri.setEnabled(false);
    }//GEN-LAST:event_btnEnferSisteUriActionPerformed

    private void btnGuardarAFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAFActionPerformed
        agregarAnteFarma();
    }//GEN-LAST:event_btnGuardarAFActionPerformed

    private void btnGuardarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSActionPerformed
        agregarSintomas();
    }//GEN-LAST:event_btnGuardarSActionPerformed

    private void btnGuardarECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarECActionPerformed
        agregarExamenesC();
        generar.setEnabled(true);
        campOs.setText("Campos Llenados");
        setLblColor(campOs);
    }//GEN-LAST:event_btnGuardarECActionPerformed

    private void txtToma6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToma6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToma6ActionPerformed

    private void chbxEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxEsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxEsActionPerformed

    private void chbxAgudezVisualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxAgudezVisualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxAgudezVisualActionPerformed

    private void chbxPoliureaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxPoliureaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbxPoliureaActionPerformed

    private void cbxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSexoActionPerformed
        if(cbxSexo.getSelectedItem().equals("Masculino")){
            this.rbEmbarazo_Si.setEnabled(false);
            this.rbEmbarazo_No.setSelected(true);
            this.rbEmbarazo_Si.setSelected(false);
        }else if(cbxSexo.getSelectedItem().equals("Femenino")){
            this.rbEmbarazo_Si.setEnabled(true);
            this.rbEmbarazo_No.getSelectedIcon();
            this.rbEmbarazo_No.setSelected(false);
}
    }//GEN-LAST:event_cbxSexoActionPerformed

    private void generarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarMouseClicked
        String pu,pf,pd,fcd,dadg;
        if(chbxPoliurea.isSelected()){
            pu="SI";
        }else{
            pu="NO";
        }
        if(chbxPolifagia.isSelected()){
            pf="SI";
        }else{
            pf="NO";
        }
        if(chbxPolidipsia.isSelected()){
            pd="SI";
        }else{
            pd="NO";
        }
        if(chbxFamiliaresConDM.isSelected()){
            fcd="SI";
        }else{
            fcd="NO";
        }
        if(chbxDiagDiabetGestacional.isSelected()){
            dadg="SI";
        }else{
            dadg="NO";
        }
        String em="NO";
        if(rbEmbarazo_Si.isSelected()){
            em="SI";
        }
        double ga=Double.parseDouble(txtGluAyu.getText());
        double tt=Double.parseDouble(txtTot.getText());
        double gs=Double.parseDouble(txtGlico.getText());
        Algoritmos a = new Algoritmos();
        Algoritmos a1 = new Algoritmos();
        Algoritmos a2 = new Algoritmos();
        
        String res1=a1.tienePreDiabetesCHECK(pu, pf, pd);
        String res2=a2.tieneDiabetes(fcd, dadg, em, ga, gs);
        
        String diag="Diagnostico de Diabetes Negativo";
        if(res1.equals("PREDIABETES")){
            diag = res1;
        }
        if((ga>= 100 && ga<=125)||(tt>=140 && tt<=1995)||(gs>=5.7 && gs<=6.4)){
            diag= "PREDIABETES ";
        }
        if(res2.equals("Tiene Diabetes Tipo I")||res2.equals("Tiene Diabetes Gestacional")||res2.equals("Tiene Diabetes Tipo II")){
            diag = res2;
        }
        
        ConexionMySQL  mysql=new ConexionMySQL();
        Connection cn=mysql.conectar();
        
        String asql="";
        String mensaje="";
        
        asql = "INSERT INTO diagnostico(num_hcdiag,resultado)"+
                "VALUES(? ,? )";
        
        mensaje="Los Datos se han calculado y guardado de manera Satisfactoria...";
        try 
        {
            PreparedStatement pst=cn.prepareStatement(asql);
            pst.setString(1, txtNumHistorial.getText());
            pst.setString(2, diag); 
                    
            int n=pst.executeUpdate();
            
            if(n>0)
            {            
                JOptionPane.showMessageDialog(null,mensaje,"Guardando",JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_generarMouseClicked

    private void txtNumHistorialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumHistorialKeyTyped
        campOs.setVisible(true);
        
    }//GEN-LAST:event_txtNumHistorialKeyTyped

    private void campOsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campOsKeyTyped
       
    }//GEN-LAST:event_campOsKeyTyped

    public void setLblColor(JLabel lbl){
        lbl.setForeground(new Color(0, 153, 0));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel anteceFarmatolo;
    private javax.swing.JPanel antecePato;
    private javax.swing.JButton btnEnferEndocrinologicas;
    private javax.swing.JButton btnEnferInfecciosas;
    private javax.swing.JButton btnEnferPiel;
    private javax.swing.JButton btnEnferReumatologicas;
    private javax.swing.JButton btnEnferSangre;
    private javax.swing.JButton btnEnferSisteDiges;
    private javax.swing.JButton btnEnferSisteUri;
    private javax.swing.JButton btnEnferSistemaCirculatorio;
    private javax.swing.JButton btnEnferSistemaRespi;
    private javax.swing.JButton btnGuardarAF;
    private javax.swing.JButton btnGuardarEC;
    private javax.swing.JButton btnGuardarS;
    private javax.swing.JButton btnNeoplasias;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnTransMental;
    private javax.swing.JLabel campOs;
    private javax.swing.JComboBox<String> cbxEstadoCivil;
    private javax.swing.JComboBox<String> cbxEtnia;
    private javax.swing.JComboBox<String> cbxSexo;
    private javax.swing.JCheckBox chbxAcantosisMigricans;
    private javax.swing.JCheckBox chbxAgudezVisual;
    private javax.swing.JCheckBox chbxAl;
    private javax.swing.JCheckBox chbxAn;
    private javax.swing.JCheckBox chbxAstemia;
    private javax.swing.JCheckBox chbxDiagDiabetGestacional;
    private javax.swing.JCheckBox chbxDigestesias;
    private javax.swing.JCheckBox chbxEs;
    private javax.swing.JCheckBox chbxFamiliaresConDM;
    private javax.swing.JCheckBox chbxIn;
    private javax.swing.JCheckBox chbxMiastenia;
    private javax.swing.JCheckBox chbxNacioMas4_5kg;
    private javax.swing.JCheckBox chbxParaestesia;
    private javax.swing.JCheckBox chbxPe;
    private javax.swing.JCheckBox chbxPerdiPeso;
    private javax.swing.JCheckBox chbxPolidipsia;
    private javax.swing.JCheckBox chbxPolifagia;
    private javax.swing.JCheckBox chbxPoliurea;
    private javax.swing.JCheckBox chbxPrurito;
    private javax.swing.JCheckBox chbxTia;
    private javax.swing.JCheckBox chbxTir;
    private javax.swing.JCheckBox chbxVa;
    private javax.swing.JPanel examComp;
    private javax.swing.JTextField fctxt;
    private javax.swing.JTextField frtxt;
    private javax.swing.JLabel generar;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
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
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private com.toedter.calendar.JDateChooser jdc;
    private javax.swing.JTextField padtxt;
    private javax.swing.JTextField pastxt;
    private javax.swing.JRadioButton rbEmbarazo_No;
    private javax.swing.JRadioButton rbEmbarazo_Si;
    private javax.swing.JPanel sintom;
    private javax.swing.JTextField txtApellidoMa;
    private javax.swing.JTextField txtApellidoPa;
    private javax.swing.JTextField txtColeHDL;
    private javax.swing.JTextField txtColeLDL;
    private javax.swing.JTextField txtColeT;
    private javax.swing.JTextField txtDiaCintura;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtGlico;
    private javax.swing.JTextField txtGluAyu;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumHistorial;
    private javax.swing.JTextField txtOcupacion;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTalla;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtToma1;
    private javax.swing.JTextField txtToma2;
    private javax.swing.JTextField txtToma3;
    private javax.swing.JTextField txtToma4;
    private javax.swing.JTextField txtToma5;
    private javax.swing.JTextField txtToma6;
    private javax.swing.JTextField txtTot;
    private javax.swing.JTextField txtTri;
    // End of variables declaration//GEN-END:variables
}
