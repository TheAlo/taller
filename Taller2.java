
package taller.pkg2;

import java.util.Scanner;

/**
 *
 * Punto 1
 */
public class Taller2 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int resultado;
       System.out.print("Ingrese el primer numero: ");
       Scanner num = new Scanner (System.in);
       num1= num.nextInt();
       System.out.print("Ingrese el segundo numero: ");
       num2= num.nextInt();
       System.out.println("X = " +num1);
        System.out.println("El valor de X + X es "+(num1+num1));
        System.out.println((num1+num2)+" - "+(num2+num1));
    }
    
}
