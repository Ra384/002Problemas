
package clases;

import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Programa5 {
    Scanner sc = new Scanner(System.in);
    
    public void par(){
        String letrero = "El numero es ";
        System.out.println("Introduce el numero: ");
        int num = sc.nextInt();
        if(num%2==0)
            System.out.println(letrero+"par");
        else
            System.out.println(letrero+"impar");
    }
    
    
}
