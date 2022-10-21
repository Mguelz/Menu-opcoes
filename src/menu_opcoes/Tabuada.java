package menu_opcoes;

import java.util.Scanner;

public class Tabuada {
	public static void tabuada() {
		Scanner scanner = new Scanner(System.in);
		int tabuada = 0, continuar = 1;

		do {
			System.out.println("Qual a tabuada que você deseja: ");
			tabuada = scanner.nextInt();

			int i = 0;
			do {
				System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
				i++;
			} while (i < 11);
			
			System.out.println("\nDeseja consutlar outra tabuada? \n1 - Sim ou 2 - Não");
			tabuada = scanner.nextInt();
			if (tabuada == 1) {
				continuar = 0;
			} else {
				continuar = 1;
			}

		} while (continuar == 0);
	}
}
