package menu_opcoes;

import java.util.Scanner;

public class Despesa {
	public static void despesa() {
		Scanner scanner = new Scanner(System.in);
		double rendaMes = 0, tudoEmDinheiro = 0, tudoEmCartao = 0, totalDespesas = 0, restante = 0;
		boolean continuar = false;
		int opcao, teste = 11;

		do {
			do {
				System.out.println("qual a sua renda neste mes: ");
				rendaMes = scanner.nextDouble();
				System.out.println("quantidade gasto em DINHEIRO: ");
				tudoEmDinheiro = scanner.nextDouble();
				System.out.println("quantidade gasto em CARTÃO: ");
				tudoEmCartao = scanner.nextDouble();
				System.out.println("");

				if (tudoEmDinheiro < 0 || tudoEmCartao < 0) { // caso o que for gasto em dinheiro ou cartao for
																// negativo, refazer todo os passos
					System.out.println("Não é possível inserir valores negativos neste campo");
					System.out.println("Insira novamente");
					continuar = true;
					break;
				} else {
					totalDespesas = tudoEmDinheiro + tudoEmCartao;
					System.out.println("Total de despesas");
					System.out.println(totalDespesas + " \n");

					restante = rendaMes - totalDespesas;

					if (totalDespesas > rendaMes) {
						System.out.println("Fazer empréstimo no banco \nVoce ficou com: R$" + restante);
					} else if (restante == 0) {
						System.out.println("Saldo: R$" + restante + "\nNão restou nenhum dinheiro");
					} else {
						System.out.println(
								"Você ficou com o saldo positivo neste mês \nRestou em sua conta R$" + restante);
						System.out.println("");
					}
				}
			} while (teste < 10);

			System.out.println("\nDeseja calcular outra despesa? \n1 - Sim ou 2 - Não");
			opcao = scanner.nextInt();
			if (opcao == 1) {
				continuar = true;
			} else {
				continuar = false;
			}

		} while (continuar);
	}
}
