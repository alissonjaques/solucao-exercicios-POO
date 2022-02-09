package classes;

/**
 *
 * @author Alisson Jaques
 */
public class Governador extends Politico { // declaração da classe

    /**
     * Declaração dos campos da classe
     */
    private String estadoGovernado;

    /**
     * O construtor da classe Governador, que recebe argumentos para inicializar
     * todos os seus campos.
     *
     * @param nome o nome do governador
     * @param numeroIdentidade o número da identidade do governador
     * @param dataDeNascimento a data de nascimento do governador
     * @param partido o partido do governador
     * @param estadoGovernado estado que o governador governa
     */
    public Governador(String nome, int numeroIdentidade, Data dataDeNascimento, String partido, String estadoGovernado) {
        super(nome, numeroIdentidade, dataDeNascimento, partido);
        this.estadoGovernado = estadoGovernado;
    }

    /**
     * O construtor sobrecarregado da classe Governador, que recebe argumentos 
     * para inicializar todos os seus campos.
     *
     * @param politico uma instância da classe Politico
     * @param estadoGovernado estado que o governador governa
     */
    public Governador(Politico politico, String estadoGovernado) {
        super(politico.getNome(), politico.getIdentidade(), politico.getNascimento(), politico.getPartido());
        this.estadoGovernado = estadoGovernado;
    }
    
    /**
     * O construtor default da classe Governador, que não recebe nenhum argumento
     * e inicializa os campos da classe com valores default.
     */
    public Governador() {

    }

    /**
     * @return the estadoGovernado
     */
    public String getEstadoGovernado() {
        return estadoGovernado;
    }

    /**
     * @param estadoGovernado the estadoGovernado to set
     */
    public void setEstadoGovernado(String estadoGovernado) {
        this.estadoGovernado = estadoGovernado;
    }
    
     /**
     * O método toString não recebe argumentos, e retorna uma String contendo os
     * valores dos campos da classe formatados.
     *
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString() {
        String resultado = super.toString();
        resultado += "\nEstado do Mandato: " + getEstadoGovernado();
        return resultado;
    } // fim do método toString
} // fim do classe Governador
