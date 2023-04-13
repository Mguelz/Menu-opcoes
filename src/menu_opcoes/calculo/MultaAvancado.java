package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class MultaAvancado {

	/**
	 * irá perguntar quantas multas voce recebeu<br>
	 * depois quantos pontos recebeu na multa 1, e assim por diante...<br>
	 * no final ele ira mostrar ao todo quantos pontos voce recebeu e a quantidade
	 * que ira pricisar pagar
	 */
	public static void multaAvancado() {
		LeitorDeDados scanner = new LeitorDeDados();
		Mensagem m = new Mensagem();

		byte qtdMultas;
		int somaPontosCNH = 0, pontosCNH;
		double infraLeve = 88.38, infraMedia = 130.16, infraGrave = 195.23, infraGravissima = 293.47;

		double valorTotalPagar = 0, valorTotalSomado = 0;
		boolean continuarTry = false;

		do {
			try {
				m.lnPrintaMensagemLn("------------------ MULTA -----------------");
				m.printaMensagemLn("Quantas multas você tomou: ");
				qtdMultas = scanner.pegarByteDigitado();
				for (int i = 1; i <= qtdMultas; i++) {
					m.printaMensagemSemPularLinha("Quantos pontos na CNH você recebeu na multa " + i + ": ");
					pontosCNH = scanner.pegarNumeroInteiro();
					if (pontosCNH == 3 || pontosCNH == 4 || pontosCNH == 5 || pontosCNH == 7) {
						somaPontosCNH += pontosCNH;
					}

					if (pontosCNH != 3 && pontosCNH != 4 && pontosCNH != 5 && pontosCNH != 7) {
						m.printaMensagemLn("Digite uma quantidade valida (3,4,5 ou 7)");
						continuarTry = true;
						i--;
					} else if (pontosCNH == 3) {
						valorTotalPagar = infraLeve;
						valorTotalSomado += valorTotalPagar;
						continuarTry = false;
					} else if (pontosCNH == 4) {
						valorTotalPagar = infraMedia;
						valorTotalSomado += valorTotalPagar;
						continuarTry = false;
					} else if (pontosCNH == 5) {
						valorTotalPagar = infraGrave;
						valorTotalSomado += valorTotalPagar;
						continuarTry = false;
					} else if (pontosCNH == 7) {
						valorTotalPagar = infraGravissima;
						valorTotalSomado += valorTotalPagar;
						continuarTry = false;
					}
				}

			} catch (Exception e) {
				m.lnPrintaMensagemLn("É somente permitido números");
				continuarTry = true;
			}

		} while (continuarTry);

		m.lnPrintaMensagemLn("\nAo todo você tomou " + somaPontosCNH + " pontos na carteira");
		m.lnPrintaMensagemLn("Ao todo você ira pagar R$ " + valorTotalSomado);
	}
}
