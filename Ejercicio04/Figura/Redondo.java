package Ejercicio04;

public class Redondo extends Figura{
	private int radio;
	
	public Redondo(String color, int radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double obtenerArea() {
		return Math.PI * this.radio * this.radio;
	}

	@Override
	public String toString() {
		return "Redondo [radio=" + radio + "]";
	}
	
	
	
}
