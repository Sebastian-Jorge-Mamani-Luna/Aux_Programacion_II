package Ejercicio04;

public class Persona {
	protected String nombre;
	protected int carnet; 
	protected int edad;
	
	public Persona(String nombre, int carnet, int edad) {
		this.nombre = nombre;
		this.carnet = carnet;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", carnet=" + carnet + ", edad=" + edad + "]";
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCarnet() {
		return carnet;
	}

	public void setCarnet(int carnet) {
		this.carnet = carnet;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	
}
