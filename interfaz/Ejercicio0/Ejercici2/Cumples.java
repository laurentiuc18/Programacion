package Ejercici2;

public class Cumples {

	protected String nombre;
	protected int dia;
	protected int mes;
	protected int anyo;
	
	public Cumples() {}
	
	public Cumples(String nombre,int dia, int mes,int anyo) {
		
		this.nombre=nombre;
		this.dia=dia;
		this.mes=mes;
		this.anyo=anyo;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}
}
