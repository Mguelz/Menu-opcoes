package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class NumeroPrimo {

	/**
	 * o método é capaz de identifricar se o numero digitado é primo ou nao
	 * 
	 * @return
	 */
	public static boolean numeroPrimo() {
		LeitorDeDados scanner = new LeitorDeDados();
		Mensagem m = new Mensagem();

		boolean primo = false, continuar = false;
		int qtd = 0, digitado = 0;

		apresentaNumeroPrimo();
		do {
			try {
				m.lnPrintaMensagemSemPularLinha("Digite um numero: ");
				int num = scanner.pegarNumeroInteiro();

				for (int i = 1; i <= num; i++) {
					if (num % i == 0) {
						qtd++;
					}
				}

				if (qtd == 2) {
					primo = true;
				}

				if (primo) {
					m.lnPrintaMensagem("O numero " + num + " eh um numero primo");
				} else {
					m.lnPrintaMensagem("O numero " + num + " nao eh primo");
				}
				qtd = 0;
				primo = false;

				m.lnPrintaMensagem("Deseja calcular outro numero?");
				m.printaMensagem("1- Sim ou 2 - Não");
				digitado = scanner.pegarNumeroInteiro();
				if (digitado == 1) {
					continuar = true;
				} else {
					continuar = false;
				}

			} catch (NumberFormatException number) {
				m.lnPrintaMensagem("------------------------ ERRO ------------------------");
				m.printaMensagemLn("É somente permitido numeros");
				m.printaMensagemErro("Erro: " + number);
				m.printaMensagem("------------------------------------------------------");
				continuar = true;
			} catch (Exception e) {
				m.lnPrintaMensagem("------------------------ ERRO ------------------------");
				m.printaMensagemLn("É somente permitido numeros");
				m.printaMensagemErro("Erro: " + e);
				m.printaMensagem("------------------------------------------------------");
			}

		} while (continuar);

		return primo;
	}

	/**
	 * Apresenta como funciona o identificar de numero primo
	 */
	private static void apresentaNumeroPrimo() {
		Mensagem m = new Mensagem();

		m.lnPrintaMensagemLn("------------------ Numero Primo -----------------");
		m.printaMensagem("Ao digitar um numero o sistema exibira se o mesmo é primo ou nao");
		m.printaMensagem("");
	}
}
