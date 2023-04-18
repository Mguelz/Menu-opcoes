package menu_opcoes.calculo;

import java.text.DecimalFormat;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class ConversorFahrenheit {

	/**
	 * Irá converter de a temperatura de Fahrenheit para Celcius
	 */
	public static void ConverterFahrenheit() {
		LeitorDeDados scanner = new LeitorDeDados();
		Mensagem m = new Mensagem();

		double celcius, fahrenheit;
		boolean continuar = false;
		int opcao = 0;

		m.lnPrintaMensagem("------------------ CONVERSOR DE GRAUS -----------------");
		m.printaMensagemLn("Converter a temperatura em Fahrenheit para Celcius");

		do {
			DecimalFormat formatador = new DecimalFormat("#0.0");
			m.lnPrintaMensagemLn("Digite a temperatuda em fahrenheit: ");
			fahrenheit = scanner.pegarNumeroQuebrado();

			celcius = (5 * (fahrenheit - 32)) / 9;

			m.printaMensagemLn("Temperatura em Celsious: " + formatador.format(celcius) + "ºC");
			m.printaMensagemLn("Deseja converter novamente?");
			m.printaMensagemErroLn("1 - Sim ou  2 - Não");
			opcao = scanner.pegarNumeroInteiro();
			if (opcao == 1) {
				continuar = true;
			} else {
				continuar = false;
			}
		} while (continuar);
	}
}
