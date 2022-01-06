package classes;

/**
 * A classe LampadaFluorescente possui campos e métodos que representam uma lâmpada fluorescente.
 * Ela herda da classe Lampada, sendo uma especialização desta.
 * 
 * @author Alisson Jaques
 */
public class LampadaFluorescente extends Lampada{ // declara a classe
    
    /**
     * Declaração de campos da classe
     */
    private double comprimento;
    
    /**
     * O construtor completo da classe LampadaFluorescente que recebe como argumento o estado,
     * a potência e o comprimento da lâmpada, inicializando todos os seus campos com os mesmos.
     * @param estado o estado da lâmpada (aceso ou apagado)
     * @param potencia a potência wats da lâmpada
     * @param comprimento o comprimento em centímetros da lâmpada
     */
    public LampadaFluorescente(boolean estado, float potencia, double comprimento){
        super(estado,potencia); // inicializa os campos herdados da classe ancestral com os valores passados como argumento
        this.comprimento = comprimento;
    } // fim do construtor completo
    
    /**
     * O construtor default para a classe LampadaFluorescente que não recebe nenhum argumento e inicializa os campos da classe
     * com valores default.
     */
    public LampadaFluorescente(){
    
    } // fim do construtor default
    
    /**
     * O método getComprimento retorna o comprimento encapsulado na lâmpada fluorescente.
     * @return o comprimento da lâmpada
     */
    public double getComprimento() {
        return comprimento;
    } // fim do método getComprimento

    /**
     * O método setComprimento recebe como argumento um comprimento e atualiza o comprimento
     * encapsulado na lâmpada fluorescente.
     * @param comprimento o novo comprimento da lâmpada
     */
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    } // fim do método setComprimento
    
    /**
     * O método toString não possui argumentos e retorna uma string, contendo os campos da
     * classe formatados.
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString(){
        String resultado = super.toString() + "\n";
        resultado += "Comprimento da Lâmpada: " + getComprimento() + " cm\n";
        return resultado;
    } // fim do método toString
} // fim da classe LampadaFluorescente