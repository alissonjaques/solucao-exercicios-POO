
public class Principal {
	
	public static void main(String[] argumentos) {
		
		
		System.out.println("4000 segundos representa: " + Relogio.relogio(4000));
		main(5);
		main();
		main("O Universo Numa Casca de N�s");
	
	}
	
	public static void main(int numero) {
		
		System.out.println(numero*numero);
				
	}
	
	public static void main() {
		
		System.out.println("Hello World!");
		
		
	}
	
	public static void main(String mensagem) {
		
		
		System.out.println(mensagem);
		
	}
}
