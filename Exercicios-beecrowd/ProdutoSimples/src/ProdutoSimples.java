import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int a, b, prod;

        a = scanner.nextInt();
        b = scanner.nextInt();

        prod = a * b;

        System.out.println("PROD = " + prod);

        scanner.close();

    }
}
