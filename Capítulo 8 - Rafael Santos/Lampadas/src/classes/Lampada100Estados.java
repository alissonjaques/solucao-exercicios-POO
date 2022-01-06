package classes;

/**
 * A classe Lampada100Estados representa uma lãmpada com um estado de luminosidade, 
 * onde 0<=luminosidade<=100. Se luminosidade = 0 a lâmpada estará apagada. Esta
 * classe herda da classe Lampada, sendo uma especialização desta.
 * @author Alisson Jaques
 */
public class Lampada100Estados extends Lampada { // delcaração da classe
    
    /**
     * Declaração dos campos da classe
     */
    private byte luminosidade;
    
    /**
     * O construtor completo da classe Lampada100Estados que recebe argumentos para
     * inicializar todos os seus campos, incluindo os herdados.
     * @param luminosidade um valor pertencente ao intervalo [0,100], que representa
     * a luminosidade da lâmpada
     */
    public Lampada100Estados(byte luminosidade) {
        /*
          Aqui é chamado o método estático determinaEstado(boolean), passando como
          argumento o valor passado como argumento ao construtor, este método retornará
          um valor booleano que será passado ao construtor da super classe, que inicializará
          o campo herdado, da classe Lampada100Estados, com o mesmo.
        */
        super(determinaEstado(luminosidade));
        // O método verificaLuminosidade(byte) garantirá que a luminosidade esteja no intervalo [0,100]
        this.luminosidade = verificaLuminosidade(luminosidade); 
    }
    
    /**
     * O construtor default para a classe Lampada100Estados que não recebe nenhum argumento e inicializa
     * os campos da classe com valores default.
     */
    public Lampada100Estados() {

    }
    
    /**
     * O método determinaEstado(byte) recebe como argumento um valor de luminosidade e verifica 
     * se a lâmpada está acesa ou não.
     * @param luminosidade um valor que indica a luminosidade da lâmpada
     * @return o valor booleano false, se a lâmpada estiver apagada, ou true, caso contrário
     */
    private static boolean determinaEstado(byte luminosidade) {
        byte controlador = verificaLuminosidade(luminosidade); // garante que 0<=luminosidade<=100
        return controlador != 0;
    }
    
    /**
     * O método verificaLuminosidade(byte) recebe como argumento um valor de luminosidade e
     * garante que a luminosidade esteja no valor esperado (entre 0 e 100, incluindo estes).
     * @param luminosidade um valor que indica a luminosidade da lâmpada
     */
    private static byte verificaLuminosidade(byte luminosidade) {
        if (luminosidade < 0) {
            luminosidade = 0;
        } else if (luminosidade > 100) {
            luminosidade = 100;
        }
        return luminosidade;
    }
    
    /**
     * O método getLuminosidade() retorna a luminosidade encapsulada no objeto da 
     * classe Lampada100Estados.
     * @return the luminosidade
     */
    public byte getLuminosidade() {
        return luminosidade;
    }

    /**
     * O método setLuminosidade(byte) recebe como argumento um valor de luminosidade e 
     * atualiza a luminosidade encapsulada no objeto.
     * @param luminosidade o novo valor para a luminosidade
     */
    public void setLuminosidade(byte luminosidade) {
        this.luminosidade = verificaLuminosidade(luminosidade);
    }
    
    /**
     * O método toString() não recebe argumentos e retorna uma string, contendo
     * os campos do objeto formatados.
     * @return uma string com os campos do objeto formatados
     */
    @Override
    public String toString() {
        String resultado = super.toString() + "\n";
        resultado += "Valor da Luminosidade: " + getLuminosidade() + "\n";
        return resultado;
    } // fim do método toString
} // fim da classe Lampada100Estados
