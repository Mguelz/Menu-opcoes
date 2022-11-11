package menu_opcoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversorFahrenheit {
	public static void ConverterFahrenheit() {
		Scanner scanner = new Scanner(System.in);

		double c, f;
		boolean continuar = false;
		int opcao = 0;

		System.out.println("Converter a temperatura em Fahrenheit para Celcius \n");

		do {
			DecimalFormat formatador = new DecimalFormat("#0.0");

			System.out.print("Digite a temperatura em fahrenheit: ");
			f = scanner.nextDouble();

			c = (5 * (f - 32)) / 9;

			System.out.println("Temperatura em Celsius: " + formatador.format(c) + "°C");

			System.out.println("Deseja converter novamente? \n1 - Sim ou 2 - Não");
			opcao = scanner.nextInt();

			if (opcao == 1) {
				continuar = true;
			} else {
				continuar = false;
			}
		} while (continuar);
	}
}
