package Ejercicio04;

public class Cuadrado extends Figura{
	private int lado;
	
	public Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}

	@Override
	public double obtenerArea() {
		return this.lado * this.lado;
	}

	public void mostrarColorMayorFigura(Triangulo t1) {
		if(obtenerArea() > t1.obtenerArea()) {
			System.out.println("el area mayor es del Cuadrado y su color es:  " + this.color);
		}else {
			if(obtenerArea() == t1.obtenerArea()) {
				System.out.println("el area de ambas figuras son iguales y sus colores son: " + this.color + " y " + t1.color);
			}else {
				System.out.println("El area mayor es del Triangulo y su color es: " + t1.color);
			}
			
		}
		
	}
	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + this.lado + "]";
	}

	
	
	
	
	
}
