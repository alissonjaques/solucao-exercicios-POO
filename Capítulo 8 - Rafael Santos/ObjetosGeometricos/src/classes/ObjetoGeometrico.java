package classes;

/**
 * A classe ObjetoGeometrico possui campos e métodos que representam um objeto
 * geométrico regular no plano.
 *
 * @author Alisson Jaques
 */
public class ObjetoGeometrico { // declaração da classe

    /**
       Declaração dos campos da classe
    */
    private double apotema;
    private double comprimentoLado;
    private int numeroDeLados;
    private double perimetro;
    private double area;
        
    /**
     * O construtor completo da classe ObjetoGeometrico que recebe argumentos para inialiazar
     * todos os seus campos.
     * 
     * @param apotema a medida da apotema do objeto
     * @param comprimentoLado o tamanho do lado
     * @param numeroDeLados o número de lados
     */
    public ObjetoGeometrico(double apotema, double comprimentoLado, int numeroDeLados) {
        this.apotema = apotema;
        this.comprimentoLado = comprimentoLado;
        this.numeroDeLados = numeroDeLados;
        perimetro = numeroDeLados * comprimentoLado;
        area = (perimetro * apotema) / 2;
    } // fim do construtor completo
    
    /**
     *  O construtor default da classe ObjetoGeometrico inicializa todos os campos
     *  da classe com valores default.
     */
    public ObjetoGeometrico() {
        apotema = 0.0;
        comprimentoLado = 0.0;
        numeroDeLados = 0;
        perimetro = 0.0;
        area = 0.0;
    } // fim do construtor default

    /**
     * O método getApotema retorna o valor da apótema.
     * 
     * @return o valor numérico da apótema
     */
    public double getApotema() {
        return apotema;
    }

    /**
     * O método setApotema recebe um novo valor para a apótema e atualiza este valor
     * na apótema encapsulada na classe.
     * 
     * @param apotema o novo valor para a apótema encapsulada na classe
     */
    public void setApotema(double apotema) {
        double aux = this.apotema;
        this.apotema = (apotema < 0) ? aux : apotema; // se o valor for inválido a atualização não é realizada
    } // fim do método setApotema

    /**
     * O método getComprimentoLado retorna o valor da media do lado do poligono regular
     * encapsulado.
     * 
     * @return o valor da medida do lado do polígono regular
     */
    public double getComprimentoLado() {
        return comprimentoLado;
    } // fim do método getComprimentoLado

    /**
     * O método setComprimentoLado recebe um novo valor para a medida do lado e atualiza 
     * este valor no objeto
     * 
     * @param comprimentoLado a nova medida do lado do polígono regular
     */
    public void setComprimentoLado(double comprimentoLado) {
        double aux = this.comprimentoLado;
        this.comprimentoLado = (comprimentoLado < 0) ? aux : comprimentoLado;
    } // fim do método setComprimentoLado

    /**
     * O método getNumeroDeLados retorna o número de lados do polígono.
     * 
     * @return o número de lados do polígono
     */
    public double getNumeroDeLados() {
        return numeroDeLados;
    } // fim do método getNumeroDeLados

    /**
     * O método setNumeroDeLados recebe um novo valor para a quantidade de lados e atualiza 
     * este valor no objeto
     * 
     * @param numeroDeLados a nova quantidade de lados do polígono regular
     */
    public void setNumeroDeLados(int numeroDeLados) {
        int aux = this.numeroDeLados;
        this.numeroDeLados = (numeroDeLados < 0) ? aux : numeroDeLados;
    } // fim do método setNumeroDeLados

     /**
     * O método getPerimetro retorna a medida do perímetro do polígono.
     * 
     * @return a medida do perímetro do polígono
     */
    public double getPerimetro() {
        return perimetro;
    } // fim do método getPerimetro

    /**
     * O método setPerimetro recebe um novo valor para a medida do polígono e atualiza 
     * este valor no objeto
     * 
     * @param perimetro a nova medida do perímetro do polígono regular
     */
    public void setPerimetro(double perimetro) {
        double aux = this.perimetro;
        this.perimetro = (perimetro < 0) ? aux : perimetro;
    } // fim do método setPerimetro

    /**
     * O método getArea retorna a área do polígono.
     * 
     * @return a área do polígono
     */
    public double getArea() {
        return area;
    } // fim do método getArea

    /**
     * O método setArea recebe um novo valor para a área do polígono e atualiza 
     * este valor no objeto
     * 
     * @param area a nova área polígono regular
     */
    public void setArea(double area) {
        double aux = this.area;
        this.area = (area < 0) ? aux : area;
    } // fim do método setArea

    /**
     * O método toString não recebe argumentos e retorna uma string contendo os campos da 
     * classe formatados.
     * 
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado = "*********************** Dados do Objeto Geometrico ************************\n\n";
        resultado += "Apotema: " + getApotema();
        resultado += "\nComprimento do lado: " + getComprimentoLado();
        resultado += "\nNúmero de Lados: " + getNumeroDeLados();
        resultado += "\nPerimetro: " + getPerimetro();
        resultado += "\nArea: " + getArea();
        resultado += "\n\n***************************************************************************\n";
        return resultado;
    } // fim do método toString
} // fim da classe ObjetoGeometrico