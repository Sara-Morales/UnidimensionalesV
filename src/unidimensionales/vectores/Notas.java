
package unidimensionales.vectores;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Notas {
    
    public static void main(String[] args) {
        
        
        int [] nota = new int [3]; //logitud del vector //
        
        for (int i = 0; i < 3; i++) {
            nota[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota"));
            
        }
        double promedio = (nota[0] + nota [1] + nota [2] ) /3 ;
        
       JOptionPane.showMessageDialog(null, "Las notas ingresadas son: " + nota [0] + "\n" + nota [1]+ "\n" 
       + nota[2] );
       
      JOptionPane.showMessageDialog(null,"El promedio total de las notas es: "+ promedio);
       
            
        }
}

