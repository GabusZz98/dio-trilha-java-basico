import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculoSimples {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int id1, id2, qtd1, qtd2;

        BigDecimal valor1, valor2;

        id1 = scanner.nextInt();
        qtd1 =  scanner.nextInt();
        valor1 = new BigDecimal(scanner.nextDouble());

        id2 = scanner.nextInt();
        qtd2 = scanner.nextInt();
        valor2 = new BigDecimal(scanner.nextDouble());

        BigDecimal total = new BigDecimal(qtd1).multiply(valor1).add(new BigDecimal(qtd2).multiply(valor2));

        total = total.setScale(2, RoundingMode.HALF_UP);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n ", total);

        scanner.close();



    }
}
