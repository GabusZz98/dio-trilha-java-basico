import java.util.Scanner;

public class Maior {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maiorAB = Math.max(a, b);
        int maiorABS = Math.max(maiorAB, c);

        System.out.println(maiorABS + " eh o maior");

        scanner.close();

    }
}
