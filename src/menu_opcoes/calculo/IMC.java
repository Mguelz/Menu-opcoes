package menu_opcoes.calculo;

import java.util.Scanner;

public class IMC {
	
	final static byte VALOR_PARACONTINUAR_NO_SISTEMA = 1;
	
	public static void imc() { // metodo avancado
		Scanner scanner = new Scanner(System.in);
		double massa = 0, altura = 0, imc = 0;
		boolean continuar = false;

		do {
			System.out.println("Qual sua massa");
			massa = scanner.nextDouble();
			System.out.println("Qual sua altura");
			altura = scanner.nextDouble();

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
			continuar = scanner.nextByte() == VALOR_PARACONTINUAR_NO_SISTEMA;
		} while (continuar);
	}
	
	public static void imcIntermediario() { // metodo intermediario
		Scanner scanner = new Scanner(System.in);
		double massa = 0, altura = 0, imc = 0;
		int digitou;
		boolean continuar = true;

		do {
			System.out.println("Qual sua massa");
			massa = scanner.nextDouble();
			System.out.println("Qual sua altura");
			altura = scanner.nextDouble();

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
			digitou = scanner.nextInt();
			if (digitou != 1) {
				continuar = false;
			}
		} while (continuar);
	}
	
	public static void imcPrincipiante() {
		Scanner scanner = new Scanner(System.in);
		double massa = 0, altura = 0, imc = 0;
		int continuar, digitou;

		do {
			System.out.println("Qual sua massa");
			massa = scanner.nextDouble();
			System.out.println("Qual sua altura");
			altura = scanner.nextDouble();

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
			System.out.println("Deseja calcular outro IMC? \n1 - SIM ou 2 - NÂO");
			digitou = scanner.nextInt();
			if (digitou == 1) {
				continuar = 1;
			} else {
				continuar = 2;
			}
		} while (continuar != 2);
	}
}
