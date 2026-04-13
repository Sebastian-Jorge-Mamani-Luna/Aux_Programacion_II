package Ejercicio04;

public class Triangulo extends Figura{
	
	private int lado1, lado2, lado3;
	
	public Triangulo(String color, int lado1, int lado2, int lado3) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}


	@Override
	public double obtenerArea() {
		 double s = (this.lado1 + this.lado2 + this.lado3) / 2.0;
		 double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
		 return area;
	}

	
	
	@Override
	public String toString() {
		return "Triangulo [lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + "]";
	}
	
	

}
