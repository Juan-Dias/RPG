import java.util.Random;
import java.util.Scanner;

public class projetoPI {
	static Scanner sc = new Scanner(System.in);

	static int qtdPerguntasDesafio5 = 4;

	static String lerOpcoes() {
		String opcaoLida, opcaoLidaMaiuscula;

		System.out.print("Digite a opção: ");
		opcaoLida = sc.next();
		opcaoLidaMaiuscula = opcaoLida.toUpperCase();
		System.out.println("");

		return opcaoLidaMaiuscula;
	}

	static int[] montagemVetorAleatorio() {
		int[] vetorAleatorio = new int[qtdPerguntasDesafio5];

		int posicao1, posicao2, temp;
		Random rd = new Random();

		for (int i = 0; i < vetorAleatorio.length; i++) {
			vetorAleatorio[i] = i;

		}

		for (int i = 0; i < 4; i++) {
			posicao1 = rd.nextInt(vetorAleatorio.length);
			posicao2 = rd.nextInt(vetorAleatorio.length);

			temp = vetorAleatorio[posicao1];
			vetorAleatorio[posicao1] = vetorAleatorio[posicao2];
			vetorAleatorio[posicao2] = temp;

		}
		return vetorAleatorio;
	}

	static String montagemPergunta(int Pergunta) {

		String retorno = "";

		retorno = retorno + obtemPergunta(Pergunta);
		retorno = retorno + "\n";
		String[] vetOp = obtemOpcao(Pergunta);

		for (int j = 0; j < 5; j++) {
			retorno = retorno + vetOp[j] + "\n";

		}

		return retorno;
	}

	static String obtemPergunta(int Pergunta) {
		String[] vetorPergunta = new String[qtdPerguntasDesafio5];

		vetorPergunta[0] = "A maior raiz da equação – 2x² + 3x + 5 = 0 vale:";
		vetorPergunta[1] = "AS SOLUÇÕES DA EQUAÇÃO 2X2 - 3X + 1 = 0, SÃO:?";
		vetorPergunta[2] = "Qual a resposta da equação 30-20+2x=10?";
		vetorPergunta[3] = "Qual a resposta da equação 10x-20=40+50?";
		vetorPergunta[4] = "EM MANUTENÇÃO";
		vetorPergunta[5] = "EM MANUTENÇÃO";


		return vetorPergunta[Pergunta];
	}

	static String[] obtemOpcao(int Pergunta) {
		String[] vetorOpcoes = new String[5];
		String[][] matrizOpcoes = new String[qtdPerguntasDesafio5][5];

		matrizOpcoes[0][0] = "A - -1";
		matrizOpcoes[0][1] = "B - 1";
		matrizOpcoes[0][2] = "C - 2";
		matrizOpcoes[0][3] = "D - 2,5";
		matrizOpcoes[0][4] = "E - (3 + √19)/4";

		matrizOpcoes[1][0] = "A -  X1 = 2, X2 = 1";
		matrizOpcoes[1][1] = "B - X1 = 16, X2 = 8";
		matrizOpcoes[1][2] = "C - X1 = -1, X2 = - 0,5";
		matrizOpcoes[1][3] = "D - X1 = 0, X2 = 2";
		matrizOpcoes[1][4] = "E - X1 = 1, X2 = 0,5";

		matrizOpcoes[2][0] = "A - 3";
		matrizOpcoes[2][1] = "B - 4";
		matrizOpcoes[2][2] = "C - 8";
		matrizOpcoes[2][3] = "D - 0";
		matrizOpcoes[2][4] = "E - 1";

		matrizOpcoes[3][0] = "A - 12";
		matrizOpcoes[3][1] = "B - 11";
		matrizOpcoes[3][2] = "C - 10";
		matrizOpcoes[3][3] = "D - 9";
		matrizOpcoes[3][4] = "E - 3";
		
		matrizOpcoes[4][0] = "MANUTENCÃO";
		matrizOpcoes[4][1] = "MANUTENCÃO";
		matrizOpcoes[4][2] = "MANUTENCÃO";
		matrizOpcoes[4][3] = "MANUTENCÃO";
		matrizOpcoes[4][4] = "MANUTENCÃO";
		
		matrizOpcoes[5][0] = "MANUTENCÃO";
		matrizOpcoes[5][1] = "MANUTENCÃO";
		matrizOpcoes[5][2] = "MANUTENCÃO";
		matrizOpcoes[5][3] = "MANUTENCÃO";
		matrizOpcoes[5][4] = "MANUTENCÃO";

		for (int i = 0; i < 5; i++) {
			vetorOpcoes[i] = matrizOpcoes[Pergunta][i];
		}

		return vetorOpcoes;
	}

