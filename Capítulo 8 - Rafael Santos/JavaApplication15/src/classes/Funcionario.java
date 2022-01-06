package classes;

/**
 * A classe Funcionario, que encapsula os dados básicos de um funcionário de uma
 * empresa. Esta classe herda da classe Pessoa, criando a relação "Funcionario é
 * um tipo de Pessoa".
 */
public class Funcionario extends Pessoa{ 
    
// declaração da classe (herdando de Pessoa)
    /**
     * Declaração dos campos adicionais da classe. Note que não é necessário
     * declarar um campo como sendo uma instância da classe Pessoa, como foi
     * feito com o exemplo do mecanismo de delegação: os campos e métodos da
     * classe Pessoa foram herdados (mas os campos deverão ser acessados
     * indiretamente pois são privados da classe Pessoa).
     */
    private Data admissão;
    private float salário;

    /**
     * O construtor para a classe Funcionario que recebe argumentos para
     * inicializar todos os campos da classe. Este construtor recebe os mesmos
     * dados que seriam necessários para criar uma instância da classe Pessoa
     * mais os que diferenciam a classe Funcionario da Pessoa. Passaremos os
     * dados que representam uma Pessoa para o construtor da classe ancestral,
     * via a palavra-chave super.
     *
     * @param nome o nome da pessoa
     * @param id o número da identidade da pessoa
     * @param nasc uma instância da classe Data com a data de nascimento
     * @param adm uma instância da classe Data com a data de admissão
     * @param sal o salário do funcionário
     */
    public Funcionario(String nome, int id, Data nasc, Data adm, float sal) {
        super(nome, id, nasc);
        admissão = adm;
        salário = sal;
    }
    
    /**
     * O construtor sobrecarregado da classe Funcionario que recebe argumentos para
     * inicializar todos os campos da classe, inclusive os herdados.
     *
     * @param pessoa uma instância da classe Pessoa
     * @param adm uma instância da classe Data com a data de admissão
     * @param sal o salário do funcionário
     */    
    public Funcionario(Pessoa pessoa, Data adm, float sal){
        /*
          Delega a inicialização dos campos herdados ao construtor da superclasse, passando como argumentos 
          retornos de métodos da instância pessoa.
        */
        super(pessoa.getNome(),pessoa.getIdentidade(),pessoa.getNascimento());
        admissão = adm;
        salário = sal;   
    } // fim do construtor sobrecarregado
    
    /**
     * O construtor default para a classe Funcionario que não recebe argumentos
     * e inicializa os campos desta classe com valores default.
     */
    public Funcionario(){
    
    }

    /**
     * @return the admissão
     */
    public Data getAdmissão() {
        return admissão;
    }

    /**
     * @param admissão the admissão to set
     */
    public void setAdmissão(Data admissão) {
        this.admissão = admissão;
    }

    /**
     * @return the salário
     */
    public float getSalário() {
        return salário;
    }

    /**
     * @param salário the salário to set
     */
    public void setSalário(float salário) {
        this.salário = salário;
    }
    
    /**
     * O método toString não recebe argumentos, e retorna uma String contendo os
     * valores dos campos da classe formatados. Como é necessário ter os campos
     * da classe ancestral formatados para retornar o resultado deste método,
     * chamamos o método toString da classe ancestral via a palavra-chave super.
     *
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString() {
        String resultado;
        resultado = super.toString() + "\n"; // chama o método toString da classe Pessoa
        resultado = resultado + "Data de admissão: " + getAdmissão() + "\n";
        resultado = resultado + "Salário: " + getSalário();
        return resultado;
    }

    /**
     * O método qualSalário retorna o valor do salário do funcionário. Este
     * método será usado por qualquer outro método que queira somente acessar
     * (ler) o valor numérico do salário. Este método foi declarado como final,
     * e não poderá ser sobreposto por métodos com a mesma assinatura em classes
     * herdeiras.
     *
     * @return o valor do salário do funcionário
     */
    final public float qualSalário() {
        return getSalário();
    }
} // fim da classe Funcionario
