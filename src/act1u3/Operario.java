package act1u3;

/*
**@Edwin Santos
 */
public class Operario extends Empleado {

    public Operario() {
        super(nombre, apellido, edad, Clave);

    }

    public Operario(String nombre, String apellido, int edad, String Clave) {

    }

    public void determinarOperario(String nombre, String apellido, int edad) {

        if (nombre.equalsIgnoreCase("Luis") || nombre.equalsIgnoreCase("Dania")) {
            System.out.println("____________________________________________");
            System.out.println("\nEmpleado: " + nombre + " " + apellido + "  /  Edad: " + edad);
        }

    }

}
