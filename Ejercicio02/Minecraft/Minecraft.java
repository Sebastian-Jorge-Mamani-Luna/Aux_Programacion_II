package Ejercicio02;

public class Minecraft {
	
    private String[] nombres;   
    private int[] diamantes;    
    private int cantidadJugadores; 

    public Minecraft() {
        nombres = new String[100];     
        diamantes = new int[100];
        cantidadJugadores = 0;
    }

    
    public void agregarJugador(String nombre, int diamantesJugador) {
        if(this.cantidadJugadores < 100) {
            this.nombres[this.cantidadJugadores] = nombre;
            this.diamantes[this.cantidadJugadores] = diamantesJugador;
            this.cantidadJugadores++;
            System.out.println("Jugador " + this.nombres + " agregado con " + this.diamantes + " diamantes");
        } else {
            System.out.println("El servidor ya tiene 100 jugadores");
        }
    }

    
    public void mostrarStacks() {
        System.out.println("Stacks de diamantes por cada jugador:");
        for (int i = 0; i < this.cantidadJugadores; i++) {
            int stacks = diamantes[i] / 64; 
            System.out.println(nombres[i] + ": " + stacks + " stacks");
        }
    }

    
    public void jugadorConMasDiamantes() {
        if (cantidadJugadores == 0) {
            System.out.println("no hay jugadores en el servidor");
        }

        int maxDiamantes = diamantes[0];
        String nombreMax = nombres[0];

        for (int i = 1; i < cantidadJugadores; i++) {
            if (diamantes[i] > maxDiamantes) {
                maxDiamantes = diamantes[i];
                nombreMax = nombres[i];
            }
        }
        System.out.println("Jugador con mas diamantes es: " + nombreMax + " con " + maxDiamantes + " diamantes");
    }

    
    public void totalDiamantes() {
        int total = 0;
        for (int i = 0; i < cantidadJugadores; i++) {
            total += diamantes[i];
        }
        System.out.println("total de diamantes en el servidor son: " + total);
    }
}
