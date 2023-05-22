package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class GasolinaOuAlcool {

	/**
	 * O sistema irá calular se é mais vantajoso abastecer com gasolina ou alcool
	 */
	public static void gasolinaOuAlcool() {
		LeitorDeDados scanner = new LeitorDeDados();
		Mensagem m = new Mensagem();

		double gasolina, alcool;
		int digitado;
		boolean continuar = true;

		m.lnPrintaMensagem("------------------ Gasolina ou Álcool-----------------");
		do {
			m.printaMensagemSemPularLinha("Digite o valor do álcool: ");
			alcool = scanner.pegarNumeroQuebrado();
			m.printaMensagemSemPularLinha("Digite o valor da gasolina: ");
			gasolina = scanner.pegarNumeroQuebrado();

			if (alcool < 0.7 * gasolina) {
				m.lnPrintaMensagem("Abastecer com álcool");
			} else {
				m.lnPrintaMensagem("Abastecer com gasolina");
			}
			m.lnPrintaMensagem("Deseja calcular novamente?");
			m.printaMensagem("1- Sim ou 2 - Não");
			digitado = scanner.pegarNumeroInteiro();
			if (digitado == 1) {
				continuar = true;
			} else {
				continuar = false;
			}
		} while (continuar);

	}
}
