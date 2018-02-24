
package clases;

import java.util.Scanner;
/**
 *
 * @author Ramon
 */
public class Programa4 {
    int num;
    Scanner sc = new Scanner(System.in);
    public void dt(){
        System.out.println("Introduce un Numero: ");
        num = sc.nextInt();
        if(num<50){
            System.out.println("El doble es: "+(2*num));
        }else if(num>=50){
            System.out.println("El tiple es: "+(3*num));
        }
    }
    
   
}
