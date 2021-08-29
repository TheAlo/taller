
package taller.pkg2;

/**
 *
 * Punto 3
 * 
 */
import java.util.Scanner;
public class Punto3 {
    public static void main(String[] args) {
        float num1;
        float num2;
        float num3;
       System.out.print("Ingrese el primer numero: ");
       Scanner num = new Scanner (System.in);
       num1= num.nextFloat();
       System.out.print("Ingrese el segundo numero: ");
       Scanner numer = new Scanner (System.in);
       num2= num.nextFloat();
       System.out.print("Ingrese el tercer numero: ");
       Scanner nume = new Scanner (System.in);
       num3= num.nextFloat();
        float promedio = (num1 + num2 + num3) / 3 ;
        float division = num1 / num2 / num3;
        float modulo = num1 %  num2 % num3;
        float coci = num1 / num2 / num3;
        float suma = num1 + num2 + num3;
        System.out.println("El promedio seria: "+ promedio);
        System.out.println("El division seria: "+ division);
        System.out.println("El modulo seria: "+ modulo);
        System.out.println("El cociente es: "+ coci);
        System.out.println("La suma es: "+ suma);
    }
}
