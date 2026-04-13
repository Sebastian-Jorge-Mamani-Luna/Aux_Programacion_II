package Ejercicio04;

public class Docente extends Persona{
	private int antiguedad;
	private double sueldo;
	
	public Docente(String nombre, int carnet, int edad, int antiguedad, double sueldo) {
		super(nombre, carnet, edad);
		this.antiguedad = antiguedad;
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Docente [ " + super.toString() + ", antiguedad=" + antiguedad + ", sueldo=" + sueldo + "]";
	}

	public int getEdad() {
		return edad;
	}
	
	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
	
	
}
