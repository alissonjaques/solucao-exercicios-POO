package main;

import classes.Ponto3D;
import classes.Ponto2D;
import classes.Ponto3DDelegacao;

/**
 * A classe Main demonstra exemplos de usos das classes Ponto3D, Ponto3DDelegacao e Ponto2D,
 * representando um programa de computador simples que manipula pontos cartesianos de
 * tr�s dimens�es.
 * 
 * @author Alisson Jaques
 */
public class Main { // declara a classe
    /**
     * O m�todo main permite a execu��o desta classe e manipula inst�ncias das classes
     * Ponto3D, Ponto3DDelegacao e Ponto2D, demonstrando o uso destas.
     * 
     * @param args os argumentos que podem ser passados ao m�todo, via linha de comando,
     * mas que neste caso ser�o ignorados.
     */
    public static void main(String[] args){
        // cria v�rios pontos com tr�s dimens�es
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
    } // fim do m�todo main
} // fim da classe Main