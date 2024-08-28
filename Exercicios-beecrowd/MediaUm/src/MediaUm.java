import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class MediaUm {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double a, b, mediaSoma;

        a = scanner.nextDouble();
        b = scanner.nextDouble();

        mediaSoma = ((a * 3.5) + (b * 7.5)) / 11;

        BigDecimal mediaFinal = new BigDecimal(mediaSoma);

        mediaFinal = mediaFinal.setScale(5, RoundingMode.HALF_UP);

        System.out.println("MEDIA = " + mediaFinal);

        scanner.close();

    }
}
