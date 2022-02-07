package classes;

/**
 * A classe Politico possui campos e métodos que representam um politico. Esta
 * classe herda da classe Pessoa, sendo uma especialização desta.
 * @author Alisson Jaques
 */
public class Politico extends Pessoa { // declaração da classe

    /**
     * Declaração dos campos da classe
     */
    private String partido;

    /**
     * O construtor da classe Politico, que recebe argumentos para inicializar
     * seus campos.
     *
     * @param nome o nome do político
     * @param numeroIdentidade o número da identidade do político
     * @param dataDeNascimento a data de nascimento do político
     * @param partido o partido do político
     */
    public Politico(String nome, int numeroIdentidade, Data dataDeNascimento, String partido) {
        super(nome, numeroIdentidade, dataDeNascimento);
        this.partido = partido;
    }
    
    /**
     * O construtor sobrecarregado da classe Politico, que recebe argumentos para inicializar
     * seus campos.
     *
     * @param pessoa uma instância da classe Pessoa
     * @param partido o partido do político
     */
    public Politico(Pessoa pessoa, String partido) {
        super(pessoa.getNome(),pessoa.getIdentidade(),pessoa.getNascimento());
        this.partido = partido;
    }
    
    /**
     * O construtor default da classe Politico, que não recebe nenhum argumento e
     * inicializa os campos da classe com valores default.
     */
    public Politico() {

    }

    /**
     * @return the partido
     */
    public String getPartido() {
        return partido;
    }

    /**
     * @param partido the partido to set
     */
    public void setPartido(String partido) {
        this.partido = partido;
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
        resultado += "\nPartido: " + getPartido();
        return resultado;
    } // fim do método toString
} // fim da classe Politico
