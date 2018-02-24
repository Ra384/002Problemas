package clases;

/**
 *
 * @author Ramon
 */
public class Motocicleta extends Carro{
    boolean casco;
    int cantGasolina;
    public Motocicleta() {
        super("TINTO");
    }
    
    public Motocicleta(String nombre){
        super(nombre);
    }
    
    @Override
    public void datosVehiculo(){
        super.datosVehiculo();
    }
    
    public boolean isCasco(){
        return casco;
    }
    
    public void setCasco(boolean casco){
        this.casco = casco;
    }
    
    public void setCantGasolina(int cantGasolina)
    {
        this.cantGasolina = cantGasolina;
    }
    
}
