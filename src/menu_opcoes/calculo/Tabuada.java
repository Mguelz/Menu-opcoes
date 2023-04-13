package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class Tabuada {
	static int tabuada = 0, valorFinal, continuar = 1; // static para que os metodos staticos tenham acesso à variavel

	/**
	 * o usuario irá escolher qual tabuada ele quer e até que numero será
	 * multiplicado
	 */
	public static void tabuada() {
		LeitorDeDados scanner = new LeitorDeDados();
		Mensagem m = new Mensagem();
		boolean continuarTry = false;
		do {
			try {

				m.lnPrintaMensagemLn("------------------ TABUADA -----------------");
				m.printaMensagemSemPularLinha("Qual a tabuada que você deseja: ");
				tabuada = scanner.pegarNumeroInteiro();
				m.printaMensagemSemPularLinha("Até que valor deseja calcular? ");
				valorFinal = scanner.pegarNumeroInteiro();
				m.printaMensagemLn("");
				int valorSecundario = 0;
				
				do {
					m.printaMensagem("   " + tabuada + " x " + valorSecundario + " = " + (tabuada * valorSecundario));
					valorSecundario++;
				} while (valorSecundario < (valorFinal + 1));

				m.lnPrintaMensagemLn("Deseja consutlar outra tabuada?");
				m.printaMensagemSemPularLinha("1 - Sim ou 2 - Não");
				tabuada = scanner.pegarNumeroInteiro();
				if (tabuada == 1) {
					continuarTry = true;
				} else {
					continuarTry = false;
				}

			} catch (Exception e) {
				m.lnPrintaMensagemLn("É somente permitido números");
				continuarTry = true;
			}

		} while (continuarTry);

	}

	public static void tabuadaPrincipiante() {
		LeitorDeDados scanner = new LeitorDeDados();

		do {
			System.out.println("Qual a tabuada que você deseja: ");
			tabuada = scanner.pegarNumeroInteiro();
			int i = 0;
			do {
				System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
				i++;
			} while (i < 11);

			System.out.println("\nDeseja consutlar outra tabuada? \n1 - Sim ou 2 - Não");
			tabuada = scanner.pegarNumeroInteiro();
			if (tabuada == 1) {
				continuar = 0;
			} else {
				continuar = 1;
			}
		} while (continuar == 0);
	}
}
