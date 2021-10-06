package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double randomNumber = 0.0;
		int lenghtIndex = 20;
		int count = 0;
		
		for (int i = 1; i <= lenghtIndex; i++) {
			
			System.out.print("Digite um número: ");
			randomNumber = sc.nextDouble();
			
			sc.nextLine();
			
			if (randomNumber >= 0 && randomNumber <= 100) {
				count += 1;
			}
			else {
				continue;
			}
		}
		
		System.out.printf("Quantidade de números entre 0 e 100: %d", count);
		
		sc.close();
	}

}
