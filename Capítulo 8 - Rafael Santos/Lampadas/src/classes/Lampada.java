package classes;

import java.util.Scanner;

/**
 * *
 * A classe Lampada representa uma lâmpada em uso. Ela possuí métodos para
 * alteração de seu estado (acesa ou apagada), mostra o estado no qual se
 * encontra e se é econômica ou não.
 *
 * @author Alisson Jaques
 */
public class Lampada {

    //declara os campos da classe
    private boolean estadoDaLampada, estadoInicial = false; //indica se esta ligada ou não
    private float potencia; //indica a potência em watts da lâmpada
    private Contador registraQuantidade;

    /**
     * O construtor para a classe Lampada que recebe como argumento o seu estado
     * atual (apagada ou desligada) e inicializa os campos do objeto encapsulado
     * com o estado passado como parâmetro e a potencia fornecida pelo usuário.
     *
     * @param _estadoDaLampada um valor booleano que indica se a lâmpada esta
     * acesa ou apagada
     */
    public Lampada(boolean _estadoDaLampada) {
        registraQuantidade = new Contador(); //criamos uma referência para um objeto da classe contador
        estadoDaLampada = _estadoDaLampada;

        if (estadoDaLampada == true) {
            estadoInicial = true; //guardamos o valor inicial do estado da lâmpada
            //se esse bloco não for executado é considerado o valor default false
        }

        System.out.println("Informe a potência da lâmpada: "); //solicitamos ao usuário da classe que informe o valor da potência da lâmpada
        Scanner valorPotencia = new Scanner(System.in); //criamos uma referência a uma instância da classe Scanner para guardar o valor fornecido
        potencia = valorPotencia.nextFloat(); //inicializamos a variável potencia com o valor informado pelo usuário
    } // fim do construtor que recebe como argumento o estado da lâmpada 

    /**
     * O construtor default para a classe Lampada, esse construtor não recebe
     * nenhum argumento e inicializa o campo estadoDaLampada com false e a
     * variável potencia com 60 utilizando o construtor para o método clona.
     */
    public Lampada() {
        this((boolean) false, (float) 60);
        registraQuantidade = new Contador(); //criamos uma referência para um objeto da classe contador
    } // fim do construtor sem argumentos

    /**
     * O construtor para o método clona da lâmpada, ele recebe como argumentos
     * todos os campos da classe lâmpada e inicializa a instância clone com
     * esses campos.
     *
     * @param _estadoDaLampada um valor booleano que indica se a lâmpada esta
     * ligada ou apagada
     * @param potencia o valor correspondente à potência da lâmpada
     */
    public Lampada(boolean _estadoDaLampada, float umaPotencia) {
        registraQuantidade = new Contador(); //criamos uma referência para um objeto da classe contador
        estadoDaLampada = _estadoDaLampada;

        if (estadoDaLampada == true) {
            estadoInicial = true; //guardamos o valor inicial do estado da lâmpada
            //se esse bloco não for executado é considerado o valor default false
        }
        potencia = umaPotencia;
    } //fim do construtor para o método clona

    /**
     * O método acendeLampada recebe como argumento o estado da lâmpada (aceso
     * ou pagado) e o atualiza para aceso.
     *
     * @param estadoDaLampada um valor booleano que representa se a lâmpada esta
     * acesa ou apagada
     * @return estado da lâmpada aceso
     */
    public boolean acendeLampada(boolean _estadoDaLampada) { //acende a lâmpada (true = aceso)
        _estadoDaLampada = true;
        setEstadoDaLampada(_estadoDaLampada);

        //chamamos o método quantidadeLigada(atráves do objeto registraQuantidade)
        //para registrar quantas vezes a lâmpada foi ligada
        getRegistraQuantidade().quantidadeLigada(true);

        return isEstadoDaLampada(); //retorna o estado da lâmpada como aceso
    } // fim do método acendeLampada

    /**
     * O método apagaLampada recebe como argumento o estado da lâmpada (aceso ou
     * apagado) e o atualiza para apagado.
     *
     * @param estadoDaLampada um valor booleano que representa se a lâmpada esta
     * acesa ou apagada
     * @return estado da lâmpada apagado
     */
    public boolean apagaLampada(boolean _estadoDaLampada) { // apaga a lâmpada (false = apagado)
        _estadoDaLampada = false;
        setEstadoDaLampada(_estadoDaLampada);

        return isEstadoDaLampada(); //retorna o estado da lâmpada como apagado
    } // fim do método apagaLampada

    /**
     * O método mostraEstado recebe como argumento o estado da lâmpada e imprime
     * seu estado.
     *
     * @param estadoDaLampada um valor booleano que representa se a lâmpada esta
     * acesa ou apagada
     */
    public void mostraEstado(boolean estadoDaLampada) { // ostra o estado da lâmpada
        if (estadoDaLampada == true) { //se lâmpada esta acesa
            System.out.println("A lâmpada esta acesa"); //imprime aceso
        } else { //senão
            System.out.println("A lâmpada esta apagada"); // imprimi apagado
        }
    } // fim do método mostraEstado

    /**
     * O método estaLigada recebe como argumento o estado da lâmpada e verifica
     * se a mesma esta ligada ou não.
     *
     * @param estadoDaLampada um valor booleano que representa se a lâmpada esta
     * acesa ou apagada
     * @return true se a lâmpada estiver acesa false se a lâmpada estiver
     * apagada
     */
    public boolean estaLigada(boolean estadoDaLampada) {
        return estadoDaLampada == true;
    } // fim do método estaLigada

