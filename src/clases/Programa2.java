
package clases;

import java.util.Scanner;
/**
 *
 * @author Ramon
 */
public class Programa2 {
    double c,k,f;
    Scanner sc = new Scanner(System.in);
    
    public void grados(){
        System.out.println("Introduce grados (°C): ");
        c = sc.nextDouble();
        System.out.println("Grados Kelvin °K :: "+(c+273));
        System.out.println("Grados Farenheit °F ::"+((c*1.8)+32));
    }
}
