
public class Jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int retornoMenu = menu();
		if (retornoMenu == 1) {
			historia();
		}
		
		sc.close();
	}
	
	static int menu(){
		Scanner sc = new Scanner(System.in);
		
			int opcaoDigitada = 0;
			
			while (opcaoDigitada != 4) {
			System.out.println("*********************");
			System.out.println("********MENU*********");
			System.out.println("*********************");
			System.out.println("*   1 - Jogar       *");
			System.out.println("*   2 - Pontuação   *");
			System.out.println("*   3 - Creditos    *");
			System.out.println("*   4 - Sair        *");
			System.out.println("*********************");
			System.out.println("");
			System.out.print("Digite a opção que deseja: ");
				opcaoDigitada = sc.nextInt();
			
			System.out.println("");
			
				switch (opcaoDigitada) {
					case 1: System.out.println("Entrando no jogo...");
						break;
					case 2: System.out.println("Mostrando sua pontuação...");
						break;
					case 3: System.out.println("Indo para os créditos...");
							System.out.println("Projeto criado para a matéria de 'Projeto Integrador I - Professor: Eduardo Takeo.'");
							System.out.println("O intuito dele é unir todas as materias do curso Tecnologia em Analíse e Desenvolvimento de Sistemas - Periodo I");
							System.out.println("Desde já agradecemos pela preferencia e desejamos uma otima expêriencia.");
							System.out.println("Desenvolvedores: Brenno C. Messias, Deivid C. Gomes e Juan G. Dias.");
							System.out.println("");
						break;
					case 4: System.out.println("Saindo do jogo");
						break;
				
					default: System.out.println("Opção invalida!!!");
						break;
					
					}
				
						if (opcaoDigitada == 1) {
							break;
						}
							System.out.println("");
					} 
		
		sc.close();
				return opcaoDigitada;
	}
	
	static void historia(){
		System.out.println("***Colocar historia***");
	}
}
