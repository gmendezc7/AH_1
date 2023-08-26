
package ejemplos.sabado29;

/**
 *
 * @author Eliseo
 */
import java.util.Scanner;
public class Sabado29 {

    public static void main(String[] args) {
        Scanner sp = new Scanner (System.in);
        System.out.println("Ingrese su primer numero");
        int num1 = sp.nextInt();
        System.out.println("Ingrese su segundo numero");
        int num2 = sp.nextInt();
    
        
        if (num1== num2){
            System.out.println("los numeros son iguales");
        } else {
            System.out.println("Los numeros no son iguales");
        }
    }
}
