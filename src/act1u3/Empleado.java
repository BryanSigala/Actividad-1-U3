
package act1u3;

import java.util.Scanner;

/**
 *
 * @Bryan Sigala
 */
public class Empleado extends Act1U3 {
    
    
    Scanner ingreso = new Scanner(System.in);
    
    public Empleado () {
        super(nombre, apellido, edad, Clave);
    }
    public Empleado (String nombre, String apellido, int edad, String Clave) {
        
    }
    
    public void ingresenombre () {
        System.out.println("Ingrese su nombre registrado: ");
        nombre = ingreso.next();
        System.out.println("\nIngrese su apellido registrado(materno/paterno): ");
        apellido = ingreso.next();
        System.out.println("\nIngrese su edad: ");
        edad = ingreso.nextInt();
        
        if (nombre.equalsIgnoreCase("Luis") || nombre.equalsIgnoreCase("Dania") || nombre.equalsIgnoreCase("Pablo")) {
            
        } else {
            System.out.println("\nIngrese su clave de empleado: ");
            Clave = ingreso.next();
            System.out.println("\n_________________________________________________________________");
            System.out.println("\nNombre de empleado: " + nombre + " "+ apellido + "  /  Edad: " + edad + "\n"
                + "Clave de empleado: " + Clave); //Para comprobar que la salida funciona
        }
    }
    
    
    
    
}
