package Atividades1704;

import java.util.Scanner;

public class Somapareimpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int somaimpar = 0, somapar = 0, num= 0;
		
		for (int i= 1; i<=10; i++) {
			System.out.println("Informe um número");
			num= ler.nextInt();
		

			if (num % 2 ==0) {
				somapar ++;
		}
		

			else  {
				somaimpar ++;
		}
	
	}

	
	System.out.println("a quantidade de númros pares é:" +somapar);
	System.out.println("a quantidade de número impares é:" +somaimpar);
	
		ler.close();
	}
}
