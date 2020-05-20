
public class Jogo {

  public static void main (String [] args) {
			montaMenu();
			
		}
	
		static void montaMenu(){ //função estatica do tipo void, criada para armazenar o menu do jogo.
			Scanner sc = new Scanner (System.in);
			
			int opcaoDigitada = 0, a = 0, b = 0;
		
			while (opcaoDigitada != 4) { //laço de repetição utilizado para reiniciar o menu do jogo, a cada vez que o jogador apertar as opções 2 e 3
										 //ou quando o jogador não atigir o objetivo e perder o jogo.
		
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
							break;
						case 4: System.out.println("Saindo do jogo");
							break;
					
						default: System.out.println("Opção invalida!!!");
							break;
							
						}
					
							System.out.println("");
							
							if (opcaoDigitada == 1) {
								break;
							}
							if (opcaoDigitada == 2) {
								int pontuacaoJogador = pontuacao(a, b); //falta inserir o sistema de pontuação do jogo
							}
							if (opcaoDigitada == 3) {
								creditos();
							}
							
					}
						
						if (opcaoDigitada == 1) { //if utilizado para  começar o jogo, junto a opção 1(Jogar).
							historia();
						}
						
			sc.close();
		}		
		static void historia() { //função estatica do tipo void, utilizada para armazenar a historia do personagem.
			System.out.println("***Colocar Historia inicial***");
		}

		static int pontuacao (int a, int b){ //função estatica do tipo int, para retornar a pontuação do jogador.
			
			int min = 0;
			return min;
		}

		static void creditos() {
			System.out.println("Projeto criado para a matéria de 'Projeto Integrador I - Professor: Eduardo Takeo.'");
			System.out.println("O intuito dele é unir todas as materias do curso Tecnologia em Analíse e Desenvolvimento de Sistemas - Periodo I");
			System.out.println("Desde já agradecemos pela preferencia e desejamos uma otima expêriencia.");
			System.out.println("Desenvolvedores: Brenno C. Messias, Deivid C. Gomes e Juan G. Dias.");
			System.out.println("");
		}

    
}
