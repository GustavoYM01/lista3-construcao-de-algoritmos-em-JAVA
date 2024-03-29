package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double randomNumber = 0.0;
		String randomName = "";

		System.out.print("Digite um n�mero: ");
		randomNumber = sc.nextDouble();

		sc.nextLine();

		System.out.print("Digite o seu nome: ");
		randomName = sc.nextLine();

		double verifyDecimal = givesItBackDecimal(randomNumber, 2);

		for (int i = 1; i <= 1; i++) {
			
			if (verifyDecimal <= 0.54) {
				randomNumber = Math.floor(randomNumber);
			} else if (verifyDecimal >= 0.55) {
				randomNumber = Math.round(randomNumber);
			} else {
				System.out.println("ERRO");
			}
			
			for (int j = 1; j <= randomNumber; j++) {
				System.out.println(j + " Nome: " + randomName + " | " + "n�mero arredondado: " + randomNumber);
			}
		}
		sc.close();
	}

	public static double givesItBackDecimal(double x, int n) {
		double p = Math.pow(10.0, n);
		int dec = (int) (x * p - ((int) x) * p);
		return dec / p;
	}

}
