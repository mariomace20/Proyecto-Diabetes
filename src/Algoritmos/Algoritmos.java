
package Algoritmos;

import static java.lang.Math.pow;


public class Algoritmos {
    
    
   public String tienePreDiabetesDOUBLE(double glucosaEnAyuno,double testTolerancia,double glicosilada){
        
        String resultado="hola pre";      
        if((glucosaEnAyuno>= 100 && glucosaEnAyuno<=125)||(testTolerancia>=140 && testTolerancia<=1995)||(glicosilada>=5.7 && glicosilada<=6.4)){
            resultado = "PREDIABETES ";
        }
        return resultado;
    }
    
    public String tienePreDiabetesCHECK(String tienePoliurea, String tienePolifagia, String tienePolidipsia){
        
        String resultado="HOLA";
        if((tienePoliurea.equalsIgnoreCase("SI") && tienePolifagia.equalsIgnoreCase("SI")) || (tienePoliurea.equalsIgnoreCase("SI") && tienePolidipsia.equalsIgnoreCase("SI")) || (tienePolifagia.equalsIgnoreCase("SI") && tienePolidipsia.equalsIgnoreCase("SI"))|| (tienePoliurea.equalsIgnoreCase("SI") && tienePolifagia.equalsIgnoreCase("SI") && tienePolidipsia.equalsIgnoreCase("SI"))){
            resultado = "PREDIABETES";
        }
        return resultado;
    }
    
    public double calculoIMC(double peso, double talla){
        double res;
        double t;
        t=talla/100;
        res=peso/pow(t,2);
        return res;
    }
    
    public String tieneDiabetes(String tieneFamiliaresPrimerGrado,String tieneDiagnosticoAnteriorDiabGestacional ,String tieneEmbarazo,double glucosaEnAyuno,double tieneGlicosilada){
        String r="";
        if(tieneFamiliaresPrimerGrado.equalsIgnoreCase("SI") && glucosaEnAyuno>120 && tieneGlicosilada>6.5){
            r="Tiene Diabetes Tipo I";
        }else if(tieneDiagnosticoAnteriorDiabGestacional.equalsIgnoreCase("SI") && glucosaEnAyuno>100){
            r="Tiene Diabetes Tipo II";
        }else if(tieneEmbarazo.equalsIgnoreCase("SI") && glucosaEnAyuno>100){
            r="Tiene Diabetes Gestacional";
        }
        return r;
    }
}
