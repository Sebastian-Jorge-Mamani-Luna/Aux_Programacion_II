package Ejercicio05;

public class Libro {
	private String nombre, autor; private int anio;

	public Libro() {
	}

	public Libro(String nombre, String autor, int anio) {
		this.nombre = nombre;
		this.autor = autor;
		this.anio = anio;
	}

	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", anio=" + anio + "]";
	}
	
	
	
	
	
}
