import java.util.Scanner; // importa��o da classe Scanner para manipula��o de dados fornecidos pelo usu�rio

/**
 * 	A classe Principal possu� v�rios m�todos est�ticos, incluindo o m�todo main
 * 	para sua execu��o. Esta classe demonstra v�rios exemplos de usos de classes
 *  bibliotecas, referentes a convers�o de unidades.
 * 	@author Alisson Jaques	
 * 
 * */
public class Principal { // declara��o da classe

	public static void main(String[] argumentos) {
		
		
		Scanner opcao = new Scanner(System.in);							// criamos um objeto Scanner para podermos manipular valores fornecidos pelo usu�rio
		final double distanciaDaTerraALuaEmQuilometros = 382000;        // a dist�ncia da terra � lua em quil�metros
		final double areaCampoFutebolMetrosQuadrados = 8250;			// a �rea de um campo de futebol em metros quadrados
		final double volumePiscinaOlimpicaMetrosCubicos = 1890;			// o volume de uma piscina ol�mpica em metros c�bicos
		final double velocidadeDaLuzEmQuilometrosPorHora = 1080000000;  // a velociadade da luz em km/h
		final double periodoDeGestacaoElefanteIndianoEmDias = 624;		// o per�odo de gesta��o de um elefante indiano em dias
		
		// intera��o com o usu�rio e impress�o de dados relativos � dist�ncia da terra � lua
		System.out.println("****************************** Dist�ncia M�dia da Terra � Lua *****************************************");
		distanciaDaTerraALua(distanciaDaTerraALuaEmQuilometros, opcao);
		
		// intera��o com o usu�rio e impress�o de dados relativos a �rea de um campo de futebol
		System.out.println("*********************** �rea de um Campo de Futebol - Convers�o de Unidades ***************************");
		areaCampoFutebol(areaCampoFutebolMetrosQuadrados, opcao);
		
		// impress�o de dados relativos a um volume de uma piscina ol�mpica
		System.out.println("******************** Volume de uma Piscina - Expresso em Diferentes Unidades **************************");
		volumePiscinaOlimpica(volumePiscinaOlimpicaMetrosCubicos);
		
		System.out.println(); // quebra de linha para organiza��o das informa��es no terminal
		// impress�o de dados relativos � velocidade da luz
		System.out.println("********************** Velocidade da Luz - Expressa em Diferentes Unidades ****************************");
		velocidadeDaLuz(velocidadeDaLuzEmQuilometrosPorHora);
		
		System.out.println(); // quebra de linha para organiza��o das informa��es no terminal
		// impress�o de dados relativos ao per�odo de gesta��o de um elefante indiano
		System.out.println("**************************** Per�odo de Gesta��o de um Elefante Indiano *******************************");
		gestacaoElefanteIndiano(periodoDeGestacaoElefanteIndianoEmDias);
		
		// v�rias convers�es de unidades de temperatura s�o apresentadas aqui, utilizando m�todos est�ticos da classe MudancaEscalaDeTemperatura
		System.out.println(); // quebra de linha para organiza��o das informa��es no terminal
		System.out.println("0� Celsius s�o " + MudancaEscalaDeTemperatura.celsiusParaKelvin(0) + " K");
		System.out.println("0� Celsius s�o " + MudancaEscalaDeTemperatura.celsiusParaFahrenheit(0)+"� F");
		System.out.println("100� Celsius s�o " + MudancaEscalaDeTemperatura.celsiusParaKelvin(100)+" K");
		System.out.println("100� Celsius s�o " + MudancaEscalaDeTemperatura.celsiusParaFahrenheit(100)+"� F");
		System.out.println("309 kelvin s�o " + MudancaEscalaDeTemperatura.kelvinParaFahrenheit(309)+"� F");
		System.out.println("97 � fahrenheit s�o " + MudancaEscalaDeTemperatura.fahrenheitParaKelvin(97)+" K");
		
		System.out.println(); // quebra de linha para organiza��o das informa��es no terminal
		System.out.println("******************* Testes para a Classe DemoConversaoDeUnidadesDeComprimento *************************");
		System.out.println(); // quebra de linha para organiza��o das informa��es no terminal
		// chamamos o m�todo main, da classe DemoConversaoDeUnidadesDeComprimento, como subrotina da nossa aplica��o
		DemoConversaoDeUnidadesDeComprimento.main(argumentos);				
		
	} // fim do m�todo main
	
