package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class Despesa {

	/**
	 * recolhe a quantidade de dinheiro que arrecadou no mes<br>
	 * tambem obtem a quantidade obtida em dinheiro e cartao<br>
	 * o sistema fará o calculo se voce esta devendo ou sobrando dinheiro<br>
	 * 
	 */
	public static void despesa() {
		LeitorDeDados scanner = new LeitorDeDados();
		Mensagem m = new Mensagem();

		double rendaMes = 0, tudoEmDinheiro = 0, tudoEmCartao = 0, totalDespesas = 0, restante = 0;
		boolean continuarTry = false;
		int opcao, teste = 11;

		do {
			try {
				do {
					m.lnPrintaMensagemLn("------------------ DESPESA -----------------");
					m.lnPrintaMensagemLn("qual a sua renda neste mes: ");
					rendaMes = scanner.pegarNumeroQuebrado();
					m.lnPrintaMensagemLn("quantidade gasto em DINHEIRO: ");
					tudoEmDinheiro = scanner.pegarNumeroQuebrado();
					m.lnPrintaMensagemLn("quantidade gasto em CARTÃO: ");
					tudoEmCartao = scanner.pegarNumeroQuebrado();
					m.lnPrintaMensagemLn("");

					if (tudoEmDinheiro < 0 || tudoEmCartao < 0) { // caso o que for gasto em dinheiro ou cartao for
																	// negativo, refazer todo os passos
						m.printaMensagemLn("Não é possível inserir valores negativos neste campo");
						m.printaMensagemLn("Insira novamente");
						continuarTry = true;
						break;
					} else {
						m.printaMensagemLn("----------------------------------------------");
						totalDespesas = tudoEmDinheiro + tudoEmCartao;
						m.printaMensagemLn("Total de despesas");
						m.printaMensagemLn(totalDespesas + "");
						m.printaMensagemLn("----------------------------------------------");
						restante = rendaMes - totalDespesas;

						if (totalDespesas > rendaMes) {
							m.printaMensagemLn("Fazer empréstimo no banco ");
							m.printaMensagemLn("Voce ficou com: R$" + restante);
						} else if (restante == 0) {
							m.printaMensagemLn("Saldo: R$" + restante);
							m.lnPrintaMensagemLn("Não restou nenhum dinheiro");
						} else {
							m.printaMensagemLn("Você ficou com o saldo positivo neste mês");
							m.printaMensagemLn("Restou em sua conta R$" + restante);
//							m.printaMensagemLn("");
						}
					}
				} while (teste < 10);

			} catch (Exception e) {
				m.lnPrintaMensagemLn("É somente permitido números");
				continuarTry = true;
			}

			m.lnPrintaMensagemLn("Deseja calcular outra despesa?");
			m.printaMensagemLn("1 - Sim ou 2 - Não");
			opcao = scanner.pegarNumeroInteiro();
			if (opcao == 1) {
				continuarTry = true;
			} else {
				continuarTry = false;
			}
		} while (continuarTry);
	}
}
