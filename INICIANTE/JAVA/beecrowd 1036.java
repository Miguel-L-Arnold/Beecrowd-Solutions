import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double delta = (b * b) - 4 * a * c;

        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            delta = Math.sqrt(delta);
            double R1 = (-b + delta) / (2 * a);
            double R2 = (-b - delta) / (2 * a);
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        }
    }
}