	/**
	 *  O m�todo distanciaDaTerraALua recebe como argumento a dist�ncia m�dia
	 *  da terra � lua em quil�metros e informa esse valor convertido  em milhas
	 *  ou p�s (dependendo da escolha realizada pelo usu�rio). Esse m�todo � est�tico, 
	 *  ent�o pode ser chamado por outras classes diretamente, sem a necessidade de cria��o
	 *  de objetos para a mesma. Ele tamb�m pode ser considerado uma subrotina para o m�todo
	 *  main principal desta classe.
	 *  @param quilometros o valor em quil�metros a ser convertido
	 *  @param opcaoEscolhida um apontador para um objeto da classe Scanner, para podermos manipular
	 *  dados fornecidos pelo usu�rio
	 * 
	 * */
	public static void distanciaDaTerraALua(double quilometros, Scanner opcaoEscolhida) {
		
		byte escolha;                            // a escolha do usu�rio
		
		System.out.println("\nVoc� deseja que a dist�ncia seja convertida em milhas ou p�s? (escolha 1 para milhas ou 2 para p�s)\n");
		escolha = opcaoEscolhida.nextByte(); // guardamos o conte�do fornecido pelo usu�rio na vari�vel escolha
		
		while(escolha!=1 && escolha!=2) { // enquanto a escolha n�o for v�lida
			
			System.out.println("Escolha uma op��o v�lida! Milhas (1) ou P�s (2):"); // pe�a ao usu�rio uma valor v�lido
			escolha = opcaoEscolhida.nextByte(); // guarde o valor informado na vari�vel escolha
			
		} // fim do while
		
		System.out.println(); // quebra de linha para organiza��o das informa��es no terminal
		
		if(escolha==1) { // se a escolha for milhas
			
			// mostra o valor da dist�ncia convertido em milhas
			System.out.println("A dist�ncia m�dia da terra � lua � de " + ConversaoDeUnidadesDeComprimento.quil�metrosParaMilhas(quilometros)+" milhas\n");
			
		}
		else { // sen�o
			
			// mostra o valor convertido em p�s
			System.out.println("A dist�ncia m�dia da terra � lua � de " + ConversaoDeUnidadesDeComprimento.quil�metrosParaP�s(quilometros)+" p�s\n");
			
		} // fim-se
		
	} // fim do m�todo distanciaDaTerraALua
	
