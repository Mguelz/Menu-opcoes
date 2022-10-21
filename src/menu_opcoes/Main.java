package menu_opcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Opcoes opcoes = new Opcoes();

		byte opcaoEscolha;
		boolean continuar = true;

		do {
			opcoes.escolherOpcoes();
			opcaoEscolha = scanner.nextByte();

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
				Multa.multa();
				Opcoes.linhaFinal();
				break;
			case 5:
				NumeroSorte.numeroSorte();
				break;
			case 6:
				Frete.frete();
				Opcoes.linhaFinal();
				break;
			case 7:
				ParImpar.parImpar();
				Opcoes.linhaFinal();
				break;
			case 8:
				Jokenpo.jokenpo();
				break;
			case 0: // SAIR
				System.out.println("Programa fechado!");
				Opcoes.linhaFinal();
				continuar = false;
				break;
			case 9:
				RegraTres.regraDeTres();
				Opcoes.linhaFinal();
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
