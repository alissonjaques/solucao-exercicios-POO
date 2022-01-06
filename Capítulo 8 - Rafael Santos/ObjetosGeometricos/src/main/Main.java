package main;

import classes.Circulo;
import classes.ObjetoGeometrico;
import classes.Ponto2D;
import classes.Quadrado;
import classes.Retangulo;
import classes.Triangulo;
import classes.TrianguloEquilatero;
import classes.TrianguloEscaleno;
import classes.TrianguloIsosceles;

/**
 * A classe Main manipula instâncias das classes ObjetoGeometrico, Circulo,
 * Retangulo e Triangulo, dando exemplo de usos das mesmas.
 *
 * @author Alisson Jaques
 */
public class Main { // declara a classe

    /**
     * O método main permite a execução dessa classe, ele utiliza de várias instâncias
     * das classes ObjetoGeometrico, Circulo, Retangulo e Triangulo, dando exemplos de 
     * usos.
     * 
     * @param args os argumentos que podem ser passados ao método, via linha de comando,
     * mas que neste caso serão ignorados
     */
    public static void main(String[] args) {
        
        // exemplos de uso da classe ObjetoGeometrico
        ObjetoGeometrico quadrado = new ObjetoGeometrico((double) 3.51, (double) 1.0, (int) 4);
        ObjetoGeometrico vazio = new ObjetoGeometrico();

        System.out.println(quadrado);
        System.out.println(vazio);

        // exemplos de uso da classe Circulo
        Circulo circulo = new Circulo(new Ponto2D((double) 1.0, (double) 0.0), (double) 3.0);
        Circulo circulo2 = new Circulo();

        System.out.println(circulo);
        System.out.println(circulo2);
        
        // exemplos de uso da classe Retangulo
        Retangulo retangulo = new Retangulo((double) 3.54, (double) 4.78);
        Retangulo retanguloVazio = new Retangulo();

        System.out.println(retangulo);
        System.out.println(retanguloVazio);
        
        // exemplos de uso da classe Triangulo
        Triangulo triangulo = new Triangulo((double) 1.0, (double) 2.0, (double) 2.0);
        Triangulo triangulo2 = new Triangulo((double) 4.0, (double) 5.0, (double) 6.0);
        Triangulo triangulo3 = new Triangulo((double) 1.0, (double) 1.0, (double) 1.0);
        Triangulo triangulo4 = new Triangulo();

        System.out.println(triangulo);
        System.out.println(triangulo2);
        System.out.println(triangulo3);
        System.out.println(triangulo4);
        
        // exemplos de uso da classe Quadrado
        Quadrado quadrado1 = new Quadrado();
        Quadrado quadrado2 = new Quadrado((double)3.5);
        
        System.out.println(quadrado1);
        System.out.println(quadrado2);
        
        // exemplos de uso da classe TrianguloEquilatero
        TrianguloEquilatero equilatero = new TrianguloEquilatero();
        TrianguloEquilatero equilatero1 = new TrianguloEquilatero((double)5.5);
        
        System.out.println(equilatero);
        System.out.println(equilatero1);
        
        // exemplos de uso da classe TrianguloIsosceles
        TrianguloIsosceles trianguloIsosceles = new TrianguloIsosceles();
        TrianguloIsosceles trianguloIsosceles1 = new TrianguloIsosceles((double)4.0,(double)6.0);
        
        System.out.println(trianguloIsosceles);
        System.out.println(trianguloIsosceles1);
        
        // exemplos de uso da classe TrianguloEscaleno
        TrianguloEscaleno escaleno = new TrianguloEscaleno();
        TrianguloEscaleno escaleno2 = new TrianguloEscaleno((double)5.6,(double)7.1,(double)4.9);
        
        System.out.println(escaleno);
        System.out.println(escaleno2);
    } // fim do método main
} // fim da classe Main