
package clases;

import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Programa10 {
    Scanner sc = new Scanner(System.in);
    public void iva(){
        System.out.println("Introduce el precio del articulo sin IVA: ");
        double precio = sc.nextInt();
        System.out.println("El precio del articulo con IVA es: "+((precio)+(precio*0.16)));
    }
}
