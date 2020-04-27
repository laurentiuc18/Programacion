package Ejercicio1;

public class Main {

	public static void main(String[] args) {
		Empleado emp = new Empleado("Eustaqui", "123456789", 50, true, 1500);
		Programador prog = new Programador("Rodolfo", "987654321", 45, false, 3500, 350, "Java");

		prog.MostrarMensaje("Hola");
		prog.MostrarMensaje(prog.Classificacion());
		prog.MostrarMensaje(prog.getDni());
	}

}
