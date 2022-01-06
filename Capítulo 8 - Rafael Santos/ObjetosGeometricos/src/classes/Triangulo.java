package classes;

/**
 * A classe Triangulo possui campos que encapsulam os dados de um tri�ngulo e
 * m�todos que manipulam estes dados, representando um tri�ngulo qualquer. Essa
 * classe herda da classe ObjetoGeometrico sendo uma especializa��o desta.
 *
 * @author Alisson Jaques
 */
public class Triangulo extends ObjetoGeometrico { // declara a classe

    /*
     * Declara��o dos campos da classe 
     */
    private double ladoA;
    private double ladoB;
    private double ladoC;

    /**
     * O construtor completo da classe Retangulo que rebece como argumento tr�s
     * valores flutuantes, que representam �s medidas do lado do ret�ngulo, e
     * inicializa todos os campos da classe.
     *
     * @param ladoA a medida do lado A do ret�ngulo
     * @param ladoB a medida do lado B do ret�ngulo
     * @param ladoC a medida do lado C do ret�ngulo
     */
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        super(); // iniala os campos herdados da classe com valores default
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        setNumeroDeLados(); // atualiza o n�mero de lados do ret�ngulo para 3
        setPerimetro();     // atualiza o per�metro do ret�ngulo
        setArea();          // atualiza a �rea do ret�ngulo
    } // fim do construtor completo

    /**
     * O construtor default para a classe Triangulo que n�o recebe nenhum
     * argumento e inicializa os campos da classe com valores default.
     */
    public Triangulo() {

    } // fim do construtor default 

    /**
     * O m�todo setNumeroDeLados atualiza o n�mero de lados do tri�ngulo, ou
     * seja, determina que o n�mero de lados do tri�ngulo � 3.
     */
    private void setNumeroDeLados() {
        super.setNumeroDeLados(3);
    } // fim do m�todo setNumeroDeLados

    /**
     * O m�todo setArea atualiza a �rea do tri�ngulo utilizando a f�rmula para o
     * c�lculo da �rea de um tri�ngulo, tendo como base a medida do
     * semiper�metro do mesmo.
     */
    private void setArea() {
        double s = getPerimetro() / 2;
        super.setArea(Math.sqrt(s * (s - getLadoA()) * (s - getLadoB()) * (s - getLadoC())));
    } // fim do m�todo setArea

    /**
     * O m�todo setPerimetro atualiza o per�metro do tri�ngulo onde p = ladoA +
     * ladoB + ladoC
     */
    private void setPerimetro() {
        double perimetro = (getLadoA() + getLadoB() + getLadoC());
        super.setPerimetro(perimetro);
    } // fim do m�todo setPerimetro
    
    /**
     * O m�todo setAreaP atualiza a �rea do tri�ngulo utilizando a f�rmula para o
     * c�lculo da �rea de um tri�ngulo, tendo como base a medida do
     * semiper�metro do mesmo.
     */
    public void setAreaP() {
        double s = getPerimetro() / 2;
        super.setArea(Math.sqrt(s * (s - getLadoA()) * (s - getLadoB()) * (s - getLadoC())));
    } // fim do m�todo setArea

    /**
     * O m�todo setPerimetroP atualiza o per�metro do tri�ngulo onde p = ladoA +
     * ladoB + ladoC
     */
    public void setPerimetroP() {
        double perimetro = (getLadoA() + getLadoB() + getLadoC());
        super.setPerimetro(perimetro);
    } // fim do m�todo setPerimetro
    
    
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
     * O m�todo toString n�o recebe argumentos e retorna uma string contendo os
     * campos da classe formatados.
     *
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado = "*************************** Dados do Tri�ngulo ****************************\n\n";
        resultado += "Medida do Lado A: " + getLadoA();
        resultado += "\nMedida do Lado B: " + getLadoB();
        resultado += "\nMedida do Lado C: " + getLadoC();
        resultado += "\nPerimetro: " + getPerimetro();
        resultado += "\nArea: " + getArea();
        resultado += "\n\n***************************************************************************\n";
        return resultado;
    } // fim do m�todo toString
} // fim da classe Triangulo