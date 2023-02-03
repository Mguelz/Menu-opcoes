package menu_opcoes.calculo;

import menu_opcoes.LeitorDeDados;

public class MultaAvancado {
	public static void multaAvancado() {
		LeitorDeDados scanner  = new LeitorDeDados();
		byte qtdMultas;
		int somaPontosCNH = 0, pontosCNH;
		double infraLeve = 88.38, infraMedia = 130.16, infraGrave = 195.23, infraGravissima = 293.47;

		double valorTotalPagar = 0, valorTotalSomado = 0;
		boolean continuar = false;

		do {
			System.out.println("Quantas multas você tomou ");
			qtdMultas = scanner.pegarByteDigitado();
			for (int i = 1; i <= qtdMultas; i++) {
				System.out.println("Quantos pontos na CNH você recebeu na multa " + i);
				pontosCNH = scanner.pegarNumeroInteiro();
				if (pontosCNH == 3 || pontosCNH == 4 || pontosCNH == 5 || pontosCNH == 7) { // somando somente os pontos (3, 4, 5, e 7)
					somaPontosCNH += pontosCNH;												// evitando somar pontos errados que o user colocar
				}

				if (pontosCNH != 3 && pontosCNH != 4 && pontosCNH != 5 && pontosCNH != 7) {
					System.out.println("Digite uma quantidade valida (3,4,5 ou 7) \n");
					continuar = true;
					i--;
				} else if (pontosCNH == 3) {
					valorTotalPagar = infraLeve;
					valorTotalSomado += valorTotalPagar;
					continuar = false;
				} else if (pontosCNH == 4) {
					valorTotalPagar = infraMedia;
					valorTotalSomado += valorTotalPagar;
					continuar = false;
				} else if (pontosCNH == 5) {
					valorTotalPagar = infraGrave;
					valorTotalSomado += valorTotalPagar;
					continuar = false;
				} else if (pontosCNH == 7) {
					valorTotalPagar = infraGravissima;
					valorTotalSomado += valorTotalPagar;
					continuar = false;
				}
			}
		} while (continuar);

		System.out.println("\nAo todo você tomou " + somaPontosCNH + " pontos na carteira");
		System.out.println("Ao todo você ira pagar R$ " + valorTotalSomado);
	}
}
