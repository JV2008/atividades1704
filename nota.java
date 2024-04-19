package Atividades1704;

import java.util.Scanner;

public class nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1,med,num=0;
		
		Scanner ler = new Scanner (System.in);
	
	
	for (Double i =1.0; i<=5.0; i++) {
		System.out.println (" Informe um número:" );
	n1= ler.nextDouble();
	
	num =+ n1;
	
	med = num/5;
	
	
		System.out.println("Soma =" +num + "e Média =" +med );
	}
	

	
	ler.close();
}
	
}
	
	
	
	
	
	
	

	
	


