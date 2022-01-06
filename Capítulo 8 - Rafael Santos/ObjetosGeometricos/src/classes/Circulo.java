package classes;

/**
 * A classe Circulo encapsula campos que representam um c�rculo no plano e
 * possui m�todos que manipulam estes campos, retornando a �rea, per�metro, etc.
 * Esta classe herda da classe ObjetoGeometrico, sendo uma especializa��o desta.
 *
 * @author Alisson Jaques
 */
public class Circulo extends ObjetoGeometrico { // declara a classe

    /*
        Declara��o dos campos da classe
     */
    private Ponto2D centro;
    private double raio;

    /**
     * O construtor completo para a classe Circulo que recebe como argumentos o
     * valor do raio e as coordenadas do centro e inializa todos os campos da
     * classe Circulo.
     *
     * @param centro as coordenadas do centro do C�rculo no plano cartesiano
     * @param raio a medida do raio do c�rculo
     */
    public Circulo(Ponto2D centro, double raio) {
        super(raio, 2 * Math.PI * raio, (int) 1); // delega a inializa��o dos campos herdados ao construtor da super classe
        this.raio = raio;
        setArea(Math.PI * getRaio() * getRaio()); // atualiza a �rea do c�rculo
        this.centro = centro;
    } // fim do construtor completo

    /**
     * O construtor default para a classe Circulo que n�o recebe nenhum
     * argumento e inicializa os campos da classe com valores default.
     */
    public Circulo() {
        super();
        centro = new Ponto2D();
        raio = 0.0;
    } // fim do construtor default     

    /**
     * O m�todo getCentro retorna o ponto que representa o centro do c�rculo
     *
     * @return o ponto que est� no centro do c�rculo
     */
    public Ponto2D getCentro() {
        return centro;
    } // fim do m�toodo getCentro

    /**
     * O m�todo setCentro recebe como argumento ponto e atualiza o ponto central
     * do c�rculo.
     *
     * @param centro o novo ponto no centro do c�rculo
     */
    public void setCentro(Ponto2D centro) {
        this.centro = centro;
    } // fim do m�todo setCentro

    /**
     * O m�todo getRaio retorna a medida do raio do c�rculo.
     *
     * @return a medida do raio do c�rculo
     */
    public double getRaio() {
        return raio;
    } // fim do m�todo getRaio

    /**
     * O m�todo setRaio recebe um valor para o raio do c�rculo e atualiza esse
     * valor no c�rculo.
     *
     * @param raio a nova medida do raio do c�rculo
     */
    public void setRaio(double raio) {
        double aux = this.raio;
        this.raio = (raio < 0) ? aux : raio;
    } // fim do m�todo setRaio

    /**
     * O m�todo toString n�o recebe argumentos e retorna uma string contendo os
     * campos da classe formatados.
     *
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado = "**************************** Dados do C�rculo *****************************\n\n";
        resultado += "Raio: " + getApotema();
        resultado += "\nPerimetro: " + getPerimetro();
        resultado += "\nArea: " + getArea();
        resultado += "\nCoordenadas do centro: " + getCentro().toString();
        resultado += "\n\n***************************************************************************\n";
        return resultado;
    } // fim do m�todo toString
} // fim da classe Circulo