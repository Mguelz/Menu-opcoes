package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class Triangulo {
	public static void descobrirTriangulo() {
		LeitorDeDados scanner = new LeitorDeDados();
		Mensagem m = new Mensagem();

		int a = 0, b = 0, c = 0, digitado = 0;
		boolean continuar = false;

		m.lnPrintaMensagemLn("------------------ PAR OU ÍMPAR-----------------");

		do {
			try {
			m.lnPrintaMensagemSemPularLinha("Digite o valor de A: ");
			a = scanner.pegarNumeroInteiro();
			m.printaMensagemSemPularLinha("Digite o valor de B: ");
			b = scanner.pegarNumeroInteiro();
			m.printaMensagemSemPularLinha("Digite o valor de C: ");
			c = scanner.pegarNumeroInteiro();
			System.out.println("");

			// ordenar de forma decrescente. De forma com que A > B > C
			if (a < b) {
				int temp = a;
				a = b;
				b = temp;
			}
			if (a < c) {
				int temp = a;
				a = c;
				c = temp;
			}
			if (b < c) {
				int temp = b;
				b = c;
				c = temp;
			}

			if (a >= (b + c)) {
				m.printaMensagem("nao forma triangulo"); // somente colocar um else para nao precisar fazer nenhuma
															// logica || (a <= b + c)
			} else if (a == b && a == c && b == c) {
				m.printaMensagem("Triangulo Equilatero");
			}
			if ((a == b && b != c) || (a != b && b == c) || (c == b && b != a)) {
				m.printaMensagem("Triangulo Isosceles");
			}
			if ((a * a) > ((b * b) + (c * c))) {
				m.printaMensagem("Triangulo Obtusangulo");
			}
			if ((a * a) < ((b * b) + (c * c))) {
				m.printaMensagem("Triangulo Acutangulo");
			}
			if ((a * a) == ((b * b) + (c * c))) {
				m.printaMensagem("Triangulo Retangulo");
			}
		

			} catch (NumberFormatException e) {
				m.printaMensagem("É apenas permitido digitar numeros");
				m.printaMensagem("erro: "+e);
				continuar = true;
			}
			catch (Exception e) {
				m.printaMensagem("Ocorreu um  erro inesperado!");
				m.printaMensagem("erro: "+e);
				continuar = true;
			}
			
			m.printaMensagem("Deseja calcular novamente?");
			m.printaMensagemLn("1 - Sim ou 0 - Não");
			digitado = scanner.pegarNumeroInteiro();
			
			if (digitado == 1) {
				continuar = true;
			} else {
				continuar = false;
			}

		} while (continuar);

	}
}
