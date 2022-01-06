package classes;

/**
 * A classe Triangulo possui campos que encapsulam os dados de um triângulo e
 * métodos que manipulam estes dados, representando um triângulo qualquer. Essa
 * classe herda da classe ObjetoGeometrico sendo uma especialização desta.
 *
 * @author Alisson Jaques
 */
public class Triangulo extends ObjetoGeometrico { // declara a classe

    /*
     * Declaração dos campos da classe 
     */
    private double ladoA;
    private double ladoB;
    private double ladoC;

    /**
     * O construtor completo da classe Retangulo que rebece como argumento três
     * valores flutuantes, que representam às medidas do lado do retângulo, e
     * inicializa todos os campos da classe.
     *
     * @param ladoA a medida do lado A do retângulo
     * @param ladoB a medida do lado B do retângulo
     * @param ladoC a medida do lado C do retângulo
     */
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        super(); // iniala os campos herdados da classe com valores default
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        setNumeroDeLados(); // atualiza o número de lados do retângulo para 3
        setPerimetro();     // atualiza o perímetro do retângulo
        setArea();          // atualiza a área do retângulo
    } // fim do construtor completo

    /**
     * O construtor default para a classe Triangulo que não recebe nenhum
     * argumento e inicializa os campos da classe com valores default.
     */
    public Triangulo() {

    } // fim do construtor default 

    /**
     * O método setNumeroDeLados atualiza o número de lados do triângulo, ou
     * seja, determina que o número de lados do triângulo é 3.
     */
    private void setNumeroDeLados() {
        super.setNumeroDeLados(3);
    } // fim do método setNumeroDeLados

    /**
     * O método setArea atualiza a área do triângulo utilizando a fórmula para o
     * cálculo da área de um triângulo, tendo como base a medida do
     * semiperímetro do mesmo.
     */
    private void setArea() {
        double s = getPerimetro() / 2;
        super.setArea(Math.sqrt(s * (s - getLadoA()) * (s - getLadoB()) * (s - getLadoC())));
    } // fim do método setArea

    /**
     * O método setPerimetro atualiza o perímetro do triângulo onde p = ladoA +
     * ladoB + ladoC
     */
    private void setPerimetro() {
        double perimetro = (getLadoA() + getLadoB() + getLadoC());
        super.setPerimetro(perimetro);
    } // fim do método setPerimetro
    
    /**
     * O método setAreaP atualiza a área do triângulo utilizando a fórmula para o
     * cálculo da área de um triângulo, tendo como base a medida do
     * semiperímetro do mesmo.
     */
    public void setAreaP() {
        double s = getPerimetro() / 2;
        super.setArea(Math.sqrt(s * (s - getLadoA()) * (s - getLadoB()) * (s - getLadoC())));
    } // fim do método setArea

    /**
     * O método setPerimetroP atualiza o perímetro do triângulo onde p = ladoA +
     * ladoB + ladoC
     */
    public void setPerimetroP() {
        double perimetro = (getLadoA() + getLadoB() + getLadoC());
        super.setPerimetro(perimetro);
    } // fim do método setPerimetro
    
    
    /**
     * @return the ladoA
     */
    public double getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
        setPerimetroP();
        setAreaP();
    }

    /**
     * @return the ladoB
     */
    public double getLadoB() {
        return ladoB;
    }

    /**
     * @param ladoB the ladoB to set
     */
    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
        setPerimetroP();
        setAreaP();
    }

    /**
     * @return the ladoC
     */
    public double getLadoC() {
        return ladoC;
    }

    /**
     * @param ladoC the ladoC to set
     */
    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
        setPerimetroP();
        setAreaP();
    }
    
    /**
     * O método toString não recebe argumentos e retorna uma string contendo os
     * campos da classe formatados.
     *
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado = "*************************** Dados do Triângulo ****************************\n\n";
        resultado += "Medida do Lado A: " + getLadoA();
        resultado += "\nMedida do Lado B: " + getLadoB();
        resultado += "\nMedida do Lado C: " + getLadoC();
        resultado += "\nPerimetro: " + getPerimetro();
        resultado += "\nArea: " + getArea();
        resultado += "\n\n***************************************************************************\n";
        return resultado;
    } // fim do método toString
} // fim da classe Triangulo