import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MediaDois {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double valor;

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        valor = ((a * 2) + (b * 3) + (c * 5)) / 10;

        BigDecimal media = new BigDecimal(valor);

        media = media.setScale(1, RoundingMode.HALF_UP);

        System.out.println("MEDIA = " + media);

        scanner.close();

    }
}
