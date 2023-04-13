package menu_opcoes;

public class Mensagem {
	/**
	 * printa a mensagem que estiver dentro do parametro sem pular a linha (print)
	 * 
	 * @param mensagem
	 */
	public void printaMensagemSemPularLinha(String mensagem) {
		System.out.print(mensagem);
	}

	/**
	 * printa a mensagem que estiver dentro do parametro, depois pula a linha
	 * (println)
	 * 
	 * @param mensagem
	 */
	public void printaMensagem(String mensagem) {
		System.out.println(mensagem);
	}

	/**
	 * printa uma mensagem (println)<br>
	 * printa uma linha em branco
	 * 
	 * @param mensagem
	 */
	public void printaMensagemLn(String mensagem) {
		System.out.println(mensagem);
		System.out.println("");
	}

	/**
	 * printa uma linha em branco("")<br>
	 * embaixo desta linha exibe a mensagem (println)
	 * 
	 * @param mensagem
	 */
	public void lnPrintaMensagem(String mensagem) {
		System.out.println("");
		System.out.println(mensagem);
	}

	/**
	 * printa uma linha em branco("")<br>
	 * embaixo printa uma mensagem (println)<br>
	 * printa uma linha em branco("")
	 * 
	 * @param mensagem
	 */
	public void lnPrintaMensagemLn(String mensagem) {
		System.out.println("");
		System.out.println(mensagem);
		System.out.println("");
	}

	/**
	 * printa uma linha em branco<br>
	 * embaixo desta linha exibe a mensagem sem pular para a proxima linha (print)
	 * 
	 * @param mensagem
	 */
	public void lnPrintaMensagemSemPularLinha(String mensagem) {
		System.out.println("");
		System.out.print(mensagem);
	}

	/**
	 * printa a mensagem que estiver dentro do parametro como erro, (err, destaca a
	 * mensagem em vermelho)
	 * 
	 * @param mensagem
	 */
	public void printaMensagemErro(String mensagem) {
		System.err.println(mensagem);
	}

	/**
	 * printa uma linha em branco e embaixo desta linha exibe uma mensagem de erro
	 * 
	 * @param mensagem
	 */
	public void lnPrintaMensagemErro(String mensagem) {
		System.err.println("");
		System.err.println(mensagem);
	}

	/**
	 * printa uma linha em branco ("")<br>
	 * embaixo desta linha em branco exibe uma mensagem de erro<br>
	 * exibe outra linha em branco ("")
	 * 
	 * @param mensagem
	 */
	public void lnPrintaMensagemErroLn(String mensagem) {
		System.err.println("");
		System.err.println(mensagem);
		System.err.println("");
	}

	/**
	 * exibe a mensagem de erro<br>
	 * exibe uma linha em branco ("")
	 * 
	 * @param mensagem
	 */
	public void printaMensagemErroLn(String mensagem) {
		System.err.println(mensagem);
		System.err.println("");
	}
}
