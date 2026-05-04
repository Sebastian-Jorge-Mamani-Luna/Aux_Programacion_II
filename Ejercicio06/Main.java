package Ejercicio06;

public class Main {
    public static void main(String[] args) {
        // a
        Edificio ed = new Edificio("Torre A", 800.0);
        Parqueo p = new Parqueo(40, 10.0); 
        ed.setParqueo(p);

        
        ed.crearDepartamento(101, 1);
        ed.crearDepartamento(201, 2);

        
        ed.getDep(0).crearHabitacion("Sala", 20.0);
        ed.getDep(0).crearHabitacion("Cocina", 10.0);
        ed.getDep(0).crearHabitacion("Bano", 5.0);
        ed.getDep(0).crearHabitacion("Patio", 15.0);

        ed.getDep(1).crearHabitacion("Dormitorio", 15.0);
        ed.getDep(1).crearHabitacion("Bano", 5.0); 

        // c
        Mueble m1 = new Mueble("Sofa", "Cuero");
        Mueble m2 = new Mueble("Mesa", "Madera");
        
       
        ed.getDep(0).getHabitacion(0).agregarMueble(m1);
        ed.getDep(0).getHabitacion(0).agregarMueble(m2);

        // b
        ed.mostrarMayorHabPiso(1);

        // d
        ed.mostrarDepsMasMuebles();

        // e
        ed.mostrarHabMasMueblesPiso(1);

        // f
        ed.eliminarDepsPrimos();
        ed.mostrarTodo();
    }
}