package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class MultaSimples {

	/**
	 * Pergunta ao usuario a quantidade de pontos na CNH que ele recebeu<br>
	 * o sistema irá calular a gravidade da infração e o valor da multa
	 */
	public static void multa() {
		LeitorDeDados scanner = new LeitorDeDados();
		Mensagem m = new Mensagem();

		byte pontosCNH = 0;
		boolean continuar = true, continuarTry = false;
		int opcao;

		do {
			try {
				do {
					m.lnPrintaMensagemLn("------------------ MULTA -----------------");
					m.printaMensagemLn("Quantos pontos na CNH você recebeu: ");
					pontosCNH = scanner.pegarByteDigitado();

					if (pontosCNH == 3) {
						m.printaMensagemLn("Infração Leve ");
						m.printaMensagemLn("R$ 88,38 de multa");
						continuar = false;
					} else if (pontosCNH == 4) {
						m.printaMensagemLn("Infração Média");
						m.printaMensagemLn("R$ 130,16 de multa");
						continuar = false;
					} else if (pontosCNH == 5) {
						m.printaMensagemLn("Infração Grave ");
						m.printaMensagemLn("R$ 195,23 de multa");
						continuar = false;
					} else if (pontosCNH == 7) {
						m.printaMensagemLn("Infração Gravíssima ");
						m.printaMensagemLn("R$ 283,47 de multa");
						continuar = false;
					}
					if (pontosCNH != 3 && pontosCNH != 4 && pontosCNH != 5 && pontosCNH != 7) {
						m.printaMensagemLn("Digite uma quantidade valida (3,4,5 ou 7)");
						continuar = true;
					}

				} while (continuar);

				m.lnPrintaMensagemLn("Deseja calcular outra vez?");
				m.printaMensagemLn("1 - Sim ou  2 - Não");
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
}
