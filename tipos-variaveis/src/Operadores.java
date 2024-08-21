import java.util.Scanner;

public class Operadores {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, X;

        a = scanner.nextInt();
        b = scanner.nextInt();

        X = a + b;

        System.out.println("X = " + X);

        scanner.close();

        

    }
}
