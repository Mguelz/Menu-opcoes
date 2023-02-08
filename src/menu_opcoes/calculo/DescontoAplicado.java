package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;

public class DescontoAplicado {
	
	/**
	 * de acordo com a quantidade que for gasta o sistema irá calcular o desconto 
	 */
	public static void desontoAplicado() {
		LeitorDeDados scanner = new LeitorDeDados();
		double desconto, valorCompra, valorDescontado;
		boolean continuarComprando = true;
		int opcao;

		System.out.println("\n------------------ DESCONTO APLICADO -----------------");
		do {
			System.out.println("\nDigite o valor da sua compra: ");
			valorCompra = scanner.pegarNumeroQuebrado();

			if (valorCompra <= 200) {
				desconto = valorCompra * 0.04;
				valorDescontado = valorCompra - desconto;
				System.out.print("\nSeu desconto foi de " + desconto);
				System.out.println(" | desconto em porcentagem = 4%");
				System.out.println("Valor total R$: " + valorDescontado);
			} else if (valorCompra <= 500) {
				desconto = valorCompra * 0.06;
				valorDescontado = valorCompra - desconto;
				System.out.print("\nSeu desconto foi de " + desconto);
				System.out.println(" | desconto em porcentagem = 6%");
				System.out.println("Valor total R$: " + valorDescontado);
			} else {
				desconto = valorCompra * 0.08;
				valorDescontado = valorCompra - desconto;
				System.out.print("\nSeu desconto foi de " + desconto);
				System.out.println(" | desconto em porcentagem = 8%");
				System.out.println("Valor total R$: " + valorDescontado);
			}
			System.out.println("\nDeseja calcular outra despesa? \n1 - Sim ou 2 - Não");
			opcao = scanner.pegarNumeroInteiro();
			if (opcao == 2) {
				continuarComprando = false;
			} else {
				continuarComprando = true;
			}
		} while (continuarComprando);

	}
}
