package Ejercicio4;
/**
 * 
 * @author Lauren
 *
 */

public class Electrodomestico {

	protected double PrecioBase;
	protected String Color;
	protected double Peso;
	protected char ConsumoEnergetico;
	
	public Electrodomestico () {}
	
	public Electrodomestico ( double Peso ,double PrecioBase) {
		
		this.PrecioBase=100;
		this.Peso=5;
	}
	
	
/**
 * 	 
 * @param PrecioBase Double valor predefinido=10
 * @param Color String valor predefinido=blanco
 * @param Peso Double valor predefinido=5
 * @param ConsumoEnergetico Char con valor predefinido=F
 */
public Electrodomestico (double PrecioBase, double Peso, String Color, char ConsumoEnergetico) {
		
		this.setPrecioBase(PrecioBase);
		this.setPeso(Peso);
		this.Color="Blanco";
		this.ConsumoEnergetico='F';
	}
	


	public double getPrecioBase() {
		return PrecioBase;
	}

	public void setPrecioBase(double precioBase) {
		PrecioBase = precioBase;
	}

	public String getColor() {
		return Color;
	}

	/**
	 * 
	 * Asi convertixc el color que me donen a tu mayuscula
	 * @param color
	 */
	public void setColor(String color) {
		String aux=color;
		Color=aux.toUpperCase();
	}

	
	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}



	public char getConsumoEnergetico() {
		return ConsumoEnergetico;
	}
/**
 * Asi intente convertir la lletra que me done en mayuscula
 * @param consumoEnergetico
 */
	public void setConsumoEnergetico(char consumoEnergetico) {
		String aux = String.valueOf(consumoEnergetico);
		ConsumoEnergetico = aux.toUpperCase().charAt(0);
		
		
	}
	
/**setter de consumo energetico
 * 
 * Manera de convertir una letra minuscula en letra mayuscula
 */
	private void comprobarConsumo(char letra) {
		
		 letra=this.ConsumoEnergetico;
		boolean si=false;
		
		char letras[]= {'A','B','C','D','E','F'};

		for(int i=0; i<letras.length; i++) {
			
		if(letras[i]==letra) {
			
			si=true;
		}
		
		if(si) {
			this.ConsumoEnergetico=letra;
		}else {
			this.ConsumoEnergetico='F';
		}
		
		
		}
		
	}
	
	
		private void comprobarColor(String color) {
			color=this.Color;
			boolean si=false;
			String colores[]= {"BLANCO","NEGRO","ROJO","AZUL","GRIS"};

			for(int i=0; i<colores.length; i++) {
			
				if(colores[i]==color) {
					
					si=true;
					
				}
				
				if(si) {
					this.Color=color;
					
				}else {
					this.Color="BLANCO";
				}
			}
			
		
		}
	
	
		public double precioFinal() {
			
			double precio=this.PrecioBase;
			
			switch (ConsumoEnergetico) {
			case 'A':
				precio=precio+100;
				break;
			case 'B':
				precio=precio+80;
				break;
			case 'C':
				precio=precio+60;
				break;
			case 'D':
				precio=precio+50;
				break;
			case 'E':
				precio=precio+30;
				break;
			case 'F':
				precio=precio+10;
				break;
			}
			
			if (Peso >= 0 && Peso <= 19) {
				precio = precio + 10;
	        }else if ( Peso >= 20 && Peso <= 49) {
	        	precio = precio + 50;
	        }else if ( Peso >= 50 && Peso <=79 ) {
	        	precio = precio + 80;
	        }else if ( Peso >= 80 ){
	        	precio = precio + 100;
	        }

	        return precio;
		}
}
