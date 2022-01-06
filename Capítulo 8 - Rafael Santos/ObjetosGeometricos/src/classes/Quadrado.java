package classes;

/**
 *
 * @author Alisson Jaques
 */
public class Quadrado extends Retangulo{
    
    public Quadrado(double lado){
        super(lado,lado);
    }
    
    public Quadrado(){
       this((double)1.0);
    }
    
    @Override
    public String toString(){
        String resultado = super.toString().replaceAll("Retângulo", "Quadrado");
        return resultado;
    }
}
