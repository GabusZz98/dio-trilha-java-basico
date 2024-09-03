import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculoArea {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        BigDecimal a, b, c;

        a = new BigDecimal(scanner.nextDouble());
        b = new BigDecimal(scanner.nextDouble());
        c = new BigDecimal(scanner.nextDouble());

        BigDecimal areaTriangulo = a.multiply(c).divide(new BigDecimal(2));
        BigDecimal areaCirculo = c.multiply(c).multiply(new BigDecimal(3.14159));
        BigDecimal areaTrapezio = a.add(b).multiply(c).divide(new BigDecimal(2));
        BigDecimal areaQuadrado = b.multiply(b);
        BigDecimal areaRetangulo = a.multiply(b);

        System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

        scanner.close();

    }
}
