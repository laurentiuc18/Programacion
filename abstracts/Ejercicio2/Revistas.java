package Ejercicio2;

public  class Revistas extends Publicacion{

	
	private int numero;
	
	
	public Revistas() {}
	
	public Revistas(int numero,int codigo, int anio, boolean prestado) {
		
		this.numero=numero;
		this.codigo=codigo;
		this.anio=anio;
		this.prestado=prestado;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	@Override
	public void Prestar() {
		
		 this.prestado=true;
	}
	@Override
	public void Devolver() {
		
		this.prestado=false;
	}
	@Override
	public boolean Prestado() {
		
		return this.prestado=false;
	}
	
	@Override
	public String toString() {

		return "El numero es "+numero +" tiene el codigo "+codigo+" el año "+ anio+" y prestado esta: "+prestado;
		
		
	}
}
