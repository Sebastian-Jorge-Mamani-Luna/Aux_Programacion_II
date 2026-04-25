package Ejercicio05_2;

public class Gato extends Animal{
	private boolean cazaRatones, tomaLeche;
	
	
	public Gato(String nombre,  int edad, String nombreDuenio, boolean cazaRatones, boolean tomaLeche) {
		super(nombre, edad, nombreDuenio);
		this.cazaRatones = cazaRatones;
		this.tomaLeche = tomaLeche;
	}


	public void mostrar() {
		System.out.println(this.nombre);
		System.out.println(this.nombreDuenio);
		System.out.println(this.edad);
		System.out.println(this.cazaRatones);
		System.out.println(this.tomaLeche);
	}


	public boolean isCazaRatones() {
		return cazaRatones;
	}


	public void setCazaRatones(boolean cazaRatones) {
		this.cazaRatones = cazaRatones;
	}


	public boolean isTomaLeche() {
		return tomaLeche;
	}


	public void setTomaLeche(boolean tomaLeche) {
		this.tomaLeche = tomaLeche;
	}
	
	
	
	
}
