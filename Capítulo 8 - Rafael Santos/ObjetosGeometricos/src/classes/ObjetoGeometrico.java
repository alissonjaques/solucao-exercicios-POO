package classes;

/**
 * A classe ObjetoGeometrico possui campos e m�todos que representam um objeto
 * geom�trico regular no plano.
 *
 * @author Alisson Jaques
 */
public class ObjetoGeometrico { // declara��o da classe

    /**
       Declara��o dos campos da classe
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
     * @param numeroDeLados o n�mero de lados
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
     * O m�todo getApotema retorna o valor da ap�tema.
     * 
     * @return o valor num�rico da ap�tema
     */
    public double getApotema() {
        return apotema;
    }

    /**
     * O m�todo setApotema recebe um novo valor para a ap�tema e atualiza este valor
     * na ap�tema encapsulada na classe.
     * 
     * @param apotema o novo valor para a ap�tema encapsulada na classe
     */
    public void setApotema(double apotema) {
        double aux = this.apotema;
        this.apotema = (apotema < 0) ? aux : apotema; // se o valor for inv�lido a atualiza��o n�o � realizada
    } // fim do m�todo setApotema

    /**
     * O m�todo getComprimentoLado retorna o valor da media do lado do poligono regular
     * encapsulado.
     * 
     * @return o valor da medida do lado do pol�gono regular
     */
    public double getComprimentoLado() {
        return comprimentoLado;
    } // fim do m�todo getComprimentoLado

    /**
     * O m�todo setComprimentoLado recebe um novo valor para a medida do lado e atualiza 
     * este valor no objeto
     * 
     * @param comprimentoLado a nova medida do lado do pol�gono regular
     */
    public void setComprimentoLado(double comprimentoLado) {
        double aux = this.comprimentoLado;
        this.comprimentoLado = (comprimentoLado < 0) ? aux : comprimentoLado;
    } // fim do m�todo setComprimentoLado

    /**
     * O m�todo getNumeroDeLados retorna o n�mero de lados do pol�gono.
     * 
     * @return o n�mero de lados do pol�gono
     */
    public double getNumeroDeLados() {
        return numeroDeLados;
    } // fim do m�todo getNumeroDeLados

    /**
     * O m�todo setNumeroDeLados recebe um novo valor para a quantidade de lados e atualiza 
     * este valor no objeto
     * 
     * @param numeroDeLados a nova quantidade de lados do pol�gono regular
     */
    public void setNumeroDeLados(int numeroDeLados) {
        int aux = this.numeroDeLados;
        this.numeroDeLados = (numeroDeLados < 0) ? aux : numeroDeLados;
    } // fim do m�todo setNumeroDeLados

     /**
     * O m�todo getPerimetro retorna a medida do per�metro do pol�gono.
     * 
     * @return a medida do per�metro do pol�gono
     */
    public double getPerimetro() {
        return perimetro;
    } // fim do m�todo getPerimetro

    /**
     * O m�todo setPerimetro recebe um novo valor para a medida do pol�gono e atualiza 
     * este valor no objeto
     * 
     * @param perimetro a nova medida do per�metro do pol�gono regular
     */
    public void setPerimetro(double perimetro) {
        double aux = this.perimetro;
        this.perimetro = (perimetro < 0) ? aux : perimetro;
    } // fim do m�todo setPerimetro

    /**
     * O m�todo getArea retorna a �rea do pol�gono.
     * 
     * @return a �rea do pol�gono
     */
    public double getArea() {
        return area;
    } // fim do m�todo getArea

    /**
     * O m�todo setArea recebe um novo valor para a �rea do pol�gono e atualiza 
     * este valor no objeto
     * 
     * @param area a nova �rea pol�gono regular
     */
    public void setArea(double area) {
        double aux = this.area;
        this.area = (area < 0) ? aux : area;
    } // fim do m�todo setArea

    /**
     * O m�todo toString n�o recebe argumentos e retorna uma string contendo os campos da 
     * classe formatados.
     * 
     * @return uma string com os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado = "*********************** Dados do Objeto Geometrico ************************\n\n";
        resultado += "Apotema: " + getApotema();
        resultado += "\nComprimento do lado: " + getComprimentoLado();
        resultado += "\nN�mero de Lados: " + getNumeroDeLados();
        resultado += "\nPerimetro: " + getPerimetro();
        resultado += "\nArea: " + getArea();
        resultado += "\n\n***************************************************************************\n";
        return resultado;
    } // fim do m�todo toString
} // fim da classe ObjetoGeometrico