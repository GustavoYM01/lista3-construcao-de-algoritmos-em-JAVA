package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sumAge = 0;
		int lenghtIndex = 20;
		double avgSumAge = 0;
		
		for (int i = 1; i <= lenghtIndex; i++) {
			
			System.out.println("Digite aqui uma idade: ");
			int age = sc.nextInt();
			
			sc.nextLine();
			
			if (age < 0 || age == 0) {
				System.out.println("Idade inv�lida!");
			}
			else {
				sumAge += age;
				continue;
			}
		}
		
		avgSumAge = sumAge / lenghtIndex;
		
		System.out.printf("M�dia das idades: %.2f", avgSumAge);
		
		sc.close();
	}

}
