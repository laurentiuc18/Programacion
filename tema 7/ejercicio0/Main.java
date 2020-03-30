package Ejercicio0;

public class Main {

	public static void main(String[] args) {
		Estudiante est =new Estudiante("DAM","Alberto",12345);
		est.setEdad(20);
		
		double notas[]={7,8.5,4,8,6,7.5,5};
		est.setNotas(notas);
		
		
		Profesor profe=new Profesor("Manel", "D104");
		profe.setEdad(45);
		profe.setHoraTutorias("Lunes de 10:30 a 13:00");
		
		
		System.out.println(est.getNombre() +" tiene una media de "+ est.getNotaMedia());
		profe.getConsultas();
		
	}

}
