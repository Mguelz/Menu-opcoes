package menu_opcoes.game;

import java.util.Random;
import menu_opcoes.LeitorDeDados;

public class Jokenpo {
	public static void jokenpo() {
		LeitorDeDados scanner  = new LeitorDeDados();
		Random random = new Random();
		int jogador, computador;
		boolean continuar = false;

		do {
			System.out.println("_________JoKenPô_________");
			System.out.println("1. Pedra");
			System.out.println("2. Papel");
			System.out.println("3. Tesoura");
			System.out.print("Digite a opção desejada: ");
			jogador = scanner.pegarNumeroInteiro();
			switch (jogador) {
			case 1:
				System.out.println("\nJogador escolheu Pedra");
				break;
			case 2:
				System.out.println("\nJogador escolheu Papel");
				break;
			case 3:
				System.out.println("\nJogador escolheu Tesoura");
				break;
			default:
				System.out.println("\nOpção Inválida");
			}
			
			computador = random.nextInt(3) + 1;
			if (computador == 4) {
				computador = 3;
			}
			switch (computador) {
			case 1:
				System.out.println("Computador escolheu Pedra");
				break;
			case 2:
				System.out.println("Computador escolheu Papel");
				break;
			case 3:
				System.out.println("Computador escolheu Tesoura");
				break;
			}
			
			if (jogador == computador) {
				System.out.println("\n         EMPATE");
			} else if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2)) {
				System.out.println("\n      Você Venceu!");
			} else {
				System.out.println("\n      Você Perdeu!");
			}
			System.out.println("Deseja continuar jogando? \n1 - Sim ou 2 - Não");
			jogador = scanner.pegarNumeroInteiro();
			if (jogador == 1) {
				continuar = true;
			} else {
				continuar = false;
			}
		} while (continuar);

		System.out.println("\n_________JoKenPô_________");
	}
}
