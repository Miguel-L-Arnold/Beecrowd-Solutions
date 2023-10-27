import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tempoDuracaoSegundos = sc.nextInt();
		int conta = tempoDuracaoSegundos;

		int horas = conta / 3600;
		conta %= 3600;
		int minutos = conta / 60;
		conta %= 60;
		int segundos = conta;

		System.out.println(horas + ":" + minutos + ":" + segundos);
	}

}