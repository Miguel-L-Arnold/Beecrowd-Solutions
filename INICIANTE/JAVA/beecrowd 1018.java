import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int notas = sc.nextInt();
        int conta = notas;

        int cedula100 = conta / 100;
        conta %= 100;

        int cedula50 = conta / 50;
        conta %= 50;

        int cedula20 = conta / 20;
        conta %= 20;

        int cedula10 = conta / 10;
        conta %= 10;

        int cedula5 = conta / 5;
        conta %= 5;

        int cedula2 = conta / 2;
        conta %= 2;

        int cedula1 = conta;

        System.out.println(notas);
        System.out.println(cedula100 + " nota(s) de R$ 100,00");
        System.out.println(cedula50 + " nota(s) de R$ 50,00");
        System.out.println(cedula20 + " nota(s) de R$ 20,00");
        System.out.println(cedula10 + " nota(s) de R$ 10,00");
        System.out.println(cedula5 + " nota(s) de R$ 5,00");
        System.out.println(cedula2 + " nota(s) de R$ 2,00");
        System.out.println(cedula1 + " nota(s) de R$ 1,00");
    }
}