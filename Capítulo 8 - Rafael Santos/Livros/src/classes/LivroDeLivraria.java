package classes;

/**
 * A classe LivroDeLivraria representa um livro de uma livraria. Esta classe
 * herda da classe Livro, sendo uma especialização desta.
 *
 * @author Alisson Jaques
 */
public class LivroDeLivraria extends Livro { // declaração da classe

    /**
     * Declaração dos campos da classe
     */
    private float valor;
    private byte quantidadeNoEstoque;

    /**
     * O construtor completo da classe LivroDeLivraria que recebe argumentos
     * para inicializar todos os seus campos.
     *
     * @param titulo o título do livro
     * @param autor o nome do autor do livro
     * @param genero o gênero do livro
     * @param isbn o código ISBN do livro
     * @param peso o peso em kg do livro
     * @param valor o preço do livro
     * @param quantidadeNoEstoque a quantidade deste livro no estoque da livraria
     */
    public LivroDeLivraria(String titulo, String autor, String genero, String isbn,
            double peso, float valor, byte quantidadeNoEstoque) {
        super(titulo, autor, genero, isbn, peso); // delega a inicialização dos campos herdados ao construtor da super classe
        this.valor = valor;
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }

    /**
     * O construtor sobrecarregado da classe LivroDeLivraria que recebe como
     * argumentos uma instância da classe livro, um valor e uma quantidade em
     * estoque e inicializa todos os campos desta classe com os mesmos.
     *
     * @param livro um objeto da classe Livro
     * @param valor o preço do livro
     * @param quantidadeNoEstoque a quantidade deste livro no estoque da livraria
     */
    public LivroDeLivraria(Livro livro, float valor, byte quantidadeNoEstoque) {
        super(livro.getTitulo(), livro.getAutor(), livro.getGenero(), livro.getIsbn(), livro.getPeso()); // delega a inicialização dos campos herdados ao construtor da super classe
        this.valor = valor;
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }

    /**
     * O construtor default para a classse LivroDeLivraria que inicializa os
     * campos desta classe com valores default.
     */
    public LivroDeLivraria() {

    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

    /**
     * @return the quantidadeNoEstoque
     */
    public byte getQuantidadeNoEstoque() {
        return quantidadeNoEstoque;
    }

    /**
     * @param quantidadeNoEstoque the quantidadeNoEstoque to set
     */
    public void setQuantidadeNoEstoque(byte quantidadeNoEstoque) {
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }

    /**
     * O método toString não recebe argumentos e retorna uma string com os
     * campos da classe formatados
     *
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado = super.toString();
        resultado += "Preço: " + getValor();
        resultado += "\nQuantidade Disponível: " + getQuantidadeNoEstoque() + "\n";
        return resultado;
    } // fim do método toString
} // fim da classe LivroDeLivraria
