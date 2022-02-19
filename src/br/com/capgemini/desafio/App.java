package br.com.capgemini.desafio;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in,"UTF-8");
		boolean emExecucao = true;
		do {

			System.out.println("--DESAFIO ACADEMIA CAPGEMINI--");
			System.out.println("------------------------------");
			System.out.println("1 - Questão 1                 ");
			System.out.println("2 - Questão 2                 ");
			System.out.println("3 - Questão 3                 ");
			System.out.println("4 - Sair                      ");
			System.out.println("------------------------------");
			System.out.println("Digite uma opção:             ");

			int opcao = scanner.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite um numero inteiro N");
				int numero = scanner.nextInt();
				Questao01.desenharEscada(numero);
				break;

			case 2:
				System.out.println("Digite uma senha (String)");
				String senha = scanner.next();
				int quantidadeNecessaria = Questao02.numeroDeCaracteresNecessarios(senha);
				System.out.println(quantidadeNecessaria);
				break;

			case 3:
				System.out.println("Digite uma palavra (String)");
				String palavra = scanner.next();
				int totalDePares = Questao03.contaAnagramas(palavra);
				System.out.println(totalDePares);
				break;
				
			case 4:
				System.out.println("Programa Encerrado!");
				scanner.close();
				emExecucao = false;
				break;
				
			default:
				System.out.println("Opção Inválida!");
				break;
			}

		}while(emExecucao);
	}
}