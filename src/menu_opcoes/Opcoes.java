package menu_opcoes;

import java.util.InputMismatchException;

public class Opcoes {
	LeitorDeDados scanner = new LeitorDeDados();

	/**
	 * Apresenta ao usuario o menu de opcoes
	 */
	public static void escolherOpcoes() {
		System.out.println("\nEscolha uma das opcoes abaixo \nDigite um numero: \n");
		System.out.println(
				" 1 - IMC \n 2 - Tabuada \n 3 - Despesas \n 4 - Multas (simples) \n 5 - Multas (avançado) \n 6 - Número da sorte \n 7 - Frete \n 8 - Par ou impar \n 9 - Jokenpo \n10 - Regra de 3 \n11 - Conversor de Fahrenheit \n12 - Desconto Aplicado \n13 - Cálculo para Comprar Gasolina ou Álcool\n0 - Sair \n");
	}

	public static void linhaFinal() {
		System.out.println("\n--------------------------------------");
	}

	/**
	 * enquanto o usuario nao digitar um numero válido, continua repetindo até que
	 * coloque uma opcao válida
	 */
	public void verificarOqueForDigitado() {
		Opcoes.escolherOpcoes();
		byte opcaoEscolha = -1;
		boolean continuarTry = true;

		do {
			System.out.println("Digite um número de 0 - 12");
			try {
				opcaoEscolha = scanner.pegarByteDigitado();
				if (opcaoEscolha >= 0 || opcaoEscolha <= 12) {
					continuarTry = false;
				} else {
					System.out.println("Opção inválida, digite novamente.");
				}
			} catch (InputMismatchException erroDeInput) {
				System.out.println("Digite um número de 0 - 12");
				scanner.pegarTextoCompleto();
			}
//			 catch (Exception f) {
//				System.out.println("error: " + f);
//				System.out.println("Digite um número de 0 - 12");
//				
//			}
		} while (continuarTry);
	}
}
