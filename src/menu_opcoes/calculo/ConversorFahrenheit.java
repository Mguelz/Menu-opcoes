package menu_opcoes.calculo;

import java.text.DecimalFormat;
import menu_opcoes.LeitorDeDados;

public class ConversorFahrenheit {
	public static void ConverterFahrenheit() {
		LeitorDeDados scanner = new LeitorDeDados();

		double celcius, fahrenheit;
		boolean continuar = false;
		int opcao = 0;

		System.out.println("Converter a temperatura em Fahrenheit para Celcius \n");

		do {
			DecimalFormat formatador = new DecimalFormat("#0.0");
			System.out.print("Digite a temperatura em fahrenheit: ");
			fahrenheit = scanner.pegarNumeroQuebrado();

			celcius = (5 * (fahrenheit - 32)) / 9;

			System.out.println("Temperatura em Celsius: " + formatador.format(celcius) + "°C");

			System.out.println("Deseja converter novamente? \n1 - Sim ou 2 - Não");
			opcao = scanner.pegarNumeroInteiro();
			if (opcao == 1) {
				continuar = true;
			} else {
				continuar = false;
			}
		} while (continuar);
	}
}
