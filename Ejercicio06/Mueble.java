package Ejercicio06;

public class Mueble {
    private String tipo;
    private String material;

    public Mueble(String tipo, String material) {
        this.tipo = tipo;
        this.material = material;
    }

    public void mostrar() {
        System.out.println("      - Mueble: " + tipo + " de " + material);
    }
}