	/**
	 *  O m�todo areaCampoFutebol recebe como argumento a �rea em metros quadrados
	 *  de um campo de futebol e um objeto da classe Scanner. Este m�todo converte
	 *  o valor da �rea fornecida em p�s quadrados, acres ou cent�metros quadrados
	 *  (dependendo da escolha realizada pelo usu�rio). Esse m�todo � est�tico, 
	 *  ent�o pode ser chamado por outras classes diretamente, sem a necessidade de cria��o
	 *  de objetos para a mesma. Ele tamb�m pode ser considerado uma subrotina para o m�todo
	 *  main principal desta classe.
	 *  @param areaEmMetrosQuadrados o valor da �rea do campo de futebol em metros quadrados
	 *  @param opcaoEscolhida um apontador para um objeto da classe Scanner, para podermos manipular
	 *  dados fornecidos pelo usu�rio
	 * 
	 * */
	public static void areaCampoFutebol(double areaEmMetrosQuadrados, Scanner opcaoEscolhida) {
		
		byte escolha; // a escolha do usu�rio
		
		System.out.println("\nVoc� deseja que a �rea seja convertida em p�s quadrados, acres ou cent�metros quadrados? \n escolha 1: para p�s quadrados\n escolha 2: para acres\n escolha 3: para cent�metros quadrados\n");
		escolha = opcaoEscolhida.nextByte(); // guardamos o conte�do fornecido pelo usu�rio na vari�vel escolha
		
		while(escolha!=1 && escolha!=2 && escolha!=3) { // enquanto a escolha n�o for v�lida
			
			System.out.println("Escolha uma op��o v�lida! P�s Quadrados (1), Acres (2) ou Cent�metros Quadrados (3):"); // pe�a ao usu�rio uma valor v�lido
			escolha = opcaoEscolhida.nextByte(); // guarde o valor informado na vari�vel escolha
			
		} // fim do while
		
		System.out.println(); // quebra de linha para organiza��o das informa��es no terminal
		
		if(escolha==1) { // se a escolha for p�s quadrados
			
			// mostra o valor da �rea convertido em p�s quadrados
			System.out.println("A �rea do campo de futebol � " + ConversaoDeUnidadesDeArea.metrosQuadradosParaP�sQuadrados(areaEmMetrosQuadrados)+" p�s quadrados\n");
			
		}
		else { // sen�o
			
			if(escolha==2) { // se a escolha for acres
			
				// mostra o valor da �rea convertido em acres
				System.out.println("A �rea do campo de futebol � " + ConversaoDeUnidadesDeArea.p�sQuadradosParaAcres(ConversaoDeUnidadesDeArea.metrosQuadradosParaP�sQuadrados(areaEmMetrosQuadrados))+" acres\n");
				
			}			
			else { // sen�o
				
				// mostra o valor da �rea convertido em cent�metros quadrados
				System.out.println("A �rea do campo de futebol � " + ConversaoDeUnidadesDeArea.metrosQuadradosParaCent�metrosQuadrados(areaEmMetrosQuadrados) + " cent�metros quadrados\n");
								
			} // fim-se
			
		} // fim-se
		
	} // fim do m�todo areaCampoFutebol	
	
	/**
	 *  O m�todo volumePiscinaOlimpica recebe como argumento o volume em metros c�bicos
	 *  de uma piscina e converte esse valor em litros, p�s c�bicos e cent�metros c�bicos. 
	 *  Esse m�todo � est�tico, ent�o pode ser chamado por outras classes diretamente, 
	 *  sem a necessidade de cria��o de objetos para a mesma. Ele tamb�m pode ser 
	 *  considerado uma subrotina para o m�todo main principal desta classe.
	 *  @param volumePiscinaOlimpicaMetrosCubicos o valor do volume da piscina em metros
	 *  c�bicos
	 * 
	 * */
	public static void volumePiscinaOlimpica(Double volumePiscinaOlimpicaMetrosCubicos) {
		
		/*
		 * Criamos uma vari�vel auxiliar que ira receber um valor, referente ao volume em litros da piscina.
		 * Isso � feito atrav�s de uma chamada ao m�todo est�tico metrosC�bicosParaLitros da classe 
		 * Convers�oDeUnidadesDeVolume.
		 * 
		 * */
		double litros = ConversaoDeUnidadesDeVolume.metrosC�bicosParaLitros(volumePiscinaOlimpicaMetrosCubicos);
		
		System.out.println(); // quebra de linha para organiza��o dos dados no terminal
		
		System.out.println("O volume da piscina � " + litros + " litros"); // mostra o valor do volume em litros
		System.out.println("O volume da piscina � " + ConversaoDeUnidadesDeVolume.metrosC�bicosParaP�sC�bicos(volumePiscinaOlimpicaMetrosCubicos) + " p�s c�bicos"); // mostra o valor do volume em p�s c�bicos
		System.out.println("O volume da piscina � " + ConversaoDeUnidadesDeVolume.litrosParaCent�metrosC�bicos(litros) + " cent�metros c�bicos"); // mostra o valor do volume em cent�metros c�bicos
		
	} // fim do m�todo volumePiscinaOlimpica
	
