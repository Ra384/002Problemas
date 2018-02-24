
package principal_java;

import clases.Programa1;
import clases.Programa10;
import clases.Programa2;
import clases.Programa3;
import clases.Programa4;
import clases.Programa5;
import clases.Programa6;
import clases.Programa7;
import clases.Programa8;
import clases.Programa9;
import java.util.Scanner;

/**
 *
 * @author Ramon
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("               MENU       ");
        System.out.println("------------------------------------");
        System.out.println("1. Area Triangulo\n"
                + "2. Convertidor (°C -> °K,°F)\n"
                + "3. Notación 12hrs\n"
                + "4. Doble y Triple\n"
                + "5. Par o Impar\n"
                + "6. Numeros Romanos\n"
                + "7. Repetición de Nombre\n"
                + "8. Del 1 al 500\n"
                + "9. Calcular Factorial\n"
                + "10. Calcular Articulo con IVA");
        
        System.out.println("\nIntroduce una opción: ");
        int op = sc.nextInt();
        
        switch(op){
            case 1:
                Programa1 p1 = new Programa1();
                p1.calcularArea();
                break;
            case 2:
                Programa2 p2 = new Programa2();
                p2.grados();
                break;
            case 3:
                Programa3 p3 = new Programa3();
                p3.convertir();
                break;
            case 4:
                Programa4 p4 = new Programa4();
                p4.dt();
                break;
            case 5:
                Programa5 p5 = new Programa5();
                p5.par();
                break;
            case 6:
                Programa6 p6 = new Programa6();
                p6.romanos();
                break;
            case 7:
                Programa7 p7 = new Programa7();
                p7.repiteNombre();
                break;
            case 8:
                Programa8 p8 = new Programa8();
                p8.contar();
                break;
            case 9:
                Programa9 p9 = new Programa9();
                p9.factorial();
                break;
            case 10:
                Programa10 p10 = new Programa10();
                p10.iva();
                break;
            default:
                System.out.println("Error");
        }
        
    }
}
