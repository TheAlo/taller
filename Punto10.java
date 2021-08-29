
package taller.pkg2;

/**
 *
 * 
 * Punto 10
 * 
 */
import java.util.Scanner;
public class Punto10 {
    
    public static void main (String [] args) {
        double masa, gramos, libras, tonelada, vl=2.205;
        System.out.println("Ingrese el valor en KG que quiere convertir");
        Scanner nume = new Scanner (System.in);
        masa= nume.nextFloat();
        gramos = masa*1000;
        tonelada = masa/1000;
        libras = masa*vl;
        System.out.println("La unidad convertida de KG a Gramos es: "+ gramos);
        System.out.println("La unidad convertida de KG a Tonelada es: "+ tonelada);
        System.out.println("La unidad convertida de KG a libra es: "+ libras);
    }
}
