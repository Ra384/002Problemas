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
public class Programa6 {
    int num;
    Scanner sc = new Scanner(System.in);
    public void romanos(){
        System.out.println("Introduce numero entre 1 y 7: ");
        num = sc.nextInt();
        switch(num){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            default:
                System.out.println("error!");
        }
        
    }
    
    
}
