package Ejercicio06;

public class Departamento {
    private int nroPuerta;
    private int nroHab;
    private Habitacion[] hab;
    private int nroPiso;

    public Departamento(int nroPuerta, int nroPiso) {
        this.nroPuerta = nroPuerta;
        this.nroPiso = nroPiso;
        this.nroHab = 0;
        this.hab = new Habitacion[100];
    }

    public void crearHabitacion(String nombre, double tam) {
        if (this.nroHab < 100) {
            this.hab[this.nroHab] = new Habitacion(nombre, tam);
            this.nroHab++;
        }
    }

    public int getNroPuerta() { return nroPuerta; }
    public int getNroPiso() { return nroPiso; }
    public int getNroHab() { return nroHab; }
    public Habitacion getHabitacion(int i) { return hab[i]; }

    public int contarMueblesTotales() {
        int total = 0;
        for (int i = 0; i < nroHab; i++) {
            total += hab[i].getCantMuebles();
        }
        return total;
    }

    public void mostrar() {
        System.out.println("  Dep " + nroPuerta + " (Piso " + nroPiso + ")");
        for (int i = 0; i < nroHab; i++) {
            hab[i].mostrar();
        }
    }
}