package Ejercicio0;

public class Estudiante extends personas {
	
	private int NumeroExpediente;
	private String CursoActual;
	private double[] notas =new double[7];

	
	
	
	public Estudiante (String CursoActual , String nombre ,int NumeroExpediente) {
		super(nombre);
		this.NumeroExpediente=NumeroExpediente;
		this.CursoActual=CursoActual;
		this.nombre=nombre;
		
	}
	
	
	public int getNumeroExpediente() {
		return NumeroExpediente;
	}
	public void setNumeroExpediente(int numeroExpediente) {
		NumeroExpediente = numeroExpediente;
	}
	public String getCursoActual() {
		return CursoActual;
	}
	public void setCursoActual(String cursoActual) {
		CursoActual = cursoActual;
	}
	
	
	
	public double[] getNotas() {
		return notas;
	}


	public void setNotas(double[] notas) {
		this.notas = notas;
	}


	public double getNotaMedia() {
		
		double media =0;
		
		for(int NumNota=0; NumNota<notas.length;NumNota++){
			
			media=media+notas[NumNota];
		}
		
		media=media/7;
		return media;
	}

}
