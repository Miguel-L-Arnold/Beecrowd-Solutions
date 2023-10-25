import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double km = sc.nextDouble();
		double litros = sc.nextDouble();
		
		double calculo = km / litros;
		
		System.out.println(String.format("%.3f km/l", calculo ));

	}
