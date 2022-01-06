package classes;

/**
 * A classe Retangulo possui campos e métodos que representam um retângulo
 * qualquer. Esta classe herda da classe ObjetoGeometrico, sendo uma
 * especialização desta.
 *
 * @author Alisson Jaques
 */
public class Retangulo extends ObjetoGeometrico {

    /**
     * Declara os campos da classe
     */
    private double largura;
    private double altura;

    /**
     * O construtor completo da classe Retangulo que recebe como argumento a
     * medida da largura e da altura e inicializa todos os campos desta classe.
     *
     * @param largura a largura do retângulo
     * @param altura a altura do retângulo
     */
    public Retangulo(double largura, double altura) {
        super(); // inicializa o campos herdados com valores default
        this.largura = largura;
        this.altura = altura;
        setArea();         // atualiza a area
        setPerimetro();    // atualiza o perímetro
        setNumeroDeLados();// atualiza o número de lados
    } // fim do construtor completo

    /**
     * O construtor default para a classe Retangulo não recebe nenhum argumento
     * e inicializa os campos da classe com valores default.
     */
    public Retangulo() {

    } // fim do construtor default

    /**
     * O método setNumeroDeLados atualiza o número de lados do retângulo, ou
     * seja, determina que o número de lados do retângulo é 4.
     */
    private void setNumeroDeLados() {
        super.setNumeroDeLados(4);
    } // fim do método setNumeroDeLados

    /**
     * O método setArea atualiza a área do retângulo definindo a mesma como o
     * produto da largura pela altura.
     */
    private void setArea() {
        super.setArea(getLargura() * getAltura());
    } // fim do método setArea

    /**
     * O método setPerimetro atualiza o perímetro do retângulo onde p = (2 *
     * ladoA) + (2 * ladoB)
     */
    private void setPerimetro() {
        double perimetro = (2 * getAltura()) + (2 * getLargura());
        super.setPerimetro(perimetro);
    } // fim do método setPerimetro

    /**
     * O método getLargura retorna a largura encapsulada no retângulo
     *
     * @return a largura do retângulo
     */
    public double getLargura() {
        return largura;
    }

    /**
     * O método setLargura recebe o valor de uma largura e atualiza esse valor
     * na largura encapsulada no retângulo.
     *
     * @param largura a nova largura do retângulo
     */
    public void setLargura(double largura) {
        double aux = this.largura;
        this.largura = (largura < 0) ? aux : largura;
    } // fim do método setLargura

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * O método setAltura recebe um valor para a altura e atualiza a altura
     * encapsulada no objeto.
     *
     * @param altura a nova altura do retângulo
     */
    public void setAltura(double altura) {
        double aux = this.altura;
        this.altura = (altura < 0) ? aux : altura;
    } // fim do método setAltura

    /**
     * O método toString não recebe argumentos e retorna uma string contendo os
     * campos da classe formatados.
     *
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado = "*************************** Dados do Retângulo ****************************\n\n";
        resultado += "Largura: " + getLargura();
        resultado += "\nAltura: " + getAltura();
        resultado += "\nPerimetro: " + getPerimetro();
        resultado += "\nArea: " + getArea();
        resultado += "\n\n***************************************************************************\n";
        return resultado;
    } // fim do método toString
} // fim da classe Retangulo