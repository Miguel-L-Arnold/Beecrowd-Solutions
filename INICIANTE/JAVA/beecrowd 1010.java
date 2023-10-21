import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int num = sc.nextInt();
		double valor = sc.nextDouble();

		int cod1 = sc.nextInt();
		int num1 = sc.nextInt();
		double valor1 = sc.nextDouble();

		double total = (num * valor) + (num1 * valor1);
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));
	}
}
