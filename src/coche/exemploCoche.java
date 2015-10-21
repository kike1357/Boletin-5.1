
package coche;

import javax.swing.JOptionPane;


public class exemploCoche {
    public static void main(String[] args) {
     Coche coche1=new Coche();
     int vel=0;
     vel=Integer.parseInt(JOptionPane.showInputDialog("Introduce velocidad"));
     coche1.acelerar(vel);
     JOptionPane.showMessageDialog(null,"Velocidade"+coche1.getVelocidade());
}
}

