package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;
import menu_opcoes.Mensagem;

public class Frete {

	/**
	 * O usuario irá digitar aonde ele mora<br>
	 * o sistema irá calular a quantidade de desconto ele tem de acordo com o estado
	 */
	public static void frete() {
		LeitorDeDados scanner = new LeitorDeDados();
		Mensagem m = new Mensagem();

		boolean continuar = true;

		m.lnPrintaMensagemLn("------------------ FRETE -----------------");
		do {
			m.printaMensagem("Digite sua UF");
			String uf = scanner.pegarTextoCurto().toUpperCase();
			switch (uf) {
			case "SP":
			case "RJ":
				m.printaMensagem("Seu desconto é de R$ 10,00");
				break;
			case "AM":
				m.printaMensagem("Seu desconto é de R$ 35,00");
				break;
			case "GO":
				m.printaMensagem("Seu desconto é de R$ 30,00");
				break;
			case "BA":
				m.printaMensagem("Seu desconto é de R$ 50,00");
				break;
			default:
				m.printaMensagem("Sua UF não possui desconto");
				break;
			}
			m.lnPrintaMensagemLn("Deseja calcular outro IMC?");
			m.lnPrintaMensagemLn("1 - SIM ou 2 - NÃO");
			uf = scanner.pegarTextoCompleto(); // TODO o programa nao esta parando aqui
			
			if (uf.equals(1)) {
				continuar = true;
			} else {
				continuar = false;
			}
		} while (continuar);
	}
}
