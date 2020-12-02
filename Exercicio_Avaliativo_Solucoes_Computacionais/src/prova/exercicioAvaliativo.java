//@Autor : Marco Antonio Rodrigues

package prova;

import java.util.Scanner;

public class exercicioAvaliativo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String nomeAluno[] = { "João Carlos", "Marco Rodrigues", "Maria Maria", "Pedro Sampaio", "Juliana Souza",
				"José Amaral", "Fabiano Ferreira", "Thiago Augusto", "Daniel Dellaspora", "Thais Carvalho" };

		double notaAluno[] = new double[10];
		int frequencia[] = new int[10];

		for (int i = 0; i < nomeAluno.length; i++) {
			System.out.println("*******************************************");
			System.out.println("Aluno: " + nomeAluno[i]);
			System.out.println("Entre com a nota: ");

			notaAluno[i] = input.nextDouble();

			if (notaAluno[i] < 0 || notaAluno[i] > 100)

			{
				notaAluno[i] = i--;

				System.out.println("Entre novamente com a nota: ");
			} else {

				System.out.println("Entre com a frequência: ");
				frequencia[i] = input.nextInt();

				if (frequencia[i] < 0 || frequencia[i] > 100) {
					frequencia[i] = i--;

					System.out.println(
							"Atenção!! Valide as informações:\n\n Entre novamente com a nota e a frequência: ");

				}
			}
		}
		// valida os aprovados e reprovados.

		double percentualAprovados = 0;
		double percentualReprovados = 0;

		for (int i = 0; i < notaAluno.length; i++) {

			if (notaAluno[i] >= 70 && frequencia[i] >= 80) {

				System.out.println("##################################################");
				System.out.println("Nome do aluno aprovado: " + nomeAluno[i]);
				System.out.println("Nota: " + notaAluno[i]);
				System.out.println("Frequência: " + frequencia[i] + "%\n");
				percentualAprovados++;

			} else {
				System.out.println("##################################################");
				System.out.println("Nome do aluno reprovado: " + nomeAluno[i]);
				System.out.println("Nota: " + notaAluno[i]);
				System.out.println("Frequência: " + frequencia[i] + "%\n");
				percentualReprovados++;
			}

		}
		// Define a maior e menor nota;

		double maiorNota = 0, menorNota = 101; // Como já é validado o recebimento de notas não é necessário inserir um
		// número muito grande e/ou muito pequeno.
		int posicaoMaiorNota = 0, posicaoMenorNota = 0;
		double media = 0;

		for (int i = 0; i < notaAluno.length; i++) {

			if (notaAluno[i] > maiorNota) {
				maiorNota = notaAluno[i];
				posicaoMaiorNota = i;
			}

		}

		for (int i = 0; i < notaAluno.length; i++) {

			if (notaAluno[i] < menorNota)

			{
				menorNota = notaAluno[i];

				posicaoMenorNota = i;
			}

		}

		// Realiza o Calculo da média.
		double mediaTurma = 0;
		for (int i = 0; i < notaAluno.length; i++) {
			mediaTurma = mediaTurma + notaAluno[i];
			media = mediaTurma / notaAluno.length;

		}
		System.out.println("-------------------------------------------------------\n\n");
		System.out.println(
				"Aluno com a melhor nota: \n\t" + nomeAluno[posicaoMaiorNota] + " Sua nota é: " + maiorNota + "\n");

		System.out.println("-------------------------------------------------------\n\n");
		System.out.println(
				"Aluno com a pior nota: \n\t" + nomeAluno[posicaoMenorNota] + " Sua nota é:" + menorNota + "\n");

		System.out.println("-------------------------------------------------------\n\n");
		percentualAprovados = (percentualAprovados / notaAluno.length) * 100;

		System.out.println("o percentual de alunos aprovados é:" + percentualAprovados + "%" + "\n");

		System.out.println("-------------------------------------------------------\n\n");
		percentualReprovados = (percentualReprovados / notaAluno.length) * 100;
		System.out.println("o percentual de alunos reprovados é: " + percentualReprovados + "%" + "\n");

		System.out.println("-------------------------------------------------------\n\n");
		System.out.println("A média da turma é:" + media);
	}

}
