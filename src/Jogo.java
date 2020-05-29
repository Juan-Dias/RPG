import java.util.Scanner;

		class jogo {

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.printf("Projeto criado para a matéria de 'Projeto Integrador I - Professor: Eduardo Takeo.'\nO intuito dele é unir todas as materias do curso Tecnologia em Analíse e Desenvolvimento de Sistemas - Periodo I \nEsse projeto em questão está voltado para a matéria de Matemática.\nDesde já agradecemos pela preferencia e desejamos uma otima expêriencia.\n\n\n");
				int retornoMenu = menu();
				if (retornoMenu == 1) {
					historiaInicial();
				}
				Desafios();
				
				sc.close();
			}

			static int menu() { // função criada para armazenar o menu principal do jogo.
				Scanner sc = new Scanner(System.in);

				int opcaoDigitada = 0;

				while ((opcaoDigitada != 4) && (opcaoDigitada != 1)) { // laço de repetição usado para repetir o menu enquanto
																		// não escolher as opções "jogar" e "sair".
				
					System.out.println("********MENU*********");
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
					System.out.printf("Desenvolvedores: Brenno Costa Messias, Deivid Cordeiro Gomes, Juan Gonçalves Dias.");
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

			static void historiaInicial() {
				System.out.println("Em uma pequena fazenda, no interior de São Paulo vive uma pequena menina chamada Ana Clara."
						+ "De família humilde e simples Ana Clara tem o sonho de se tornar uma matemática, para que assim possa ajudar seus pais\n"
						+ "a administração sua pequena fazenda."
						+ "Como seus pais não tem condições de ajuda-la nos estudos, ela vai em um concurso de sua cidade para tentar adquirir uma bolsa na cidade de São Paulo.");
				System.out.println("Finalmente Chega o dia do Concurso para ganhar a bolsa de estudos, todos de suas cidades estão participando."
						+ "mas Ana Clara não se atinge com isso.");
				System.out.println("O desafio começou...");
				System.out.println("A vida acadêmica de Ana Clara está em suas mãos"
						+ "Acerte o desafio e Ana Clara finalmente iniciará sua jornada.");
				
			}
			
			static int desafio1() {
				Scanner sc = new Scanner(System.in);
				int i = 0, resposta1 = 0;
				
				
				System.out.println("O desafio está próximo, se prepare com tudo que tem parar ajudar Ana Clara");
				System.out.println("Muitos participantes tentaram e não conseguiram."
						+ "Agora é sua vez");
				
				
				while(i < 3) {
				System.out.println("Primeira questão: Quanto é 4500/30: ");
				System.out.println("1 = A - 200 ");
				System.out.println("2 = B - 150");
				System.out.println("3 = C - 50");
				System.out.println("4 = D - 30");
				System.out.println("Você terá somente 3 tentativas para acertar a pergunta !!");
				System.out.println("Pense com calma, tudo depende de você: ");
				resposta1 = sc.nextInt();
				
				
					switch(resposta1) {
					case 1:
					System.out.println("RESPOSTA INCORRETA");
					break;
					case 2:
					System.out.println("RESPOSTA CORRETA");
					System.out.println("Muito bem, agora continue sua jornada.");
					break;
					case 3:
					System.out.println("RESPOSTA INCORRETA");
					break;
					case 4:
					System.out.println("RESPOSTA INCORRETA");
					break;
					
					default:
						System.out.println("Opção Inválida");
						break;
					}
				
					
				
				i++;
				}
				if(resposta1 != 2) {
					System.out.println("Suas tentativas acabaram.");
					System.out.println("Tenta novamente !!");
					
			
				}
				

				sc.close();
				
				return resposta1;
				}
			
			static int resposta2() {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Segunda questão: Sabendo que o valor de 57 é 78 125, qual o resultado de 58? ");
				int resposta2 = sc.nextInt();
				
				if(resposta2 ==  390625) {
					System.out.println("Sua resposta está certa");
					
				}
				else {
					System.out.println("Sua Resposta está errada");
				}
				
			
			return resposta2;
			}
			
			static int resposta3() {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Teceira questão: Resolva a equação do primeiro grau - 8x = 5 + 3 ");
				int resposta3 = sc.nextInt();
				
				if(resposta3 ==  1) {
					System.out.println("Sua resposta está certa");
					
				}
				else {
					System.out.println("Sua Resposta está errada");
				}
				
			
			return resposta3;
			}
			
		
			static int desafio2() { // Função criada para o segundo desafio do personagem.
				Scanner sc = new Scanner(System.in);
				int i = 0, questoes = 0;
				
				while(i < 3) {
				System.out.println("Descubra como é 500 em Hexadecimal: ");
				System.out.println("1 = A - 190 ");
				System.out.println("2 = B - 12c");
				System.out.println("3 = C - 1f4");
				System.out.println("4 = D - c8");
				System.out.println("Você terá somente 3 tentativas para acertar a pergunta !!");
				System.out.println("Escolha a alternativa com sabedoria: ");
				questoes = sc.nextInt();
				
				
					switch(questoes) {
					case 1:
					System.out.println("RESPOSTA INCORRETA");
					break;
					case 2:
					System.out.println("RESPOSTA INCORRETA");
					break;
					case 3:
					System.out.println("RESPOSTA CORRETA");
					System.out.println("Muito bem, agora continue sua jornada.");
					break;
					case 4:
					System.out.println("RESPOSTA INCORRETA");
					break;
					
					default:
						System.out.println("Opção Inválida");
						break;
					}
				
				i++;
				}
				if(questoes != 3) {
					System.out.println("Suas tentativas acabaram.");
					System.out.println("Tenta novamente !!");
					
				}
		
				sc.close();
				
				return questoes;
				}	
			
			}
		
