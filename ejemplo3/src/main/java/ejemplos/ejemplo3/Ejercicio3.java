
package ejemplos.ejemplo3;

import java.util.Scanner;

public class Ejercicio3 {
    
      public static void main(String[] args){
          
          Scanner sp = new Scanner(System.in);
          System.out.println("Ingrese su numero");
          int numero = sp.nextInt();
          
          System.out.println("El doble es: "+(numero+2)+", Y el triple es: "+(numero*3));
          
      }
    
}
