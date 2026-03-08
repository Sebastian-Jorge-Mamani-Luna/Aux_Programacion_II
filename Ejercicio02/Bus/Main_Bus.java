package Ejercicio02;

public class Main_Bus {

	public static void main(String[] args) {
		Bus b1 = new Bus("Mario Bros", "8 de agosto", "Toyota","321CBA", 20);
		b1.cobrarPasaje(10);
		b1.asientosDisponibles(10);
		
		//BUS 2 (PRUEBA)
		System.out.println("--------------BUS 2---------------");
		Bus b2 = new Bus();
		b2.cobrarPasaje(100);
		b2.asientosDisponibles(100);
	}

}
