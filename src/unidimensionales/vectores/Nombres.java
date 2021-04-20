
package unidimensionales.vectores;
import java.util.Scanner;

public class Nombres {

    
    public static void main(String[] args) {
        
        String[] Nombres={"Sara","Melissa","Oscar"}; // Nombres guardadados en el vector //
        System.out.println("La cantidad de nombre almacenados es: "+ Nombres.length); // imprimir la cantidad del vector // 
        
        System.out.println("Nombre de la posicion 0 es : " + Nombres[0]); // Imprimir alguna posicion deseada //
        
        for (int indice = 0; indice < Nombres.length; indice++) { // imprimir posicion del vector y contenido del vector //
            System.out.println("Posicion : "+indice+"  Nombre: " + Nombres[indice]);
            
        }
            
        }
        
    }
    

