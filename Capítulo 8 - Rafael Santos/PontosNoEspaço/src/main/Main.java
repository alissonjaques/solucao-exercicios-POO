package main;

import classes.Ponto3D;
import classes.Ponto2D;
import classes.Ponto3DDelegacao;

/**
 * A classe Main demonstra exemplos de usos das classes Ponto3D, Ponto3DDelegacao e Ponto2D,
 * representando um programa de computador simples que manipula pontos cartesianos de
 * três dimensões.
 * 
 * @author Alisson Jaques
 */
public class Main { // declara a classe
    /**
     * O método main permite a execução desta classe e manipula instâncias das classes
     * Ponto3D, Ponto3DDelegacao e Ponto2D, demonstrando o uso destas.
     * 
     * @param args os argumentos que podem ser passados ao método, via linha de comando,
     * mas que neste caso serão ignorados.
     */
    public static void main(String[] args){
        // cria vários pontos com três dimensões
        Ponto3D pontoA = new Ponto3D(new Ponto2D((double)5.0,(double)6.7),(double)-1.0);
        Ponto3D origem = new Ponto3D();
        Ponto3D pontoB = new Ponto3D((double)-1.0,(double)-1.0,(double)-1.0);
        Ponto2D ponto = new Ponto2D((double)21.0,(double)14.45);
        Ponto3DDelegacao pontoC = new Ponto3DDelegacao(ponto,(double)-33.00);
        
        // imprime os pontos criados acima
        System.out.println("Ponto A = " + pontoA);
        System.out.println("Ponto B = " + pontoB);   
        System.out.println("Ponto C = " + pontoC);
        System.out.println("Origem  = " + origem);
    } // fim do método main
} // fim da classe Main