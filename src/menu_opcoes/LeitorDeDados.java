package menu_opcoes;

import java.util.Scanner;

public class LeitorDeDados {
	private Scanner scanner;

	public LeitorDeDados() {
		scanner = new Scanner(System.in);
	}

	public byte pegarByteDigitado() {
		return Byte.parseByte(scanner.nextLine());
	}

	/**
	 * faz a leitura doque o usuario digitar até o "enter"
	 * 
	 * @return nextLine()
	 */
	public String pegarTextoCompleto() {
		return scanner.nextLine();
	}

	/**
	 * faz a leitura doque o usuario digitar até o primeiro "espaço"
	 * 
	 * @return next()
	 */
	public String pegarTextoCurto() {
		return scanner.next();
	}

	/**
	 * faz a leitura de um inteiro que o usuario digitar
	 * 
	 * @return nextInt()
	 */
	public int pegarNumeroInteiro() {
		return Integer.parseInt(scanner.nextLine());
	}

	public double pegarNumeroQuebrado() {
		return Double.parseDouble(scanner.nextLine());
	}

	/**
	 * Faz a leitura somente da primeira letra digitada, a tornando maiuscula
	 * 
	 * @return
	 */
	public char pegarPrimeiraLetraMaiuscula() {
		return scanner.nextLine().toUpperCase().charAt(0);
	}

	/**
	 * fecha o Scanner
	 */
	public void fecharLeitor() {
		scanner.close();
	}
}
