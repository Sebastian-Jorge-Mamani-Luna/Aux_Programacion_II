package Ejercicio03;
import java.util.Scanner;
public class Main_Videojuego {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int n;
		
		
		//OBJETO 1
		Videojuego vj1 = new Videojuego();
		vj1.agregarJugadores();
		
		do {
			System.out.println("Ingrese la cantidad de jugadores nuevos: ");
			n = leer.nextInt();
			if(n < 0) {
				System.out.println("¡No se puede ingresar una cantidad negativa!.");
			}
		}while(n < 0);
		
		vj1.agregarJugadores(n);
		
		
		
		//OBJETO 2
		Videojuego vj2 = new Videojuego("Lef4", "PC", 1);
		
		do {
			System.out.println("Ingrese la cantidad de jugadores nuevos: ");
			n = leer.nextInt();
			if(n < 0) {
				System.out.println("¡No se puede ingresar una cantidad negativa!.");
			}
		}while(n < 0);
		
		vj2.agregarJugadores(n);

	}

}
