package Ejercicio04;

public class Main_Persona {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Antonio", 1234, 21, 321, "Estadistica");
		Estudiante e2 = new Estudiante("Ana", 4567, 40, 987, "Estadistica");
		Docente d1 = new Docente("Ramiro", 5463, 40, 10, 5000);
		
		
		e2.VerificarEdadEstudianteDocente(d1);
		
		System.out.println("Estan en la misma carrera?..." + e1.verificarSiEstanMismaCarrera(e2));
	}

}
