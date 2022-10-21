package menu_opcoes;

import java.util.Scanner;

public class IMC {
	public static void imc() {
		Scanner scanner = new Scanner(System.in);
		double massa = 0, altura = 0, imc = 0;
		int continuar, digitou;

		do {
			System.out.println("Qual sua massa");
			massa = scanner.nextDouble();
			System.out.println("Qual sua altura");
			altura = scanner.nextDouble();

			// processamento
			imc = massa / (altura * altura);
			System.out.print("Seu IMC é: " + imc + "\n");

			// saida
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
