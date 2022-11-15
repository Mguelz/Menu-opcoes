package menu_opcoes;

//import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte opcaoEscolha = 0;
		boolean continuar = true;

		do {
			Opcoes.escolherOpcoes();
			/*
			 * ao usuario tentar digitar algum valor inválido, o programa não poderá parar
			 */
			try {
				opcaoEscolha = scanner.nextByte();
			} catch (Exception e) {		 // Value out of range / RuntimeException / InputMismatchException
				System.out.println("Você digtou um valor inválido \nProblema: " + e.getMessage());
				continuar = true; // para que o fluxo do código continuar funcionando
				break; // ignorar todos os código abaixo até bater na chave do loop while para continuar o loop
			}
//			finally {}

			switch (opcaoEscolha) {
			case 1:
				IMC.imc();
				Opcoes.linhaFinal();
				break;
			case 2:
				Tabuada.tabuada();
				Opcoes.linhaFinal();
				break;
			case 3:
				Despesa.despesa();
				Opcoes.linhaFinal();
				break;
			case 4:
				MultaSimples.multa();
				Opcoes.linhaFinal();
				break;
			case 5:
				MultaAvancado.multaAvancado();
				Opcoes.linhaFinal();
				break;
			case 6:
				NumeroSorte.numeroSorte();
				break;
			case 7:
				Frete.frete();
				Opcoes.linhaFinal();
				break;
			case 8:
				ParImpar.parImpar();
				Opcoes.linhaFinal();
				break;
			case 9:
				Jokenpo.jokenpo();
				break;
			case 10:
				RegraTres.regraDeTres();
				Opcoes.linhaFinal();
				break;
			case 11:
				ConversorFahrenheit.ConverterFahrenheit();
				Opcoes.linhaFinal();
				break;
			case 0: // SAIR
				System.out.println("Programa fechado!");
				Opcoes.linhaFinal();
				continuar = false;
				break;
			default:
				System.out.println("Digite uma opcao valida");
				Opcoes.linhaFinal();
				break;
			}
		} while (continuar);
		scanner.close();

	}

}
