package classes;

/**
 * A classe Retangulo possui campos e m�todos que representam um ret�ngulo
 * qualquer. Esta classe herda da classe ObjetoGeometrico, sendo uma
 * especializa��o desta.
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
     * @param largura a largura do ret�ngulo
     * @param altura a altura do ret�ngulo
     */
    public Retangulo(double largura, double altura) {
        super(); // inicializa o campos herdados com valores default
        this.largura = largura;
        this.altura = altura;
        setArea();         // atualiza a area
        setPerimetro();    // atualiza o per�metro
        setNumeroDeLados();// atualiza o n�mero de lados
    } // fim do construtor completo

    /**
     * O construtor default para a classe Retangulo n�o recebe nenhum argumento
     * e inicializa os campos da classe com valores default.
     */
    public Retangulo() {

    } // fim do construtor default

    /**
     * O m�todo setNumeroDeLados atualiza o n�mero de lados do ret�ngulo, ou
     * seja, determina que o n�mero de lados do ret�ngulo � 4.
     */
    private void setNumeroDeLados() {
        super.setNumeroDeLados(4);
    } // fim do m�todo setNumeroDeLados

    /**
     * O m�todo setArea atualiza a �rea do ret�ngulo definindo a mesma como o
     * produto da largura pela altura.
     */
    private void setArea() {
        super.setArea(getLargura() * getAltura());
    } // fim do m�todo setArea

    /**
     * O m�todo setPerimetro atualiza o per�metro do ret�ngulo onde p = (2 *
     * ladoA) + (2 * ladoB)
     */
    private void setPerimetro() {
        double perimetro = (2 * getAltura()) + (2 * getLargura());
        super.setPerimetro(perimetro);
    } // fim do m�todo setPerimetro

    /**
     * O m�todo getLargura retorna a largura encapsulada no ret�ngulo
     *
     * @return a largura do ret�ngulo
     */
    public double getLargura() {
        return largura;
    }

    /**
     * O m�todo setLargura recebe o valor de uma largura e atualiza esse valor
     * na largura encapsulada no ret�ngulo.
     *
     * @param largura a nova largura do ret�ngulo
     */
    public void setLargura(double largura) {
        double aux = this.largura;
        this.largura = (largura < 0) ? aux : largura;
    } // fim do m�todo setLargura

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * O m�todo setAltura recebe um valor para a altura e atualiza a altura
     * encapsulada no objeto.
     *
     * @param altura a nova altura do ret�ngulo
     */
    public void setAltura(double altura) {
        double aux = this.altura;
        this.altura = (altura < 0) ? aux : altura;
    } // fim do m�todo setAltura

    /**
     * O m�todo toString n�o recebe argumentos e retorna uma string contendo os
     * campos da classe formatados.
     *
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado = "*************************** Dados do Ret�ngulo ****************************\n\n";
        resultado += "Largura: " + getLargura();
        resultado += "\nAltura: " + getAltura();
        resultado += "\nPerimetro: " + getPerimetro();
        resultado += "\nArea: " + getArea();
        resultado += "\n\n***************************************************************************\n";
        return resultado;
    } // fim do m�todo toString
} // fim da classe Retangulo