    /**
     * O método éEconômica recebe como parâmetro a potência da lâmpada e
     * verifica se a mesma é econômica ou não.
     *
     * @param potencia a potência em watts da lâmpada
     * @return true se a lâmpada for econômica false se a lâmpada não for
     * econômica
     */
    public boolean éEconômica(float potencia) {
        return potencia < 40;
    } // fim do método éEconômica

    /**
     * O método éIgual recebe como argumento uma instância da própria classe
     * Lampada e verifica se essa nova instância é igual à instância atual.
     *
     * @param novaLampada um novo objeto da classe Lampada
     * @return true se o objeto atual é igual ao objeto passado false caso
     * contrário
     */
    public boolean éIgual(Lampada novaLampada) {
        return (isEstadoDaLampada() == novaLampada.isEstadoDaLampada()) && (getPotencia() == novaLampada.getPotencia());
    } // fim do método éIgual

    /**
     * O método clona cria uma nova instância com com os mesmos estados da
     * instância atual,
     *
     * @return um novo objeto com os mesmos dados do objeto atual
     */
    public Lampada clona() {
        Lampada temporária = new Lampada(isEstadoDaLampada(), getPotencia()); //cria uma nova instância da classe Lampada com os mesmos campos do objeto encapsulado
        //chamando o construtor que recebe todos os argumentos da classe		
        return temporária; //retorna uma referência para o novo objeto
    }//fim do método clona

    /**
     * O método toString não possuí argumentos, ele rotarna uma String que
     * fornece informações sobre os campos da classe.
     *
     * @return uma String com uma frase que representa os valores dos campos da
     * classe
     */
    @Override
    public String toString() {
        Lampada clonar = new Lampada(); //criamos um novo objeto da classe Lampada
        Lampada clone = clonar.clona(); //fazemos a referência clone igual à referencia do objeto duplicado, assim essa refência herda os dados da instância atual

        if ((isEstadoDaLampada() == true) && (clone.éEconômica(getPotencia()) == true)) {//se a lâmpada esta acesa e é econômica faça:
            String resultado;
            if (isEstadoInicial() == false) {
                resultado = "A lâmpada esta acesa e é econômica" + "\nQuantidade de vezes que a lampada foi ligada: " + getRegistraQuantidade().quantidadeVezesLigado(); //String = A lâmpada esta acesa e é econômica
            } else {
                resultado = "A lâmpada esta acesa e é econômica" + "\nQuantidade de vezes que a lampada foi ligada: " + (getRegistraQuantidade().quantidadeVezesLigado() + 1);
            }
            return resultado; //retorna String
        } else if ((isEstadoDaLampada() == false) && (clone.éEconômica(getPotencia()) == false)) { //mesmo raciocínio da condição anterior...
            String resultado;
            if (isEstadoInicial() == false) {
                resultado = "A lâmpada esta apagada e não é econômica" + "\nQuantidade de vezes que a lampada foi ligada: " + getRegistraQuantidade().quantidadeVezesLigado();
            } else {
                resultado = "A lâmpada esta apagada e não é econômica" + "\nQuantidade de vezes que a lampada foi ligada: " + (getRegistraQuantidade().quantidadeVezesLigado() + 1);
            }
            return resultado;
        } else if ((isEstadoDaLampada() == false) && (clone.éEconômica(getPotencia()) == true)) {
            String resultado;
            if (isEstadoInicial() == false) {
                resultado = "A lâmpada esta apagada e é econômica" + "\nQuantidade de vezes que a lampada foi ligada: " + getRegistraQuantidade().quantidadeVezesLigado();
            } else {
                resultado = "A lâmpada esta apagada e é econômica" + "\nQuantidade de vezes que a lampada foi ligada: " + (getRegistraQuantidade().quantidadeVezesLigado() + 1);
            }
            return resultado;
        } else {
            String resultado;
            if (isEstadoInicial() == false) {
                resultado = "A lâmpada esta acesa e não é econômica" + "\nQuantidade de vezes que a lampada foi ligada: " + getRegistraQuantidade().quantidadeVezesLigado();
            } else {
                resultado = "A lâmpada esta acesa e não é econômica" + "\nQuantidade de vezes que a lampada foi ligada: " + (getRegistraQuantidade().quantidadeVezesLigado() + 1);
            }
            return resultado;
        }
    } // fim do método toString

    /**
     * @return the estadoDaLampada
     */
    public boolean isEstadoDaLampada() {
        return estadoDaLampada;
    }

    /**
     * @param estadoDaLampada the estadoDaLampada to set
     */
    public void setEstadoDaLampada(boolean estadoDaLampada) {
        this.estadoDaLampada = estadoDaLampada;
    }

    /**
     * @return the estadoInicial
     */
    public boolean isEstadoInicial() {
        return estadoInicial;
    }

    /**
     * @param estadoInicial the estadoInicial to set
     */
    public void setEstadoInicial(boolean estadoInicial) {
        this.estadoInicial = estadoInicial;
    }

    /**
     * @return the potencia
     */
    public float getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the registraQuantidade
     */
    public Contador getRegistraQuantidade() {
        return registraQuantidade;
    }

    /**
     * @param registraQuantidade the registraQuantidade to set
     */
    public void setRegistraQuantidade(Contador registraQuantidade) {
        this.registraQuantidade = registraQuantidade;
    }
} // fim da classe Lampada
