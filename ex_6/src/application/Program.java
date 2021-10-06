package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int sumAge = 0;
		
		for (int i = 1; i <= 20; i++) {
			
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
		
		System.out.printf("Soma das idades: %d", sumAge);
		
		sc.close();
	}

}
