import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double nota4 = sc.nextDouble();

		double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10;
		System.out.println("Media: " + df.format(media));

		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media < 7 && media >= 5) {
			System.out.println("Aluno em exame.");
			double notaExame = sc.nextDouble();
			System.out.println("Nota do exame: " + df.format(notaExame));
			media = (media + notaExame) / 2;
			if (media >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: " + df.format(media));
		} else {
			System.out.println("Aluno reprovado.");
		}
	}
}