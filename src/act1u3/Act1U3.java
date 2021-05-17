package act1u3;

import java.util.Scanner;

/**
 * @Bryan Sigala
 * @Edwin Santos
 */
public class Act1U3 {

    static String nombre, apellido, Clave;
    static int edad;

    public Act1U3() {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Act1U3 (String nombre, String apellido, int edad, String Clave) {
        
    }

    public static void main(String[] args) {

        Scanner ingreso = new Scanner(System.in);

        Empleado empleado = new Empleado();
        Directivo directivo = new Directivo();
        Operario operario= new Operario();
        PuestoOperario puestoOp=new PuestoOperario();
        
        System.out.println("Bienvenido a la Actividad 1 de la Unidad 3 de POO\n");
        empleado.ingresenombre();
        directivo.determinarDirectivo(nombre, apellido, edad);
        operario.determinarOperario(nombre, apellido, edad);
        puestoOp.definirOperario(nombre);

    }

}
