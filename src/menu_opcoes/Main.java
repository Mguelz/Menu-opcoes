package menu_opcoes;

//import java.util.InputMismatchException;
import java.util.Scanner;

import menu_opcoes.calculo.ConversorFahrenheit;
import menu_opcoes.calculo.Despesa;
import menu_opcoes.calculo.Frete;
import menu_opcoes.calculo.IMC;
import menu_opcoes.calculo.MultaAvancado;
import menu_opcoes.calculo.MultaSimples;
import menu_opcoes.calculo.RegraTres;
import menu_opcoes.calculo.Tabuada;
import menu_opcoes.game.Jokenpo;
import menu_opcoes.game.NumeroSorte;
import menu_opcoes.game.ParImpar;

public class Main {
	
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

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Opcoes op = new Opcoes();
		byte opcaoEscolha = 0;
		boolean continuar = true;

		do {
//			op.verificarOqueForDigitado();
			
				
//			esta funcionando, porem eu quero que o programa nao pare
  
			Opcoes.escolherOpcoes();
			try {
				opcaoEscolha = scanner.nextByte();
			} catch (Exception e) {		 // Value out of range / RuntimeException / InputMismatchException
				System.out.println("Você digtou um valor inválido \nProblema: " + e.getMessage());
				continuar = true; // para que o fluxo do código continuar funcionando
				break; // ignorar todos os código abaixo até bater na chave do loop while para continuar o loop
			}
			
			switch (opcaoEscolha) {
			case OPCAO_IMC:
				IMC.imc();
				Opcoes.linhaFinal();
				break;
			case OPCAO_TABUADA:
				Tabuada.tabuada();
				Opcoes.linhaFinal();
				break;
			case OPCAO_DESPESA:
				Despesa.despesa();
				Opcoes.linhaFinal();
				break;
			case OPCAO_MULTA:
				MultaSimples.multa();
				Opcoes.linhaFinal();
				break;
			case OPCAO_MULTA_AVANCADO:
				MultaAvancado.multaAvancado();
				Opcoes.linhaFinal();
				break;
			case OPCAO_NUMERO_SORTE:
				NumeroSorte.numeroSorte();
				break;
			case OPCAO_FRETE:
				Frete.frete();
				Opcoes.linhaFinal();
				break;
			case OPCAO_PAR_IMPAR:
				ParImpar.parImpar();
				Opcoes.linhaFinal();
				break;
			case OPCAO_JOKENPO:
				Jokenpo.jokenpo();
				break;
			case OPCAO_REGRA3:
				RegraTres.regraDeTres();
				Opcoes.linhaFinal();
				break;
			case OPCAO_CONVERTER_FAHRENHEIT:
				ConversorFahrenheit.ConverterFahrenheit();
				Opcoes.linhaFinal();
				break;
			case OPCAO_SAIR: // SAIR
				System.out.println("Programa Fechado!");
				Opcoes.linhaFinal();
				continuar = false;
				break;
			default:
				System.out.println("Digite uma Opcao Válida");
				Opcoes.linhaFinal();
				break;
			}
		} while (continuar);
		scanner.close();

	}

}
