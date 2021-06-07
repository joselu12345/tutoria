
package edfinal;

/**
 *Clase Vehiculo que es superclase de Coche e implementa la interfaz interfazVehiculo
 * 
 * @author Jose Luis Ruz Gil
 * @version 1.0
 */

class Vehiculo implements interfazVehiculo{
/**
 * 
 */      
    protected int kilometraje;
    
/**
 * Constructor de la clase Vehiculo
 */    
    public Vehiculo(){
        this.kilometraje = 0;
    }
/**
 * Método get del atributo kilometraje
 * @return obtiene el kilometraje del vehiculo  
 */
    public int getKilometraje() {
        return kilometraje;
    }
/**
 * Método set del atributo kilometraje
 * @param kilometraje establece el kilometraje del vehiculo
 */
    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }
    
}
