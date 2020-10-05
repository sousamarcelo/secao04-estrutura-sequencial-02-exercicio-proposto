import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

public class Exercicio04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a matricula: ");
		int matricula = sc.nextInt();
		System.out.print("Total de horas trabalhadas: ");
		double totalHorasTrabalhada = sc.nextDouble();
		System.out.print("Digite valor recebido por hora: ");
		double recebidoPorHora = sc.nextDouble();
		
		double salario = totalHorasTrabalhada * recebidoPorHora;
		
		System.out.println("NUMBER = " + matricula);
		System.out.printf("SALARY = %.2f", salario);
		
		sc.close();

	}

}
