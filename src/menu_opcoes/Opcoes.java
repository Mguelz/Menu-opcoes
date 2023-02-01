package menu_opcoes;

import java.util.InputMismatchException;

public class Opcoes {
	LeitorDeDados scanner = new LeitorDeDados();

	public static void escolherOpcoes() {
		System.out.println("\nEscolha uma das opcoes abaixo \nDigite um numero: \n");
		System.out.println("1 - IMC \n2 - Tabuada \n3 - Despesas \n4 - Multas (simples) \n5 - Multas (avançado) \n6 - Número da sorte \n7 - Frete \n8 - Par ou impar \n9 - Jokenpo \n10 - Regra de 3 \n11 - Conversor de Fahrenheit \n0 - Sair \n");
	}

	public static void linhaFinal() {
		System.out.println("\n--------------------------------------");
	}

	public void verificarOqueForDigitado() {
		Opcoes.escolherOpcoes();
		byte opcaoEscolha = -1;
		boolean continuarTry = true;
		while (continuarTry) {
			try {
				opcaoEscolha = scanner.pegarByteDigitado();
				if (opcaoEscolha > -1 || opcaoEscolha < 12) {
					continuarTry = false;
				} else {
					System.out.println("Digite um número de 0 - 11");
					opcaoEscolha = scanner.pegarByteDigitado();
				}
			} catch (InputMismatchException erroDeInput) { // Value out of range / RuntimeException / InputMismatchException
				System.out.println("Digite um número de 0 - 11");
				continuarTry = false;
			} catch (Exception f) {
				System.out.println("error: " + f);
				System.out.println("Digite um número de 0 - 11");
				continuarTry = false;
			}
		}
	}
}
