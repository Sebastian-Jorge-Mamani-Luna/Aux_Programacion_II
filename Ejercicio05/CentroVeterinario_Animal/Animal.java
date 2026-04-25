package Ejercicio05_2;

public class Animal {
	protected String nombre;
	protected int edad;
	protected String nombreDuenio ;


	public Animal(String nombre, int edad, String nombreDuenio) {
		this.nombre = nombre;
		this.nombreDuenio = nombreDuenio;
		this.edad = edad;
	}
	
	
	public void mostrar() {
		System.out.println(this.nombre);
		System.out.println(this.nombreDuenio);
		System.out.println(this.edad);
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getNombreDuenio() {
		return nombreDuenio;
	}


	public void setNombreDuenio(String nombreDuenio) {
		this.nombreDuenio = nombreDuenio;
	}
	
	
	
	
}
