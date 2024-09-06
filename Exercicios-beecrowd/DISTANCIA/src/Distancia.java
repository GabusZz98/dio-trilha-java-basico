import java.util.Scanner;
public class Distancia {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();

        int tempo = distancia * 2;

        System.out.println(tempo + " minutos");

        scanner.close();
        
    }
}
