package Ejercicio5;

/**
 * 
 * @author Lauren
 *
 */
public class Main {

	public static void main(String[] args) {
		/**
		 * Array de 10 posiciones
		 */
		double precioFinal = 0;
		Producto[] prod = new Producto[10];
		prod[0] = new Perecedero(10, "agua", 1);
		prod[1] = new Perecedero(1, "pan", 0.80);
		prod[2] = new Perecedero(2, "Helado", 5);
		prod[3] = new Perecedero(3, "Flan", 2);
		prod[4] = new Perecedero(4, "Pizza", 3);
		prod[5] = new NoPerecedero("Alimento", "azucar", 4);
		prod[6] = new NoPerecedero("alimento", "sal", 3);
		prod[7] = new NoPerecedero("utensilio", "sarten", 15);
		prod[8] = new NoPerecedero("alimento", "café", 7);
		prod[9] = new NoPerecedero("alimento", "pasta", 10);

		/**
		 * un for para poder recorrer el array
		 */
		for (int i = 0; i < prod.length; i++) {

			precioFinal = precioFinal + prod[i].Calcular(5);
		}

		System.out.println("El precio final es de " + precioFinal + " €");
	}

}
