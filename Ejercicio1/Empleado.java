package Ejercicio1;

public class Empleado {

	protected String nombre;
	protected String dni;
	protected int edad;
	protected boolean casado;
	protected double salario;

	public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isCasado() {
		return casado;
	}

	public void setCasado(boolean casado) {
		this.casado = casado;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Empleado() {
	}

	
	public String Classificacion() {
		
		String clasifica="";
		
		if (edad <= 18) {
			clasifica = "Novato";
		}else if (edad >= 19 && edad <= 25) {
			clasifica = "Junior";
		}else if (edad > 25) {
			clasifica = "Senior";
		}
		return clasifica;
	}
	
	public void MostrarDatos() {
		
		System.out.println("* Nombre: "+this.nombre);
		System.out.println("* Edad: "+this.edad);
		System.out.println("* DNI: "+this.dni);
		System.out.println("* Salario: "+this.salario);
		
		if (casado)
			System.out.println("Esta casado");
		else
			System.out.println("Esta soltero");
	}
	
	public double AumentarSalario(double porcentaje){
		
		
		salario=salario+salario*porcentaje/100;
		
		return salario;
	}
	public void MostrarMensaje(String mensaje) {
		
		System.out.println(mensaje);
	}
}
