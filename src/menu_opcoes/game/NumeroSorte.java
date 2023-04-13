package menu_opcoes.game;

import java.util.Random;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class NumeroSorte {

	/**
	 * O sistema irá gerar um numero aleatorio e o usuario irá tentar acertar
	 */
	public static void numeroSorte() {
		LeitorDeDados scanner = new LeitorDeDados();
		Random random = new Random();
		Mensagem m = new Mensagem();

		int digitado, tentativa = 0, opcao;
		boolean continuarTry = false;

		do {
			objetivoJogo();
			try {
				m.lnPrintaMensagemErroLn("------------------ NÚMERO DA SORTE -----------------");
				for (int continuar = 1; continuar <= 3; continuar++) {
					m.printaMensagemLn("Tentativa " + (tentativa + 1));
					tentativa++;
					m.printaMensagemSemPularLinha("Digite um número entre 1 e 10: ");
					digitado = scanner.pegarNumeroInteiro();
					int sorteio = random.nextInt(10) + 1;
					if (digitado == sorteio) {
						m.printaMensagemLn("Você Acertou!, Parabéns ");
						continuar = 3;
					} else {
						m.printaMensagemLn("Você Errou, o número certo era: " + sorteio);
						m.printaMensagemLn("Suas chances acabaram!");

					}
					m.printaMensagemLn("------------------------------");
				}

				m.lnPrintaMensagemLn("Deseja jogar novamente? ");
				m.printaMensagemLn("1 - Sim ou 2 - Não");
				opcao = scanner.pegarNumeroInteiro();
				if (opcao == 1) {
					continuarTry = true;
				} else {
					continuarTry = false;
				}

			} catch (Exception e) {
				m.lnPrintaMensagemLn("É somente permitido números");
				continuarTry = true;
			}

		} while (continuarTry);

	}

	public static void objetivoJogo() {
		Mensagem m = new Mensagem();
		m.lnPrintaMensagemLn("--------------------- SOBRE O JOGO  ---------------------");
		m.printaMensagem("O sistema irá gerar um numero aleatório entre 0 e 10");
		m.printaMensagem("Você terá três tentativas para acertar esse número");
		m.printaMensagem("Caso contrario você irá perder");
		m.printaMensagemLn("A cada tentativa o sistema gerará um número diferente");
	}
}
