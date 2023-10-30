import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int idadeEmDias = sc.nextInt();

		int ano = idadeEmDias / 365;
		idadeEmDias %= 365;
		int mes = idadeEmDias / 30;
		idadeEmDias %= 30;
		int dia = idadeEmDias;

		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
	}

}