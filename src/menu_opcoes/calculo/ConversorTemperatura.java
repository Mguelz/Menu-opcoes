package menu_opcoes.calculo;

import java.text.DecimalFormat;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class ConversorTemperatura {

	/**
	 * Apos o usuario digitar o graus juntamente com a medida desejada, é possivel
	 * converter esse graus para qualquer outra medida de temperatura (Celcius,
	 * Fahrenheit e Kelvin)
	 */
	public static void conversorTemperatura() {
		LeitorDeDados scanner = new LeitorDeDados();
		Mensagem m = new Mensagem();
		ConversorTemperatura ct = new ConversorTemperatura();
		
		double num = 0;
		char caractere, retornar = 0;
		boolean continuar = false;
		int repetir;

		m.lnPrintaMensagem("------------------ CONVERSOR DE GRAUS -----------------");

		do {
			try {
				m.printaMensagem("C - Celcius");
				m.printaMensagem("F - Fahrenheit");
				m.printaMensagem("K - Kelvin");
				m.printaMensagemSemPularLinha("Digite em que medida estará os seu grau: ");
				caractere = scanner.pegarPrimeiraLetraMaiuscula();
				m.printaMensagemSemPularLinha("Digite a quantidade de graus: ");
				num = Double.parseDouble(scanner.pegarTextoCompleto());
				m.printaMensagem(" ");
				m.printaMensagem("C - Celcius");
				m.printaMensagem("F - Fahrenheit");
				m.printaMensagem("K - Kelvin");
				m.printaMensagemSemPularLinha("Digite a temperatura que deseja converter: ");
				retornar = scanner.pegarPrimeiraLetraMaiuscula();

				m.printaMensagem("Temperatura Antes: " + num);
				m.printaMensagem("Temperatura Depois: " + ct.converterTemperatura(num, caractere, retornar));

				m.lnPrintaMensagem("1 - Sim ou 2 - Não");
				m.printaMensagemSemPularLinha("Deseja verificar outra temperatura: ");
				repetir = scanner.pegarNumeroInteiro();
				if (repetir == 1) {
					continuar = true;
				} else {
					continuar = false;
				}

			} catch (Exception e) {
				m.lnPrintaMensagemLn("Voce digitou algum dado errado");
				continuar = true;
			}

		} while (continuar);
	}

	/**
	 * Retorna a temperatura em graus escolhida
	 * 
	 * recebe a quantidade de graus que o usuario quer converter para a temperatura desejada <br>
	 * no final retornando a 
	 * 
	 * @param num
	 * @param caractere
	 * @param retornar
	 * @return
	 */
	private double converterTemperatura(double num, char caractere, char retornar) {
		Mensagem m = new Mensagem();

		double celcius = 0, fahrenheit = 0, kelvin = 0;

		switch (caractere) {
		case 'C':
			celcius = num;
			fahrenheit = celcius * 1.8 + 32; // C to F
			kelvin = celcius + 273.15; // C to K
			if (retornar == 'C') {
				return celcius;
			} else if (retornar == 'F') {
				return fahrenheit;
			} else if (retornar == 'K') {
				return kelvin;
			}
			break;
		case 'F':
			fahrenheit = num;
			celcius = (32 * fahrenheit - 32) * 5 / 9;
			celcius = (fahrenheit - 32) / 1.8; // F to C
			kelvin = celcius + 273.15; // C to K
			if (retornar == 'C') {
				return celcius;
			} else if (retornar == 'F') {
				return fahrenheit;
			} else if (retornar == 'K') {
				return kelvin;
			}
			break;
		case 'K':
			kelvin = num;
			celcius = kelvin - 273.15; // K to C
			fahrenheit = (celcius * 1.8) + 32; // K to F
			if (retornar == 'C') {
				return celcius;
			} else if (retornar == 'F') {
				return fahrenheit;
			} else if (retornar == 'K') {
				return kelvin;
			}
			break;
		default:
			m.printaMensagem("Voce nao digitou (C, F ou K)");
		}
		return kelvin;
	}

	/**
	 * Irá converter de a temperatura de Fahrenheit para Celcius
	 */
	private void ConverterFahrenheitAntigo() {
		LeitorDeDados scanner = new LeitorDeDados();

		double celcius, fahrenheit;
		boolean continuar = false;
		int opcao = 0;

		System.out.println("\n------------------ CONVERSOR DE GRAUS -----------------");
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
