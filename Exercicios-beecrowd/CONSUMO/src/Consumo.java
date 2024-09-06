import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        double combustivel = scanner.nextDouble();

        double consumo = distancia / combustivel;

        System.out.printf("%.3f km/l", consumo);

        scanner.close();

    }
}
