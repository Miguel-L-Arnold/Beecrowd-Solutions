import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horas = sc.nextInt();
		int velocidadeMedia = sc.nextInt();

		double qntLitros = ((float)horas * velocidadeMedia) / 12;
		System.out.println(String.format("%.3f", qntLitros));

	}
}