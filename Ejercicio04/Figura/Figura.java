package Ejercicio04;

public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    public abstract double obtenerArea();
       
}
