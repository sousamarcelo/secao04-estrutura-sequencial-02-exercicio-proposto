import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class Exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite as informação da peça 1: ");
		int codigoPeca1 = sc.nextInt();
		double totalPeca1 = sc.nextDouble();
		double valorUnitarioPeca1 = sc.nextDouble();
		
		double valorTotalPeca1 = totalPeca1 * valorUnitarioPeca1;
		
		System.out.print("Digite as informações da peça 2: ");
		int codigoPeca2 = sc.nextInt();
		double totalPeca2 = sc.nextDouble();
		double valorUnitarioPeca2 = sc.nextDouble();
		
		double valorTotalPeca2 = totalPeca2 * valorUnitarioPeca2;
		
		double totalPagar = valorTotalPeca1 + valorTotalPeca2;
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", totalPagar );
		
		
		sc.close();

	}

}
