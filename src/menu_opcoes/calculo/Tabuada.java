package menu_opcoes.calculo;

import java.util.Scanner;

public class Tabuada {
	static int tabuada = 0, valorFinal, continuar = 1; // static para que os metodos staticos tenham acesso à variavel

	public static void tabuada() {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Qual a tabuada que você deseja: ");
			tabuada = scanner.nextInt();
			System.out.println("Até que valor deseja calcular? ");
			valorFinal = scanner.nextInt();
			int valorSecundario = 0;
			do {
				System.out.println(tabuada + " x " + valorSecundario + " = " + (tabuada * valorSecundario));
				valorSecundario++;
			} while (valorSecundario < (valorFinal + 1));

			System.out.println("\nDeseja consutlar outra tabuada? \n1 - Sim ou 2 - Não");
			tabuada = scanner.nextInt();
			if (tabuada == 1) {
				continuar = 0;
			} else {
				continuar = 1;
			}
		} while (continuar == 0);
	}

	public static void tabuadaPrincipiante() {
		Scanner scanner = new Scanner(System.in);

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
