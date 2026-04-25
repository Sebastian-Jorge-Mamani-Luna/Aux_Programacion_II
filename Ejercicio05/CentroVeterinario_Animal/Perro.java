package Ejercicio05_2;

public class Perro extends Animal{
	private boolean requiereBosal, ladraFuerte;

	
	public Perro(String nombre, int edad,  String nombreDuenio, boolean requiereBosal, boolean ladraFuerte) {
		super(nombre, edad, nombreDuenio);
		this.requiereBosal = requiereBosal;
		this.ladraFuerte = ladraFuerte;
	}
	
	
	public void mostrar() {
		System.out.println(this.nombre);
		System.out.println(this.edad);
		System.out.println(this.nombreDuenio);
		System.out.println(this.requiereBosal);
		System.out.println(this.ladraFuerte);
	}


	public boolean isRequiereBosal() {
		return requiereBosal;
	}


	public void setRequiereBosal(boolean requiereBosal) {
		this.requiereBosal = requiereBosal;
	}


	public boolean isLadraFuerte() {
		return ladraFuerte;
	}


	public void setLadraFuerte(boolean ladraFuerte) {
		this.ladraFuerte = ladraFuerte;
	}
	
	
	
	
}
