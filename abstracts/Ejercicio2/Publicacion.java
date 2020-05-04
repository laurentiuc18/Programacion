package Ejercicio2;

public  class Publicacion implements Interf {
	protected int codigo;
	protected int anio;
	protected boolean prestado;
	
	
	public Publicacion() {}
	
	public Publicacion(int codigo, int anio, boolean prestado) {
		
		this.codigo=codigo;
		this.anio=anio;
		this.prestado=false;
	}
	

	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	
	@Override
	public void Prestar() {
		
		prestado =true;
	}
	@Override
	public void Devolver() {
		
		prestado =false;
	}
	@Override
	public boolean Prestado() {
		
		return prestado =false;
		
	}
	
	
	
	@Override
	public String toString() {

		return "El codigo es "+codigo+"del año "+ anio+" y prestado esta: "+prestado;
		
		
	}
	
	
	
}
