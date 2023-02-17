package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;

public class Frete {

	/**
	 * O usuario irá digitar aonde ele mora<br>
	 * o sistema irá calular a quantidade de desconto ele tem de acordo com o estado
	 */
	public static void frete() {
		LeitorDeDados scanner = new LeitorDeDados();
		boolean continuar = true;

		System.out.println("\n------------------ FRETE -----------------\n");
		do {
			System.out.println("Digite sua UF");
			String uf = scanner.pegarTextoCurto().toUpperCase();
			switch (uf) {
			case "SP":
			case "RJ":
				System.out.println("Seu desconto é de R$ 10,00");
				break;
			case "AM":
				System.out.println("Seu desconto é de R$ 35,00");
				break;
			case "GO":
				System.out.println("Seu desconto é de R$ 30,00");
				break;
			case "BA":
				System.out.println("Seu desconto é de R$ 50,00");
				break;
			default:
				System.out.println("Sua UF não possui desconto");
				break;
			}
			System.out.println("\nDeseja calcular outro IMC? \n1 - SIM ou 2 - NÃO");
			uf = scanner.pegarTextoCompleto(); // TODO o programa nao esta parando aqui
			if (uf.equals(1)) {
				continuar = true;
			} else {
				continuar = false;
			}
		} while (continuar);
	}
}
