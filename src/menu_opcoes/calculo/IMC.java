package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;

public class IMC {

	final static byte VALOR_PARACONTINUAR_NO_SISTEMA = 1;

	/**
	 * calcula de acordo com a massa e a altura da pessoa se ela esta no peso ideal
	 * ou não
	 */
	public static void imc() { // metodo avancado
		LeitorDeDados scanner = new LeitorDeDados();
		double massa = 0, altura = 0, imc = 0;
		boolean continuar = false;
		boolean continuarTry = false;
		boolean digitado;

		do {
			try {
				System.out.println("\n------------------ IMC -----------------\n");
				System.out.print("Qual sua massa: ");
				massa = scanner.pegarNumeroQuebrado();
				System.out.print("Qual sua altura: ");
				altura = scanner.pegarNumeroQuebrado();

				imc = massa / (altura * altura);
				System.out.print("\nSeu IMC é: " + imc + "\n"); // TODO pode colocar dentro dos if/else para nao
																// imprimir junto com o else
				if (imc < 18.5) {
					System.out.println("Seu índice é: Magreza");
				} else if (imc >= 18.5 && imc < 24.9) {
					System.out.println("Seu índice é: Normal");
				} else if (imc >= 24.9 && imc < 30) {
					System.out.println("Seu índice é: Sobrepeso");
				} else if (imc < 50) {
					System.out.println("Seu índice é: Obesidade");
				} else {
					System.out.println("A massa ou altura que você colocou não é um valor válido!");
				}

				System.out.println("\nDeseja calcular outro IMC? \n1 - SIM ou 2 - NÂO");
				boolean repetir = digitado = scanner.pegarByteDigitado() == VALOR_PARACONTINUAR_NO_SISTEMA;
				System.out.println("Você escolheu: " + repetir);

				if (digitado == true) {
					continuarTry = true;
					break;
				} else {
					continuarTry = false;
				}

			} catch (Exception e) {
				System.out.println("É somente permitido números para massa e altura!");
			}
		} while (continuarTry);
	}

	/**
	 * outras formas de fazer o calculo do imc, pra relembrar como fazia antigamente
	 */
	public static void imcIntermediario() { // metodo intermediario
		LeitorDeDados scanner = new LeitorDeDados();
		double massa = 0, altura = 0, imc = 0;
		int digitou;
		boolean continuar = true;

		do {
			System.out.println("Qual sua massa");
			massa = scanner.pegarNumeroQuebrado();
			System.out.println("Qual sua altura");
			altura = scanner.pegarNumeroQuebrado();

			imc = massa / (altura * altura);
			System.out.print("Seu IMC é: " + imc + "\n");
			if (imc < 18.5) {
				System.out.print("Seu índice é: Magreza");
			} else if (imc >= 18.5 && imc < 24.9) {
				System.out.print("Seu índice é: Normal");
			} else if (imc >= 24.9 && imc < 30) {
				System.out.print("Seu índice é: Sobrepeso");
			} else {
				System.out.print("Seu índice é: Obesidade");
			}
			System.out.println("\nDeseja calcular outro IMC? \n1 - SIM ou 2 - NÂO");
			digitou = scanner.pegarNumeroInteiro();
			if (digitou != 1) {
				continuar = false;
			}
		} while (continuar);
	}

	/**
	 * outras formas de fazer o calculo do imc, pra relembrar como fazia antigamente
	 */
	public static void imcPrincipiante() {
		LeitorDeDados scanner = new LeitorDeDados();
		double massa = 0, altura = 0, imc = 0;
		int continuar, digitou;

		do {
			System.out.println("Qual sua massa");
			massa = scanner.pegarNumeroQuebrado();
			System.out.println("Qual sua altura");
			altura = scanner.pegarNumeroQuebrado();

			imc = massa / (altura * altura);
			System.out.print("Seu IMC é: " + imc + "\n");
			if (imc < 18.5) {
				System.out.print("Seu índice é: Magreza");
			} else if (imc >= 18.5 && imc < 24.9) {
				System.out.print("Seu índice é: Normal");
			} else if (imc >= 24.9 && imc < 30) {
				System.out.print("Seu índice é: Sobrepeso");
			} else {
				System.out.print("Seu índice é: Obesidade");
			}
			System.out.println("\n");
			System.out.println("Deseja calcular outro IMC? \n1 - SIM ou 2 - NÃO");
			digitou = scanner.pegarNumeroInteiro();
			if (digitou == 1) {
				continuar = 1;
			} else {
				continuar = 2;
			}
		} while (continuar != 2);
	}
}
