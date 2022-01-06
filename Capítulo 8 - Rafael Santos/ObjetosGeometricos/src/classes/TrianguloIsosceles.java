package classes;

/**
 * A classe TrianguloIsosceles possui campos e m�todos que re
 * @author Alisson Jaques
 */
public class TrianguloIsosceles extends Triangulo{
    public TrianguloIsosceles(double ladosIguais, double lado){
        super(ladosIguais,ladosIguais,lado);
    }
    
    public TrianguloIsosceles(){
        this((double)1.0,(double)1.0);
    }
    
    @Override
    public String toString(){
        String resultado = super.toString().replaceAll("\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\* Dados do Tri�ngulo \\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*", "\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\* Dados do Tri�ngulo Is�sceles \\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*");
        return resultado;
    }
}
