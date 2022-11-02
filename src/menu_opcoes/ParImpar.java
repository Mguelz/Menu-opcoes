package menu_opcoes;

import java.util.Random;
import java.util.Scanner;

public class ParImpar {
	public static void parImpar() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int digitado = -1, imparPar, sorteio;
		boolean opcao = false; // continuar jogando

		do {
			System.out.println("\nEscolha 0 - (par) ou 1 - (ímpar)");
			digitado = scanner.nextInt();

			sorteio = random.nextInt(11);
			imparPar = sorteio % 2;
			if (digitado == 0) {
				System.out.println("Você escolheu: par");
				System.out.println("A máquina escolheu: impar");
				System.out.println("O numero sorteado foi: " + sorteio + "\n");
				if (imparPar == 0) {
					System.out.println("Você Venceu!");
				} else {
					System.out.println("Você Perdeu!");
				}
			} else if (digitado == 1) {
				System.out.println("Você escolheu: impar");
				System.out.println("A máquina escolheu: par");
				System.out.println("O numero sorteado foi: " + sorteio + "\n");
				if (imparPar == 1) {
					System.out.println("Você Venceu! \n");
				} else {
					System.out.println("Você Perdeu! \n");
				}
			} else {
				System.out.println("Digite um opcão válida");
				opcao = true;
			}

			System.out.println("Deseja jogar novamente? \n1 - Sim ou 2 - Não");
			digitado = scanner.nextInt();
			if (digitado == 1) {
				opcao = true;
			} else {
				opcao = false;
			}

		} while (opcao);

	}
}
