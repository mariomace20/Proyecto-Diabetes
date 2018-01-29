
package Algoritmos;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import BaseDatos.ConexionMySQL;
import com.itextpdf.text.Element;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;

import com.itextpdf.text.pdf.draw.LineSeparator;

public class PrintPdf {
    protected  String hc;
    public void print(String hc) throws Exception
    {   ConexionMySQL  mysql=new ConexionMySQL();
        Connection cn=mysql.conectar();
        String a="",b="",c="",d="",e="",f="",g="",h="",i="",j="",
                n="",o="",p="",q="",r="",s="",t="",u="",v="",w="",
                a1="",a2="",a3="",a4="",a5="",a6="",a7="",a8="";
        Double k = null,l = null,m = null,
               b1=null, b2=null,b3=null,b4=null,b5=null,b6=null, b7=null,b8=null;
        
        
       /* System.out.println("Numero de Historia:");
            Scanner in = new Scanner(System.in);
            hc=in.nextLine();*/
        try{
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM paciente WHERE num_hisc LIKE '%"+hc+"%'");
           // ResultSet rss = st.executeQuery("SELECT * FROM sintomas WHERE num_hiscs LIKE '%"+hc+"%'");&& rss.next()
           while(rs.next())
           { a = rs.getString("num_hisc");
             b= rs.getString("nom_pac");
            c= rs.getString("apep_pac");
            d= rs.getString("apem_pac");
            e= rs.getString("sexo");
            f= rs.getString("fec_nac");
            g= rs.getString("dni_pac");
            h=rs.getString("telefono");
            i=rs.getString("est_civ");
            j=rs.getString("direccion");
            k=rs.getDouble("peso");
            l=rs.getDouble("talla");
            m=rs.getDouble("dia_cint");
            n=rs.getString("embarazo");
         
            
            }
           
        }catch(SQLException ex){
            
        }
        try{
            Statement st=cn.createStatement();
            ResultSet rss = st.executeQuery("SELECT * FROM sintomas WHERE num_hiscs LIKE '%"+hc+"%'");
           while(rss.next())
           {
            o=rss.getString("poliurea");
            p=rss.getString("polifagia");
            q=rss.getString("polidipsia");
            r=rss.getString("perd_peso");
            t=rss.getString("astenia");
            u=rss.getString("fam_p_grado");
            v=rss.getString("nac_peso");
            w=rss.getString("diag_diages");
            a1=rss.getString("acantosis");
            a2=rss.getString("paraestesia");
            a3=rss.getString("pas");
           a4=rss.getString("pad");
           a5=rss.getString("fc");
           a5=rss.getString("fr");
                
            }
            //setAlignment(Element.ALIGN_CENTER);
        }catch(SQLException ex){
            
        }
        
        try{
            Statement st=cn.createStatement();
            ResultSet rss = st.executeQuery("SELECT * FROM exam_complementario WHERE num_hiscec LIKE '%"+hc+"%'");
           while(rss.next())
           {
            b1=rss.getDouble("hb_glicosilada");
            b2=rss.getDouble("hdl");
            b3=rss.getDouble("ldl");
            b4=rss.getDouble("col_total");
            b5=rss.getDouble("tgc");
            b6=rss.getDouble("gluco_ayu");
            b7=rss.getDouble("total_gluco");
            
                
            }
            //setAlignment(Element.ALIGN_CENTER);
        }catch(SQLException ex){
            
        }
        Paragraph p0=new Paragraph("Datos Personales");
        Paragraph p1=new Paragraph("N° HC: "+a+"   Nombre: "+b+"    Apellido Paterno: "+c+"     Apellido Materno: "+d );
         Paragraph p2=new Paragraph("F. de Nac.: "+f+"  Sexo: "+e+"  DNI:"+g+" Telef:"+h );
           LineSeparator line = new LineSeparator();
         Paragraph p3=new Paragraph("                         ");
          Paragraph p4=new Paragraph("Examen Fisico y Sintomas");
          Paragraph p5=new Paragraph("Peso:"+k+"  talla:"+l+"  D. de cintura: "+m);
          Paragraph p6=new Paragraph("poliurea:"+o+"  polidipsia: "+q+"  polifagia:"+p+"  perdida de peso:"+r);
           Paragraph p7=new Paragraph("Familiares con DM (en 1|grado):"+u+"  Peso al nacer: "+v+"  Diag. anterior de DM gestacional:"+w);
           Paragraph p8=new Paragraph("PAS"+a3+"  PAD: "+a4+"  Fr. cardiaca:"+w+"  Fr. Respiratoria:"+a1);
        Paragraph p9=new Paragraph("Prueba Serologica");
          Paragraph p10=new Paragraph("Hb. glicosilada:"+b1+"  Glucosa en ayunas"+b6+"  Test de Tolerancia "+b7);
          Paragraph p11=new Paragraph("Colesterol HDL:"+b2+"  Colesterol LDL"+b3+"  Trigliceridos: "+b7);
           p1.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
        p2.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
         p0.setAlignment(Element.ALIGN_TOP);
        p4.setAlignment(Element.ALIGN_TOP);
        p6.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
        p7.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
         p8.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
       p9.setAlignment(Element.ALIGN_TOP);
        p11.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
         p10.setAlignment(Element.ALIGN_JUSTIFIED_ALL);
        Document document=new Document();
        PdfWriter.getInstance(document, new FileOutputStream("hc.pdf"));
        document.open();
        document.addTitle("registro de paciente");
        document.add(p0);
        document.add(p1);
        document.add(p2);
        document.add(p3);
        document.add(line);
        document.add(p4);
        document.add(p5);
        document.add(p6);
         document.add(p7);
        document.add(p8);
        document.add(p3);
        document.add(line);
        document.add(p3);
        document.add(p9);
         document.add(p10);
        document.add(p11);
        document.close();//Apellido Paterno
    }
}


