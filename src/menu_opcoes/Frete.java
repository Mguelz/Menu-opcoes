package menu_opcoes;

import java.util.Scanner;

public class Frete {
	public static void frete() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite sua UF");
		String uf = scanner.next().toUpperCase(); // o toUpperCase aumentara o caractere que o user digitar
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
