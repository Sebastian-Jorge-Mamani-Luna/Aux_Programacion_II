package Ejercicio02;

public class Main_Minecraft {

	public static void main(String[] args) {
		
		Minecraft m1 = new Minecraft();

        // Agregamos jugadores
        m1.agregarJugador("Sebas", 100);
        m1.agregarJugador("Ana", 50);
        m1.agregarJugador("Hilario", 10);

        
        
        
        m1.mostrarStacks();

        m1.jugadorConMasDiamantes();

        m1.totalDiamantes();
		
	}

}
