
public class Jogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int retornoMenu = menu();
		if (retornoMenu == 1) {
			historia();
		}

		sc.close();
	}

	static int menu() { // função criada para armazenar o menu principal do jogo.
		Scanner sc = new Scanner(System.in);

		int opcaoDigitada = 0;

		while ((opcaoDigitada != 4) && (opcaoDigitada != 1)) { // laço de repetição usado para repetir o menu enquanto
																// não escolher as opções "jogar" e "sair".
			System.out.println("*********************");
			System.out.println("********MENU*********");
			System.out.println("*********************");
			System.out.println("*   1 - Jogar       *");
			System.out.println("*   2 - Pontuação   *");
			System.out.println("*   3 - Creditos    *");
			System.out.println("*   4 - Sair        *");
			System.out.println("*********************\n");
			System.out.print("Digite a opção que deseja: ");
			opcaoDigitada = sc.nextInt();

			System.out.println("");

			switch (opcaoDigitada) {
			case 1:
				System.out.println("Entrando no jogo...\n");
				break;
			case 2:
				System.out.println("Mostrando sua pontuação...\n");
				break;
			case 3:
				System.out.printf(
						"Indo para os créditos...\n\nProjeto criado para a matéria de 'Projeto Integrador I - Professor: Eduardo Takeo.'\nO intuito dele é unir todas as materias do curso Tecnologia em Analíse e Desenvolvimento de Sistemas - Periodo I\nDesde já agradecemos pela preferencia e desejamos uma otima expêriencia.\nDesenvolvedores: Brenno C. Messias, Deivid C. Gomes e Juan G. Dias.\n\n");
				break;
			case 4:
				System.out.println("Saindo do jogo");
				break;

			default:
				System.out.println("Opção invalida!!!\n");
				break;
			}
		}

		sc.close();
		return opcaoDigitada;
	}

	static void historia() {
		System.out.println("***Colocar historia***");
	}
}
