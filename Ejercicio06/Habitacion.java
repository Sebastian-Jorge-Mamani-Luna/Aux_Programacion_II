package Ejercicio06;

public class Habitacion {
    private String nombre;
    private double tamanio;
    private int cantMuebles;
    private Mueble[] muebles;

    public Habitacion(String nombre, double tamanio) {
        this.nombre = nombre;
        this.tamanio = tamanio;
        this.cantMuebles = 0;
        this.muebles = new Mueble[100];
    }

    
    public void agregarMueble(Mueble m) {
        if (this.cantMuebles < 100) {
            this.muebles[this.cantMuebles] = m;
            this.cantMuebles++;
        }
    }

    public int getCantMuebles() { return cantMuebles; }
    public String getNombre() { return nombre; }

    public void mostrar() {
        System.out.println("    Habitacion: " + nombre + " | Muebles: " + cantMuebles);
        for (int i = 0; i < cantMuebles; i++) {
            if (muebles[i] != null) muebles[i].mostrar();
        }
    }
}