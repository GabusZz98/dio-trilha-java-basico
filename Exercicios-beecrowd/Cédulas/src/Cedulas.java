import java.util.Scanner;
public class Cedulas {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        System.out.println(valor);

        for (int cedula : cedulas) {
            int quantidade = valor / cedula;
            System.out.println(quantidade + " nota(s) de R$ " + cedula + ",00");
            valor = valor % cedula;
        }

        scanner.close();
    }
}
