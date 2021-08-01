/**
 * A classe PoligonoRegular possu� campos e m�todos que representam um pol�gono regular com n�mero de lados entre 4 e 10, podendo ser extendidos, caso se julgue nescess�rio.
 * 
 * @author Alisson jaques 
 * 
 * */
public class PoligonoRegular {//declara��o da classe
	
	//declara os campos da classe
	private byte quantidadeLados;
	private double lado;
	
	/**
	 *  O construtor com todos argumentos para a classe PoligonoRegular, que inicializa os campos da classe com os argumentos passados como par�metros.
	 *  @param umaQuantidadeLados um valor inteiro que representa a quantidade de lados do pol�gono
	 *  @param umLado um valor flutuante que representada o tamanho dos lados do pol�gono
	 * 
	 * */
	PoligonoRegular(byte umaQuantidadeLados, double umLado){
		
		quantidadeLados = umaQuantidadeLados;
		lado = umLado;
		
	} // fim do construtor com todos os argumentos
	
	/**
	 * O construtor que possu� como �nico argumento um valor inteiro, que � a quantidade de lados do pol�gono, ele chama o construtor com todos argumentos
	 * passando o valor em seu argumento e um valor flutuante (1) que representa um tamanho default (pol�gono regular com tamanho de lados igual a 1).
	 * @param umaQuantidadeLados um valor inteiro que representa a quantidade de lados do pol�gono
	 * 
	 * */
	PoligonoRegular(byte umaQuantidadeLados){
		
		this(umaQuantidadeLados,(double)1); //chamamos o construtor com assinatura PoligonoRegular(byte,double)
		
	} // fim do construtor com apenas o argumento referente � quantidade de lados
	
	/**
	 *  O construtor para a classe PoligonoRegular que recebe um valor flutuante como �nico argumento, ele chama o construtor com todos os argumentos passando
	 *  o valor em seu argumento e um falor byte (3) que representa o n�mero de lados defalt (tri�ngulo equil�tero com um comprimento de lados qualquer).
	 * 
	 * */
	PoligonoRegular(double umLado){
		
		this((byte)3,umLado);
		
	} // fim do construtor com apena o argumento referente ao tamanho dos lados
	
	/**
	 *  O construtor default para a classe PoligonoRegular que n�o recebe nenhum argumento, ele chama v�rios construtores em cascata e representa um objeto 
	 *  cujos campos formam um tri�ngulo equil�tero de comprimento de lados igual 1.
	 * 
	 * */
	PoligonoRegular(){
		
		this((double)1);
		
	} // fim do construtor default
	
	/**
	 * O m�todo inicializaPoligonoRegular recebe como par�metro dados referentes ao comprimento do lado e n�mero de lados do poligono e inicializa os campos da classe com eles.
	 * @param umaQuantidadeLados o n�mero de lados do pol�gono
	 * @param umLado o comprimento do pol�gono 
	 * 
	 * */
	
	/**
	public void inicializaPoligoRegular(byte umaQuantidadeLados, double umLado) {
		
		quantidadeLados = umaQuantidadeLados;
		lado = umLado;
		
	}//fim do m�todo inicializaPoligonoRegular
	*/
	
	/**
	 * O m�todo � igual recebe como argumento um objeto da pr�pria classe Pol�goRegular e verifica se o objeto passado como ref�ncia e o atual s�o iguais.
	 * @param outroPoligonoRegular um refer�ncia a uma inst�ncia da pr�pria classe PoligoRegular
	 * @return true se os objetos forem iguais
	 * 		   false caso contr�rio 
	 * 
	 * */
	public boolean �Igual(PoligonoRegular outroPoligonoRegular) {
		
		if((quantidadeLados==outroPoligonoRegular.quantidadeLados)&&(lado==outroPoligonoRegular.lado)) {
			
			return true;
		
		}
		else {
			
			return false;
		
		}
	}//fim do m�todo �Igual
	
	/**
	 *  O m�todo calculaNumeroDiagonais n�o possu� argumentos, ele utiliza um express�o que determina o n�mero de diagonais do pol�gono de acordo com o n�mero
	 *  de lados dados no objeto.
	 *  @return numeroDiagonais o n�mero de diagonais do pol�gono 
	 * 
	 * */
	public int calculaNumeroDiagonais() {
		
		//declara��o de vari�vel auxiliar
		int numeroDiagonais;
		
		numeroDiagonais = (quantidadeLados*(quantidadeLados-3))/2;//express�o para c�lculo da diagonal: diagonal = (numeroDeLados*(numeroDeLados-3))/2
		
		return numeroDiagonais;
		
	}//fim do m�todo calculaNumeroDiagonais
	
	/**
	 *  O m�todo calculaArea n�o possu� argumentos, ele utiliza o comprimento do lado do pol�gono para, atr�ves de uma express�o, calcular a �rea do mesmo.
	 *  @return area a �rea do pol�gono 
	 * 
	 * */
	public double calculaArea() {
		
		//declara��o de vari�veis auxiliares
		double area, apotema;
		
		apotema = lado/(2*Math.tan((Math.PI)/(double)quantidadeLados)); //express�o para o c�lculo da ap�tema: ap�tema = comprimentoDoLado/(2*tg(180�/numeroDeLados)
		
		area = (quantidadeLados*lado*apotema)/2; //express�o para o c�lculo da �rea: �rea = (numeroDeLados*comprimentoDoLado*ap�tema)/2
		
		return area;
		
	}//fim do m�todo calculaArea
	
	/**
	 * O m�todo toString n�o possu� argumentos, ele verifica o conte�do da vari�vel correspondente � quantidade de lados e, atrav�s deste dado, imprime o nome do pol�gono.
	 * @return nomePoligono o nome do pol�gono de acordo com o n�mero de lados do mesmo 
	 * 
	 * */
	public String toString() {
		
		//declara��o de refer�ncia auxiliar
		String nomePoligono;
		
		if(quantidadeLados==3) {//se quantidade de lados for igual a 3
			
			nomePoligono = "Tri�ngulo"; //array de strings recebe "Tri�ngulo"
			
			return nomePoligono; //retorna array de strings
			
		}
		else if(quantidadeLados==4) {//racioc�nio igual ao anterior, considerar para todos da mesma natureza (subsequentes)
			
			nomePoligono = "Quadrado";
			
			return nomePoligono;
		
		}
		else if(quantidadeLados==5) {
			
			nomePoligono = "Pent�gono";
			
			return nomePoligono;
		
		}
		else if(quantidadeLados==6) {
			
			nomePoligono = "Hex�gono";
			
			return nomePoligono;
		
		}
		else if(quantidadeLados==7) {
			
			nomePoligono = "Hept�gono";
			
			return nomePoligono;
		
		}
		else if(quantidadeLados==8) {
			
			nomePoligono = "Oct�gono";
			
			return nomePoligono;
		
		}
		else if(quantidadeLados==9) {
			
			nomePoligono = "Ene�gono";
			
			return nomePoligono;
	
		}
		else{
			
			nomePoligono = "Dec�gono";
			
			return nomePoligono;
	
		}
				
		
	}//fim do m�todo toString
	
}//fim da classe PoligonoRegular
