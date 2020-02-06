package firstfoot;
import javax.swing.JOptionPane;

public class treeMinorBigger {
    public static void main(String[] args) { 
        int num1;
        int num2;
        int num3;
        
        int mayor = 0;
        int mayor2 = 0;
        int menor = 0;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa" +
                " el primer numero "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa" +
                " el segundo numero "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa" +
                " el tercer numero "));
        
        if((num1 < num2) && (num2 < num3)){
            menor = num1;
            mayor = num2;
            mayor2 = num3;
            JOptionPane.showMessageDialog(null, menor + ", " + mayor + ", " + 
                    mayor2);
            
        }else if((num1 > num2)&&(num2 > num3)){
            menor = num3;
            mayor = num2;
            mayor2 = num1;
            JOptionPane.showMessageDialog(null, menor + ", " + mayor + ", " + 
                    mayor2);
        }else if((num1 > num2)&&(num2 < num3)){
            menor = num2;
            mayor = num3;
            mayor2 = num1;
            JOptionPane.showMessageDialog(null, menor + ", " + mayor + ", " + 
                    mayor2);
        }else if((num1 < num2)&&(num2 > num3)){
            menor = num1;
            mayor = num3;
            mayor2 = num2;
            JOptionPane.showMessageDialog(null, menor + ", " + mayor + ", " + 
                    mayor2);
        
        }
    }
}
