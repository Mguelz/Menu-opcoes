package menu_opcoes.game;

import java.util.Random;

import menu_opcoes.LeitorDeDados;

public class ParImpar {
	public static void parImpar() {
		LeitorDeDados scanner = new LeitorDeDados();
		Random random = new Random();

		int digitado = -1, imparPar, sorteio;
		boolean continuarJogando = false;

		System.out.println("\n------------------ PAR OU ÍMPAR-----------------");
		do {
			System.out.println("\nEscolha 0 - (par) ou 1 - (ímpar)");
			digitado = scanner.pegarNumeroInteiro();

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
				continuarJogando = true;
			}

			System.out.println("Deseja jogar novamente? \n1 - Sim ou 2 - Não");
			digitado = scanner.pegarNumeroInteiro();
			if (digitado == 1) {
				continuarJogando = true;
			} else {
				continuarJogando = false;
			}

		} while (continuarJogando);

	}
}
