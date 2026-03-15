package Ejercicio03;

public class Videojuego {
	private String nombre;
	private String plataforma;
	private int cantidadJugadores;
	
	
	public Videojuego () {
		this.nombre = "Minecraft";
		this.plataforma = "Android";
		this.cantidadJugadores = 20;
	}
	
	public Videojuego (String nombre, String plataforma, int cantidadJugadores) {
		this.nombre = nombre;
		this.plataforma = plataforma;
		this.cantidadJugadores = cantidadJugadores;
	}
	
	public void agregarJugadores() {
		this.cantidadJugadores += 1;
		System.out.println("Se agrego 1 jugador, actualmente... " + cantidadJugadores + " jugadores");
	}
	
	public void agregarJugadores(int cantidadJugadoresNuevos) {
		this.cantidadJugadores += cantidadJugadoresNuevos;
		System.out.println("Se agrego " +  cantidadJugadoresNuevos +  ", actualmente... " + cantidadJugadores + " jugadores");
	}
}
