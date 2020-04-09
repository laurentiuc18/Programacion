package Ejercicio5;

/**
 * @author Lauren
 */
public class Producto {

	protected String nombre;
	protected double precio;

	/**
	 * Constructor por defecto
	 */
	public Producto() {
	}

	/**
	 * COnstructor con todos los valores
	 * 
	 * @param nombre
	 * @param precio
	 */
	public Producto(String nombre, double precio) {

		this.nombre = nombre;
		this.precio = precio;
	}

	/**
	 * Getters & Setters
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Metodo para calcular el precio total de los productos
	 * 
	 * @param cantidad
	 * @return
	 */
	public double Calcular(int cantidad) {

		precio = precio * cantidad;
		return precio;
	}

	/**
	 * Metodo toString para devolver el nombre i precio de cada producto
	 */
	public String toString() {

		return "El nombre del objeto es" + this.nombre + " y vale " + this.precio + "€";
	}
}
