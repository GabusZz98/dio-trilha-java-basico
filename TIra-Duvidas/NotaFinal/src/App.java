import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int A, B, C, D;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        int total = (A + B + C + D) / 4;

       System.out.println("Nota total: " + total);

       scanner.close();
    }
}
