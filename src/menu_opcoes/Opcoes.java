package menu_opcoes;

import java.util.InputMismatchException;

public class Opcoes {
	LeitorDeDados scanner = new LeitorDeDados();

	/**
	 * Apresenta ao usuario o menu de opcoes
	 */
	public void escolherOpcoes() {
		Mensagem m = new Mensagem();
		m.lnPrintaMensagem("-------------------------------- Tela de Menu --------------------------------");
		m.lnPrintaMensagem("Escolha uma das opcoes abaixo");
		m.printaMensagemLn("Digite um número: ");
		m.printaMensagem(" 1 - IMC");
		m.printaMensagem(" 2 - Tabuada");
		m.printaMensagem(" 3 - Despesas");
		m.printaMensagem(" 4 - Multas (simples) ");
		m.printaMensagem(" 5 - Multas (avançado) ");
		m.printaMensagem(" 6 - Número da sorte ");
		m.printaMensagem(" 7 - Frete ");
		m.printaMensagem(" 8 - Par ou impar ");
		m.printaMensagem(" 9 - Jokenpo ");
		m.printaMensagem(" 10 - Regra de 3 ");
		m.printaMensagem(" 11 - Conversor de Fahrenheit ");
		m.printaMensagem(" 12 - Desconto Aplicado ");
		m.printaMensagem(" 13 - Numero Primo ");
		m.printaMensagem(" 14 - Triângulos ");
		m.printaMensagem(" 15 - Em Breve ");
		m.printaMensagem(" 16 - Em Breve ");
		m.printaMensagem(" 17 - Cálculo para Comprar Gasolina ou Álcool");
		m.printaMensagemLn(" 0 - Sair ");
	}

	/**
	 * Apresenta no console uma linha pontilhada servindo como borda final
	 */
	public static void linhaFinal() {
		Mensagem m = new Mensagem();
		m.printaMensagem("--------------------------------------");
	}

	/**
	 * enquanto o usuario nao digitar um numero válido, continua repetindo até que
	 * coloque uma opcao válida
	 * 
	 * ESTE METODO NAO ESTA SENDO USADO !!!!!!!!!!!!!!!!!!!!
	 */
	public void verificarOqueForDigitado() {
		Opcoes op = new Opcoes();
		Mensagem m = new Mensagem();

		op.escolherOpcoes();
		byte opcaoEscolha = -1;
		boolean continuarTry = true;

		// copiado do método principal porque nao sei como aplicaria dentro de um método
		// fora do main
		do {
			m.lnPrintaMensagemLn("Digite uma opção de 0 à 17:");
			try {
				opcaoEscolha = scanner.pegarByteDigitado();
				if (opcaoEscolha >= 0 || opcaoEscolha <= 12) {
					continuarTry = false;
				} else {
					System.out.println("Opção inválida, digite novamente.");
				}
			} catch (InputMismatchException erroDeInput) {
				System.out.println("\nÉ somente permitido números!");
				scanner.pegarTextoCompleto();
			} catch (Exception e) {
				System.out.println("error: " + e);
				scanner.pegarTextoCompleto();
			}
		} while (continuarTry);
	}
}
