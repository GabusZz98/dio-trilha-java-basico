import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int A, B, C, D, diferenca;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);
        
        scanner.close();
    }
}
