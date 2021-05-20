
package Mg_Figuras;

/**
 *
 * @author Envy
 */
public class Rectangulo extends Figura {
    
    private double base, altura;
    
    public Rectangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double calcularPerimetro(){
        return(base*2+altura*2);
    }
    public double calcularArea(){
        return(base*altura);
    }
    
}
