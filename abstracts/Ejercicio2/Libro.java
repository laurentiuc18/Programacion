package Ejercicio2;

public class Libro extends Publicacion {

	
	
	private String autor;
	
	
	public Libro() {}
	
	public Libro(String autor,int codigo, int anio, boolean prestado) {
		
		this.autor=autor;
		this.codigo=codigo;
		this.anio=anio;
		this.prestado=prestado;
	}
	
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	
	@Override
	public void Prestar() {
		
		this.prestado=false;
	}
	@Override
	public void Devolver() {
		
		this.prestado=false;
	}
	@Override
	public boolean Prestado() {
		
		return this.prestado=true;
	}
	
	@Override
	public String toString() {

		return "El autor es "+autor+" tiene el codigo "+codigo+" es del año "+ anio+" y prestado esta: "+prestado;
}
}