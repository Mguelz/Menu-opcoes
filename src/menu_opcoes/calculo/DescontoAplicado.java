package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class DescontoAplicado {

	/**
	 * de acordo com a quantidade que for gasta o sistema irá calcular o desconto
	 */
	public static void desontoAplicado() {
		LeitorDeDados scanner = new LeitorDeDados();
		Mensagem m = new Mensagem();

		double desconto, valorCompra, valorDescontado;
		boolean continuarComprando = true;
		int opcao;

		m.lnPrintaMensagem("------------------ DESCONTO APLICADO -----------------");
		do {
			m.lnPrintaMensagemSemPularLinha("Digite o valor da sua compra: ");
			valorCompra = scanner.pegarNumeroQuebrado();

			if (valorCompra <= 200) {
				desconto = valorCompra * 0.04;
				valorDescontado = valorCompra - desconto;
				m.lnPrintaMensagem("Seu desconto foi de " + desconto);
				m.printaMensagem(" | desconto em porcentagem = 4%");
				m.printaMensagem("Valor total R$: " + valorDescontado);
			} else if (valorCompra <= 500) {
				desconto = valorCompra * 0.06;
				valorDescontado = valorCompra - desconto;
				m.printaMensagemSemPularLinha("Seu desconto foi de " + desconto);
				m.printaMensagem(" | desconto em porcentagem = 6%");
				m.printaMensagem("Valor total R$: " + valorDescontado);
			} else {
				desconto = valorCompra * 0.08;
				valorDescontado = valorCompra - desconto;
				m.lnPrintaMensagemSemPularLinha("Seu desconto foi de " + desconto);
				m.printaMensagem(" | desconto em porcentagem = 8%");
				m.printaMensagem("Valor total R$: " + valorDescontado);
			}
			m.lnPrintaMensagem("Deseja calcular outra despesa?");
			m.printaMensagem("1 - Sim ou 2 - Não");
			opcao = scanner.pegarNumeroInteiro();
			if (opcao == 2) {
				continuarComprando = false;
			} else {
				continuarComprando = true;
			}
		} while (continuarComprando);

	}
}
