import java.util.Scanner;
public class TesteSelecao {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int A, B, C, D;

        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();

        if (B > C && D > A && C + D > A + B && C > 0 && D > 0 && A % 2 == 0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores não aceitos");
        }

        scanner.close();
    }
}


