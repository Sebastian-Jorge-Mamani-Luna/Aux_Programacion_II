package Ejercicio05_2;

public class Main {
	public static void main(String[] args) {
		//INCISO A
		Perro perro1 = new Perro("Firulais", 5, "Roberto", false, false);
		Perro perro2 = new Perro("Dog", 3, "Martina", false, true);
		Perro perrosCV1[] = {perro1, perro2};
		Gato gato1 = new Gato("Michi", 2, "Ana", false, true);
		Gato gato2 = new Gato("Alexa", 2, "Margarita", false, true);
		Gato gatosCV1[] = {gato1, gato2};
		
		CentroVeterinario cv1 = new CentroVeterinario("Dogtor", 2, perrosCV1, 2, gatosCV1);
		
		//2DA INSTANCIA
		Perro p1 = new Perro("Firulais", 5, "Roberto", false, false);
		Perro p2 = new Perro("Dog", 3, "Martina", false, true);
		Perro perrosCV2[] = {p1, p2};
		Gato g1 = new Gato("Michi", 2, "Ana", false, true);
		Gato g2 = new Gato("Alexa", 2, "Margarita", false, true);
		Gato gatosCV2[] = {g2, g1};
		
		CentroVeterinario cv2 = new CentroVeterinario("Cattor", 2, perrosCV2, 2, gatosCV2);
		
		
		//INCISO B y C
		cv1.ordenarPerros();
		cv1.ordenarGatos();
		cv1.mostrarAnimales();
		cv2.ordenarPerros();
		cv2.ordenarGatos();
		cv2.mostrarAnimales();
		
		//INCISO D
		cv1.mostrarAnimalesDuenio("Margarita");
	}
}
