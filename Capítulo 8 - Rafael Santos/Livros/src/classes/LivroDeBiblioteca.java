package classes;

/**
 * A classe LivroDeBiblioteca possui campos e métodos que representam um livro
 * de uma biblioteca. Esta classe herda da classe Livro, sendo uma
 * especialização desta.
 *
 * @author Alisson Jaques
 */
public class LivroDeBiblioteca extends Livro { // declaração da classe

    /**
     * Declaração dos campos da classe
     */
    private String codigoNaBiblioteca;
    private short quantidade;

    /**
     * O construtor completo da classe LivroDeLivraria que recebe argumentos
     * para inicializar todos os seus campos.
     *
     * @param titulo o título do livro
     * @param autor o nome do autor do livro
     * @param genero o gênero do livro
     * @param isbn o código ISBN do livro
     * @param peso o peso em kg do livro
     * @param codigoNaBiblioteca o código do livro na biblioteca
     * @param quantidade a quantidade de exemplares deste livro na biblioteca
     */
    public LivroDeBiblioteca(String titulo, String autor, String genero, String isbn,
            double peso, String codigoNaBiblioteca, short quantidade) {
        super(titulo, autor, genero, isbn, peso); // delega a inicialização dos campos herdados ao construtor da super classe
        this.codigoNaBiblioteca = codigoNaBiblioteca;
        this.quantidade = quantidade;
    }

    /**
     * O construtor sobrecarregado da classe LivroDeLivraria que recebe como
     * argumentos uma instância da classe livro e o código na biblioteca,
     * inicializando os campos desta classe com os mesmos.
     *
     * @param livro um objeto da classe Livro
     * @param codigoNaBiblioteca o código do livro na biblioteca
     * @param quantidade a quantidade de exemplares deste livro na biblioteca
     */
    public LivroDeBiblioteca(Livro livro, String codigoNaBiblioteca, short quantidade) {
        super(livro.getTitulo(), livro.getAutor(), livro.getGenero(), livro.getIsbn(), livro.getPeso()); // delega a inicialização dos campos herdados ao construtor da super classe
        this.codigoNaBiblioteca = codigoNaBiblioteca;
        this.quantidade = quantidade;
    }

    public LivroDeBiblioteca() {

    }

    /**
     * @return the codigoNaBiblioteca
     */
    public String getCodigoNaBiblioteca() {
        return codigoNaBiblioteca;
    }

    /**
     * @param codigoNaBiblioteca the codigoNaBiblioteca to set
     */
    public void setCodigoNaBiblioteca(String codigoNaBiblioteca) {
        this.codigoNaBiblioteca = codigoNaBiblioteca;
    }

    /**
     * @return the quantidade
     */
    public short getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * O método toString não recebe argumentos e retorna uma string com os
     * campos da classe formatados
     *
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado = "================= Ficha Catalográfica ====================\n";
        resultado += super.toString();
        resultado += "Código na Biblioteca: " + getCodigoNaBiblioteca() + "\n";
        resultado += "Quantidade de Exemplares: " + getQuantidade() + "\n";
        resultado += "==========================================================\n";
        return resultado;
    } // fim do método toString
} // fim da classe LivroDeBiblioteca
