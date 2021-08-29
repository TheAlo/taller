
package taller.pkg2;

/**
 *
 * 
 * Punto 6
 * 
 */
        import java.util.Scanner;
public class Punto6 {
        public static void main(String[] args){
        Scanner recibir = new Scanner(System.in);
        float  peso, estatura, imc;
        
        System.out.print("Ingrese su peso: ");
        peso = recibir.nextFloat();
        System.out.print("Ingrese su estatura: ");
        estatura = recibir.nextFloat();
        
        imc = peso/(estatura*estatura);
        System.out.println("Su peso segun IMC es: "+imc);
        
        if (imc < 18.5) {
            System.out.println("\nEsta bajo de peso ");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("\nTiene un peso Normal");
        } else if (imc  >= 25 && imc <= 29.9){
            System.out.println("\nTiene sobre peso");
        } else {
            System.out.println("\nTiene obesidad");
        }
    }
}
