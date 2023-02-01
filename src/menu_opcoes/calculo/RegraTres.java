package menu_opcoes.calculo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RegraTres {
	public static void regraDeTres() {

		Scanner scanner = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");

		int continuar;
		do {
			double porcentagem, total, valor;
			int digitou;
			
			System.out.print("\nDigite o valor total: ");
			total = scanner.nextDouble();
			System.out.print("Digite a porcentagem: ");
			porcentagem = scanner.nextDouble();

			valor = (porcentagem * total) / 100;
			System.out.println("\n" + porcentagem + "% de " + total + " = " + formatador.format(valor) + " \n");

			System.out.println("Deseja fazer outra conta? \n1 - SIM ou 2 - NÂO");
			digitou = scanner.nextInt();
			if (digitou == 1) {
				continuar = 1;
			} else {
				continuar = 2;
			}
		} while (continuar != 2);
	}
}
