package menu_opcoes.game;

import java.util.Random;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class Jokenpo {

	/**
	 * O usuario ira escolher entre pedra, papel ou tesoura<br>
	 * o sistema tambem ira escolher uma opcao<br>
	 * no final ira verificar quem ganhou
	 */
	public static void jokenpo() {
		LeitorDeDados scanner = new LeitorDeDados();
		Random random = new Random();
		Mensagem m = new Mensagem();

		int jogador, computador;
		boolean continuar = false;

		m.lnPrintaMensagemLn("------------------ JOKENPÔ-----------------");
		do {
			m.printaMensagem("1. Pedra");
			m.printaMensagem("2. Papel");
			m.printaMensagemLn("3. Tesoura");
			m.printaMensagemSemPularLinha("Digite a opção desejada: ");
			jogador = scanner.pegarNumeroInteiro();
			switch (jogador) {
			case 1:
				m.lnPrintaMensagem("Jogador escolheu Pedra");
				break;
			case 2:
				m.lnPrintaMensagem("Jogador escolheu Papel");
				break;
			case 3:
				m.lnPrintaMensagem("Jogador escolheu Tesoura");
				break;
			default:
				m.lnPrintaMensagemErroLn("Opção Inválida");
			}

			computador = random.nextInt(3) + 1;
			if (computador == 4) {
				computador = 3;
			}
			switch (computador) {
			case 1:
				m.printaMensagemLn("Computador escolheu Pedra");
				break;
			case 2:
				m.lnPrintaMensagemLn("Computador escolheu Papel");
				break;
			case 3:
				m.printaMensagemLn("Computaor escolheu Tesoura");
				break;
			}

			if (jogador == computador) {
				m.lnPrintaMensagemSemPularLinha("         EMPATE");
			} else if ((jogador == 1 && computador == 3) || (jogador == 2 && computador == 1)
					|| (jogador == 3 && computador == 2)) {
				m.lnPrintaMensagemLn("      Você Venceu!");
			} else {
				m.lnPrintaMensagemLn("      Você Perdeu!");
			}
			m.printaMensagem("Deseja continuar jogando? ");
			m.printaMensagemLn("1 - Sim ou 2 - Não");
			jogador = scanner.pegarNumeroInteiro();
			if (jogador == 1) {
				continuar = true;
			} else {
				continuar = false;
			}
		} while (continuar);

		m.lnPrintaMensagemLn("_________JoKenPô_________");
	}
}
