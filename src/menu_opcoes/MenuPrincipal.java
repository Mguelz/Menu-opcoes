package menu_opcoes;

import java.util.InputMismatchException;

import menu_opcoes.calculo.ConversorFahrenheit;
import menu_opcoes.calculo.DescontoAplicado;
import menu_opcoes.calculo.Despesa;
import menu_opcoes.calculo.Frete;
import menu_opcoes.calculo.GasolinaOuAlcool;
import menu_opcoes.calculo.IMC;
import menu_opcoes.calculo.MultaAvancado;
import menu_opcoes.calculo.MultaSimples;
import menu_opcoes.calculo.RegraTres;
import menu_opcoes.calculo.Tabuada;
import menu_opcoes.game.Jokenpo;
import menu_opcoes.game.NumeroSorte;
import menu_opcoes.game.ParImpar;

public class MenuPrincipal {

	public static final byte OPCAO_SAIR = 0;
	public static final byte OPCAO_IMC = 1;
	public static final byte OPCAO_TABUADA = 2;
	public static final byte OPCAO_DESPESA = 3;
	public static final byte OPCAO_MULTA = 4;
	public static final byte OPCAO_MULTA_AVANCADO = 5;
	public static final byte OPCAO_NUMERO_SORTE = 6;
	public static final byte OPCAO_FRETE = 7;
	public static final byte OPCAO_PAR_IMPAR = 8;
	public static final byte OPCAO_JOKENPO = 9;
	public static final byte OPCAO_REGRA3 = 10;
	public static final byte OPCAO_CONVERTER_FAHRENHEIT = 11;
	public static final byte OPCAO_DESCONTO_APLICADO = 12;
	public static final byte OPCAO_GASOLINA_OU_ALCOOL = 13;

	public static void navegação() {
		LeitorDeDados scanner = new LeitorDeDados();
		Opcoes opcoes = new Opcoes();
		Mensagem m = new Mensagem();
		byte opcaoEscolha = 0;
		boolean continuar = true;
		boolean continuarTry = false;

		do {
			opcoes.escolherOpcoes();

			do {
				m.printaMensagemSemPularLinha("Digite uma opção de " + OPCAO_SAIR + " à " + OPCAO_GASOLINA_OU_ALCOOL + ": ");

				try {
					opcaoEscolha = scanner.pegarByteDigitado();
					if (opcaoEscolha >= 0 || opcaoEscolha <= 12) {
						continuarTry = false;
					} else {
						m.printaMensagemLn("Opção inválida, digite novamente.");
					}
				} catch (InputMismatchException erroDeInput) {
					m.lnPrintaMensagem("É somente permitido números!");
					scanner.pegarTextoCompleto();
					continuarTry = true;
					m.printaMensagemSemPularLinha("Digite uma opção de " + OPCAO_SAIR + " à " + OPCAO_GASOLINA_OU_ALCOOL + ": "); // TODO fazer uma classe para guardar essas constantes para reuso
				} catch (NumberFormatException digitouLetra) {
					m.lnPrintaMensagemErro("error: " + digitouLetra);
					m.printaMensagemErro("É somente permitido números");
					continuarTry = true;
					m.lnPrintaMensagemSemPularLinha("Digite uma opção de " + OPCAO_SAIR + " à " + OPCAO_GASOLINA_OU_ALCOOL + ": ");
				} catch (Exception e) {
					m.printaMensagemErro("error: " + e);
					continuarTry = true;
					m.printaMensagemSemPularLinha("Digite uma opção de " + OPCAO_SAIR + " à " + OPCAO_GASOLINA_OU_ALCOOL + ": ");
					scanner.pegarTextoCompleto();
				}

			} while (continuarTry);

			switch (opcaoEscolha) {
			case OPCAO_IMC:
				IMC.imc();
				break;
			case OPCAO_TABUADA:
				Tabuada.tabuada();
				break;
			case OPCAO_DESPESA:
				Despesa.despesa();
				break;
			case OPCAO_MULTA:
				MultaSimples.multa();
				break;
			case OPCAO_MULTA_AVANCADO:
				MultaAvancado.multaAvancado();
				break;
			case OPCAO_NUMERO_SORTE:
				NumeroSorte.numeroSorte();
				break;
			case OPCAO_FRETE:
				Frete.frete();
				break;
			case OPCAO_PAR_IMPAR:
				ParImpar.parImpar();
				break;
			case OPCAO_JOKENPO:
				Jokenpo.jokenpo();
				break;
			case OPCAO_REGRA3:
				RegraTres.regraDeTres();
				break;
			case OPCAO_CONVERTER_FAHRENHEIT:
				ConversorFahrenheit.ConverterFahrenheit();
				break;
			case OPCAO_DESCONTO_APLICADO:
				DescontoAplicado.desontoAplicado();
				break;
			case OPCAO_GASOLINA_OU_ALCOOL:
				GasolinaOuAlcool.gasolinaOuAlcool();
				break;
			case OPCAO_SAIR: // SAIR
				m.lnPrintaMensagemLn("Programa Fechado!");
				continuar = false;
				break;
			default:
				m.printaMensagemLn("Digite uma Opcao Válida:");
				break;
			}
		} while (continuar);
		scanner.fecharLeitor();

	}
}
