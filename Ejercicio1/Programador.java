package Ejercicio1;

public class Programador extends Empleado {
	private int lineaCodigo;
	private String lenguajeDominante;
	


	public Programador() {
		
	}
	
	public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineas, String lenguaje) {
		
		super(nombre, dni, edad, casado, salario);
		
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
		this.lineaCodigo = lineas;
		this.lenguajeDominante = lenguaje;
	}
	
	public int getLineaCodigo() {
		return lineaCodigo;
	}

	public void setLineaCodigo(int lineaCodigo) {
		this.lineaCodigo = lineaCodigo;
	}

	public String getLenguajeDominante() {
		return lenguajeDominante;
	}

	public void setLenguajeDominante(String lenguajeDominante) {
		this.lenguajeDominante = lenguajeDominante;
	}
	
	public String nivelProgramacion() {
		
		String lvl = "";
		
		if (lineaCodigo <=200) {
			lvl = "Level 1";
		}else if (lineaCodigo >= 200 && lineaCodigo <= 500) {
			lvl = "Level 2";
		}else if (lineaCodigo >= 500) {
			lvl = "Level 3";
		}
		return lvl;
	}
	
}
