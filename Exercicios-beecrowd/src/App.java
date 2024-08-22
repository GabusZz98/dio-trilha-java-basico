import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int a, b, soma;

        a = scanner.nextInt();
        b = scanner.nextInt();

        soma = a + b;

        System.out.println("SOMA = " + soma);



        scanner.close();
        
    }
}
