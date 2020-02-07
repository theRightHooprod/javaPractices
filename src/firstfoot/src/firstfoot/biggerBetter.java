package firstfoot;
import javax.swing.JOptionPane;

public class biggerBetter {
        public static void main(String[] args) {
            
            //Aquí yo declaré mis variables
            int num1;
            int num2;
            
            //aquí empeze a pedir los valores de las variables
            num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa" +
                " el primer numero "));
            
            num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa" +
                " el segundo numero "));
            
            if(num1 > num2){
                JOptionPane.showMessageDialog(null, num1 + ", " + num2 + "...");
            }else{
                JOptionPane.showMessageDialog(null, num2 + ", " + num1 + "...");
            }
        
        }
    
}