	/**
	 *  O m�todo velocidadeDaLuz recebe um �nico argumento,
	 *  que � um valor referente � velocidade da luz em km/h
	 *  e imprime no terminal essa velocidade expressa em milhas
	 *  por hora, metros por segundo e p�s por segundo. Este m�todo
	 *  � est�tico, n�o necessitando de cria��es de objetos da classe
	 *  Principal para ser utilizado. Este m�todo � uma das subrotinas
	 *  do m�todo main principal.
	 *  @param velocidadeDaLuzEmQuilometrosPorHora o valor da velocidade
	 *  da luz em quil�metros por hora
	 * 
	 * */
	public static void velocidadeDaLuz(double velocidadeDaLuzEmQuilometrosPorHora) {
		
		System.out.println(); // quebra de linha para organiza��o dos dados no terminal
		System.out.println("A velocidade da luz � " + ConversaoDeUnidadesDeVelocidade.quil�metrosPorHoraParaMilhasPorHora(velocidadeDaLuzEmQuilometrosPorHora) + " milhas por hora"); // mostra o valor da velocidade da luz em milhas por hora
		System.out.println("A velocidade da luz � " + ConversaoDeUnidadesDeVelocidade.quil�metrosPorHoraParaMetrosPorSegundo(velocidadeDaLuzEmQuilometrosPorHora) + " m/s");          // mostra o valor da velocidade da luz em metros por segundo
		System.out.println("A velocidade da luz � " + ConversaoDeUnidadesDeVelocidade.quil�metrosPorHoraParaP�sPorSegundo(velocidadeDaLuzEmQuilometrosPorHora) + " p�s por segundo"); // mostra o valor da velocidade da luz em p�s por segundo
		
	} // fim do m�todo velocidadeDaLuz
	
	/**
	 *  O m�todo gestacaoElefanteIndiano recebe um �nico argumento,
	 *  referente ao per�odo de gesta��o em dias, e imprime a convers�o
	 *  desse valor em horas, minutos e segundos (imprime tamb�m o valor
	 *  em dias). Este m�todo demonstra usos da classe ConversaoDeUnidadesDeTempo 
	 *  e � um m�todo est�tico, ou seja, pode ser chamado diretamente por classes
	 *  usu�rias. Este m�todo � uma subrotina do m�todo main principal dessa classe.
	 *  @param periodoEmDias o tempo de gesta��o de um elefante indiano em dias
	 * 
	 * */	
	public static void gestacaoElefanteIndiano(double periodoEmDias) {
		
		/*
		 *  declara��o de vari�veis auxiliares
		 * 
		 * */
		double segundos = ConversaoDeUnidadesDeTempo.diasParaSegundos(periodoEmDias); // o tempo em segundos correspondente ao n�mero de dias
		int segundosInteiros = (int)segundos;										  // dias de gesta��o representados em n�meros inteiros
		
		System.out.println(); // quebra de linha para organiza��o dos dados no terminal
		System.out.println("O per�odo de gesta��o de um elefante indiano � " + periodoEmDias + " dias");												// imprime o tempo de gesta��o em dias
		System.out.println("O per�odo de gesta��o de um elefante indiano � " + ConversaoDeUnidadesDeTempo.diasParaHoras(periodoEmDias) + " horas");     // imprime o tempo de gesta��o em horas
		System.out.println("O per�odo de gesta��o de um elefante indiano � " + ConversaoDeUnidadesDeTempo.diasParaMinutos(periodoEmDias) + " minutos"); // imprime o tempo de gesta��o em minutos
		System.out.println("O per�odo de gesta��o de um elefante indiano � " + segundos + " segundos");													// imprime o temop de gesta��o em segundos
		System.out.println("Se a gesta��o de um elefante indiano come�asse agora, levaria " + Relogio.relogio(segundosInteiros)+" para acabar.");		// imprime o prazo de um tempo de gesta��o (no formato rel�gio)
				
	} // fim do m�todo gestacaoElefanteIndiano
	
} // fim classe Principal