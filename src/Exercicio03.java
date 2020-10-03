import java.util.Scanner;

//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite valor A: ");
		int A = sc.nextInt();
		System.out.print("Digite valor B: ");
		int B = sc.nextInt();
		System.out.print("Digite valor C: ");
		int C = sc.nextInt();
		System.out.print("Digite valor D: ");
		int D = sc.nextInt();
		
		int diferencaProduto = A*B-C*D;
		
		System.out.println("DIFERENÇA = " + diferencaProduto);
		
		sc.close();

	}

}
