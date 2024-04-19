package Atividades1704;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Digite a quantidade de funcionários da empresa: ");
		int qntFun = ler.nextInt();
		double totalS = 0;


		for (int i = 1; i <= qntFun; i++) {
			System.out.print("Digite o salário do funcionário " + i + ": ");
			double salario = ler.nextDouble();
			totalS += salario;
		}

		double medSal = totalS/ qntFun;

		System.out.println("A média salarial da empresa é: " + medSal);

		ler.close();
	}

}

