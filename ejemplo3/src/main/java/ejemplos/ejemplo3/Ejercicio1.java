
package ejemplos.ejemplo3;

    import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        Scanner sp = new Scanner (System.in);
        System.out.println("Ingrese el primer numero: ");
        int numero1 = sp.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = sp.nextInt();
        
        System.out.println("Los numeros son: "+numero1+" "+numero2);
    }
    
}
