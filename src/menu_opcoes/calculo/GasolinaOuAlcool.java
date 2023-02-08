package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;

public class GasolinaOuAlcool {

	public static void gasolinaOuAlcool() {
		LeitorDeDados scanner = new LeitorDeDados();

		double gasolina, alcool;
		int digitado;
		boolean continuar = true;

		System.out.println("\n------------------ Gasolina ou Álcool-----------------");
		do {
			System.out.println("Digite o valor do álcool: ");
			alcool = scanner.pegarNumeroQuebrado();
			System.out.println("Digite o valor da gasolina: ");
			gasolina = scanner.pegarNumeroQuebrado();

			if (alcool < 0.7 * gasolina) {
				System.out.println("Abastecer com álcool");
			} else {
				System.out.println("Abastecer com gasolina");
			}
			System.out.println("Deseja calcular novamente? \n1 - Sim ou 2 - Não");
			digitado = scanner.pegarNumeroInteiro();
			if (digitado == 1) {
				continuar = true;
			} else {
				continuar = false;
			}
		} while (continuar);

	}
}
