package Ejercicio03;

public class Aula {
	private String nombreAula;
	private int piso;
	private String estudiantes[][] = new String[50][2];
	private int numeroEstudiantes;
	
	
	public Aula(String nombreAula, int piso) {
		this.nombreAula = nombreAula;
		this.piso = piso;
		this.numeroEstudiantes = 3;
		
		estudiantes[0][0] = "Sebas"; estudiantes[0][1] = "100";
		estudiantes[1][0] = "Benito"; estudiantes[1][1] = "90";
		estudiantes[2][0] = "German"; estudiantes[2][1] = "20";	
	}
	
	
	public void mostrar() {
		System.out.println("Nombre del aula: " +  this.nombreAula);
		System.out.println("Número de piso: " + this.piso);
		System.out.println("---------------------------------------------");
		System.out.println("NOM. ESTUDIANTE ||  NOTA SOBRE 100");
		for(int i = 0; i < numeroEstudiantes; i++) {
			System.out.println(estudiantes[i][0] + "       " + estudiantes[i][1]);
		}
	}
	
	
	public void mostrar(int notaMinimaAprobacion) {
		System.out.println("NOM. ESTUDIANTE ||  NOTA SOBRE 100");
		for(int i = 0; i < numeroEstudiantes; i++) {
			if(Integer.parseInt(estudiantes[i][1]) >= notaMinimaAprobacion) {
				System.out.println(estudiantes[i][0] + "                  APROBO");
			}else {
				System.out.println(estudiantes[i][0] + "                  REPROBO");
			}
		}
	}
	
	
	
}
