package Ejercicio06;

public class Edificio {
    private String nombre;
    private double superficie;
    private int cantDep;
    private Departamento[] deps;
    private Parqueo parqueo;

    public Edificio(String nombre, double superficie) {
        this.nombre = nombre;
        this.superficie = superficie;
        this.cantDep = 0;
        this.deps = new Departamento[100];
    }

    
    public void setParqueo(Parqueo p) { this.parqueo = p; }

    public void crearDepartamento(int nroPuerta, int nroPiso) {
        if (this.cantDep < 100) {
            this.deps[this.cantDep] = new Departamento(nroPuerta, nroPiso);
            this.cantDep++;
        }
    }

    public Departamento getDep(int i) { return deps[i]; }
    public int getCantDep() { return cantDep; }

    

    public void mostrarMayorHabPiso(int y) {
        Departamento mayor = null;
        for (int i = 0; i < cantDep; i++) {
            if (deps[i].getNroPiso() == y) {
                if (mayor == null || deps[i].getNroHab() > mayor.getNroHab()) {
                    mayor = deps[i];
                }
            }
        }
        if (mayor != null) mayor.mostrar();
    }

    public void mostrarDepsMasMuebles() {
        int max = -1;
        for (int i = 0; i < cantDep; i++) {
            int total = deps[i].contarMueblesTotales();
            if (total > max) max = total;
        }
        for (int i = 0; i < cantDep; i++) {
            if (deps[i].contarMueblesTotales() == max) deps[i].mostrar();
        }
    }

    public void mostrarHabMasMueblesPiso(int z) {
        String nombreH = "";
        int max = -1;
        for (int i = 0; i < cantDep; i++) {
            if (deps[i].getNroPiso() == z) {
                for (int j = 0; j < deps[i].getNroHab(); j++) {
                    if (deps[i].getHabitacion(j).getCantMuebles() > max) {
                        max = deps[i].getHabitacion(j).getCantMuebles();
                        nombreH = deps[i].getHabitacion(j).getNombre();
                    }
                }
            }
        }
        System.out.println("Hab mas muebles en piso " + z + ": " + nombreH);
    }

    public void eliminarDepsPrimos() {
        int nuevaCant = 0;
        Departamento[] aux = new Departamento[100];
        for (int i = 0; i < cantDep; i++) {
            int n = deps[i].getNroHab();
            boolean esPrimo = true;
            if (n < 2) esPrimo = false;
            else {
                for (int k = 2; k < n; k++) {
                    if (n % k == 0) esPrimo = false;
                }
            }
            if (!esPrimo) {
                aux[nuevaCant] = deps[i];
                nuevaCant++;
            }
        }
        deps = aux;
        cantDep = nuevaCant;
    }

    public void mostrarTodo() {
        System.out.println("Edificio: " + nombre);
        if (parqueo != null) parqueo.mostrar();
        for (int i = 0; i < cantDep; i++) {
            deps[i].mostrar();
        }
    }
}