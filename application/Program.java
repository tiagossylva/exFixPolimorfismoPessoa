package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("quantidade de pessoas: ");
		int n = sc.nextInt();
		
		List<Pessoa> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.println("nome: ");
			String name = sc.nextLine();
			System.out.print("gasto anual: ");
			double gastoAnual = sc.nextDouble();
			System.out.print("gasto saude: ");
			double gastosSaude = sc.nextDouble();
			
			
			list.add(new PessoaFisica(name, gastoAnual , gastosSaude));
			
		}
		System.out.println("TAXES PAID: ");
		
		for(Pessoa p : list) {
			System.out.println(p.toString());
		}
		
		sc.close();
	}

}
