package br.com.capgemini.desafio;
public class Questao02 {

	public static int numeroDeCaracteresNecessarios(String senha) {

		int quantidadeDeCaracteres = 0;

		String letrasMaiusculas = "(.*[A-Z].*)";

		if (!senha.matches(letrasMaiusculas)){
			quantidadeDeCaracteres++;
		}

		String letrasMinusculas = "(.*[a-z].*)";

		if (!senha.matches(letrasMinusculas)){
			quantidadeDeCaracteres++;
		}

		String numeros = "(.*[0-9].*)";

		if (!senha.matches(numeros)){
			quantidadeDeCaracteres++;
		}

		String caracteresEspeciais = "(.*[!@#%^*()-+].*)";

		if (!senha.matches(caracteresEspeciais)){
			quantidadeDeCaracteres++;
		}

		int tamanhoDaSenha = senha.length();
		
		if ((tamanhoDaSenha + quantidadeDeCaracteres) < 6){
			
			quantidadeDeCaracteres = 6 - tamanhoDaSenha; 
				
		}

		return quantidadeDeCaracteres;

	}
}
