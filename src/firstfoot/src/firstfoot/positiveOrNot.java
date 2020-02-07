package firstfoot;
import javax.swing.JOptionPane;

public class positiveOrNot {
    public static void main(String[] args) {
        
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa" +
                " un numero"));
        
        if(numero > 0){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es" +
                    " positivo");
        }else if(numero == 0){
            JOptionPane.showMessageDialog(null, "El numero es 0");

        }else{
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es" +
                    " negativo");
            }
    } 
}
