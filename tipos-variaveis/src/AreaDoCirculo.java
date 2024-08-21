import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class AreaDoCirculo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double raio, area;
        double PI = 3.14159;

        raio = scanner.nextDouble();

        area = (PI * raio * raio);

        BigDecimal areaFormat = new BigDecimal(area).setScale(4, RoundingMode.HALF_UP);

        System.out.println("A=" + areaFormat);

        scanner.close();


    }
    
}
