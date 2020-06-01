package RPG;
import java.util.Scanner;

public class projetoPI {
	static Scanner sc = new Scanner(System.in);

	static int menu() {
		System.out.printf(
				"Projeto criado para a matéria de 'Projeto Integrador I - Professor: Eduardo Takeo.'\nO intuito dele é unir todas as materias do curso Tecnologia em Analíse e Desenvolvimento de Sistemas - Periodo I \nEsse projeto em questão está voltado para a matéria de Matemática.\nDesde já agradecemos pela preferencia e desejamos uma otima expêriencia.\n\n\n");

		int opcaoDigitada = 0;

		while ((opcaoDigitada != 3) && (opcaoDigitada != 1)) { // laço de repetição usado para repetir o menu enquanto
																// não escolher as opções "jogar" e "sair".

			System.out.println("********MENU*********");
			System.out.println("*   1 - Jogar       *");
			System.out.println("*   2 - Creditos    *");
			System.out.println("*   3 - Sair        *");
			System.out.println("*********************\n");
			System.out.print("Digite a opção que deseja: ");
			opcaoDigitada = sc.nextInt();

			System.out.println("");

			switch (opcaoDigitada) {
			case 1:
				System.out.println("Entrando no jogo...\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");
				break;
				
			case 2:
				System.out.println(
						"Desenvolvedores: Brenno Costa Messias, Deivid Cordeiro Gomes, Juan Gonçalves Dias.\n");
				break;
			case 3:
				System.out.println("Saindo do jogo");
				break;

			default:
				System.out.println("Opção invalida!!!\n");
				break;
			}
			
			
			}
		if(menu() ==  3) {
			System.out.println("");
		}

		return opcaoDigitada;
	}

	static void historia() {
		System.out.println(
				"Em uma pequena fazenda, no interior de São Paulo vive uma pequena menina chamada Ana Clara.\n"
						+ "De família humilde e simples Ana Clara tem o sonho de se tornar uma matemática, para que assim possa ajudar seus pais "
						+ "administrar sua pequena fazenda.\n"
						+ "Como seus pais não tem condições de ajuda-la nos estudos, ela vai em um concurso de sua cidade para tentar adquirir uma bolsa na cidade de São Paulo.\n"
						+ "Finalmente Chega o dia do Concurso para ganhar a bolsa de estudos, todos de suas cidades estão participando mas Ana Clara não se atinge com isso.\n");
		System.out.println(
				"--------------------------------------------------------------------------------------------\n");
		System.out.println("O desafio começou...\n" + "A vida acadêmica de Ana Clara está em suas mãos...\n"
				+ "Acerte o desafio e Ana Clara finalmente iniciará sua jornada.\n");
		System.out.println("O desafio está próximo, se prepare com tudo que tem parar ajudar Ana Clara\n");
		System.out.println("Muitos participantes tentaram e não conseguiram\nAgora é sua vez...\n");
		System.out.println(
				"--------------------------------------------------------------------------------------------\n");
		System.out.println("Abaixo você fará o questionario da bolsa:\n\n");

	}

	static boolean questionario() {

		int i = 0, j = 4;
		int resposta1 = 0, resposta2 = 0, resposta3 = 0;
		boolean acertou = true;

		while (i < 3) {
			System.out.println("Você terá somente " + (j -= 1) + " tentativas para acertar o questionario !!\n");
			System.out.println("Primeira questão: Quanto é 4500/30: ");
			System.out.println("1 = A - 200 ");
			System.out.println("2 = B - 150");
			System.out.println("3 = C - 50");
			System.out.println("4 = D - 30");
			System.out.print("Pense com calma, tudo depende de você: ");
			resposta1 = sc.nextInt();
			System.out.println("");

			switch (resposta1) {
			case 1:
				System.out.println("RESPOSTA INCORRETA\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");

				break;
			case 2:
				System.out.println("RESPOSTA CORRETA");
				System.out.println("Muito bem, agora continue sua jornada.\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");

				break;
			case 3:
				System.out.println("RESPOSTA INCORRETA\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");

				break;
			case 4:
				System.out.println("RESPOSTA INCORRETA\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");

				break;

			default:
				System.out.println("Opção Inválida");
				break;
			}

			System.out.println("Segunda questão: Sabendo que o valor de 5^7 é 78.125, qual o resultado de 5^8? ");
			resposta2 = sc.nextInt();

			if (resposta2 == 390625) {
				System.out.println("Sua resposta está certa\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");

			} else {
				System.out.println("Sua Resposta está errada\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");

			}

			System.out.println("Teceira questão: Resolva a equação do primeiro grau - 8x = 5 + 3 ");
			resposta3 = sc.nextInt();

			if (resposta3 == 1) {
				System.out.println("Sua resposta está certa\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");

			} else {
				System.out.println("Sua Resposta está errada\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");

			}

			if ((resposta1 == 2) && (resposta2 == 390625) && (resposta3 == 1)) {
				System.out
						.println("Parabéns você conseguiu conquistar a bolsa de estudos tão deseja por Ana Clara!!\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");
				break;
			} else {
				if (i < 2) {
					System.out.println("Tente novamente !!\n");
				}
			}

			i++;

		}
		if ((resposta1 == 2) && (resposta2 == 390625) && (resposta3 == 1)) {
			acertou = (resposta1 == 2) && (resposta2 == 390625) && (resposta3 == 1);
		} else {
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("********************GAME OVER********************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************\n\n");
			menu();

		}

		return acertou;
	}

