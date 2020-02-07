package firstfoot;
import javax.swing.JOptionPane;


public class inputMany {
    public static void main(String[] args) {
        long x;
        int ans = 0;
        
        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa" +
            " un numero entre 0 y 9,999"));   
        
        while(x != 0){
            
            ans++;
            x /= 10;
            
        }

        
        JOptionPane.showMessageDialog(null, "Total de numeros: " + ans);
    }

}
