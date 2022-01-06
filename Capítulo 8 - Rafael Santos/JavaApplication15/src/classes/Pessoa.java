package classes;

/**
 * A classe Pessoa, que encapsula os dados de identificação de uma pessoa. A
 * única diferença entre esta classe e a classe Pessoa0 é que todos os campos
 * são declarados como private ao invés de public.
 */
public class Pessoa{ // declaração da classe 

    /**
     * Declaração dos campos da classe
     */
    private String nome; // o nome da pessoa
    private int identidade; // o número da identidade da pessoa
    private Data nascimento; // a data de nascimento da pessoa

    /**
     * O construtor da classe Pessoa, que recebe argumentos para inicializar
     * seus campos.
     *
     * @param n o nome da pessoa
     * @param i o número da identidade da pessoa
     * @param d a data de nascimento da pessoa
     */
    public Pessoa(String n, int i, Data d) {
        nome = n;
        identidade = i;
        nascimento = d;
    }
    
    /**
     * O construtor default para a classe Pessoa que não recebe argumentos
     * e inicializa os campos desta classe com valores default.
     */
    public Pessoa(){
    
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the identidade
     */
    public int getIdentidade() {
        return identidade;
    }

    /**
     * @param identidade the identidade to set
     */
    public void setIdentidade(int identidade) {
        this.identidade = identidade;
    }

    /**
     * @return the nascimento
     */
    public Data getNascimento() {
        return nascimento;
    }

    /**
     * @param nascimento the nascimento to set
     */
    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }
    
    /**
     * O método toString não recebe argumentos, e retorna uma String contendo os
     * valores dos campos da classe formatados.
     *
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdentidade: " + getIdentidade() + " "
                + "\nData de Nascimento: " + getNascimento();
    }
} // fim da classe Pessoa
