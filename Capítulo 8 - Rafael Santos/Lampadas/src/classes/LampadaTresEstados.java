package classes;

/**
 * A classe LampadaTresEstados possui campos e métodos que representam uma lâmpada
 * que pode estar acesa, apagada ou em meia luz. Esta classe herda da classe Lampada,
 * sendo uma especialização desta.
 * @author Alisson Jaques
 */
public class LampadaTresEstados extends Lampada { // declara a classe
    
    /**
     * Declaração dos campos da classe
     */
    private boolean meiaLuz;
    
    /**
     * O construtor completo da classe LampadaTresEstados que recebe argumentos para incializar 
     * todos os campos desta classe.
     * @param estado o estado da lâmpada
     * @param meiaLuz indica se a lâmpada está com meia luz ou não
     */
    public LampadaTresEstados(boolean estado, boolean meiaLuz) {
        super(estado); // delega a inicialização dos campos herdados ao construtor da super classe
        this.meiaLuz = meiaLuz;
    }
    
    /**
     * O construtor default para a classe LampadaTresEstados que não recebe nenhum argumento e
     * inicializa os campos da classe com valores default.
     */
    public LampadaTresEstados() {

    }
    
    /**
     * O método isMeiaLuz retorna um valor booleano que indica se a lâmpada esta em meia luz
     * ou não.
     * @return um valor booleano que indica se a lâmpada está ou não em meia Luz
     */
    public boolean isMeiaLuz() {
        return meiaLuz;
    }

    /**
     * O método setMeiaLuz recebe como argumento um estado de meia luz e atualiza o
     * estado de meia luz encapsulado no objeto.
     * @param meiaLuz o novo estado de meia luz (sim ou não)
     */
    public void setMeiaLuz(boolean meiaLuz) {
        this.meiaLuz = meiaLuz;
    }
    
    /**
     * O método toString não recebe argumentos e retorna uma string contendo os campos
     * do objeto formatados.
     * @return uma string contendo os campos do objeto formatados
     */
    @Override
    public String toString() {
        String resultado = super.toString() + "\n";
        resultado += "Meia Luz: " + isMeiaLuz() + "\n";
        return resultado;
    } // fim do método toString
} // fim da classe LampadaTresEstados
