package Ejercicio01;

public class Principal {

	public static void main(String[] args) {
		
		Anime a1 = new Anime("Attack on Titan⚔","Shōnen",89);
		Anime a2 = new Anime("Dragon ball", "Shōnen", 153);
		
		Televisor t1 = new Televisor("Samsung",720,"oled");
		Televisor t2 = new Televisor("Lg",480,"ips");
		
		Instrumento i1 = new Instrumento("Trompeta", "metal", "aire");
		Instrumento i2 = new Instrumento("Guitarra", "madera", "cuerda");
		
		
		//Extra
		System.out.println(t1);
		System.out.println(t2);
		
		System.out.println(i1);
		System.out.println(i2);
		
	}

}
