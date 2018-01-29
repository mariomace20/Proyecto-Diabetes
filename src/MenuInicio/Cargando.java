
package MenuInicio;

import Enfermedades.*;
import MenuInicio.MenuPrincipal;
import com.sun.awt.AWTUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.ImageIcon;

public class Cargando extends javax.swing.JFrame {

    private Timer t;
    private ActionListener al;
    
    public Cargando() {
        
        al = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if( barra.getValue() < 100 ){
                    barra.setValue(barra.getValue()+10);
                }else{
                    t.stop();
                    setVisible(false);
                    MenuPrincipal mP = new MenuPrincipal();
                    mP.setVisible(true);
                } 
                        
            }
        };
        
        t = new Timer(100,al);
        
        
        initComponents();
        setSize(300,300);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/circunferencia64.png")).getImage());
        
        AWTUtilities.setWindowOpaque(this, false);
        
        t.start();
        this.dispose();   
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barra = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(barra);
        barra.setBounds(20, 200, 220, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/botiquin-de-primeros-auxilios_1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, -20, 320, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barra;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
