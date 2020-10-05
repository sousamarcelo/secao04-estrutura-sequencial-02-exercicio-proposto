import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas
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
