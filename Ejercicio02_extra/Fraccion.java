package TareaExtra;

public class Fraccion {
	//Atributos
	
	private int numerador;
	private int denominador;
	
	//METODOS 
	//Construye una nueva fraccion (por defecto)
	public Fraccion() {
		this.numerador = 0;
		this.denominador = 1;
	}
	//Construye una nueva fraccion (parametrizado)
	public Fraccion(int n, int d) {
		this.numerador = n;
		this.denominador = d;
	}
	
	//Comprueba si dos fracciones son iguales
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Fraccion) {
			Fraccion f = (Fraccion) o;
			return f.numerador == this.numerador && 
				   f.denominador == this.denominador;
		} else {
			return false;
		}
	}
	
	//Cadena del objeto 
	public String toString() {
		return String.format("%d/%d", this.numerador, this.denominador);
	}
	
	//Suma 2 fracciones
	public Fraccion suma (Fraccion o) {
		int n = (this.numerador * o.denominador) + (this.denominador * o.numerador);
		int d = this.denominador * o.denominador;
		return new Fraccion(n, d);
	}
	
	//Resta 2 fracciones
	public Fraccion resta(Fraccion o) {
		Fraccion c = new Fraccion();
		c.numerador = (this.numerador * o.denominador) - (this.denominador * o.numerador);
		c.denominador = this.denominador * o.denominador;
		return c;
	}
	
	
	//inciso a)
	public Fraccion multiplica(Fraccion o) {
		Fraccion m = new Fraccion();
		m.numerador = this.numerador * o.numerador;
		m.denominador = this.denominador * o.denominador; 
		return m;
	}
	
	
	//inciso b)
	public Fraccion divide (Fraccion o) {
		Fraccion d = new Fraccion();
		d.numerador = this.numerador * o.denominador;
		d.denominador = this.denominador * o.numerador;
		return d;
	}
}
