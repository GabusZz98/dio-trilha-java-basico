import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Esfera {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner (System.in);

        BigDecimal pi = new BigDecimal ("3.14159");
        int r = scanner.nextInt();

        BigDecimal esfera = new BigDecimal(4.0/3.0).multiply(pi).multiply(new BigDecimal(r).pow(3));

        esfera = esfera.setScale(3, RoundingMode.HALF_UP);

        System.out.printf("VOLUME = %.3f%n", esfera);

        scanner.close();



    }
}
