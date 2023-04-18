package menu_opcoes.calculo;

import java.text.DecimalFormat;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class RegraTres {

	/**
	 * ira calular por uma regra de tres com os valores que o usuario digitar
	 */
	public static void regraDeTres() {

		LeitorDeDados scanner = new LeitorDeDados();
		DecimalFormat formatador = new DecimalFormat("#0.0");
		Mensagem m = new Mensagem();

		int continuar;
		m.lnPrintaMensagemLn("------------------ REGRA DE TRÊS -----------------");
		do {
			double porcentagem, total, valor;
			int digitou;

			m.printaMensagemSemPularLinha("Digite o valor total: ");
			total = scanner.pegarNumeroQuebrado();
			m.printaMensagemSemPularLinha("Digite a porcentagem: ");
			porcentagem = scanner.pegarNumeroQuebrado();

			valor = (porcentagem * total) / 100;
			m.lnPrintaMensagemLn(porcentagem + "% d e" + total + " = " + formatador.format(valor));

			m.printaMensagem("Deseja fazer outra conta?");
			m.printaMensagem("1 - SIM ou 2 - NÃO");
			digitou = scanner.pegarNumeroInteiro();
			if (digitou == 1) {
				continuar = 1;
			} else {
				continuar = 2;
			}
		} while (continuar != 2);
	}
}
