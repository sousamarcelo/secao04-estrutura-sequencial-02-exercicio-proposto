import java.util.Locale;
import java.util.Scanner;

/*Fazer um programa que leia tr�s valores com ponto flutuante de dupla precis�o: A, B e C. Em seguida, calcule e
mostre:
a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
b) a �rea do c�rculo de raio C. (pi = 3.14159)
c) a �rea do trap�zio que tem A e B por bases e C por altura.
d) a �rea do quadrado que tem lado B.
e) a �rea do ret�ngulo que tem lados A e B.*/

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite tr�s valores: ");
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double trianguloArea = A * C / 2;
		double circuloArea = 3.14159 * Math.pow(C, 2.0);
		double trapezioArea = (A+B) * C / 2;
		double quadradoArea = Math.pow(B, 2.0);
		double retanguloArea = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", trianguloArea);
		System.out.printf("CIRCULO: %.3f%n", circuloArea);
		System.out.printf("TRAPEZIO: %.3f%n", trapezioArea);
		System.out.printf("QUADRADO: %.3f%n", quadradoArea);
		System.out.printf("RETANGULO: %.3f%n", retanguloArea);
		
		
		sc.close();

	}

}
