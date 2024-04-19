package Atividades1704;

import java.util.Scanner;

public class Pareimpar {

	public static void main(String[] args) {
		
		
		int num;
		Scanner ler = new Scanner (System.in);
		System.out.println("informe o primeiro número");
		num = ler.nextInt();
		ler.close();
		
		for (int i =0; i< num; i++) {

			
			
			if (num % 2 ==1) {
			System.out.println("O Valor inserido é impar");
		}
		

			else  {
			System.out.println("O Valor inserido é par");
		}
		
	}

}
}
