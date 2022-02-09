package classes;

/**
 *
 * @author Alisson Jaques
 */
public class Prefeito extends Politico { // declaração da classe

    /**
     * Declaração dos campos da classe
     */
    private String cidadeDoMandato;

    /**
     * O construtor da classe Prefeito, que recebe argumentos para inicializar
     * todos os seus campos.
     *
     * @param nome o nome do prefeito
     * @param numeroIdentidade o número da identidade do prefeito
     * @param dataDeNascimento a data de nascimento do prefeito
     * @param partido o partido do prefeito
     * @param cidadeDoMandato a cidade que o prefeito gorvena
     */
    public Prefeito(String nome, int numeroIdentidade, Data dataDeNascimento,
            String partido, String cidadeDoMandato) {
        super(nome, numeroIdentidade, dataDeNascimento, partido);
        this.cidadeDoMandato = cidadeDoMandato;
    }

    /**
     * O construtor sobrecarregado da classe Prefeito, que recebe argumentos para inicializar
     * todos os seus campos.
     *
     * @param politico uma instância da classe Politico
     * @param cidadeDoMandato a cidade que o prefeito gorvena
     */
    public Prefeito(Politico politico, String cidadeDoMandato) {
        super(politico.getNome(), politico.getIdentidade(), politico.getNascimento(), politico.getPartido());
        this.cidadeDoMandato = cidadeDoMandato;
    }

    /**
     * O construtor default da classe Prefeito, que não recebe nenhum argumento
     * e inicializa os campos da classe com valores default.
     */
    public Prefeito() {

    }

    /**
     * @return the cidadeDoMandato
     */
    public String getCidadeDoMandato() {
        return cidadeDoMandato;
    }

    /**
     * @param cidadeDoMandato the cidadeDoMandato to set
     */
    public void setCidadeDoMandato(String cidadeDoMandato) {
        this.cidadeDoMandato = cidadeDoMandato;
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
        resultado += "\nCidade do Mandato: " + getCidadeDoMandato();
        return resultado;
    } // fim do método toString
} // fim da classe Prefeito
