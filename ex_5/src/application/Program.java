package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double randomNumber = 0.0;
		double sum = 0.0;

		for (int i = 1; i <= 10; i++) {
			
			System.out.print("Digite um n�mero: ");
			randomNumber = sc.nextDouble();
			
			sc.nextLine();
			sum += randomNumber;
		}
		
		System.out.printf("Soma total dos n�meros digitados: %.2f", sum);
		
		sc.close();
	}

}
