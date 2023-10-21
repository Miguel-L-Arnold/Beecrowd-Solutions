import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double horasTrabalhadas = sc.nextDouble();
		double valorHora = sc.nextDouble();
		double salary = horasTrabalhadas * valorHora;
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f\n", salary);
		
	}
}
