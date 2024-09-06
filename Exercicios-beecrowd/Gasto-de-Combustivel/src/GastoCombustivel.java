import java.util.Scanner;

public class GastoCombustivel {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int tempoGasto = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();

        double combustivel = (tempoGasto * velocidadeMedia) / 12.0;

        System.out.printf("%.3f%n", combustivel);

        scanner.close();
    }
}
