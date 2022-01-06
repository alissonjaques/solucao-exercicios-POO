package classes;

/**
 *
 * @author Alisson Jaques
 */
public class TrianguloEscaleno extends Triangulo{
    public TrianguloEscaleno(double ladoA, double ladoB, double ladoC){
        super(ladoA,ladoB,ladoC);
        if(!verificaIgualdade(ladoA,ladoB,ladoC)){ // se os lados não formarem um triângulo escaleno
            modifica(); // cria um triângulo escaleno default de lados A = 1, B = 2 e C = 3
        }
    }
    
    public TrianguloEscaleno(){
        this((double)1.0,(double)1.0,(double)1.0);
    }
    
    private boolean verificaIgualdade(double ladoA, double ladoB, double ladoC){
        if(ladoA==ladoB || ladoA==ladoC){
            return false;
        }
        else return ladoB != ladoC;
    }
    
    private void modifica(){
        setLadoA((double)1.0);
        setLadoB((double)2.0);
        setLadoC((double)3.0);
    }
    
    @Override
    public String toString(){
        String resultado = super.toString().replaceAll("\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\* Dados do Triângulo \\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*", "\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\* Dados do Triângulo Escaleno \\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*\\*");
        return resultado;
    }
}
