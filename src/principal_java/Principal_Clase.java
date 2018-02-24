/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal_java;

import clases.Carro;
import clases.Motocicleta;

/**
 *
 * @author Ramon
 */
public class Principal_Clase {
    public static void main(String[] args) {
        System.out.println("Este es un mensaje!");
        System.out.println("Este es otro mensaje!");
        Carro cnuevo = new Carro("Mazda");
        cnuevo.setColor("BLANCO");
        cnuevo.datosVehiculo();
        
        Carro cusado = new Carro("Nissan");
        cusado.setColor("Negro");
        cusado.datosVehiculo();
        
        
        
      
        Motocicleta moto = new Motocicleta("Generica");
        moto.setColor("Negra");
        moto.setModelo(2005);
        moto.datosVehiculo();
        
        System.out.println();
        moto.setModelo(3000);
        moto.setCasco(true);
        moto.setCantGasolina(30);
        imprimeAutos(cnuevo,moto,cusado);
        
    }
    public static void imprimeAutos(Carro ...c){
        System.out.println("Imprimiendo....");
        for(Carro carro:c){
            carro.datosVehiculo();
            System.out.println("----------------------");
        }
        
    }
}
