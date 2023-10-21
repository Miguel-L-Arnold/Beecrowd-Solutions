import java.util.Scanner;

public class Main {
 
	public static double pi = 3.14159;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int raio = sc.nextInt();
		double volumeEsfera = (4 / 3.0) * pi * Math.pow(raio, 3.0);
		System.out.printf("VOLUME = %.3f\n", volumeEsfera);
	}
}