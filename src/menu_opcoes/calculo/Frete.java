package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;

public class Frete {
	public static void frete() {
		LeitorDeDados scanner  = new LeitorDeDados();

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
	}
}
