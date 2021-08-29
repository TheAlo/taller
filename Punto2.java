
package taller.pkg2;

/**
 *
 * Punto 2
 * 
 */
import java.util.Scanner;
public class Punto2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.print("Ingrese el primer numero: ");
       Scanner num = new Scanner (System.in);
       num1= num.nextInt();
       System.out.print("Ingrese el segundo numero: ");
       num2= num.nextInt();
        int division = num1 / num2;
        int suma = num1 + num2;
        int resta = num1 - num2;
       System.out.println("Los numero que usted escribio fueron: " + num1 +","+ num2);
       System.out.println("La suma de los numeros es: "+ suma);
       System.out.println("La division de los numero es: "+ division);
       System.out.println("La resta de los numero es: "+ resta); 
    }
}
