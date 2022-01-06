package classes;

/**
 * A classe Diretor possui campos e métodos que representam um diretor de uma instituição
 * de ensino. Essa classe herda da classe ChefeDeDepartamento, pois todo diretor (nesse 
 * minimundo) é um chefe de departamento.
 * @author Alisson Jaques
 */
public class Diretor extends ChefeDeDepartamento{ // declara a classe
    
    /**
     * Declaração dos campos especializados da classe
     */
    private Data dataDePromoçãoAoCargo;
    
    /**
     * O construtor completo da classe Diretor que recebe argumentos para inicializar
     * todos os seus campos, inclusive os campos herdados da classe ChefeDeDepartamento.
     * @param nome o nome do diretor
     * @param id o número de identidade do diretor
     * @param nasc a data de nascimento do diretor
     * @param adm a data de admissão do diretor
     * @param sal o salário do diretor
     * @param dep o departamento que o diretor pertence
     * @param prom a data de promoção a chefe de departamento
     * @param dataDePromoçãoAoCargo a data de promoção a diretor
     */
    public Diretor(String nome, int id, Data nasc,Data adm, float sal, 
            String dep, Data prom, Data dataDePromoçãoAoCargo){
        super(nome,id,nasc,adm,sal,dep,prom); // delega a inicialização dos campos herdados ao construtor da superclasse
        this.dataDePromoçãoAoCargo = dataDePromoçãoAoCargo;    
    } // fim do construtor completo
    
    /**
     * O construtor sobrecarregado da classe Diretor que recebe como argumento um objeto da classe
     * ChefeDeDepartamento e a data de promoção a diretor e inicializa todos os campos
     * da classes com os mesmos, inclusive os campos herdados da classe ChefeDeDepartamento.
     * @param chefeDeDepartamento uma instância da classe ChefeDeDepartamento
     * @param dataDePromoçãoAoCargo a data de promoção a diretor
     */
    public Diretor(ChefeDeDepartamento chefeDeDepartamento, Data dataDePromoçãoAoCargo){
        /*
          Delega a inicialização dos campos herdados ao construtor da superclasse, passando como argumentos 
          retornos de métodos da instância chefeDeDepartamento.
        */
        super(chefeDeDepartamento.getNome(),chefeDeDepartamento.getIdentidade(),chefeDeDepartamento.getNascimento(),
                chefeDeDepartamento.getAdmissão(),chefeDeDepartamento.getSalário(),chefeDeDepartamento.getDepartamento(),
                chefeDeDepartamento.getPromoçãoAChefe());
        this.dataDePromoçãoAoCargo = dataDePromoçãoAoCargo;    
    } // fim do construtor sobrecarregado
    
    /**
     * O construtor default da classe Diretor que não recebe argumentos e deixa os 
     * campos da classe com valores default.
     */
    public Diretor(){
    
    } // fim do construtor default
        
    /**
     * O método getDataDePromoçãoAoCargo retorna a data de promoção a diretor.
     * @return a data de promoção a diretor
     */
    public Data getDataDePromoçãoAoCargo() {
        return dataDePromoçãoAoCargo;
    } // fim do método getDataDePromoçãoAoCargo

    /**
     * O método setDataDePromoçãoAoCargo recebe como argumento uma data de promoção a diretor
     * e atualiza a data de promoção a diretor encapsulada no objeto.
     * @param dataDePromoçãoAoCargo a nova data de promoção a diretor
     */
    public void setDataDePromoçãoAoCargo(Data dataDePromoçãoAoCargo) {
        this.dataDePromoçãoAoCargo = dataDePromoçãoAoCargo;
    } // fim do método setDataDePromoçãoAoCargo
    
    /**
     * O método toString não recebe argumentos e retorna uma string, contendo os campos
     * da classe formatados.
     * @return uma string contendo os campos da classe formatados
     */
    @Override
    public String toString(){
        String resultado = super.toString();
        resultado += resultado + "\nData de promoção ao cargo de Diretor:" + getDataDePromoçãoAoCargo() + "\n";
        return resultado;    
    } // fim do método toString    
} // fim da classe Diretor
