
package ejemplos.sabado5deagosto;

import java.util.Scanner;


public class ejemplo2 {
    
    public static void main (String[] args ){
        
        Scanner sp = new Scanner(System.in);
        System.out.println("Ingrese su valor numérico");
        int valor = sp.nextInt();
        
        //Crear una tabla de multiplicar 
        for (int i = 10; i >= 1; i--) {
            System.out.println(valor + " x "+i +" = "+ valor*i );
        }
    }
    
}
