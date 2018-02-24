/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Ramon
 */
public class Carro {
    int modelo;
    String color;
    public String nombre;
    
    public Carro(String nombre){
        this.nombre = nombre;
    }
    
    public void datosVehiculo(){
        int y = 90;
        System.out.println("Modelo: "+ modelo+" Nombre: "+ nombre+" Color: "+color);
        System.out.println("Corre a: "+y+" km");
    }
    
    public void setModelo(int modelo){
        this.modelo = modelo;
    }
    
    public void setColor(String color){
        this.color = color;
    }
}
