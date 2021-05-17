package act1u3;

/**
 *
 * @Edwin Santos
 */
public class PuestoOperario extends Operario {

    public PuestoOperario() {
        super(nombre, apellido, edad, Clave);
    }

    public PuestoOperario(String nombre, String apellido, int edad, String Clave) {

    }

    public void definirOperario(String nombre) {
        if (nombre.equalsIgnoreCase("Luis")) {
            System.out.println("Clave de empleado: SJXN1351"
                    + "\nPuesto: Operario ----> Oficial.");
        } else if (nombre.equalsIgnoreCase("Dania")) {
            System.out.println("Clave de empleado: LURW5168"
                    + "\nPuesto: Operario ----> Tecnico.");
        }
    }

}
