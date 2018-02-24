
package clases;

import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Programa7 {
    Scanner sc = new Scanner(System.in);
    
    public void repiteNombre(){
        System.out.println("Introduce tu nombre: ");
        String name = sc.nextLine();
        System.out.println("Introduce las veces a repetir: ");
        int num = sc.nextInt();
        for (int i = 1; i < (num+1); i++) {
            System.out.println(name);
        }
        System.out.println("El nombre se repitió "+num+" veces!");
    }
    
   
}
