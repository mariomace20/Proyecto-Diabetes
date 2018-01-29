
package MenuRegistro;

import BaseDatos.ConexionMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RegistroPacientes extends javax.swing.JPanel {
    DefaultTableModel modelo;
    
    public RegistroPacientes() {
        initComponents();
    }
    
    public void RegistroPacientes()
    {
        String[] titulos={"N° Historia Clinica","Nombres","apellido paterno","apellido materno","sexo","fecha de nacimiento","dni","estado civil","etnia"} ;
        String[] registro=new String[9];      
        String asql="";
        modelo=new DefaultTableModel(null,titulos);
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        asql="SELECT * FROM paciente";
                //+"WHERE num_hisc";
        
        try 
        {
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(asql);
            
            while(rs.next())
            {
                registro[0]=rs.getString("num_hisc");
                registro[1]=rs.getString("nom_pac");
                registro[2]=rs.getString("apep_pac");
                registro[3]=rs.getString("apem_pac");
                registro[4]=rs.getString("sexo");
                registro[5]=rs.getString("fec_nac");
                registro[6]=rs.getString("dni_pac");
                registro[7]=rs.getString("est_civil");
                registro[8]=rs.getString("etnia");
                
                modelo.addRow(registro);
            }
            tablaPacientes.setModel(modelo);
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }

    public void RegistroPacientesTIPOS(String valor)
    {     
        String[] registro=new String[9];      
        String asql="";
        
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection cn=mysql.conectar();
        
        
        if(valor.equals("NUMERO DE HISTORIAL CLINICO")){
            String[] titulos={"N° Historia Clinica","Nombres","apellido paterno","apellido materno","sexo","fecha de nacimiento","dni","estado civil","etnia"} ;
            modelo=new DefaultTableModel(null,titulos);
            asql="SELECT * FROM paciente";
            try 
            {
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(asql);

                while(rs.next())
                {
                    registro[0]=rs.getString("num_hisc");
                    registro[1]=rs.getString("nom_pac");
                    registro[2]=rs.getString("apep_pac");
                    registro[3]=rs.getString("apem_pac");
                    registro[4]=rs.getString("sexo");
                    registro[5]=rs.getString("fec_nac");
                    registro[6]=rs.getString("dni_pac");
                    registro[7]=rs.getString("est_civil");
                    registro[8]=rs.getString("etnia");

                    modelo.addRow(registro);
                }
                tablaPacientes.setModel(modelo);
            }
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null,ex);
            }   
        }else if(valor.equals("NOMBRES")){
            String[] titulos={"Nombres","apellido paterno","apellido materno","N° Historia Clinica","sexo","fecha de nacimiento","dni","estado civil","etnia"} ;
            modelo=new DefaultTableModel(null,titulos);
            asql="SELECT * FROM paciente";
            try 
            {
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(asql);

                while(rs.next())
                {
                    registro[0]=rs.getString("nom_pac");
                    registro[1]=rs.getString("apep_pac");
                    registro[2]=rs.getString("apem_pac");
                    registro[3]=rs.getString("num_hisc");
                    registro[4]=rs.getString("sexo");
                    registro[5]=rs.getString("fec_nac");
                    registro[6]=rs.getString("dni_pac");
                    registro[7]=rs.getString("est_civil");
                    registro[8]=rs.getString("etnia");

                    modelo.addRow(registro);
                }
                tablaPacientes.setModel(modelo);
            }
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null,ex);
            }            
        }else if(valor.equals("DNI")){
            String[] titulos={"DNI","N° Historia Clinica","Nombres","apellido paterno","apellido materno","sexo","fecha de nacimiento","estado civil","etnia"} ;
            modelo=new DefaultTableModel(null,titulos);
            asql="SELECT * FROM paciente WHERE dni_pac";
            try 
            {
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(asql);

                while(rs.next())
                {
                    registro[0]=rs.getString("dni_pac");
                    registro[1]=rs.getString("num_hisc");
                    registro[2]=rs.getString("nom_pac");
                    registro[3]=rs.getString("apep_pac");
                    registro[4]=rs.getString("apem_pac");
                    registro[5]=rs.getString("sexo");
                    registro[6]=rs.getString("fec_nac");
                    registro[7]=rs.getString("est_civil");
                    registro[8]=rs.getString("etnia");

                    modelo.addRow(registro);
                }
                tablaPacientes.setModel(modelo);
            }
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null,ex);
            }
        }else if(valor.equals("ETNIA")){
            String[] titulos={"ETNIA","N° Historia Clinica","Nombres","apellido paterno","apellido materno","sexo","fecha de nacimiento","dni","estado civil"} ;
            modelo=new DefaultTableModel(null,titulos);
            asql="SELECT * FROM paciente";
            try 
            {
                Statement st=cn.createStatement();
                ResultSet rs=st.executeQuery(asql);

                while(rs.next())
                {
                    registro[0]=rs.getString("etnia");
                    registro[1]=rs.getString("num_hisc");
                    registro[2]=rs.getString("nom_pac");
                    registro[3]=rs.getString("apep_pac");
                    registro[4]=rs.getString("apem_pac");
                    registro[5]=rs.getString("sexo");
                    registro[6]=rs.getString("fec_nac");
                    registro[7]=rs.getString("dni_pac");
                    registro[8]=rs.getString("est_civil");

                    modelo.addRow(registro);
                }
                tablaPacientes.setModel(modelo);
            }
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null,ex);
            }            
        }      
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscar2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        buscar1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbxRelacion = new javax.swing.JComboBox<>();
        cbxSelecOpc = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        buscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar 16.png"))); // NOI18N
        buscar2.setEnabled(false);
        buscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar2MouseClicked(evt);
            }
        });
        add(buscar2);
        buscar2.setBounds(670, 150, 24, 24);

        tablaPacientes.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaPacientes.setGridColor(new java.awt.Color(255, 255, 255));
        tablaPacientes.setSelectionBackground(new java.awt.Color(33, 169, 155));
        tablaPacientes.setShowHorizontalLines(false);
        tablaPacientes.setShowVerticalLines(false);
        jScrollPane1.setViewportView(tablaPacientes);

        add(jScrollPane1);
        jScrollPane1.setBounds(40, 240, 700, 213);

        buscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar 16.png"))); // NOI18N
        buscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar1MouseClicked(evt);
            }
        });
        add(buscar1);
        buscar1.setBounds(670, 110, 24, 24);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enfermera 32.png"))); // NOI18N
        jLabel1.setText("LISTA DE PACIENTES");
        add(jLabel1);
        jLabel1.setBounds(30, 20, 198, 32);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel4.setText("Registro de Pacientes por");
        jLabel4.setEnabled(false);
        add(jLabel4);
        jLabel4.setBounds(48, 150, 144, 15);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel3.setText("Tipo de Busqueda");
        add(jLabel3);
        jLabel3.setBounds(48, 110, 99, 15);

        cbxRelacion.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cbxRelacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su Tipo de Dato..", "NUMERO DE HISTORIAL CLINICO", "NOMBRES", "DNI", "ETNIA" }));
        cbxRelacion.setBorder(null);
        cbxRelacion.setEnabled(false);
        add(cbxRelacion);
        cbxRelacion.setBounds(220, 150, 430, 19);

        cbxSelecOpc.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cbxSelecOpc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su opcion...", "Busqueda por Tipo de Dato", "TODOS LOS PACIENTES" }));
        cbxSelecOpc.setBorder(null);
        add(cbxSelecOpc);
        cbxSelecOpc.setBounds(220, 110, 430, 19);

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel24.setText("REGISTRO");
        add(jLabel24);
        jLabel24.setBounds(70, 210, 90, 19);
        add(jSeparator1);
        jSeparator1.setBounds(168, 80, 560, 17);
        add(jSeparator2);
        jSeparator2.setBounds(140, 220, 620, 10);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");
        add(jSeparator3);
        jSeparator3.setBounds(20, 220, 20, 250);
        add(jSeparator4);
        jSeparator4.setBounds(30, 80, 50, 30);

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setToolTipText("");
        add(jSeparator5);
        jSeparator5.setBounds(30, 80, 20, 110);
        add(jSeparator6);
        jSeparator6.setBounds(30, 190, 700, 10);
        add(jSeparator7);
        jSeparator7.setBounds(20, 470, 740, 20);

        jSeparator8.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator8.setToolTipText("");
        add(jSeparator8);
        jSeparator8.setBounds(730, 80, 20, 110);

        jSeparator9.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator9.setToolTipText("");
        add(jSeparator9);
        jSeparator9.setBounds(760, 220, 20, 250);
        add(jSeparator10);
        jSeparator10.setBounds(20, 220, 40, 30);

        jLabel25.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        jLabel25.setText("BUSQUEDA");
        add(jLabel25);
        jLabel25.setBounds(90, 70, 90, 19);
    }// </editor-fold>//GEN-END:initComponents

    private void buscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar1MouseClicked
        
        if(cbxSelecOpc.getSelectedItem().toString().equals("TODOS LOS PACIENTES")){
            cbxRelacion.setEnabled(false);
            buscar2.setEnabled(false);
            jLabel4.setEnabled(false);  
        }
        
        if(cbxSelecOpc.getSelectedItem().toString().equals("Busqueda por Tipo de Dato")){
            
            cbxRelacion.setEnabled(true);
            buscar2.setEnabled(true);
            jLabel4.setEnabled(true);  
            
        }else{
            
            if(!cbxSelecOpc.getSelectedItem().toString().equals("Seleccione su opcion...")){
                RegistroPacientes();      
            }               
        }
        
        
    }//GEN-LAST:event_buscar1MouseClicked

    private void buscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar2MouseClicked
        
        String valor=cbxRelacion.getSelectedItem().toString();
        
        RegistroPacientesTIPOS(valor);
    }//GEN-LAST:event_buscar2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel buscar1;
    private javax.swing.JLabel buscar2;
    private javax.swing.JComboBox<String> cbxRelacion;
    private javax.swing.JComboBox<String> cbxSelecOpc;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables
}
