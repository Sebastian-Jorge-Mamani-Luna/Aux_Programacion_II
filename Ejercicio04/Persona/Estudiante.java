package Ejercicio04;

public class Estudiante extends Persona{
	private int matricula;
	private String carrera;
	
	
	public Estudiante(String nombre, int carnet, int edad, int matricula, String carrera) {
		super(nombre, carnet, edad);
		this.matricula = matricula;
		this.carrera = carrera;
	}
	
	
	public void VerificarEdadEstudianteDocente(Docente d1) {
		if(getEdad() == d1.getEdad()) {
			System.out.println("Tienen la misma edad...");
		}else{
			System.out.println("No tienen la misma edad...");
		}
	}
	
	
	public boolean verificarSiEstanMismaCarrera(Estudiante e2) {
	    return this.carrera != null && this.carrera.equals(e2.carrera);
	}
	
	@Override
	public String toString() {
		return "Estudiante [ " + super.toString() + ", matricula=" + matricula + ", carrera=" + carrera + "]";
	}


	
	
	
	
	
	
	
	
}
