package main;

/**
 * Importação das classes fundamentais
 */
import classes.Data;
import classes.Governador;
import classes.Pessoa;
import classes.Politico;
import classes.Prefeito;

/**
 * A classe Main demonstra usos das classes Governador, Prefeito, Politico, Pessoa e Data.
 * @author Alisson Jaques
 */
public class Main {

    /**
     * O método main permite a execução desta classe, ele demonstra usos das classes
     * Governador, Prefeito, Politico, Pessoa e Data, manipulando objetos das mesmas.
     * @param args os argumentos que podem ser passados ao método, via linha de comando,
     * mas que neste caso serão ignorados
     */
    public static void main(String[] args) {
        // criamos três instâncias da classe Governador
        Governador paulo = new Governador("Paulo da Silva Magalhães", 45135649,
                new Data((byte) 4, (byte) 12, (short) 1988), "Democrata", "Minas Gerais");
        Governador amoedo = new Governador("Amoedo Fernandes Pimentel", 11316546,
                new Data((byte) 21, (byte) 6, (short) 1981), "Trabalhadores", "São Paulo");
        Governador jaques = new Governador("Jaques Mayer", 21313465,
                new Data((byte) 11, (byte) 1, (short) 1986), "Libertação", "Rio de Janeiro");

        // criamos uma instância da classe Pessoa
        Pessoa avelarP = new Pessoa("Fabio Avelar", 12313165, new Data((byte) 20, (byte) 2, (short) 1988));
        // criamos uma instância classe Politico passando como argumento uma pessoa e um partido
        Politico avelar = new Politico(avelarP, "Democrata");
        // criamos uma instância da classe Prefeito passando como argumento um politico e uma cidade de mandato
        Prefeito avelarPref = new Prefeito(avelar, "Nova Serrana MG");
        // criamos uma instância da classe Prefeito
        Prefeito pimentel = new Prefeito(new Politico("Pimentel João dos Santos", 78979797,
                new Data((byte) 28, (byte) 8, (short) 1984), "Libertação Paranormal"), "Belo Horizonte MG");
        
        // imprimimos no terminal os governadores e prefeitos cadastrados no sistema:
        System.out.println("====================================================");
        System.out.println("================= Governadores =====================");
        System.out.println(paulo);
        System.out.println();
        System.out.println(amoedo);
        System.out.println();
        System.out.println(jaques);        
        System.out.println("=================== Prefeitos ======================");
        System.out.println(avelarPref);
        System.out.println();
        System.out.println(pimentel);
        System.out.println("====================================================");
    } // fim do método main
} // fim da classe Main