import java.util.Scanner;

public class Main {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		double salary = sc.nextDouble();
		double vendas = sc.nextDouble();
		double total = (salary + (vendas * 0.15));
		System.out.printf("TOTAL = R$ %.2f\n", total);
	}
}