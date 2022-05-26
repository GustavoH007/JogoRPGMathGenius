package JogoRPGMathGenius;

import java.util.Scanner;

public class JogoRPGMathGenius {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int opcao;
		
		do {
		    
			System.out.println("*--Menu RPG Math Genius--*\n");
			
			System.out.println("1 - Instruções");
		
		    System.out.println("2 - Jogar");
		
		    System.out.println("3 - Créditos");
		
		    System.out.println("4 - Sair");
		
		    System.out.print("Escolha uma opção: ");
		
		opcao = entrada.nextInt();
		
		switch (opcao) {
		
		case 1:
		
			System.out.println("Você escolheu a opção Instruções");
			System.out.println("\n*--Instruções--*");
			System.out.println("\n*--Bem-vindo ao jogo RPG textual Math Genius--*");
			System.out.println("\nNosso jogo tem como personagem você mesmo");
			System.out.println("Um estudante que foi desafiado pelo diretor geral de sua faculdade com uma competição de perguntas e respostas, onde o objetivo é conseguir uma bolsa para estudar\nprogramação em uma enorme empresa nos Estados Unidos.");
			System.out.println("Ao ser desafiado pelo diretor geral, ele volta no tempo para passar por toda a história da matemática.");
			System.out.println("Cada etapa do desafio passará em uma época onde foi fundado a matéria, sendo assim, ele será desafiado pelos maiores gênios da matemática em sua época.\nExemplo: Arquimedes na Grécia Antiga, Bháskara na Índia e etc.");
			System.out.println("\n*--Regras do da competição--*\n");
			System.out.println("A competição é simples: caso alcance X pontos acumulados, você é o vencedor!");
			System.out.println("Serão 3 níveis: Fácil, Médio e Difícil.");
			System.out.println("Serão 6 etapas com 3 perguntas em cada uma.");
			System.out.println("No modo fácil: O objetivo é alcançar 200 pontos. Cada pergunta, se acertar de primeira, valerá 20 pontos. Se acertar na segunda tentativa, 15 pontos.");
			System.out.println("No modo médio: O objetivo é alcançar 250 pontos. Cada pergunta se acertar de primeira, valerá 20 pontos. Se acertar na segunda tentativa, 15 pontos.");
			System.out.println("No modo difícil: O objetivo é alcançar 300 pontos. Cada pergunta se acertar de primeira, valerá 20 pontos. Se acertar na segunda tentativa, 15 pontos.");
			System.out.println("\n*--Dicas--*\n");
			System.out.println("Em todos casos, errando a pergunta nas duas tentativas, será zerado.");
			System.out.println("Lembrando que com a escolha do nível, também impactará na dificuldade das perguntas.");
			System.out.println("Antes de cada etapa, o jogo mostrará um breve resumo sobre a matéria, é importante ler com atenção para ajudar nas respostas");			
		    System.out.println("\nBoa sorte no jogo !!!\n");
		
					
		break;
		
		case 2:
			
			System.out.println("Você escolheu a opção Jogar");
			
			boolean acertou = false;
			
			int tentativas = 0; // quantidades de tentativas questão
			int pontos = 0; // quantidades de pontos por questão
			String alternativa;
			
			//1ª pergunta
			do {
			System.out.println("Potenciação (Grécia Antiga): (250a.c) Seja bem vindo a Grécia Antiga! Você está em 250a.c, onde multiplicar os números ainda é uma incógnita!\r\n"
					+ "A humanidade demorou milhares de anos para chegar a contagem simples até os cálculos de potenciação. Uma importante etapa desse percurso foi desenvolvida\r\n"
					+ "por Arquimedes, na Grécia Antiga. Esse matemático viveu no século 3 a.c e fez importantes contribuições tanto no desenvolvimento teórico, quanto na prática. \r\n"
					+ "Em suas especulações, Arquimedes resolveu calcular quantos grãos de areia eram necessários para encher o Universo. Essa questão parecia fundamental a Arquimedes. Em sua época,\r\n"
					+ "o Universo era considerado um sistema de esferas com o mesmo centro: o Sol. Os planetas estavam fixados na superfície de cada esfera.\r\n"
					+ "Potenciação é a operação que envolve a multiplicação sucessiva de um número por ele mesmo. A potenciação é uma operação da Matemática utilizada quando existe a multiplicação \r\n"
					+ "sucessiva de um número por ele mesmo várias vezes.\r\n"
					);
			System.out.println("*--Potenciação--**");
			System.out.println("Pergunta 1: (3^6 . 3^-2 ) / 3^4 é igual a ?");
			System.out.println("a) 0"); 
			System.out.println("b) 1"); //resposta correta
			System.out.println("c) 3^-3");
			System.out.println("d) 3^-8");
			
			System.out.print("Escolha uma alternativa: ");
			alternativa = entrada.next();
			
			switch (alternativa) {
			case "b":
			case "B":
			System.out.println("Resposta correta!");
			acertou = true;
			tentativas = tentativas + 1;
			break;
			case "a":
			case "A":
			case "c":
			case "C":
			case "d":
			case "D":
			
			System.out.println("Resposta incorreta!");
			tentativas = tentativas + 1;
			break;
			
			default:
			System.out.println("Escolha inválida!");
			
			}
			} while (!acertou && tentativas < 2);
			if (acertou && tentativas == 1) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
			pontos = pontos + 20;
			} else if (acertou && tentativas == 2) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
			pontos = pontos + 15;
			} else {
				System.out.println("Você errou e acumulou 0 pontos");
			}
			
