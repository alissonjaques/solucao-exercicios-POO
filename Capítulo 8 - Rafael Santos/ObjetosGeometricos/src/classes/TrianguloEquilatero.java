package classes;

/**
 *
 * @author Alisson Jaques
 */
public class TrianguloEquilatero extends Triangulo{    
    public TrianguloEquilatero(double lado){
        super(lado,lado,lado);
    }
    
    public TrianguloEquilatero(){
        this((double)1.0);
    }
    
    @Override
    public String toString(){
        String resultado = super.toString().replaceAll("\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\* Dados do Tri�ngulo \\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*", "\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\* Dados do Tri�ngulo Equil�tero \\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*");
        return resultado;
    }
}
