package Ejercicio4;

public class Lavadora extends Electrodomestico{
	private double Carga;
	
	public Lavadora() {}
	public Lavadora(double Peso, double carga) {
		
		this.Carga=5;
		this.Peso=Peso;
	}
	
	public Lavadora(double PrecioBase,double Peso,double Carga,String Color,  char ConsumoEnergetico) {
		
		this.setCarga(Carga);
		this.ConsumoEnergetico=ConsumoEnergetico;
		this.Peso=Peso;
		this.Color=Color;
		this.PrecioBase=PrecioBase;
		
	}
	public double getCarga() {
		return Carga;
	}
	public void setCarga(double carga) {
		Carga = carga;
	}
	
	@Override
	
	public double precioFinal() {
		
		double suma =super.precioFinal();
		
		if(this.Carga<30) {
			suma=suma+50;
		}
		
		return suma;
		
		
	}
	
}
