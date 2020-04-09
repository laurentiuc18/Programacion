package Ejercicio5;

/**
 * @author Lauren
 */
public class Perecedero extends Producto {

	private int diasAcaducar;

	/*
	 * Metodo por defecto
	 */
	public Perecedero() {
	}

	/**
	 * 
	 * @param diasAcaducar
	 * @param nombre
	 * @param precio
	 */
	public Perecedero(int diasAcaducar, String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
		this.diasAcaducar = diasAcaducar;
	}
	/*
	 * Getters & Setters
	 */

	public int getDiasAcaducar() {
		return diasAcaducar;
	}

	public void setDiasAcaducar(int diasAcaducar) {
		this.diasAcaducar = diasAcaducar;
	}

	/**
	 * metodo que sobreescribe valores de la classe padre @Producto
	 */
	@Override
	public double Calcular(int cantidad) {

		double precio = super.Calcular(cantidad);

		switch (diasAcaducar) {
		case 1:
			precio = precio / 4;
			break;
		case 2:
			precio = precio / 3;
			break;
		case 3:
			precio = precio / 2;
			break;

		}

		return precio;
	}
}
