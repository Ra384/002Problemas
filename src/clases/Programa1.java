package clases;
import java.util.Scanner;
/**
 *
 * @author Ramon
 */
public class Programa1 {
    double base, altura,area;
    Scanner sc = new Scanner(System.in);
    public void calcularArea()
    {
        System.out.println("Introduce el valor de la base: ");
        base = sc.nextDouble();
        System.out.println("Introduce el valor de la altura: ");
        altura = sc.nextDouble();
        System.out.println("El area del Triangulo es: "+((base*altura)/2));
    }

}
