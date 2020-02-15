
public class ExemplosMetodosVoid {
	public static void main(String[] args) {
		saudacao(5);
		dobro(3);
		metade(4);
		tamanho("marcelo");
		soma(1,2);
	}
	
	/*M�todo sauda��o*/
	      		/*Void -> Retorno | periodo -> argumento/par�metro*/
	public static void saudacao(int periodo) {
		if (periodo == 1) {
			System.out.println("Bom Dia");
			
		}else if (periodo == 2){
			System.out.println("Boa Tarde");

		}else if (periodo == 3){
			System.out.println("Boa Noite");
			
		}else {
			System.out.println("Ol�");
		}
	}
	
	public static void dobro(int valor) {
		int resultado = valor * 2;
		System.out.println("Resultado: "+ resultado);
	}
	
	public static void metade(int valorMetade) {
		int resultadoMetade = valorMetade / 2;
		System.out.println("Resultado da Metade: "+ resultadoMetade);
	}
	
	public static void tamanho(String nomeTamanho) {
		System.out.println("Tamanho do Nome: "+ nomeTamanho.length());
	}
	
	public static void soma(int valorSoma, int valorSoma2) {
		int resultadoSoma = valorSoma + valorSoma2;
		System.out.println("Resultado da Soma: "+ resultadoSoma);
	}
	
	
}
