
package Algoritmos;

import BaseDatos.ConexionMySQL;
import MenuPaciente.PacienteNuevo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.*;

public class ProcesarReceta{
    
    PacienteNuevo pacientenew = new PacienteNuevo();
    
    ArrayList<String> pastillas_para_enf_X = new ArrayList<>();
    ArrayList<String> pastillas_contra_diab= new ArrayList<>();
   
    
    ArrayList<String> receta= new ArrayList<>();
     
   
             
            
     
    public void comparar(String enfermedad, String para){
        
        String asql="";
        String s,e;
        ConexionMySQL mysql=new ConexionMySQL();       
        Connection conect=mysql.conectar();
       
                   
        asql="SELECT cod_enf ,pastilla FROM "+para+" WHERE cod_enf LIKE  '%"+enfermedad+"%' ";
        
        try 
        {
            Statement st=conect.createStatement();
            ResultSet rs=st.executeQuery(asql);
            
            while(rs.next())
            {
                pastillas_para_enf_X.add(rs.getString("pastilla"));
                
            }
            
        }
        catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null,ex);
        }
      }
        
    
    public void receta(String hc){
        
        String medicina;
        receta.add("GLIMEPERIDA");
        receta.add("NATEGLINIDA");
        receta.add("LISPRO");
        receta.add("GLIPIZIDA");
        receta.add("GLIBENCLAMIDA");
        receta.add("NPH"); // LISPRO = NPH
        
        
        
        for(int i = 0; i <pastillas_para_enf_X.size(); i++) {
            
            
               medicina = pastillas_para_enf_X.get(i);
                 
                     if(medicina.equalsIgnoreCase("ANTICONCEPTIVOS") | medicina.equalsIgnoreCase("amlodipino ratiopharm efg")| medicina.equalsIgnoreCase("ASPARARAGINASA")| medicina.equalsIgnoreCase("ANTICOAGULANTE")| medicina.equalsIgnoreCase("GLUCAGON")){
                    
                        receta.remove("GLIMEPERIDA");
                    
                    }
                     if(medicina.equalsIgnoreCase("IMAO")|medicina.equalsIgnoreCase("METFORMIDA")|medicina.equalsIgnoreCase("WARFORMINA")|medicina.equalsIgnoreCase("DIGOXINA")|medicina.equalsIgnoreCase("SALICILATOS")){
                    
                        receta.remove("NATEGLINIDA");
                    }
                     if(medicina.equalsIgnoreCase("ACARBOSA")|medicina.equalsIgnoreCase("ANFERPRAMENA")|medicina.equalsIgnoreCase("BISOPRELOL")| medicina.equalsIgnoreCase("CAPTOPRIL")| medicina.equalsIgnoreCase("CELIPRELOL")){
                    
                        receta.remove("LISPRO");
                    }
                     if(medicina.equalsIgnoreCase("DEXKETOPROFENO")|medicina.equalsIgnoreCase("FOSFOSAL")|medicina.equalsIgnoreCase("MIGLITOL")| medicina.equalsIgnoreCase("OXACEPROL")| medicina.equalsIgnoreCase("RANITIDINA")){
                    
                        receta.remove("GLIPIZIDA");
                    }
                     if(medicina.equalsIgnoreCase("FOSFOSAL")|medicina.equalsIgnoreCase("CLORGILINA")|medicina.equalsIgnoreCase("ETODOLAC")| medicina.equalsIgnoreCase("ACITRETINA")| medicina.equalsIgnoreCase("VARDENAFIL")){
                    
                        receta.remove("GLIBENCLAMIDA");
                    }
                     if(medicina.equalsIgnoreCase("ACARBOSA")|medicina.equalsIgnoreCase("ANFERPRAMENA")|medicina.equalsIgnoreCase("BISOPRELOL")| medicina.equalsIgnoreCase("CAPTOPRIL")| medicina.equalsIgnoreCase("CELIPRELOL")){
                    
                        receta.remove("NPH");
                    }
           
        }
        
        ConexionMySQL  mysql=new ConexionMySQL();
        Connection cn=mysql.conectar();
        
        String asql="";
        String mensaje="";
        
        asql = "INSERT INTO recetas(pacient_cod,receta_1,receta_2)"+
                "VALUES(? ,? ,? )";
        
        mensaje="Los Datos se han guardado de manera Satisfactoria...";
        try 
        {
            PreparedStatement pst=cn.prepareStatement(asql);
            pst.setString(1, hc);
            pst.setString(2, receta.get(0));
            pst.setString(3, receta.get(1));
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
    
}

    

