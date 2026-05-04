package Ejercicio06;

public class Parqueo {
    private int capacidad;
    private int cantAuto;
    private String[] placas;
    private double precioH;

    public Parqueo(int capacidad, double precioH) {
        this.capacidad = capacidad;
        this.precioH = precioH;
        this.cantAuto = 0;
        this.placas = new String[100];
    }

    public void mostrar() {
        System.out.println("Parqueo - Capacidad: " + capacidad + " autos");
    }
}
