package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite aqui o seu nome: ");
		String nome = sc.nextLine();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + nome);
		}
		
		sc.close();
	}

}
