
package taller.pkg2;

/**
 *
 *
 * Punto 8
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Punto8 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
 
            System.out.println("\n 1 para la Opcion 1");
            System.out.println("2 para laOpcion 2");
            System.out.println("3 para la opcion3");
            System.out.println("4 para la opcion 4");
            System.out.println("5 para la ocpion de Salir");
 
            try {
 
                System.out.print("Escribe una de las opciones: ");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has ingresado a la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has ingresado a la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has ingresado a la opcion 3");
                        break;
                    case 4:
                        System.out.println("Has ingresado a la opcion 4");
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }
    }
}