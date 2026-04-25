package Ejercicio05_2;

import java.util.Arrays;

public class CentroVeterinario {
	private String nombre;
	private int cantPerros;
	private Perro[] perros;
	private int cantGatos;
	private Gato[] gatos;
	
	
	public CentroVeterinario(String nombre, int cantPerros, Perro[] perros, int cantGatos, Gato[] gatos) {
		this.nombre = nombre;
		this.cantPerros = cantPerros;
		this.perros = perros;
		this.cantGatos = cantGatos;
		this.gatos = gatos;
	}
	
	public void ordenarPerros() {
		for(int i = 0; i < this.cantPerros; i++) {
			for(int j = 0; j < this.cantPerros - 1 - i; j++) {
				if (perros[j].getEdad() == perros[j+1].getEdad()) {
					if(perros[j].getNombreDuenio().compareTo(perros[j+1].getNombreDuenio()) > 0) {//mayor que 0
						Perro aux = perros[j];
						perros[j] = perros[j+1];
						perros[j+1] = aux; 
					}
				}else {
					if(perros[j].getEdad() > perros[j+1].getEdad()) {
						Perro aux = perros[j];
						perros[j] = perros[j+1];
						perros[j+1] = aux; 
					}
				}
			}
		}
	}
	
	
	
	public void ordenarGatos() {
	    for (int i = 0; i < this.cantGatos; i++) {
	        for (int j = 0; j < this.cantGatos - 1 - i; j++) {

	            boolean intercambiar = false;

	            if (gatos[j].isTomaLeche() != gatos[j+1].isTomaLeche()) {
	                if (!gatos[j].isTomaLeche() && gatos[j+1].isTomaLeche()) {
	                    intercambiar = true;
	                }

	            } else {
	            	
	                if (gatos[j].getEdad() != gatos[j+1].getEdad()) {
	                    if (gatos[j].getEdad() < gatos[j+1].getEdad()) {
	                        intercambiar = true;
	                    }

	                } else {
	                    if (gatos[j].getNombre().compareTo(gatos[j+1].getNombre()) > 0) {
	                        intercambiar = true;
	                    }
	                }
	            }
	            
	            if (intercambiar) {
	                Gato aux = gatos[j];
	                gatos[j] = gatos[j+1];
	                gatos[j+1] = aux;
	            }
	        }
	    }
	}
	
	public void mostrarAnimales() {
	    System.out.println("=== PERROS ===");
	    for (int i = 0; i < this.cantPerros; i++) {
	        System.out.println(
	            "Nombre: " + perros[i].getNombreDuenio() +
	            ", Edad: " + perros[i].getEdad() +
	            ", Dueño: " + perros[i].getNombreDuenio()
	        );
	    }

	    System.out.println("=== GATOS ===");
	    for (int i = 0; i < this.cantGatos; i++) {
	        System.out.println(
	            "Nombre: " + gatos[i].getNombre() +
	            ", Edad: " + gatos[i].getEdad() +
	            ", Dueño: " + gatos[i].getNombreDuenio() +
	            ", Toma leche: " + gatos[i].isTomaLeche()
	        );
	    }
	}
	
	
	public boolean verificarDuenioMasDe2Animales(String nomD) {
		int cont = 0;
		for (int i = 0; i < this.cantPerros; i++) {
			if(cont > 2) {
				return true;
			}else {
				if(perros[i].getNombreDuenio().equals(nomD)) {
					cont++;
				}
			}
		}
		
		for (int i = 0; i < this.cantGatos; i++) {
			if(cont > 2) {
				return true;
			}else {
				if(gatos[i].getNombreDuenio().equals(nomD)) {
					cont++;
				}
			}
		}
		return false;
	}

	public void mostrarAnimalesDuenio(String nomD) {
		if(verificarDuenioMasDe2Animales(nomD)) {
			for(int i = 0; i < this.cantPerros; i++) {
				if(perros[i].getNombreDuenio().equals(nomD)) {
					perros[i].mostrar();
				}
			}
			for(int i = 0; i < this.cantGatos; i++) {
				if(gatos[i].getNombreDuenio().equals(nomD)) {
					gatos[i].mostrar();
				}
			}
		}else {
			System.out.println("No hay mas de 2 mascotas con el mismo dueño");
		}
	}

	
	
}
