import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] valores = new int[3];
		int[] valoresOrdenados = new int[3];

		for (int i = 0; i < 3; i++) {
			valores[i] = sc.nextInt();
			valoresOrdenados[i] = valores[i];

		}
		Arrays.sort(valoresOrdenados);

		for (int valor : valoresOrdenados) {
			System.out.println(valor);
		}
		System.out.println();

		for (int valor : valores) {
			System.out.println(valor);
		}

	}

}

---------------------OUTRO JEITO------------------------------

// Ordenação manual (Selection Sort)
		for (int i = 0; i < 2; i++) {
			for (int j = i + 1; j < 3; j++) {
				if (valoresOrdenados[i] > valoresOrdenados[j]) {
					// Troca os valores
					int temp = valoresOrdenados[i];
					valoresOrdenados[i] = valoresOrdenados[j];
					valoresOrdenados[j] = temp;
				}
			}
		}
