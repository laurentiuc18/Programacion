package Ejercicio4;

public class Television extends Electrodomestico {

	private double pulgadas;
	private boolean smartTV;
	
	public Television() {}
	
	public Television(double PrecioBase,double Peso) {
		
		this.PrecioBase=PrecioBase;
		this.Peso=Peso;
	}
	
	public Television( double PrecioBase,double Peso,double pulgadas ,String Color, char ConsumoEnergetico, boolean smartTV) {
		
		this.ConsumoEnergetico=ConsumoEnergetico;
		this.Peso=Peso;
		this.Color=Color;
		this.pulgadas=20;
		this.smartTV=false;
		this.PrecioBase=PrecioBase;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	
	@Override
	public double precioFinal() {
		
		double suma=super.precioFinal();
		
		if(pulgadas>40) {
			
			suma=this.PrecioBase*0.3;
			
		}
		
		if(this.smartTV) {
			
			suma=suma+50;
		}
		return suma;
	}
}