	static void historiaPrimeiroDesafio() {
		System.out.println("Com a conquista da bolsa de estudos, Ana Clara parte para São Paulo atrás de seu sonho.\n");
		System.out.println("Chegando lá ela se depara com uma imensa cidade, como nunca visto antes.\n");
		System.out.println(
				"Isso não a deixa assustada pois sua vontade de ser uma grande matematica é maior que seu medo\n");
		System.out.println(
				"--------------------------------------------------------------------------------------------\n");
		System.out.println("3 MONTH LATER...\n");
		System.out.println(
				"--------------------------------------------------------------------------------------------\n");
		System.out.println("Após um tempo estudando em São Paulo, Ana Clara encontra seu primeiro grande desafio\n");
		System.out.println(
				"Ana Clara precisa fazer sua primeira prova, ela vinha estudando naquele momento os SISTEMAS DE NUMERAÇÕES.\n");
		System.out.println("E AGORA ESTÁ COM VOCÊ A RESPONSABILIDADE DE AJUDA-LÁ A PASSAR NA PROVA!!!!");
		System.out.println(
				"--------------------------------------------------------------------------------------------\n");

	}

	static boolean primeiroDesafio() {

		boolean acertou = true;
		int primeiroDesafio = 0, resposta1Desafio = 0, i = 0, j = 4;

		while (primeiroDesafio < 3) {
			System.out.println("Você terá somente " + (j -= 1) + " tentativas para acertar o questionario !!\n");
			System.out.println("Descubra como é 500(decimal) em Hexadecimal: ");
			System.out.println("1 = A - 190 ");
			System.out.println("2 = B - 12c");
			System.out.println("3 = C - 1f4");
			System.out.println("4 = D - c8");
			System.out.println("Escolha a alternativa com sabedoria: ");
			resposta1Desafio = sc.nextInt();

			switch (resposta1Desafio) {
			case 1:
				System.out.println("RESPOSTA INCORRETA\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");
				break;
			case 2:
				System.out.println("RESPOSTA INCORRETA\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");
				break;
			case 3:
				System.out.println("RESPOSTA CORRETA");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");
				break;
			case 4:
				System.out.println("RESPOSTA INCORRETA\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");
				break;

			default:
				System.out.println("Opção Inválida");
				break;
			}

			if (resposta1Desafio == 3) {
				System.out
						.println("Parabéns você conseguiu realizar a prova com exatidão, Ana Clara pode continuara com sua jornada novamente!!\n");
				System.out.println(
						"--------------------------------------------------------------------------------------------\n");
				break;
			}
			i++;
		}
		if (resposta1Desafio == 3) {
			acertou = resposta1Desafio == 3;
		} else {
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("********************GAME OVER********************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************\n\n");
			menu();

		}

		return acertou;
	}
	
	static void historiaSegundoDesafio() {
		System.out.println("Após seu primeiro desafio concluído, Ana Clara se sente mais segura, podendo agora continuar seus estudos e assim alcançar seu objetivo."
				+ "Mas oque ela não sabe é que seus colegas de classe tinham todos ido muito mal naquela prova, e com isso todos começariam a persegui-la."
				+ "Por ser de familía humilde e simples, em uma escola onde todos eram da alta sociedade, Ana Clara cada vez mais começou a sofrer bullying."
				+ "Depois de uma semana sendo motivo de chacota e zoação, um dos colegas que faziam parte desses que caçoavam dela, finamente desafia ela para um combate onde iriam descobrir quem era"
				+ "o mais inteligente.\n");
		System.out.println("Esse é o momento de Ana Clara provar seu valor, com essa vitória ela poderar conquistar o respeito de seus colegas de classe.\n");
		System.out.println("Vença o desafio para que ela possa continuar sua jornada.");
	}

	static boolean segundoDesafio() {
		System.out.println("(a^3 * b^3 * b^7 * a^6) / (b^3 * a^5)");
		
		return true;
	}
	
	public static void main(String[] args) {

		if (menu() == 1) {
			historia();
		}
		if (questionario() == true) {
			historiaPrimeiroDesafio();
		}
		if (primeiroDesafio() == true) {
			historiaSegundoDesafio();
		}
		
		
		

		sc.close();
	}
}
