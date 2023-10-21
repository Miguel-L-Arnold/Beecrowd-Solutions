import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double media = ((3.5 * a) + (7.5 * b)) / 11;
		System.out.printf("MEDIA = %.5f\n", media);
	}
}