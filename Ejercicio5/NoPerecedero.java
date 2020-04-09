package Ejercicio5;

/**
 * @author Lauren
 */
public class NoPerecedero extends Producto {

	private String tipo;

	public NoPerecedero() {
	}

	public NoPerecedero(String tipo, String nombre, double precio) {

		this.tipo = tipo;
		this.nombre = nombre;
		this.precio = precio;

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * No he creado metodos ya que hereda los metodos de la classe padre , si se le
	 * pone un valor al precio ya lo calcula @Producto
	 */

}
