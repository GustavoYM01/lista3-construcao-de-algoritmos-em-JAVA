package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double randomNumber = 0.0;
		int count = 0;
		int lenghtIndex = 20;
		
		for (int i = 1; i <= lenghtIndex; i++) {
			System.out.print("Digite um n�mero: ");
			randomNumber = sc.nextDouble();
			
			sc.nextLine();
			
			if (randomNumber % 2 == 0) {
				count += 1;
			}
			else {
				continue;
			}
		}
		
		System.out.printf("Quantidade de n�meros pares: %d", count);
		
		sc.close();
	}

}
