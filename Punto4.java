
package taller.pkg2;

/**
 *
 * Punto 4
 * 
 */
 import java.util.Scanner;
public class Punto4 {
    Scanner lector = new Scanner(System.in);
    public Punto4() {
        double radio, area, longitud;
        System.out.print("Ingrese Radio de la circunferencia: ");
        radio= lector.nextDouble();
        area = Math.PI*Math.pow(radio,2);
        longitud = 2*Math.PI*radio;
        System.out.println("El area de la circunferencia es: "+ area);
        System.out.println("La longitud de la circunferencia es: "+ longitud);
}
    public static void main(String[] args){
        Punto4 solucion = new Punto4();
    }
}
