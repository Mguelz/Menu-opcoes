package menu_opcoes;

import java.util.Scanner;

public class MultaSimples {
	public static void multa() {
		Scanner scanner = new Scanner(System.in);
		byte pontosCNH = 0;
		boolean continuar = true, repetir = false;
		int opcao;

		do {
			do {
				System.out.println("Quantos pontos na CNH você recebeu?");
				pontosCNH = scanner.nextByte();
				if (pontosCNH == 3) {
					System.out.println("Infração Leve ");
					System.out.println("R$ 88,38 de multa");
					continuar = false;
				} else if (pontosCNH == 4) {
					System.out.println("Infração Média");
					System.out.println("R$ 130,16 de multa");
					continuar = false;
				} else if (pontosCNH == 5) {
					System.out.println("Infração Grave ");
					System.out.println("R$ 195,23 de multa");
					continuar = false;
				} else if (pontosCNH == 7) {
					System.out.println("Infração Gravíssima ");
					System.out.println("R$ 283,47 de multa");
					continuar = false;
				}
				if (pontosCNH != 3 && pontosCNH != 4 && pontosCNH != 5 && pontosCNH != 7) {
					System.out.println("Digite uma quantidade valida (3,4,5 ou 7)");
					continuar = true;
				}
			} while (continuar);

			System.out.println("\nDeseja calcular outra vez? \n1 - Sim ou  2 - Não");
			opcao = scanner.nextInt();
			if (opcao == 1) {
				repetir = true;
			} else {
				repetir = false;
			}
		} while (repetir);
	}
}
