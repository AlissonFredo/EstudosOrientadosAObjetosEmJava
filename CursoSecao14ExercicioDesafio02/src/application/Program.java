package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Digite o numero de contribuentes: ");
		int numeroDeContribuentes = keyboard.nextInt();
		
		for(int i = 1; i <= numeroDeContribuentes; i++) {
			
			System.out.println("Contribuente #" + i + " dados:");
			System.out.print("Pessoa fisica ou Juridica (f/j):");
			char pessoaFisicaOuJuridica = keyboard.next().charAt(0);
			System.out.print("Nome: ");
			keyboard.nextLine();
			String nome = keyboard.nextLine();
			System.out.print("Renda Anual: ");
			double rendaAnual = keyboard.nextDouble();
			
			if(pessoaFisicaOuJuridica == 'f') {
				
				System.out.print("Gasto com saude: ");
				double gastoComSaude = keyboard.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastoComSaude));
			}else {
				
				System.out.print("Numero de funcionarios: ");
				int numeroDeFuncionario = keyboard.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionario));
			}
		}
		System.out.println();
		
		System.out.println("Impostos pagos:");
		for(Pessoa pessoa: list) {
			System.out.println(pessoa.getNome() + ": $" + String.format("%.2f", pessoa.imposto()));
		}
		System.out.println();
		
		double soma = 0;
		for(Pessoa pessoa: list) {
			soma += pessoa.imposto();
		}
		System.out.println("Total de impostos: " + String.format("%.2f", soma));
		
		keyboard.close();
	}

}
