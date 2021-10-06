package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for (int i = 1; i <= 20; i++) {
			
			System.out.print("Digite aqui uma idade: ");
			int age = sc.nextInt();
			
			sc.nextLine();
			
			if (age < 0 || age == 0) {
				System.out.print("Idade inv�lida!");
				break;
			}
			
			else if (age >= 18) {
				count += 1;
			}
			
			else {
				continue;
			}
		}
		
		System.out.printf("Quantidade de pessoas que s�o maiores de idade: %d", count);
		
		sc.close();
	}

}
