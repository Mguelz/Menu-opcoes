package menu_opcoes.game;

import java.util.Random;
import menu_opcoes.LeitorDeDados;

public class NumeroSorte {
	
	/**
	 * O sistema irá gerar um numero aleatorio e o usuario irá tentar acertar
	 */
	public static void numeroSorte() {
		LeitorDeDados scanner  = new LeitorDeDados();
		Random random = new Random();
		int digitado, tentativa = 0, opcao;
		boolean repetir = false;

		objetivoJogo(); // descrevendo como funciona este mini game
		do {
			System.out.println("\n------------------ NÚMERO DA SORTE -----------------");
			for (int continuar = 1; continuar <= 3; continuar++) {
				System.out.println("Tentativa " + (tentativa + 1));
				tentativa++;
				System.out.println("Digite um número entre 1 e 10: ");
				digitado = scanner.pegarNumeroInteiro();
				int sorteio = random.nextInt(10) + 1;
				if (digitado == sorteio) {
					System.out.println("Você Acertou!, Parabéns ");
					continuar = 3;
				} else {
					System.out.println("Você Errou, o número certo era: " + sorteio);
				}
				System.out.println("------------------------------");
			}

			System.out.println("\nDeseja jogar novamente? \n1 - Sim ou 2 - Não");
			opcao = scanner.pegarNumeroInteiro();
			if (opcao == 1) {
				repetir = true;
			} else {
				repetir = false;
			}
		} while (repetir);

	}

	public static void objetivoJogo() {
		System.out.println("Sobre o Jogo:");
		System.out.println("O sistema irá gerar um numero aleatório entre 0 e 10");
		System.out.println("Você terá três tentativas para acertar esse número");
		System.out.println("Caso contrário você irá perder");
		System.out.println("A cada tentativa o sistema gerará um número diferente \n");
	}
}
