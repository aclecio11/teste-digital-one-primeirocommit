package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Carro carro = new Carro();

		System.out.println("Digite os dados do carro");
		System.out.print("nome: ");
		carro.nome = sc.nextLine();
		System.out.print("marca: ");
		carro.marca = sc.nextLine();
		System.out.print("cor: ");
		carro.cor = sc.nextLine();
		System.out.print("ano: ");
		carro.ano = sc.nextInt();

		System.out.println(carro);
	}

}
