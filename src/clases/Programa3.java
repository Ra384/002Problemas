
package clases;

import java.util.Scanner;
/**
 *
 * @author Ramon
 */
public class Programa3 {
    Scanner sc = new Scanner(System.in);
    int hr24;
    
    public void convertir(){
        String aux="";
        System.out.println(".:Introduce la hora actual en formato 24hrs:.");
        System.out.println("Hora: ");
        int hr = sc.nextInt();
        System.out.println("Minutos (:00): ");
        int min = sc.nextInt();
        
        
        if(hr <= 12 && hr > 0){
            if(min < 10) {
                aux = "0"+min;
                System.out.println("La hora es: "+hr+":"+aux);
            }else{
                System.out.println("La hora es: "+hr+":"+min);
            }
                
        }else if(hr > 12 && hr < 25){
            if(min < 10) {
                aux = "0"+min;
                System.out.println("La hora es: "+(hr-12)+":"+aux);
            }else{
                System.out.println("La hora es: "+(hr-12)+":"+min);
            }
        }else{
            System.out.println("Hora Invalida!");
        }
    }
}
