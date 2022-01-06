package classes;

/**
 *
 * @author Alisson Jaques
 */
public class Aluno extends Pessoa { // declaração da classe
    /**
     * Declaração dos campos da classe
     */
    private String numeroDeMatricula;
    private String curso;
    
    /**
     * O construtor completo para a classe Aluno, que recebe argumentos para inicializar
     * todos os seus campos.
     *  
     * @param n o nome do aluno
     * @param i o número da identidade do aluno
     * @param d a data de nascimento do aluno
     * @param numeroDeMatricula o númerdo de matrícula do aluno
     * @param curso o curso do aluno
     */
    public Aluno(String n, int i, Data d, String numeroDeMatricula, String curso){
        super(n,i,d); // delega a inicialização dos campos herdados ao construtor da super classe
        this.numeroDeMatricula = numeroDeMatricula;
        this.curso = curso;
    }
    
    /**
     * O construtor default para a classe Aluno que não recebe argumentos
     * e inicializa os campos desta classe com valores default.
     */
    public Aluno(){
    
    }
        
    /**
     * @return the numeroDeMatricula
     */
    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    /**
     * @param numeroDeMatricula the numeroDeMatricula to set
     */
    public void setNumeroDeMatricula(String numeroDeMatricula) {
        this.numeroDeMatricula = numeroDeMatricula;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    /**
     * O método toString não recebe argumentos, e retorna uma String contendo os
     * valores dos campos da classe formatados.
     *
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString(){
        String resultado = super.toString();
        resultado += "\n" + getNumeroDeMatricula();
        resultado += "\n" + getCurso();
        return resultado;
    }
} // fim da classe Aluno