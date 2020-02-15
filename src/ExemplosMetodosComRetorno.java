
public class ExemplosMetodosComRetorno {
	public static void main(String[] args) {
		int resultado = cubo(3);
		System.out.println("Resultado: "+ resultado);
		
		String resultadoNome = concatenar("MARCELO","ALVES");
		System.out.println("Nome: "+ resultadoNome);
		
		int resultadoSinal = sinal(1);
		System.out.println("Resultado Sinal: "+ resultadoSinal);
		
		boolean resultadoSemana = ehDiaSemana("sabado");
		System.out.println("Dia Semana: "+ resultadoSemana);
		
		boolean  resultadoSemanaHora = possoIrBanco("sabado", 7);
		System.out.println("Pode? "+ resultadoSemanaHora);
	}
	
	public static int cubo (int num) {
		return num * num * num; 
	}
	
	public static String concatenar(String v1, String v2) {
		return v1 + " " + v2;
	}
	
	public static int sinal(int numSinal) {
		if(numSinal > 0){
			return 1;
			
		}else if(numSinal < 0) {
			return -1;
			
		}else {
			return 0;
			
		}
	}
	
	public static boolean ehDiaSemana(String diaSemana) {
		if (diaSemana.equalsIgnoreCase("sabado") || diaSemana.equalsIgnoreCase("domingo")) {
			return false;
			
		}else {
			return true;
			
		}
	}
	
	public static boolean possoIrBanco(String diaSemana2, int horaSemana2) {
		boolean diaSemana = ehDiaSemana(diaSemana);
		
		if(diaSemana == false) {
			 return false;
			 
		}else if (horaSemana2 >= 10 && horaSemana2 <= 16){
			return true;
			
		}else {
			return false;
		}
		
	}
}
