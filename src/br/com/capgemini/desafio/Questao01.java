package br.com.capgemini.desafio;
public class Questao01 {

	public static void desenharEscada(int numero) {
		
		int diferenca;
		int contador = 0;

		for (int i = 0; i < numero; i++) {

			contador++;

			diferenca = numero - contador;

			for (int k = 0; k < diferenca; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < contador; j++) {
				System.out.print("*");
			}

			System.out.print("\n");
		}
	}
	
	
	
}
