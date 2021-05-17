
package act1u3;

/**
 *
 * @Bryan Sigala
 */
public class Directivo extends Empleado {
    
    public Directivo () {
        super(nombre, apellido, edad, Clave);
    }
    public Directivo (String nombre, String apellido, int edad, String Clave) {
        
    }
    
    public void determinarDirectivo (String nombre, String apellido, int edad) {
        if (nombre.equalsIgnoreCase("Pablo")) {
            System.out.println("____________________________________________");
            System.out.println("\nEmpleado: " + nombre + " "+ apellido + "  /  Edad: " + edad);
            System.out.println("Clave Empleado: CECC6629"
                    + "\nPuesto: Directivo.");
        }
    }
    
}
