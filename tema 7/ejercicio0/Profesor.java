package Ejercicio0;

public class Profesor extends personas {
	


	private String Despacho;
	private String HoraTutorias;

	
	public Profesor() {}
	public Profesor(String nombre,String Despacho) {
		super(nombre);
		
		this.nombre = nombre;
		this.Despacho = Despacho;
		
	}
	

	public String getDespacho() {
		return Despacho;
	}
	public void setDespacho(String despacho) {
		Despacho = despacho;
	}
	public String getHoraTutorias() {
		return HoraTutorias;
	}
	public void setHoraTutorias(String horaTutorias) {
		HoraTutorias = horaTutorias;
	}
	
	
	public void getConsultas() {
		
		System.out.println(nombre +"tiene tutoria el "+HoraTutorias+"en la sala" + Despacho);
	}
}
