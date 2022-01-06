package classes;

/**
 * A classe ChefeDeDepartamento, que encapsula os dados básicos de um chefe de
 * um departamento de uma empresa. Esta classe herda da classe Funcionario,
 * criando a relação "ChefeDeDepartamento é um tipo de Funcionario".
 */
public class ChefeDeDepartamento extends Funcionario { // declaração da classe (herdando de Funcionario)

    /**
     * Declaração dos campos adicionais da classe. Note que não é necessário
     * declarar um campo como sendo instância da classe Funcionario. Somente os
     * campos que diferenciam um ChefeDeDepartamento de um Funcionario são
     * necessários.
     */
    private String departamento;
    private Data promoçãoAChefe;

    /**
     * O construtor para a classe ChefeDeDepartamento, que recebe argumentos
     * para inicializar todos os campos da classe. Este construtor recebe os
     * mesmos dados que seriam necessários para criar uma instância da classe
     * Pessoa mais os que diferenciam a classe Funcionario da classe Pessoa e os
     * que diferenciam a classe ChefeDeDepartamento da classe Funcionario.
     * Passaremos os dados que representam um Funcionario para o construtor da
     * classe ancestral, via a palavra-chave super.
     *
     * @param nome o nome da pessoa
     * @param id o número da identidade da pessoa
     * @param nasc uma instância da classe Data com a data de nascimento
     * @param adm uma instância da classe Data com a data de admissão
     * @param sal o salário do funcionário/chefe de departamento
     * @param dep o departamento que este chefe chefia
     * @param prom uma instância da classe Data com a data de promoção ao cargo
     */
    public ChefeDeDepartamento(String nome, int id, Data nasc,
            Data adm, float sal,
            String dep, Data prom) {
        super(nome, id, nasc, adm, sal); // chama o construtor da classe Funcionario
        departamento = dep;
        promoçãoAChefe = prom;
    }
    
    /**
     * O construtor para a classe ChefeDeDepartamento, que recebe argumentos
     * para inicializar todos os campos da classe. Este construtor recebe uma
     * instância da classe Funcionario e inicializa seus campos herdados com os campos
     * desta instância. Os campos de especialização (departamento e promoçãoAChefe) 
     * são incializados com os outros argumentos correspondentes.
     *
     * @param funcionario uma instância da classe Funcionario
     * @param dep o departamento que este chefe chefia
     * @param prom uma instância da classe Data com a data de promoção ao cargo
     */
    public ChefeDeDepartamento(Funcionario funcionario, String dep, Data prom){
       super(funcionario.getNome(),funcionario.getIdentidade(),funcionario.getNascimento(),
               funcionario.getAdmissão(),funcionario.getSalário());
       departamento = dep;
       promoçãoAChefe = prom;
    }
    
    /**
     * O construtor default para a classe ChefeDeDepartamento que não recebe argumentos
     * e inicializa os campos desta classe com valores default.
     */
    public ChefeDeDepartamento(){
    
    } 
        
    /**
     * @return the departamento
     */
    public String getDepartamento() {
        return departamento;
    }

    /**
     * @param departamento the departamento to set
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     * @return the promoçãoAChefe
     */
    public Data getPromoçãoAChefe() {
        return promoçãoAChefe;
    }

    /**
     * @param promoçãoAChefe the promoçãoAChefe to set
     */
    public void setPromoçãoAChefe(Data promoçãoAChefe) {
        this.promoçãoAChefe = promoçãoAChefe;
    }
    
    /**
     * O método toString não recebe argumentos, e retorna uma String contendo os
     * valores dos campos da classe formatados. Como é necessário ter os campos
     * da classe ancestral formatados para retornar todos os campos desta classe
     * formatados, chamamos o método toString da classe ancestral via a
     * palavra-chave super.
     *
     * @return uma String com os valores dos campos formatados.
     */
    @Override
    public String toString() {
        String resultado;
        resultado = super.toString() + "\n"; // chama o método toString da classe Funcionario
        resultado = resultado + "Departamento:" + getDepartamento() + "\n";
        resultado = resultado + "Data de promoção ao cargo de Chefe de Departamento:" + getPromoçãoAChefe();
        return resultado;
    }

    /**
     * O método qualDepartamento retorna o departamento do chefe de
     * departamento. Este método será usado por qualquer outro método que queira
     * acessar (ler) somente o valor do campo departamento.
     *
     * @return o departamento do chefe de departamento
     */
    public String qualDepartamento() {
        return getDepartamento();
    }

} // fim da classe ChefeDeDepartamento

