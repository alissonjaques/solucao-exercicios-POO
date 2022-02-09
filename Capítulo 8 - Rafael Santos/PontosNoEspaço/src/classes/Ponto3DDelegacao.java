package classes;

/**
 * A classe Ponto3D possui campos e metodos que representam um ponto no espaço
 * tridimensional. Ela faz um uso da classe Ponto2D, via delegação.
 * 
 * @author Alisson Jaques
 */
public class Ponto3DDelegacao{ // declara a classe
    /*
      Campos da classe
    */
    private Ponto2D xy;
    private double z;
    
    /**
     * O construtor completo da classe Ponto3DDelegacao que recebe uma instância da classe
     * Ponto2D e um número flutuante, inicializandos os campos da classe com os 
     * mesmos.
     * 
     * @param xy a coordenada de um ponto no plano cartesiano ortogonal
     * @param z um número flutuante que representa a coordenada da terceira dimensão
     */
    public Ponto3DDelegacao(Ponto2D xy, double z){
        this.xy = xy;
        this.z = z;   
    } // fim do construtor completo
    
    /**
     * O construtor sobrecarregado da classe Ponto3DDelegacao que recebe uma instância da
     * classe Ponto2D e inicializa todos os seus campos, a coordenada z é inicializada
     * com o valor default 0.
     * 
     * @param xy um ponto no plano cartesiano
     */
    public Ponto3DDelegacao(Ponto2D xy){
        this.xy = xy;
        z = 0.0;
    } // fim do construtor sobrecarregado
    
    /**
     * O construtor sobrecarregado da classe Ponto3DDelegacao que recebe como argumento um
     * valor flutuante que representa a coordenada z do ponto e inicializa todos os campos
     * da classe, as coordenadas x e y são inicializadas com valores default 0;
     * 
     * @param z a coordenada z do ponto
     */
    public Ponto3DDelegacao(double z){
       xy = new Ponto2D();
       this.z = z;
    }
    
    /**
     * O construtor default para a classe Ponto3DDelegacao que representa a origem do 
     * sistema cartesiano de 3 dimensões.
     */
    public Ponto3DDelegacao(){
       xy = new Ponto2D();
       z = 0.0;
    } // fim do construtor default
    
    /**
     * @return the xy
     */
    public Ponto2D getXy() {
        return xy;
    }

    /**
     * @param xy the xy to set
     */
    public void setXy(Ponto2D xy) {
        this.xy = xy;
    }

    /**
     * @return the z
     */
    public double getZ() {
        return z;
    }

    /**
     * @param z the z to set
     */
    public void setZ(double z) {
        this.z = z;
    }
    
    /**
     * O método toString não possui argumentos e retorna os campos da classe formatados.
     * 
     * @return os campos da classe formatados
     */
    @Override
    public String toString(){
        String resultado = "(" + xy.retornaX() + "," + xy.retornaY() + "," + getZ() + ")";
        return resultado;
    } // fim do método toString
} // fim da classe Ponto3DDelegacao
