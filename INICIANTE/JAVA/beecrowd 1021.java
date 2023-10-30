import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double valorMonetario = sc.nextDouble();
		int notas = (int) valorMonetario;
		int moedas = (int) ((valorMonetario - notas) * 100);

		int nota100 = notas / 100;
		notas %= 100;

		int nota50 = notas / 50;
		notas %= 50;

		int nota20 = notas / 20;
		notas %= 20;

		int nota10 = notas / 10;
		notas %= 10;

		int nota5 = notas / 5;
		notas %= 5;

		int nota2 = notas / 2;
		notas %= 2;

		int moeda1 = notas;
		notas %= 1;

		int moeda050 = moedas / 50;
		moedas %= 50;

		int moeda025 = moedas / 25;
		moedas %= 25;

		int moeda010 = moedas / 10;
		moedas %= 10;

		int moeda005 = moedas / 5;
		moedas %= 5;

		int moeda001 = moedas;

		System.out.println("NOTAS:");
		System.out.println(nota100 + " nota(s) de R$ 100.00");
		System.out.println(nota50 + " nota(s) de R$ 50.00");
		System.out.println(nota20 + " nota(s) de R$ 20.00");
		System.out.println(nota10 + " nota(s) de R$ 10.00");
		System.out.println(nota5 + " nota(s) de R$ 5.00");
		System.out.println(nota2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moeda1 + " moeda(s) de R$ 1.00");
		System.out.println(moeda050 + " moeda(s) de R$ 0.50");
		System.out.println(moeda025 + " moeda(s) de R$ 0.25");
		System.out.println(moeda010 + " moeda(s) de R$ 0.10");
		System.out.println(moeda005 + " moeda(s) de R$ 0.05");
		System.out.println(moeda001 + " moeda(s) de R$ 0.01");
	}

}