			//2ª pergunta
			tentativas = 0; 
			acertou = false;
			
			do {
				System.out.println("Pergunta 2: Qual dessas afirmações está correta?");
				System.out.println("a) (x . y)^4 = x^4 . y^4"); //resposta correta
				System.out.println("b) (x + y)^4 = x^4 + y^4");
				System.out.println("c) (x - y)^4 = x^4 - y^4");
				System.out.println("d) (x + y)^1 = 1");
				
				System.out.print("Escolha uma alternativa: ");
				alternativa = entrada.next();
				
				switch (alternativa) {
				case "a":
				case "A":
				System.out.println("Resposta correta!");
				acertou = true;
				tentativas = tentativas + 1;
				
				break;
				case "b":
				case "B":
				case "c":
				case "C":
				case "d":
				case "D":
				System.out.println("Resposta incorreta!");
				tentativas = tentativas + 1;
				break;
				
				default:
				System.out.println("Escolha inválida!");

				
				}
			} while (!acertou && tentativas < 2);
			if (acertou && tentativas == 1) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
			pontos = pontos + 20;
			} else if (acertou && tentativas == 2) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
			pontos = pontos + 15;
			} else {
					System.out.println("Você errou e acumulou 0 pontos");
			}
		
		//3ª pergunta
		tentativas = 0; 
		acertou = false;
        do {
            System.out.println("Pergunta 3: Sabendo que x igual a 20^100 e y igual a 400^50, pode-se afirmar que:");
            System.out.println("a) x é igual a y"); // resposta correta
            System.out.println("b) x é a metade de y");
            System.out.println("c) x é o dobro de y");
            System.out.println("d) x é igual ao quadrado de y");
            
            System.out.print("Escolha uma alternativa: ");
            alternativa = entrada.next();

            switch (alternativa) {
            case "a":
            case "A":
            System.out.println("Resposta correta!");
            acertou = true;
            tentativas = tentativas + 1;
            break;
            case "b":
            case "B":
            case "c":
            case "C":
            case "d":
            case "D":
            System.out.println("Resposta incorreta!");
            tentativas = tentativas + 1;
            break;

            default:
            System.out.println("Escolha inválida!");

            }
            } while (!acertou && tentativas < 2);
        if (acertou && tentativas == 1) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
			pontos = pontos + 20;
			} else if (acertou && tentativas == 2) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
			pontos = pontos + 15;
			} else {
				System.out.println("Você errou e acumulou 0 pontos");
			}
        //4ª pergunta
        tentativas = 0; 
		acertou = false;
        do {
        	System.out.println("Seja bem vindo ao mundo Arabe! Você está no início dos anos 1400! O inverso da potenciação ainda é um mistério!\r\n"
        			+ "O conceito foi criado por matemáticos árabes. Eles imaginavam um número, por exemplo 25, e diziam que ele havia crescido de uma \"raiz quadrada\" com área igual a 25. \r\n"
        			+ "Era preciso, então, \"extrair a raiz\" e perceber que cada lado do quadrado media 5. A ideia foi adotada por matemáticos europeus no fim da Idade Média. \r\n"
        			+ "Ao traduzir livros árabes, eles encontraram o conceito e passaram a aplicá-lo. Para simbolizar a raiz, os europeus optaram pela letra \"r\" minúscula, por ser a primeira letra da palavra radix - que significa \"raiz\" em latim.\r\n"
        			+ "A radiciação é a operação matemática inversa da potenciação. Desta forma, podemos encontrar o resultado de uma raiz buscando a potenciação, que tem como resultado a raiz \r\n"
        			+ "proposta. Note que se o radicando (x) é um número real e o índice (n) da raiz é um número natural, o resultado (a) é a raiz enésima de x se an = x.\r\n"
        			);
            System.out.println("*--Radiciação--*");
        	System.out.println("Pergunta 4: Dos números abaixo, marque aquele que possui uma raiz quadrada exata.");
            System.out.println("a) 600"); 
            System.out.println("b) 215");
            System.out.println("c) 144"); //resposta correta
            System.out.println("d) 110");
            
            System.out.print("Escolha uma alternativa: ");
            alternativa = entrada.next();

            switch (alternativa) {
            case "c":
            case "C":
            System.out.println("Resposta correta!");
            acertou = true;
            tentativas = tentativas + 1;
            break;
            case "a":
            case "A":
            case "b":
            case "B":
            case "d":
            case "D":
            System.out.println("Resposta incorreta!");
            tentativas = tentativas + 1;
            break;

            default:
            System.out.println("Escolha inválida!");

            }
            } while (!acertou && tentativas < 2);
        if (acertou && tentativas == 1) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
			pontos = pontos + 20;
			} else if (acertou && tentativas == 2) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
			pontos = pontos + 15;
			} else {
				System.out.println("Você errou e acumulou 0 pontos");
			}
        
        //5ª pergunta
        tentativas = 0; 
		acertou = false;
        do {
            System.out.println("Pergunta 5: A subtração das seguintes raízes é: (√4+√16) – (√25 . √9) ?");
            System.out.println("a) -9"); //resposta correta
            System.out.println("b) -6");
            System.out.println("c) -5");
            System.out.println("d) -4");
            System.out.print("Escolha uma alternativa: ");
            alternativa = entrada.next();

            switch (alternativa) {
            case "a":
            case "A":
            
            System.out.println("Resposta correta!");
            acertou = true;
            tentativas = tentativas + 1;
            break;
            case "b":
            case "B":
            case "c":
            case "C":
            case "d":
            case "D":
            
            System.out.println("Resposta incorreta!");
            tentativas = tentativas + 1;
            break;

            default:
            System.out.println("Escolha inválida!");

            }
            } while (!acertou && tentativas < 2);
        if (acertou && tentativas == 1) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
			pontos = pontos + 20;
			} else if (acertou && tentativas == 2) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
			pontos = pontos + 15;
			} else {
				System.out.println("Você errou e acumulou 0 pontos");
			}
        
        //6ª pergunta
        tentativas = 0; 
		acertou = false;
        do {
            System.out.println("Pergunta 6: O valor da expressão numérica a seguir é: √(√5+√21) . √(√5-√21)");
            System.out.println("a) 2"); // resposta correta
            System.out.println("b) 3");
            System.out.println("c) 4");
            System.out.println("d) 5");
            
            System.out.print("Escolha uma alternativa: ");
            alternativa = entrada.next();

            switch (alternativa) {
            case "a":
            case "A":
            System.out.println("Resposta correta!");
            acertou = true;
            tentativas = tentativas + 1;
            break;
            case "b":
            case "B":
            case "c":
            case "C":
            case "d":
            case "D":
            
            System.out.println("Resposta incorreta!");
            tentativas = tentativas + 1;
            break;

            default:
            System.out.println("Escolha inválida!");

            }
            } while (!acertou && tentativas < 2);
        if (acertou && tentativas == 1) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
			pontos = pontos + 20;
			} else if (acertou && tentativas == 2) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
			pontos = pontos + 15;
			} else {
				System.out.println("Você errou e acumulou 0 pontos");
			}
     
        
        //7ª pergunta
        tentativas = 0; 
		acertou = false;
        do {
        	System.out.println("Seja bem vindo a França! Você está no início dos anos 1500! Onde um matemático algebrista francês nascido em Fontenay-le-Comte, que defendeu o uso das frações decimais em lugar das \r\n"
        			+ "sexagesimais em Canon-mathematicus (1579), aperfeiçoou as notações algébricas e introduziu métodos gráficos e a \r\n"
        			+ "trigonometria para a solução de equações, no seu Isagoge (1591). Foi com o francês Viète que o método resolutivo das equações do 2º grau ganharam como símbolos, as letras. \r\n"
        			+ "Viète é o responsável pela modernização da álgebra. Seus trabalhos foram desenvolvidos por outro francês, denominado René Descartes. \r\n"
        			+ "Podemos observar que a expressão matemática utilizada atualmente para a resolução de uma equação do 2º grau não deve ser atribuída somente a uma pessoa, mas a vários \r\n"
        			+ "pesquisadores que através de inúmeros trabalhos. A equação do 2º grau é representada por: ax²+bx+c=0. A equação de 2º grau pode ser representada por ax²+bx+c=0, em que os coeficientes a, b e c são números reais, \r\n"
        			+ "com a ≠ 0.\r\n"
        			+ "");
            System.out.println("*--Equação de 2º grau:--*");
        	System.out.println("Pergunta 7: Determine qual é a equação do 2° grau que possui como raízes os números 3 e – 7.");
            System.out.println("a) x² + 4x – 20 = 0"); 
            System.out.println("b) x² + 4x – 21 = 0"); //resposta correta
            System.out.println("c) x² + 4x – 19 = 0");
            System.out.println("d)x² + 4x – 14 = 0");
            
            System.out.print("Escolha uma alternativa: ");
            alternativa = entrada.next();

            switch (alternativa) {
            case "b":
            case "B":
            System.out.println("Resposta correta!");
            acertou = true;
            tentativas = tentativas + 1;
            break;
            case "a":
            case "A":
            case "c":
            case "C":
            case "d":
            case "D":
            
            System.out.println("Resposta incorreta!");
            tentativas = tentativas + 1;
            break;

            default:
            System.out.println("Escolha inválida!");

            }
            } while (!acertou && tentativas < 2);
        if (acertou && tentativas == 1) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
			pontos = pontos + 20;
			} else if (acertou && tentativas == 2) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
			pontos = pontos + 15;
			} else {
				System.out.println("Você errou e acumulou 0 pontos");
			}
        
        //8ª pergunta
        tentativas = 0; 
		acertou = false;
        do {
            System.out.println("Pergunta 8: Encontre as raízes da equação do segundo grau x² + 5x + 4 = 0 através da soma e produto.");
            System.out.println("a) -5 e 2"); 
            System.out.println("b) -4 e 3");
            System.out.println("c) -3 e 4");
            System.out.println("d) -5 e 4"); //resposta correta
             
            System.out.print("Escolha uma alternativa: ");
            alternativa = entrada.next();

            switch (alternativa) {
            case "d":
            case "D":
            System.out.println("Resposta correta!");
            acertou = true;
            tentativas = tentativas + 1;
            break;
            case "a":
            case "A":
            case "b":
            case "B":
            case "c":
            case "C":
            
            System.out.println("Resposta incorreta!");
            tentativas = tentativas + 1;
            break;

            default:
            System.out.println("Escolha inválida!");

            }
            } while (!acertou && tentativas < 2);
        if (acertou && tentativas == 1) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
			pontos = pontos + 20;
			} else if (acertou && tentativas == 2) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
			pontos = pontos + 15;
			} else {
				System.out.println("Você errou e acumulou 0 pontos");
			}
        
        //9ª pergunta
        tentativas = 0; 
		acertou = false;
        do {
            System.out.println("Pergunta 9: Resolva a equação 2x² – 6x – 8 = 0 através da soma e produto.");
            System.out.println("a) -1 e 4"); // resposta correta
            System.out.println("b) -2 e 4");
            System.out.println("c) -1 e 3");
            System.out.println("d) -2 e 3");
           
            System.out.print("Escolha uma alternativa: ");
            alternativa = entrada.next();

            switch (alternativa) {
            case "a":
            case "A":
            System.out.println("Resposta correta!");
            acertou = true;
            tentativas = tentativas + 1;
            break;
            case "b":
            case "B":
            case "c":
            case "C":
            case "d":
            case "D":
            
            System.out.println("Resposta incorreta!");
            tentativas = tentativas + 1;
            break;

            default:
            System.out.println("Escolha inválida!");

            }
            } while (!acertou && tentativas < 2);
        if (acertou && tentativas == 1) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
			pontos = pontos + 20;
			} else if (acertou && tentativas == 2) {
			System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
			pontos = pontos + 15;
			} else {
				System.out.println("Você errou e acumulou 0 pontos");
			}
        
        //10ª pergunta
        tentativas = 0; 
        acertou = false;
        do {
        					System.out.println("Seja bem vindo a Alemanha! Você está no final dos anos 1600, onde os sistemas numéricos já haviam sido idealizados, porém, Leibniz os refinou e finalmente fundou os números binários! \r\n"
        					+ "O sistema binário ou de base 2 é um sistema de numeração posicional em que todas as quantidades se representam com base em dois números, \r\n"
        					+ "ou seja, zero e um (0 e 1).\r\n"
        					+ "Sistema Octal é um sistema de numeração cuja base é 8, ou seja, utiliza 8 símbolos para a representação de quantidade. No ocidente, \r\n"
        					+ "estes símbolos são os algarismos arábicos.\r\n"
        					+ "O sistema hexadecimal é um sistema de numeração posicional que representa os números em base 16, portanto empregando 16 símbolos.");
                            System.out.println("*--Sistema de numeração--*");
        		        	System.out.println("Pergunta 10: O valor em binário do decimal 42 é ?");
        		            System.out.println("a) 0101001"); //resposta correta
        		            System.out.println("b) 1101001");
        		            System.out.println("c) 0001101");
        		            System.out.println("d) 1010110");
        		            
        		            System.out.print("Escolha uma alternativa: ");
        		            alternativa = entrada.next();

        		            switch (alternativa) {
        		            case "a":
        		            case "A":
        		            System.out.println("Resposta correta!");
        		            acertou = true;
        		            tentativas = tentativas + 1;
        		            break;
        		            case "b":
        		            case "B":
        		            case "c":
        		            case "C":
        		            case "d":
        		            case "D":
        		            System.out.println("Resposta incorreta!");
        		            tentativas = tentativas + 1;
        		            break;

        		            default:
        		            System.out.println("Escolha inválida!");

        		            }
        		            } while (!acertou && tentativas < 2);
        		        if (acertou && tentativas == 1) {
        					System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
        					pontos = pontos + 20;
        					} else if (acertou && tentativas == 2) {
        					System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
        					pontos = pontos + 15;
        					} else {
        						System.out.println("Você errou e acumulou 0 pontos");
        					}
        		        
        		        //11ª pergunta
        		        tentativas = 0; 
        				acertou = false;
        		        do {
        		            System.out.println("Pergunta 11: Convertendo o número hexadecimal CB para decimal, teremos?");
        		            System.out.println("a) 200"); 
        		            System.out.println("b) 201");
        		            System.out.println("c) 202");
        		            System.out.println("d) 203"); //resposta correta
        		            System.out.print("Escolha uma alternativa: ");
        		            alternativa = entrada.next();

        		            switch (alternativa) {
        		            case "d":
        		            case "D":
        		            System.out.println("Resposta correta!");
        		            acertou = true;
        		            tentativas = tentativas + 1;
        		            break;
        		            case "a":
        		            case "A":
        		            case "b":
        		            case "B":
        		            case "c":
        		            case "C":
        		            System.out.println("Resposta incorreta!");
        		            tentativas = tentativas + 1;
        		            break;

        		            default:
        		            System.out.println("Escolha inválida!");

        		            }
        		            } while (!acertou && tentativas < 2);
        		        if (acertou && tentativas == 1) {
        					System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
        					pontos = pontos + 20;
        					} else if (acertou && tentativas == 2) {
        					System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
        					pontos = pontos + 15;
        					} else {
        						System.out.println("Você errou e acumulou 0 pontos");
        					}
        		        
        		        //12ª pergunta
        		        tentativas = 0; 
        				acertou = false;
        		        do {
        		            System.out.println("Pergunta 12: Convertendo o número octagonal 32 para decimal, teremos??");
        		            System.out.println("a) 14"); 
        		            System.out.println("b) 26"); //resposta correta
        		            System.out.println("c) 38");
        		            System.out.println("d) 50");
        		            System.out.print("Escolha uma alternativa: ");
        		            alternativa = entrada.next();

        		            switch (alternativa) {
        		            case "b":
        		            case "B":
        		            System.out.println("Resposta correta!");
        		            acertou = true;
        		            tentativas = tentativas + 1;
        		            break;
        		            case "a":
        		            case "A":
        		            case "c":
        		            case "C":
        		            case "d":
        		            case "D":
        		            System.out.println("Resposta incorreta!");
        		            tentativas = tentativas + 1;
        		            break;

        		            default:
        		            System.out.println("Escolha inválida!");

        		            }
        		            } while (!acertou && tentativas < 2);
        		        if (acertou && tentativas == 1) {
        					System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
        					pontos = pontos + 20;
        					} else if (acertou && tentativas == 2) {
        					System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
        					pontos = pontos + 15;
        					} else {
        						System.out.println("Você errou e acumulou 0 pontos");
        					}
        
        //13ª pergunta
        		        tentativas = 0; 
        				acertou = false;
        		        do {
        		        	System.out.println("Seja bem vindo aos Estados Unidos! Você está no início do século XX! As contas básicas com incógnitas ainda não estavam definidas.\r\n"
        		        			+ "Em matemática, o polinômio de Alexander é um nó constante que atribui um polinômio com coeficientes inteiros para cada tipo de nó. \r\n"
        		        			+ "James Waddell Alexander II descobriu o primeiro nó de polinômio em 1923. Em 1969, John Conway mostrou uma versão deste polinômio, agora chamado de Polinômio de \r\n"
        		        			+ "Alexander–Conway, pode ser calculado usando uma relação de Skein, embora o seu significado não tenha sido realizado até a descoberta do polinômio de Jones, em 1984.\r\n"
        		        			+ "olinômios são a adição ou subtração algébrica de monômios. Estes, por sua vez, são o produto entre números conhecidos e desconhecidos (incógnitas). Cada monômio que compõe \r\n"
        		        			+ "um polinômio é chamado de termo.\r\n"
        		        			+ "\r\n"
        		        			+ "");
        		            System.out.println("*--Polinômios--*");
        		        	System.out.println("Pergunta 13: Subtraia (x^2 + 12x – 9) – (8x^2 + 7x – 1). O resultado é:");
        		            System.out.println("a) 9x^2 + 5x - 10"); 
        		            System.out.println("b) 9x^2 + 5x - 8"); //resposta correta
        		            System.out.println("c) 9x^2 + 7x - 8");
        		            System.out.println("d) 9x^2 + 7x - 9");
        		           
        		            System.out.print("Escolha uma alternativa: ");
        		            alternativa = entrada.next();

        		            switch (alternativa) {
        		            case "b":
        		            case "B":
        		            System.out.println("Resposta correta!");
        		            acertou = true;
        		            tentativas = tentativas + 1;
        		            break;
        		            case "a":
        		            case "A":
        		            case "c":
        		            case "C":
        		            case "d":
        		            case "D":
        		            
        		            System.out.println("Resposta incorreta!");
        		            tentativas = tentativas + 1;
        		            break;

        		            default:
        		            System.out.println("Escolha inválida!");

        		            }
        		            } while (!acertou && tentativas < 2);
        		        if (acertou && tentativas == 1) {
        					System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
        					pontos = pontos + 20;
        					} else if (acertou && tentativas == 2) {
        					System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
        					pontos = pontos + 15;
        					} else {
        						System.out.println("Você errou e acumulou 0 pontos");
        					}
        		        
        		        //14ª pergunta
        		        tentativas = 0; 
        				acertou = false;
        		        do {
        		            System.out.println("Pergunta 14: Some (y^2 + 4y – 5) + (– 3y^2 + 12y – 1). O resultado é:");
        		            System.out.println("a) – 2y^2 + 14y + 6"); 
        		            System.out.println("b) – 2y^2 + 15y – 6");
        		            System.out.println("c) – 2y^2 + 16y – 7");
        		            System.out.println("d) – 2y^2 + 16y – 6"); //resposta correta
        		            
        		            System.out.print("Escolha uma alternativa: "); 
        		            alternativa = entrada.next();

        		            switch (alternativa) {
        		            case "d":
        		            case "D":
        		            System.out.println("Resposta correta!");
        		            acertou = true;
        		            tentativas = tentativas + 1;
        		            break;
        		            case "a":
        		            case "A":
        		            case "b":
        		            case "B":
        		            case "c":
        		            case "C":
        		            System.out.println("Resposta incorreta!");
        		            tentativas = tentativas + 1;
        		            break;

        		            default:
        		            System.out.println("Escolha inválida!");

        		            }
        		            } while (!acertou && tentativas < 2);
        		        if (acertou && tentativas == 1) {
        					System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
        					pontos = pontos + 20;
        					} else if (acertou && tentativas == 2) {
        					System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
        					pontos = pontos + 15;
        					} else {
        						System.out.println("Você errou e acumulou 0 pontos");
        					}
        		        
        		        //15ª pergunta
        		        tentativas = 0;
        				acertou = false;
        		        do {
        		            System.out.println("Pergunta 15: São exemplos de polinômio de 1º grau e de 2º grau, respectivamente:");
        		            System.out.println("a) 3x + 1 = 0 e 4x² + 3x – 3 = 0"); //resposta correta
        		            System.out.println("b) 3x + 1 = 0 e 5a^8 + 2a^6 + a² + 2^a = 0");
        		            System.out.println("c) 4x² + 3x – 3 = 0 e -3y³ + 2y + 1 = 0");
        		            System.out.println("d) 3x + 1 = 0 e 3y³ + 2y + 1 = 0");
        		            
        		            System.out.print("Escolha uma alternativa: ");
        		            alternativa = entrada.next();

        		            switch (alternativa) {
        		            case "a":
        		            case "A":
        		            System.out.println("Resposta correta!");
        		            acertou = true;
        		            tentativas = tentativas + 1;
        		            break;
        		            case "b":
        		            case "B":
        		            case "c":
        		            case "C":
        		            case "d":
        		            case "D":
        		            
        		            System.out.println("Resposta incorreta!");
        		            tentativas = tentativas + 1;
        		            break;

        		            default:
        		            System.out.println("Escolha inválida!");

        		            }
        		            } while (!acertou && tentativas < 2);
        		        if (acertou && tentativas == 1) {
        					System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 20 pontos");
        					pontos = pontos + 20;
        					} else if (acertou && tentativas == 2) {
        					System.out.println("Você acertou na " + tentativas + "ª tentativa! E acumulou 15 pontos");
        					pontos = pontos + 15;
        					} else {
        						System.out.println("Você errou e acumulou 0 pontos");
        					}
        		            System.out.println("Você tem " + pontos + " pontos");
        		            {
        		}
		break;
		
		case 3:
		
			System.out.println("Você escolheu a opção Créditos\n");
			System.out.println("*--Créditos--*\n");
			System.out.println("*--Programadores--*");
			System.out.println("Igor Camilo Valente");
			System.out.println("Gustavo Horikochi\n");
		
		break;
		
		case 4:
		
			System.out.println("Você escolheu a opção Sair");
		    System.out.println("Saindo...");
		    System.out.println("Você saiu do jogo");
		    System.out.println("Jogo fechado");
		
		break;
		
		default:
		
			System.out.println("Opção inválida!");
		
		}
		
		} while (opcao != 4);
		
	}
		
}

	









