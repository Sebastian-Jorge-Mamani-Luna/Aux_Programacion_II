package Ejercicio02;

public class Bus {
	private String nombreConductor;
	private String sindicato;
	private String marcaBus;
	private String placa;
	private int nroAsientos;
	
	
	public Bus(String nombreConductor, String sindicato, String marcaBus, String placa, int nroAsientos) {
		this.nombreConductor = nombreConductor;
		this.sindicato = sindicato;
		this.marcaBus = marcaBus;
		this.placa = placa;
		this.nroAsientos = nroAsientos;
	}
	
	public Bus() {
		this.nombreConductor = "Luigi";
		this.sindicato = "8 de agosto";
		this.marcaBus = "Volkswagen";
		this.placa = "123ABC";
		this.nroAsientos = 30;
	}
	
	
	public void cobrarPasaje(int nroPasajerosSubiendo) {
	    if(this.nroAsientos >= nroPasajerosSubiendo) {
	        double pasajeActual = (nroPasajerosSubiendo * 1.5);
	        System.out.println("Dinero actual de conductor... " + pasajeActual);
	    } else {
	        int pasajerosQuePuedenSubirParcial = nroPasajerosSubiendo - this.nroAsientos;
	        int pasajerosQuePuedenSubir = nroPasajerosSubiendo - pasajerosQuePuedenSubirParcial;
	        double pasajeActual = (pasajerosQuePuedenSubir * 1.5);
	        System.out.println("Dinero actual de conductor... " + pasajeActual);
	    }
	}
	
	public void asientosDisponibles(int nroPasajerosSubiendo) {
	    if(this.nroAsientos >= nroPasajerosSubiendo) {
	        this.nroAsientos -= nroPasajerosSubiendo;
	        System.out.println("Se subieron " + nroPasajerosSubiendo + " pasajeros --- Asientos Disponibles " + this.nroAsientos);
	    } else {
	        int pasajerosQuePuedenSubir = this.nroAsientos;
	        this.nroAsientos = 0;
	        System.out.println("Se subieron " + pasajerosQuePuedenSubir + " pasajeros --- Asientos Disponibles 0");
	    }
	}


	@Override
	public String toString() {
		return "Bus [nroAsientos Disponibles actualmente=" + nroAsientos + "]";
	}
	
	
	
}