	static String respostaCorreta(int Pergunta) {
		String[] vetorRespostasCorretas = new String[qtdPerguntasDesafio5];
		vetorRespostasCorretas[0] = "D";
		vetorRespostasCorretas[1] = "E";
		vetorRespostasCorretas[2] = "D";
		vetorRespostasCorretas[3] = "B";
		vetorRespostasCorretas[4] = "MANUTENÇÃO";
		vetorRespostasCorretas[5] = "MANUTENÇÃO";

		return vetorRespostasCorretas[Pergunta];
	}

	// Funções desafio 5 - randomizado

	static int menu() {

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(
				"**************************************************************************************************************************");
		System.out.println(
				"*  ____________________________________________________________________________________________________________________  *");
		System.out.println(
				"* |  Projeto criado para a matéria de 'Projeto Integrador I - Professor: Eduardo Takeo.'                               | *");
		System.out.println(
				"* |  O intuito dele é unir todas as materias do curso Tecnologia em Analíse e Desenvolvimento de Sistemas - Periodo I  | *");
		System.out.println(
				"* |  Esse projeto em questão está voltado para a matéria de Matemática.                                                | *");
		System.out.println(
				"* |  Desde já agradecemos pela preferencia e desejamos uma otima expêriencia.                                          | *");
		System.out.println(
				"* |____________________________________________________________________________________________________________________| *");
		System.out.println(
				"*                                                                                                                        *");
		System.out.println(
				"**************************************************************************************************************************\n\n\n");

		int opcaoDigitada = 0;

		while ((opcaoDigitada != 3) && (opcaoDigitada != 1)) { // laço de repetição usado para repetir o menu enquanto
																// não escolher as opções "jogar" e "sair".

			System.out.println("                                         ***********************");
			System.out.println("                                         *  _________________  *");
			System.out.println("                                         * |                 | *");
			System.out.println("                                         * |        | *");
			System.out.println("                                         * |_________________| *");
			System.out.println("                                         *  _________________  *");
			System.out.println("                                         * |                 | *");
			System.out.println("                                         * |      MENU       | *");
			System.out.println("                                         * |                 | *");
			System.out.println("                                         * |  1 - Jogar      | *");
			System.out.println("                                         * |                 | *");
			System.out.println("                                         * |  2 - Creditos   | *");
			System.out.println("                                         * |                 | *");
			System.out.println("                                         * |  3 - Sair       | *");
			System.out.println("                                         * |                 | *");
			System.out.println("                                         * |_________________| *");
			System.out.println("                                         *                     *");
			System.out.println("                                         ***********************\n");
			System.out.print("                                         Digite a opção que deseja: ");
			opcaoDigitada = sc.nextInt();

			System.out.println("\n\n");

			switch (opcaoDigitada) {
			case 1:
				System.out.println("Entrando no jogo...\n\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------\n\n");
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
			if (opcaoDigitada == 3) {
				break;
			}
		}

		return opcaoDigitada;
	}

	static void historia(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(3000);

		System.out.println(
				"Em uma pequena fazenda, no interior de São Paulo vive uma pequena menina chamada Ana Clara. \n");
		Thread.sleep(1500);
		System.out
				.println("De família humilde e simples Ana Clara tem o sonho de se tornar uma matemática, para que \n");
		Thread.sleep(1500);
		System.out.println("assim possa ajudar seus pais administrar sua pequena fazenda. \n");
		Thread.sleep(1500);
		System.out.println(
				"Como seus pais não tem condições de ajuda-la nos estudos, ela vai em um concurso de sua cidade \n");
		Thread.sleep(1500);
		System.out.println("para tentar adquirir uma bolsa na cidade de São Paulo. \n");
		Thread.sleep(1500);
		System.out.println("Finalmente Chega o dia do Concurso para ganhar a bolsa de estudos, \n");
		Thread.sleep(1500);
		System.out.println("todos de suas cidades estão participando mas Ana Clara não se atinge com isso. \n\n\n");
		Thread.sleep(2000);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------- \n\n\n");
		System.out.println("O DESAFIO COMEÇOU... \n\n\n");
		Thread.sleep(2000);
		System.out.println("A vida acadêmica de Ana Clara está em suas mãos... \n");
		Thread.sleep(1500);
		System.out.println("Acerte o desafio e Ana Clara finalmente iniciará sua jornada. \n");
		Thread.sleep(1500);
		System.out.println("O desafio está próximo, se prepare com tudo que tem parar ajudar Ana Clara \n");
		Thread.sleep(1500);
		System.out.println("Muitos participantes tentaram e não conseguiram \n\n");
		Thread.sleep(2000);
		System.out.println("Agora é sua vez...\n\n");
		Thread.sleep(3000);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
		System.out.println("Abaixo você fará o questionario para ganhar bolsa: \n");
		Thread.sleep(2000);
		System.out.println("BOA SORTE, VOCÊ PRECISARÁ!!! \n\n\n\n");
		Thread.sleep(3000);

	}

	static boolean questionario() {

		int j = 4;
		int resposta1 = 0, resposta2 = 0, resposta3 = 0;
		boolean acertou = true, errou = false;

		for (int i = 0; i < 3; i++) {

			System.out.println("Você terá somente " + (j -= 1) + " tentativas para acertar o questionario !! \n\n");
			System.out.println("PRIMEIRA QUESTÃO: QUANTO É 4500/30: ");
			System.out.println("1 = A - 200 ");
			System.out.println("2 = B - 150");
			System.out.println("3 = C - 50");
			System.out.println("4 = D - 30");
			System.out.print("Pense com calma, tudo depende de você: ");
			resposta1 = sc.nextInt();
			System.out.println("\n");

			switch (resposta1) {
			case 1:
				System.out.println("RESPOSTA INCORRETA \n\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------\n");

				break;
			case 2:
				System.out.println("RESPOSTA CORRETA \n\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------\n");

				break;
			case 3:
				System.out.println("RESPOSTA INCORRETA \n\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------\n");

				break;
			case 4:
				System.out.println("RESPOSTA INCORRETA \n\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------\n");

				break;

			default:
				System.out.println("Opção Inválida");
				break;
			}

			System.out.print("SEGUNDA QUESTÃO: SABENDO QUE O VALOR DE 5^7 É 78.125, QUAL O RESULTADO DE 5^8? ");
			resposta2 = sc.nextInt();
			System.out.println("\n");

			if (resposta2 == 390625) {
				System.out.println("RESPOSTA CERTA \n\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------\n");

			} else {
				System.out.println("RESPOSTA INCORRETA \n\n");
				System.out.println(
						"Para resolver essa questão podemos transformar 5^8 em uma multiplicação de potências de bases iguais, pois a^x . a^y = a^x+y\n");
				System.out.println("Como sabemos o valor de 5^7, transformamos o número 5^8 da seguinte forma:\n");
				System.out.println("5^8 = 5^7 . 5, pois 5^7 . 5 = 5^7+1 = 5^8\n");
				System.out.println(
						"Sendo assim, para encontrar o resultado, precisamos apenas substituir o valor de 5^7 e multiplicar por 5.\n");
				System.out.println("5^7 . 5 = 78 125 . 5 = 390 625. \n\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------\n");

			}

			System.out.print("TERCEIRA QUESTÃO: RESOLVA A EQUAÇÃO DE PRIMEIRO GRAU --> 8x = 5 + 3: ");
			resposta3 = sc.nextInt();
			System.out.println("\n");

			if (resposta3 == 1) {
				System.out.println("RESPOSTA CERTA \n\n");
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");

			} else {
				System.out.println("RESPOSTA INCORRETA \n\n");
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");

			}

			if ((resposta1 == 2) && (resposta2 == 390625) && (resposta3 == 1)) {
				System.out.println(
						"Parabéns você conseguiu conquistar a bolsa de estudos tão deseja por Ana Clara!! \n\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------\n\n");
				break;
			} else {
				if (i < 2) {
					System.out.println("Tente novamente !! \n\n");
				}
			}

		}

		if ((resposta1 == 2) && (resposta2 == 390625) && (resposta3 == 1)) {
			return acertou;
		} else {

			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("********************GAME OVER********************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************\n\n");
			return errou;

		}

	}

	static void historiaPrimeiroDesafio(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(3000);

		System.out.println("Com a conquista da bolsa de estudos, Ana Clara parte para São Paulo atrás de seu sonho.\n");
		Thread.sleep(1500);
		System.out.println("Chegando lá ela se depara com uma imensa cidade, como nunca visto antes.\n");
		Thread.sleep(1500);
		System.out.println(
				"Isso não a deixa assustada pois sua vontade de ser uma grande matematica é maior que seu medo \n\n");
		Thread.sleep(3000);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
		System.out.println("3 MONTH LATER... \n\n");
		Thread.sleep(3000);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
		System.out.println("Após um tempo estudando em São Paulo, Ana Clara encontra seu primeiro grande desafio\n");
		Thread.sleep(1500);
		System.out.println(
				"Ana Clara precisa fazer sua primeira prova, ela vinha estudando naquele momento os SISTEMAS DE NUMERAÇÕES.\n");
		Thread.sleep(1500);
		System.out.println("E AGORA ESTÁ COM VOCÊ A RESPONSABILIDADE DE AJUDA-LÁ A PASSAR NA PROVA!!!! \n\n");
		Thread.sleep(3000);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");

	}

	static boolean primeiroDesafio() {

		boolean acertou = true, errou = false;
		int resposta1Desafio = 0, j = 4;

		for (int i = 0; i < 3; i++) {

			System.out.println("Você terá somente " + (j -= 1) + " tentativas para acertar o desafio !! \n\n");
			System.out.println("Descubra como é 500(decimal) em Hexadecimal: ");
			System.out.println("1 = A - 190 ");
			System.out.println("2 = B - 12c");
			System.out.println("3 = C - 1f4");
			System.out.println("4 = D - c8");
			System.out.print("Escolha a alternativa com sabedoria: ");
			resposta1Desafio = sc.nextInt();
			System.out.println("\n");

			switch (resposta1Desafio) {
			case 1:
				System.out.println("RESPOSTA INCORRETA \n\n");
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
				break;
			case 2:
				System.out.println("RESPOSTA INCORRETA \n\n");
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
				break;
			case 3:
				System.out.println("RESPOSTA CORRETA \n\n");
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
				break;
			case 4:
				System.out.println("RESPOSTA INCORRETA \n\n");
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
				break;

			default:
				System.out.println("Opção Inválida");
				break;
			}

			if (resposta1Desafio == 3) {
				System.out.println(
						"Parabéns você conseguiu realizar a prova com exatidão, Ana Clara pode continuara com sua jornada novamente!! \n\n");
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
				break;
			}

		}

		if (resposta1Desafio == 3) {
			return acertou;
		} else {
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("********************GAME OVER********************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************\n\n");
			return errou;

		}

	}

	static void historiaSegundoDesafio(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(3000);

		System.out.println(
				"Após seu primeiro desafio concluído, Ana Clara se sente mais segura, podendo agora continuar seus estudos e assim alcançar seu objetivo. \n");
		Thread.sleep(1500);
		System.out.println(
				"Mas oque ela não sabe é que seus colegas de classe tinham todos ido muito mal naquela prova, e com isso todos começariam a persegui-la. \n");
		Thread.sleep(1500);
		System.out.println(
				"Por ser de familía humilde e simples, em uma escola onde todos eram da alta sociedade, Ana Clara cada vez mais começou a sofrer bullying. \n");
		Thread.sleep(1500);
		System.out.println(
				"Depois de uma semana sendo motivo de chacota e zoação, um dos colegas que faziam parte desses que caçoavam dela, \n");
		Thread.sleep(1500);
		System.out
				.println("finamente desafia ela para um combate onde iriam descobrir quem era o mais inteligente. \n");
		Thread.sleep(1500);
		System.out.println(
				"Esse é o momento de Ana Clara provar seu valor, com essa vitória ela poderar conquistar o respeito de seus colegas de classe. \n");
		Thread.sleep(1500);
		System.out.println("Vença o desafio para que ela possa continuar sua jornada. \n");
		Thread.sleep(3000);
	}

	static boolean segundoDesafio() {
		int resposta;
		boolean acertou = true, errou = false;

		System.out.println("\n");
		System.out.println(
				"---------------------------------------------------------ATENÇÃO--------------------------------------------------------------------------- \n\n");
		System.out.println("O desafio faz parte da materia de PROPRIEDADES DE POTENCIAÇÃO, esteja bem preparado! \n\n");
		System.out.println("Qual a resposta da potenciação abaixo:\n");
		System.out.println("(a^3 * b^3 * b^7 * a^6) / (b^3 * a^5)\n");
		System.out.println("1 - A: a^4*b^7");
		System.out.println("2 - B: b^8*a^2");
		System.out.println("3 - C: a^7*b^4\n");
		System.out.print("Digite a resposta: ");
		resposta = sc.nextInt();
		System.out.println("\n");

		switch (resposta) {
		case 1:
			System.out.println("RESPOSTA CORRETA \n");
			System.out.println("Muito bem, agora continue sua jornada.\n\n");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");

			break;
		case 2:
			System.out.println("RESPOSTA INCORRETA \n\n");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");

			break;
		case 3:
			System.out.println("RESPOSTA INCORRETA \n\n");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");

			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}

		if (resposta == 1) {
			return acertou;
		} else {
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("********************GAME OVER********************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************\n\n");
			return errou;
		}

	}

	static void historiaTerceiroDesafio(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(3000);

		System.out.println(
				"Após provar o seu valor para seus colegas de classe, Ana Clara finalmente tem o respeito deles, \n");
		Thread.sleep(1500);
		System.out.println("e agora ela conseguirá se enturmar, Que antes uma menina sozinha e excluída. \n");
		Thread.sleep(1500);
		System.out.println(
				"Depois que todos viram o quão inteligente Ana Clara era, rapidamente todos começaram a ir até ela pedindo ajuda, \n");
		Thread.sleep(1500);
		System.out.println(
				"em seus exercicíos, em suas provas e atividades, aos pouco ela ficava popular em sua sala de aula. \n\n");
		Thread.sleep(2000);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
		System.out.println("Depois de um semestre conturbado, a tão esperada férias chega.\n");
		Thread.sleep(1500);
		System.out.println("E Ana Clara volta para seu lar para reencontrar seus pais, e falar como tinha sido\n");
		Thread.sleep(1500);
		System.out.println("aquela experiência de morar fora e estudar a matéria que era sua paixão. \n");
		Thread.sleep(1500);
		System.out.println("Chegando em casa, todos a esperam com uma imensa saudade,\n");
		Thread.sleep(1500);
		System.out.println("Ana Clara se emociona em ver seus pais depois de tanto tempo distante.\n");
		Thread.sleep(1500);
		System.out.println("Após as saudações, ela explica como tinha sido difícil viver aqueles dias de solidão\n");
		Thread.sleep(1500);
		System.out.println("e tormentos de seus colegas de classe, mas ela fala que após um deles\n");
		Thread.sleep(1500);
		System.out.println("desafiar ela. Ela pode provar seu valor e ganhar o respeito de todos que zoavam ela.\n");
		Thread.sleep(1500);
		System.out.println(
				"E que depois daquilo se tornou mais facíl o convivio em sala e os estudos ficaram agradaveis novamente.\n");
		Thread.sleep(1500);
		System.out.println(
				"No dia seguinte, Ana acordou mais cedo do que o acostumado, ela foi bem cedo para a fazenda de seus pais.\n");
		Thread.sleep(1500);
		System.out.println("Para ver como que eles estavam indo sem \n");
		Thread.sleep(1500);
		System.out.println(
				"a ajuda dela, chegado lá ela percebeu que tudo estava um caos. O estoque de comida estava tudo errado,\n");
		Thread.sleep(1500);
		System.out.println("seus pais não estavam sabendo racionalizar de forma\n");
		Thread.sleep(1500);
		System.out.println("padronizada, então alguns animais teriam mais comidas que os outros. \n\n");
		Thread.sleep(3000);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
		System.out.println("Ajude a Ana Clara a dividir certo a comida dos animais. \n\n");
		Thread.sleep(2000);
		System.out.println(
				"---------------------------------------------------------ATENÇÃO--------------------------------------------------------------------------- \n\n");
		System.out.println("O desafio pede que você saiba divisão, esteja bem preparado \n\n");
		Thread.sleep(2000);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
		System.out.println("Os alimentos precisam ser dividos de forma certa: \n\n");
		Thread.sleep(3000);

	}

	static boolean terceiroDesafio() {
		int resposta;
		boolean acertou = true, errou = false;

		System.out.println(
				"Tem 3 sacos de 100kg de ração para patos, que tambem pode ser usado para alimentar as galinhas.");
		System.out.println("Os patos comem em média 2kg de ração por dia, ao todo são 4 patos.");
		System.out.println("As galinhas comem em média 1kg de ração por dia, ao todo são 10 galinhas.");
		System.out.println("Divida o tanto de ração para os patos e as galinhas para sete dias? ");
		System.out.println("E quanto irá sobrar para a semana seguinte? \n");
		System.out.println("1 - A: 80kg patos - 35kg galinhas - sobra 185 kg para a semana seguinte.");
		System.out.println("2 - B: 56kg patos - 70kg galinhas - sobra 174 kg para a semana seguinte.");
		System.out.println("3 - C: 40kg patos - 50kg galinhas - sobra 210 kg para a semana seguinte.");
		System.out.print("Digite a resposta: ");
		resposta = sc.nextInt();
		System.out.println("\n");

		switch (resposta) {
		case 1:
			System.out.println("RESPOSTA INCORRETA \n\n");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
			break;
		case 2:
			System.out.println("RESPOSTA CORRETA\n");
			System.out.println("Muito bem, agora continue sua jornada. \n\n");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
			break;
		case 3:
			System.out.println("RESPOSTA INCORRETA \n\n");
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");

			break;

		default:
			System.out.println("Opção Inválida");
			break;
		}

		if (resposta == 2) {
			return acertou;
		} else {
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("********************GAME OVER********************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************\n\n");
			return errou;
		}

	}

	static void historiaQuartoDesafio(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(3000);

		System.out.println(
				"Depois de uma temporada em casa com sua família, Ana Clara finalmente volta para a São Paulo e retorna aos estudos.\n");
		Thread.sleep(1500);
		System.out.println(
				"Esse tempo com seus pais à deixou muito motivada a continuar com seu sonho, sem  perder o foco.\n");
		Thread.sleep(1500);
		System.out.println(
				"Com o passar do tempo os desafios na faculdade eram cada vez mais difícies, fazendo com que ela ficasse mais tensa com os estudos.\n");
		Thread.sleep(1500);
		System.out.println("E o seu próximo desafio faria jus ao que ela estava passando naquele momento !!!\n");
		Thread.sleep(1500);
		System.out.println("Durante uma aula normal, onde o professor explicava sobre Equação do Segundo Grau,\n");
		Thread.sleep(1500);
		System.out
				.println("a coordenadora entra na sala interrompendo o professor com um enunciado muito importante.\n");
		Thread.sleep(1500);
		System.out.println(
				"Haveria um teste supresa naquele momento tão aleatório, onde ninguém espera e muito menos sabia sobre oque seria.\n");
		Thread.sleep(3000);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
	}

	static boolean quartoDesafio(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		int resposta;
		boolean acertou = true, errou = false;

		System.out.println("Acerte todas perguntas para continuar a jornada.\n\n");
		Thread.sleep(1500);
		System.out.println(
				"---------------------------------------------------------ATENÇÃO--------------------------------------------------------------------------- \n\n");
		System.out.println("Caso não consiga acertar, o jogo irá ser reiniciado. \n\n");
		Thread.sleep(1500);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
		System.out.println("PRIMEIRA QUESTÃO:\n");
		System.out.println("Em um sítio há 12 árvores. Cada árvore possui 12 galhos e em cada galho tem 12 maçãs.");
		System.out.println("Quantas maçãs existem no sítio?");
		System.out.println("");

		System.out.print("Digite a resposta: ");
		resposta = sc.nextInt();
		System.out.println("\n");

		if (resposta == 1728) {
			System.out.println("RESPOSTA CERTA \n\n");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------\n");

		} else {
			System.out.println("RESPOSTA INCORRETA \n\n");
			Thread.sleep(1500);
			System.out.println(
					"Em cada um dos 12 galhos de uma árvore encontram-se 12 maçãs, ou seja, 12 galhos vezes 12 maças: 12 x 12 = 144.\n");
			System.out.println("Só que no total temos 12 árvores, ou seja, 144 x 12 nos dá o número total de maçãs.\n");
			System.out.println("Isso pode ser expresso na forma de potência.\n");
			System.out.println("12 x 12 x 12 = 123 = 1 728.\n");
			System.out.println("Portanto, o sítio apresenta 1 728 maçãs.\n");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------\n");
			Thread.sleep(1500);
		}

		System.out.println("SEGUNDA QUESTÃO:\n");
		System.out.println(
				"Dado as potências (-2)^4 e -2^4, você deve responder se as potências são 'iguais' ou 'diferentes':");
		System.out.println("*Colocar a resposta igual ao enunciado*");
		String resposta1_2Q = sc.next();
		System.out.println("E qual o resultado das duas potencias:");
		System.out.println("Resposta Potencia 1:");
		int resposta2_2Q_P1 = sc.nextInt();
		System.out.println("Resposta Potencia 2: ");
		int resposta2_2Q_P2 = sc.nextInt();

		System.out.println("\n");

		if ((resposta2_2Q_P1 == 16) && (resposta2_2Q_P2 == -16)) {
			System.out.println("RESPOSTA CERTA \n\n");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------\n");
		} else {
			System.out.println("RESPOSTA INCORRETA \n\n");
			Thread.sleep(1500);
			System.out.println("As potências são diferentes e apresentam como resultados 16 e -16, respectivamente.\n");
			System.out.println(
					"Quando a base de uma potência é um número negativo e está elevada a um expoente par, o resultado será positivo.\n");
			System.out.println(
					"Entretanto, para sinalizar que a base é negativa seu valor deve estar entre parênteses.\n");
			System.out.println("(- 2)^4 = (- 2) x (- 2) x (- 2) x (- 2) = +16\n");
			System.out.println(
					"Quando não há parênteses separando a base, deve-se incluir o sinal de negativo no resultado. -2^4 = - 16");
			System.out.println("Portanto, os resultados são: (- 2)^4 = 16 e - 24 = - 16.");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------\n");
			Thread.sleep(1500);
		}

		System.out.println("TERCEIRA QUESTÃO:\n");
		System.out.println("Transforme os números 58 e 98, em numero octais.");
		System.out.println("58:");
		int resposta1_3Q = sc.nextInt();
		System.out.println("98:");
		int resposta2_3Q = sc.nextInt();

		System.out.println("\n");

		if ((resposta1_3Q == 72) && (resposta2_3Q == 142)) {
			System.out.println("RESPOSTA CERTA \n\n");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------\n");
		} else {
			System.out.println("RESPOSTA INCORRETA \n\n");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------\n");
		}

		System.out.println("QUARTA QUESTÃO:\n");
		System.out.println("Transforme os números 450 e 1689, em numero binarios.");
		System.out.println("450:");
		int resposta1_4Q = sc.nextInt();
		System.out.println("983:");
		int resposta2_4Q = sc.nextInt();

		System.out.println("\n");

		if ((resposta1_4Q == 111000010) && (resposta2_4Q == 1111010111)) {
			System.out.println("RESPOSTA CERTA \n\n");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------\n");
		} else {
			System.out.println("RESPOSTA INCORRETA \n\n");
			System.out.println(
					"-------------------------------------------------------------------------------------------------------------------------------------------\n");
		}

		if ((resposta == 1728) && (resposta2_2Q_P1 == 16) && (resposta2_2Q_P2 == (-16)) && (resposta1_3Q == 72)
				&& (resposta2_3Q == 142 && (resposta1_4Q == 111000010) && (resposta2_4Q == 1111010111))) {
			return acertou;
		} else {
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("********************GAME OVER********************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************\n\n");
			return errou;
		}

	}

	static void historiaQuintoDesafio(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(3000);

		System.out.println(
				"Ao ir bem em seu teste surpresa, Ana Clara não se serpreende mais com nada que possa vir pela frente.\n");
		Thread.sleep(1500);
		System.out.println("Mas a saudade de sua casa e sua familía e amigos se tornam seus piores inimigos.\n");
		Thread.sleep(1500);
		System.out.println("Em São Paulo, Ana tinha poucos amigos e quase nunca saía da casa em que vivia,\n");
		Thread.sleep(1500);
		System.out.println(
				"isso era um grande influenciador para que ela desistisse de seu sonho de se tornar uma grande matemática.\n");
		Thread.sleep(1500);
		System.out.println(
				"E isso acaba tendo um grande efeito sobre seus estudos, que é algo que ela não poderia naquele momento,\n");
		Thread.sleep(1500);
		System.out.println(
				"ela se encontrava na reta final. Não poderia perder tudo aquilo que ela já tinha conquistado.\n");
		Thread.sleep(1500);
		System.out.println("Com tudo isso, acaba surgindo mais um desafio que a deixa muito preocupada,\n");
		Thread.sleep(1500);
		System.out.println("pois com todo esse acontecimento ela acaba não conseguindo estudar o suficiente.\n");
		Thread.sleep(1500);
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------- \n\n");
	}

	static boolean quintoDesafio() {
		System.out.println("Utilize todo o conhecimento adquirido até agora para realizar este desafio.");
		int resposta = 0;
		boolean acertou = true, errou = false;

		int[] vetorAleatoario;
		String opcao, opcaoCorreta;

		vetorAleatoario = montagemVetorAleatorio();

		for (int i = 0; i < vetorAleatoario.length; i++) {

			System.out.println((i + 1) + ") " + montagemPergunta(vetorAleatoario[i]));
			opcao = lerOpcoes();
			opcaoCorreta = respostaCorreta(vetorAleatoario[i]);

			if (opcao.equals(opcaoCorreta)) {
				resposta = 0;
				System.out.println("RESPOSTA CERTA \n\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------\n");
			} else {
				resposta = 1;
				System.out.println("RESPOSTA INCORRETA \n\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------\n");

			}
		}

		if (resposta == 0) {

			return acertou;
		} else {
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("********************GAME OVER********************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************\n\n");
			return errou;
		}

	}

	static void historiaSextoDesafio(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(3000);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Parabéns por ter chegado até aqui !!");
		Thread.sleep(1500);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Foi um ano difícil e complicado para Ana Clara./n");
		Thread.sleep(1500);
		System.out.println("Mais isso ainda não acabou, o verdadeiro desafio ainda está por vir./n");
		Thread.sleep(1500);
		System.out.println("Depois de muitos momento de tristezas e alegrias em sua história, Ana Clara se tornou cada vez mais forte./n");
		Thread.sleep(1500);
		System.out.println("E a cada desafio seu sonho em se tornar uma matemática aumenta, junto com sua capacidade de ser melhor./n");
		Thread.sleep(1500);
		System.out.println("Não desisitir no primeiro obstáculo ou na primeira difículade, foi muito importante para o crescimento de Ana./n");
		Thread.sleep(1500);
		System.out.println("A cada desafio, a cada momento ela foi se superando e se aperfeiçoando para chegar até aqui./n");
		Thread.sleep(1500);
		System.out.println("Chegou o momento do ultímo desafio, para saber se realmente Ana vai conseguir passar no seu primeiro ano de faculdade./n");
		Thread.sleep(1500);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("O ultímo desafio te espera !!/n");
		Thread.sleep(1500);
		System.out.println("Calma e traquilidade serão essenciais para esse momento/n");
		Thread.sleep(1500);
		System.out.println("A vida academíca de Ana está em suas mãos./n");
		Thread.sleep(1500);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------\n");
	}
	static boolean sextoDesafio() {
		System.out.println("Utilize todo o conhecimento adquirido até agora para realizar este desafio.");
		int resposta = 0;
		boolean acertou = true, errou = false;

		int[] vetorAleatoario;
		String opcao, opcaoCorreta;

		vetorAleatoario = montagemVetorAleatorio();

		for (int i = 0; i < vetorAleatoario.length; i++) {

			System.out.println((i + 1) + ") " + montagemPergunta(vetorAleatoario[i]));
			opcao = lerOpcoes();
			opcaoCorreta = respostaCorreta(vetorAleatoario[i]);

			if (opcao.equals(opcaoCorreta)) {
				resposta = 0;
				System.out.println("RESPOSTA CERTA \n\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------\n");
			} else {
				resposta = 1;
				System.out.println("RESPOSTA INCORRETA \n\n");
				System.out.println(
						"-------------------------------------------------------------------------------------------------------------------------------------------\n");

			}
		}

		if (resposta == 0) {

			return acertou;
		} else {
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("********************GAME OVER********************");
			System.out.println("*************************************************");
			System.out.println("*************************************************");
			System.out.println("*************************************************\n\n");
			return errou;
		}

	}

	static void consideracoesFinais(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		Thread.sleep(3000);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------\n");
		System.out.println("Nós do grupo 7, gostariamos de agradecer e parabenizar aqueles que conseguiram finalizar nosso jogo.");
		Thread.sleep(1500);
		System.out.println("Tinhamos como objetivo tentar mostrar ao maxímo como é a real vida de um universitário.");
		Thread.sleep(1500);
		System.out.println("Mostrar os problemas e dificuldades que podem vir a acontecer na vida do personagem, mas espelhando a nossa.");
		Thread.sleep(1500);
		System.out.println("Esperamos ter atingindo as expectativas do professor e cumprir com oque havimos promedito.");
		Thread.sleep(1500);
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------\n");
	}
	public static void main(String[] args) throws InterruptedException {

		if (menu() == 1) {

			historia(args);

			if (questionario() == true) {

				historiaPrimeiroDesafio(args);
				if (primeiroDesafio() == true) {
					historiaSegundoDesafio(args);
					if (segundoDesafio() == true) {
						historiaTerceiroDesafio(args);
						if (terceiroDesafio() == true) {
							historiaQuartoDesafio(args);
							if (quartoDesafio(args) == true) {
								historiaQuintoDesafio(args);
								if (quintoDesafio() == true) {
									historiaSextoDesafio(args);
									if(sextoDesafio() == true) {
										consideracoesFinais(args);
									}
								} else {

								}

							} else {

							}

						} else {

						}

					} else {

					}

				} else {

				}

			} else {

			} 
				
		} else {
			System.out.println("***JOGO FINALIZADO***");
		}

		sc.close();
	}
}
