package classes;

/**
 * A classe Livro possui campos e métodos que representam um livro qualquer.
 *
 * @author Alisson Jaques
 */
public class Livro { // declaração da classe

    /**
     * Declaração dos campos da classe
     */
    private String titulo;
    private String autor;
    private String genero;
    private String isbn;
    private double peso;

    /**
     * O construtor completo da classe Livro que recebe argumentos para
     * inicializar todos os campos desta classe.
     *
     * @param titulo o título do livro
     * @param autor o nome do autor do livro
     * @param genero o gênero do livro
     * @param isbn o código ISBN do livro
     * @param peso o peso em kg do livro
     */
    public Livro(String titulo, String autor, String genero, String isbn, double peso) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.isbn = isbn;
        this.peso = peso;
    }

    /**
     * O construtor default da classe Livro que inicializa os campos da classe
     * com valores default.
     */
    public Livro() {

    }

    /**
     * O método getTitulo retorna o título do livro.
     *
     * @return uma string que representa o título do livro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * O método setTitutlo atualiza o título encapsulado com o passado como
     * argumento
     *
     * @param titulo o novo título do livro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * O método getAutor retorna o nome do autor.
     *
     * @return o nome do autor do livro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * O método setAutor atualiza o nome do autor, encapsulado, com o passado
     * como argumento.
     *
     * @param autor o novo nome de autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * O método getGenero retorna o gênero do livro.
     *
     * @return uma string que representa o gênero do livro
     */
    public String getGenero() {
        return genero;
    }

    /**
     * O método setGenero atualiza o gênero do livro, encapsulado, com o passado
     * como argumento.
     *
     * @param genero o novo gênero para atualização
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * @param isbn the isbn to set
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * O método toString não recebe argumentos e retorna uma string com os
     * campos da classe formatados.
     *
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado = "";
        resultado += "Título: " + getTitulo();
        resultado += "\nAutor: " + getAutor();
        resultado += "\nGenero: " + getGenero();
        resultado += "\nISBN: " + getIsbn();
        resultado += "\nPeso: " + getPeso() + " kg\n";
        return resultado;
    } // fim do método toString
} // fim da classe Livro
