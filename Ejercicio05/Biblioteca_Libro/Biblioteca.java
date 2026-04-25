package Ejercicio05;

import java.util.Arrays;

public class Biblioteca {
	private String nombre; private int cantLibros;
	private Libro [] libros; //CLAVE PARA HACER EJERCICIOS
	
	
	
	
	//INCISO A
	public Biblioteca(String nombre, int cantLibros, Libro[] libros) {
		this.nombre = nombre;
		this.cantLibros = cantLibros;
		this.libros = libros;
	}

	public void verificarPresenciaLibro(String HabitosAtomicos) {
		for(int i = 0; i < libros.length; i ++) {
			if(this.libros[i].getNombre().equals(HabitosAtomicos)) {
				System.out.println("¡El libro si esta!");
				System.out.println(this.libros[i]);
			}
		}
	}
	
	public void mostrarBibliotecaMasLibros(Biblioteca b2) {
		if(this.cantLibros > b2.cantLibros) {
			System.out.println(b2.toString());
		}else {
			if(this.cantLibros == b2.cantLibros) {
				System.out.println("BIBLIOTECA INFORMATICA: \n" + this.toString()+ "\n");
				System.out.println("BIBLIOTECA UMSA: \n" + b2.toString());
			}else {
				System.out.println(this.toString());
			}
			
		}
		
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getCantLibros() {
		return cantLibros;
	}


	public void setCantLibros(int cantLibros) {
		this.cantLibros = cantLibros;
	}


	public Libro[] getLibros() {
		return libros;
	}


	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}

	@Override
	public String toString() {
		return "Biblioteca [nombre=" + nombre + ", cantLibros=" + cantLibros + ", libros=" + Arrays.toString(libros)
				+ "]";
	}
	
	
	
	
	
	
}
