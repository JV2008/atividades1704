package Atividades1704;

import java.util.Scanner;

public class Repetição {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, result;
		Scanner ler = new Scanner (System.in);
		
		System.out.println("informe o número");
		num = ler.nextInt();
		
		for (int i =1; i<=10; i++) {
	    result= num * i;
	    System.out.println(num +" x " + i + " = "  + result + "\n");
		ler.close();
		}

	}
}
