/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Programa9 {
    Scanner sc = new Scanner(System.in);
    
    public void factorial(){
        int factorial = 1;
        System.out.println("Introduce numero: ");
        int num = sc.nextInt();
        for (int i = num; i > 0; i--) {
            factorial *= i; 
        }
        System.out.println("El factorial es: "+factorial);
    }
    
}
