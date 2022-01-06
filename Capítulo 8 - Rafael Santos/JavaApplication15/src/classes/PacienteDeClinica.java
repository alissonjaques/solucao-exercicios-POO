package classes;

/**
 * A classe PacienteDeClinica possui campos e métodos que representam um paciente
 * de uma clínica. Como cada paciente é uma pessoa, está classe herda da classe 
 * Pessoa.
 * @author Alisson Jaques
 */
public class PacienteDeClinica extends Pessoa { // declara a classe
    
    /**
     * Declara os campos especializados da classe
     */
    private String planoDeSaude;
    
    /**
     * O construtor completo para a classe PacienteDeClinica que recebe argumentos para
     * inicialização de todos os seus campos, incluindo os herdados da classe Pessoa.
     *
     * @param n o nome da pessoa
     * @param i o número da identidade da pessoa
     * @param d a data de nascimento da pessoa
     * @param planoDeSaude o plano de saúde da pessoa
     */
    public PacienteDeClinica(String n, int i, Data d, String planoDeSaude) {
        super(n, i, d); // delega a inicialização dos campos herdados ao construtor da superclasse
        this.planoDeSaude = planoDeSaude;
    } // fim do construtor completo
    
    /**
     * O construtor sobrecarregado da classe PacienteDeClinica que recebe argumentos para
     * inicialização de todos os seus campos, incluindo os herdados da classe Pessoa.
     *
     * @param pessoa uma instância da classe Pessoa
     * @param planoDeSaude o plano de saúde da pessoa
     */
    public PacienteDeClinica(Pessoa pessoa, String planoDeSaude) {
        /*
          Delega a inicialização dos campos herdados ao construtor da superclasse, passando como argumentos 
          retornos de métodos da instância pessoa.
        */
        super(pessoa.getNome(), pessoa.getIdentidade(), pessoa.getNascimento());
        this.planoDeSaude = planoDeSaude;
    } // fim do construtor sobrecarregado
    
    /**
     * O construtor default para a classe PacienteDeClinica que não recebe argumentos
     * e inicializa os campos desta classe com valores default.
     */
    public PacienteDeClinica() {

    } // fim do construtor default
    
    /**
     * O método getPlanoDeSaude retorna o plano de saúde da pessoa.
     * @return uma string que representa o plano de saúde da pessoa.
     */
    public String getPlanoDeSaude() {
        return planoDeSaude;
    } // fim do método getPlanoDeSaude

    /**
     * O método setPlanoDeSaude recebe como argumento uma string que representa o plano de 
     * saúde da pessoa e atualiza o plano de saúde encapsulado no objeto.
     * @param planoDeSaude o novo plano de saúde da pessoa
     */
    public void setPlanoDeSaude(String planoDeSaude) {
        this.planoDeSaude = planoDeSaude;
    } // fim do método setPlanoDeSaude
    
    /**
     * O método toString não recebe argumentos e retorna uma string, contendo os campos
     * da classe formatados.
     * @return uma string contendo os campos da classe formatados
     */
    @Override
    public String toString() {
        String resultado = super.toString();
        resultado += "\nPlano de Saúde: " + getPlanoDeSaude() + "\n";
        return resultado;
    } // fim do método toString
} // fim da classe PacienteDeClinica