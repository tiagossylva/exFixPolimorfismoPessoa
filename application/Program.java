package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantidade de pessoas: ");
		int n = sc.nextInt();
		
		List<Pessoa> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
	
			System.out.println("Pessoa Física ou Juridica (f/j)");
			char ch = sc.next().charAt(0);
			System.out.println("nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("gasto anual: ");
			double gastoAnual = sc.nextDouble();
			
			if(ch == 'f') {
				System.out.print("gasto saude: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, gastoAnual , gastosSaude));
			}
			
			if(ch == 'j') {
				System.out.println("Quantidade de Funcionarios: ");
				int qtdFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, gastoAnual, qtdFuncionarios));
			}
			sc.nextLine();
		}
		
		System.out.println();
		System.out.println("TAXES PAID: ");
		double total = 0;
		for(Pessoa p : list) {
			System.out.println(p.toString());
			total+=p.Taxa();
		}
		System.out.println();
		System.out.println("Total: " + String.format(" $ %.2f", total));
		sc.close();
	}

}
