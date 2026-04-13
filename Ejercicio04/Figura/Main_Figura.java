package Ejercicio04;

public class Main_Figura {

	public static void main(String[] args) {
		
		Cuadrado c1 = new Cuadrado("verde",5);
		System.out.println(c1);
		Cuadrado c2 = new Cuadrado("azul", 10);
		System.out.println(c2);
		
		Triangulo t1 = new Triangulo("rojo", 1, 2, 3);
		System.out.println(t1);
		Triangulo t2 = new Triangulo("morado", 3, 5, 4);
		System.out.println(t2);
		
		Redondo r1 = new Redondo("amarillo", 3);
		System.out.println(r1);
		Redondo r2 = new Redondo("celeste", 4);
		System.out.println(r2);
		
		c1.mostrarColorMayorFigura(t1);
		
	}

}
