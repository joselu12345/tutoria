
package edtrimestral3;
/**
 *
 * @author Jose Luis Ruz Gil
 */

public class Cafetera implements interfazCafeteria {
    
    /**
     * 
     */
    private int capacidadMaxima;
    private int cantidadActual;
    
    /**
     * constructor que inicializa la clase con una capacidad maxima  y cantidad maxima
     * @param capacidadMaxima capacidad maxima de la cafetera
     * @param cantidadActual cantidad actual de la cafeterra
     */
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.cantidadActual = cantidadActual;
        this.capacidadMaxima = Math.max(capacidadMaxima, cantidadActual);
    }
    
    /**
     * capacidad maxima de la cafetera
     * @param capacidadMaxima capacidad maxima con la que inicializa
     */

    public Cafetera(int capacidadMaxima) {
        this(capacidadMaxima, 0);
    }
    
    /**
     * 
     */

    public Cafetera() {
        this(1000, 0);
    }
    
    /**
     * develve el valor de la capacidad maxima de la cafetera
     * @return valor de la capacidad maxima
     */


    public int get_capacidadMaxima() {
        return getCapacidadMaxima();
    }
    
    /**
     * devuelve la capacidad maxima de la cafetera
     * @param capacidadMaxima capacidad maxima de la cafetera
     */

    public void set_capacidadMaxima(int capacidadMaxima) {
        this.setCapacidadMaxima(capacidadMaxima);
    }
    
    /**
     * establece la capacidad actual a la cantidad maxima
     */

    
    
    
    
    
    
    
    
    
    public void llenarCafetera() {
        setCantidadActual(getCapacidadMaxima());
    }
    
    /**
     * devuelve el tamaña de la taza
     * @param tamanoTaza tamaño de la taza
     *  
     * @throws Exception excepcion en caso de que de la cantidad de cafe no sea mayor a cero, indica que no hay cafe
     */




    public void servirTaza(int tamanoTaza) throws Exception {
        setCantidadActual(getCantidadActual() - tamanoTaza);
		if (getCantidadActual() <0){
			setCantidadActual(0);
 			throw new Exception("No hay café");
		}
    }
    
    /**
     * establece la cantidad actual a cero
     */

    
    
    
    
    
    public void vaciarCafetera() {
        setCantidadActual(0);
    }
    
    /**
     * devuelve la cantidad de cafe
     * @param cantidad cantidad de cafe
     * 
     * @throws Exception excepcion para cuando la cantidad actual sea mayor a la capacidad maxima, indica que rebosa
     */


    public void agregarCafe(int cantidad) throws Exception {
        setCantidadActual(getCantidadActual() + cantidad);
		if (getCantidadActual() > getCapacidadMaxima()){
			setCantidadActual(getCapacidadMaxima());
 			throw new Exception("Rebosa");
		}

    }

    /**
     * devuelve el valor de la capacidad maxima de la cafetera
     * @return capacidad maxima de la cafetera
     */
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    /**
     * establece la capacidad maxima de la cafetera
     * @param capacidadMaxima capacidad maxima de la cafetera
     */
    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * devuelve la cantidad actual de cafe
     * @return cantidad actual de cafe
     */
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     * establece la cantidad actual de cafe
     * @param cantidadActual cantidad actual de cafe
     */
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
}
