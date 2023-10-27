import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tempoDuracaoSegundos = sc.nextInt();
		

		int horas = tempoDuracaoSegundos / 3600;
		tempoDuracaoSegundos %= 3600;
		int minutos = tempoDuracaoSegundos / 60;
		tempoDuracaoSegundos %= 60;
		int segundos = tempoDuracaoSegundos;

		System.out.println(horas + ":" + minutos + ":" + segundos);
	}

}