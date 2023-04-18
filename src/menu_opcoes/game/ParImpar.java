package menu_opcoes.game;

import java.util.Random;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class ParImpar {

	/**
	 * O usuario ira escolhe par ou impar<br>
	 * o sistema tambem ira escolher uma opcao<br>
	 * no final o sistema ira calular quem ganhou
	 */
	public static void parImpar() {
		LeitorDeDados scanner = new LeitorDeDados();
		Random random = new Random();
		Mensagem m = new Mensagem();

		int digitado = -1, imparPar, sorteio;
		boolean continuarJogando = false;

		m.lnPrintaMensagemLn("------------------ PAR OU ÍMPAR-----------------");
		do {
			System.out.println("\nEscolha 0 - (par) ou 1 - (ímpar)");
			digitado = scanner.pegarNumeroInteiro();

			sorteio = random.nextInt(11);
			imparPar = sorteio % 2;
			if (digitado == 0) {
				m.lnPrintaMensagem("Você escolheu: par");
				m.printaMensagem("A máquina escolheu: impar");
				m.printaMensagem("O numero sorteado foi:" + sorteio);
				if (imparPar == 0) {
					m.lnPrintaMensagemLn("Você Venceu!");
				} else {
					m.lnPrintaMensagemLn("Você Perdeu!");
				}
			} else if (digitado == 1) {
				m.lnPrintaMensagem("Você escolheu: ímpar");
				m.printaMensagem("A máquina escolheu: par");
				m.printaMensagem("O numero sorteado foi:" + sorteio);
				if (imparPar == 1) {
					m.printaMensagemLn("Você Venceu!");
				} else {
					m.printaMensagemLn("Você Perdeu!");
				}
			} else {
				m.printaMensagemLn("Digite uma opção válida:");
				continuarJogando = true;
			}

			m.printaMensagem("Deseja jogar novamente?");
			m.printaMensagemLn("1 - Sim ou 2 - Não");
			digitado = scanner.pegarNumeroInteiro();
			if (digitado == 1) {
				continuarJogando = true;
			} else {
				continuarJogando = false;
			}

		} while (continuarJogando);

	}
}
