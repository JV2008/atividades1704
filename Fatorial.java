package Atividades1704;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int num = ler.nextInt();

		int fatorial = 1;


		for (int i = 1; i <= num; i++) {
			fatorial *= i;
		}

		System.out.println("O fatorial do número " + num + " é: " + fatorial);

		ler.close();
	}



	}


