import java.util.Scanner;

public class DistEntreDoisPontos {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double x1, y1, x2, y2;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distancia);

        scanner.close();

    }
}
