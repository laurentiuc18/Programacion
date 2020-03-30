package Ejercicio0;

public class personas {
	private int edad;
	protected String nombre;

	
	public personas(String nombre, int edad) {
		
		this.nombre=nombre;
		this.edad=edad;
	
	}
	public personas(String nombre) {
		
		this.nombre=nombre;
		
	}
	public personas(int edad) {
		
		this.edad=edad;
		
	}
	
	public personas() {
		
				
	}
		
	
	
	
	public int getEdad(){
		
		return edad;
	}
	public String getNombre(){
		
		return nombre;
	}
	
	
	
	
	

public void setEdad(int edad) {
	
	this.edad=edad;
}

public void setNombre(String nombre) {
	
	this.nombre=nombre;
}
}
