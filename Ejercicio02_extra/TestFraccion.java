package TareaExtra;

public class TestFraccion {

	public static void main(String[] args) {
		//Crea los objetos Fraccion
		Fraccion f1 = new Fraccion(1, 4);
		Fraccion f2 = new Fraccion(4, 3);
		
		//Imprime cada fraccion
		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);
		
		
		//Imprime resultados de las operaciones
		System.out.println("suma = " + f1.suma(f2));
		System.out.println("resta = " + f1.resta(f2));
		
		//a)
		System.out.println("multiplicación = " + f1.multiplica(f2));
		
		//b) 
		System.out.println("división = " + f1.divide(f2));
		
		
		
		
		System.out.println("f1 equals f2 = " + f1.equals(f2));

	}

}
