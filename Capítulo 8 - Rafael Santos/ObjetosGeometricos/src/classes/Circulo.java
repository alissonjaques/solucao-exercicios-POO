package classes;

/**
 * A classe Circulo encapsula campos que representam um círculo no plano e
 * possui métodos que manipulam estes campos, retornando a área, perímetro, etc.
 * Esta classe herda da classe ObjetoGeometrico, sendo uma especialização desta.
 *
 * @author Alisson Jaques
 */
public class Circulo extends ObjetoGeometrico { // declara a classe

    /*
        Declaração dos campos da classe
     */
    private Ponto2D centro;
    private double raio;

    /**
     * O construtor completo para a classe Circulo que recebe como argumentos o
     * valor do raio e as coordenadas do centro e inializa todos os campos da
     * classe Circulo.
     *
     * @param centro as coordenadas do centro do Círculo no plano cartesiano
     * @param raio a medida do raio do círculo
     */
    public Circulo(Ponto2D centro, double raio) {
        super(raio, 2 * Math.PI * raio, (int) 1); // delega a inialização dos campos herdados ao construtor da super classe
        this.raio = raio;
        setArea(Math.PI * getRaio() * getRaio()); // atualiza a área do círculo
        this.centro = centro;
    } // fim do construtor completo

    /**
     * O construtor default para a classe Circulo que não recebe nenhum
     * argumento e inicializa os campos da classe com valores default.
     */
    public Circulo() {
        super();
        centro = new Ponto2D();
        raio = 0.0;
    } // fim do construtor default     

    /**
     * O método getCentro retorna o ponto que representa o centro do círculo
     *
     * @return o ponto que está no centro do círculo
     */
    public Ponto2D getCentro() {
        return centro;
    } // fim do métoodo getCentro

    /**
     * O método setCentro recebe como argumento ponto e atualiza o ponto central
     * do círculo.
     *
     * @param centro o novo ponto no centro do círculo
     */
    public void setCentro(Ponto2D centro) {
        this.centro = centro;
    } // fim do método setCentro

    /**
     * O método getRaio retorna a medida do raio do círculo.
     *
     * @return a medida do raio do círculo
     */
    public double getRaio() {
        return raio;
    } // fim do método getRaio

    /**
     * O método setRaio recebe um valor para o raio do círculo e atualiza esse
     * valor no círculo.
     *
     * @param raio a nova medida do raio do círculo
     */
    public void setRaio(double raio) {
        double aux = this.raio;
        this.raio = (raio < 0) ? aux : raio;
    } // fim do método setRaio

    /**
     * O método toString não recebe argumentos e retorna uma string contendo os
     * campos da classe formatados.
     *
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado = "**************************** Dados do Círculo *****************************\n\n";
        resultado += "Raio: " + getApotema();
        resultado += "\nPerimetro: " + getPerimetro();
        resultado += "\nArea: " + getArea();
        resultado += "\nCoordenadas do centro: " + getCentro().toString();
        resultado += "\n\n***************************************************************************\n";
        return resultado;
    } // fim do método toString
} // fim da classe Circulo