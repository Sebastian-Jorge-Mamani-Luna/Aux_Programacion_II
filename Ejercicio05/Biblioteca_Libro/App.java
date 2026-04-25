package Ejercicio05;

public class App {

	public static void main(String[] args) {
		Libro l1 = new Libro("Habitos Atomicos", "James clear", 2018);
		Libro l2 = new Libro("Romeo y Julieta", "William Shakespeare", 1957);
		Libro l3 = new Libro("Frankenstein", "Mary Shelley", 1818);
		Libro l4 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
		
		Libro[] librosBiblioteca1 = {l1, l2}; //CLAVE PARA GUARDAR LOS LIBROS 
		Libro[] librosBiblioteca2 = {l3, l4}; //CLAVE PARA GUARDAR LOS LIBROS 
		
		
		//INCISO B
		Biblioteca b1 = new Biblioteca("biblioteca Informatica", 50, librosBiblioteca1);
		Biblioteca b2 = new Biblioteca("biblioteca UMSA", 100, librosBiblioteca1);
		
		
		//INCISO C
		b1.verificarPresenciaLibro("Habitos Atomicos");

		
		//INCISO D
		System.out.println("La biblioteca con mas libros es: ");
		b1.mostrarBibliotecaMasLibros(b2);
	}

}
