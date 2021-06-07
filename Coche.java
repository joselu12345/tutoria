package edfinal;

/**
 * Clase Coche que extiende de la clase Vehiculo e implementa la interfaz interfazCoche
 * 
 * @author Jose Luis Ruz Gil
 * @version 1.0
 */
public class Coche extends Vehiculo implements interfazCoche{

    private String marca;
    private String modelo;
    
/**
 * Constructor de la clase Coche
 * 
 * @param ma parámetro de tipo String marca del coche
 * @param mo párametro de tipo String modelo del coche
 */
    public Coche(String ma, String mo) {
        
        this.marca = ma;
        this.modelo = mo;
        
    }
/**
 * Método get del parametro Kilometraje
 * @return Kilometraje del coche
 */
    public int getKilometraje() {
        return this.kilometraje;
    }
/**
 * Método denominado recorre que devuelve los kilometros recorridos por el coche
 * @param km kilometros recorridos por el coche
 */
    public void recorre(int km) {
        this.kilometraje += km;
    }

    /**
     * Método get del atributo Marca
     * @return obtine la cadena marca del coche
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Método set del atributo Marca 
     * @param marca establece la marca del coche
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Método get del atributo modelo
     * @return obtiene la cadena modelo del coche
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Método set del atributo modelo
     * @param modelo establece el modelo del coche
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
