import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SalarioComBonus {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String nome;

        BigDecimal salario, vendas, total;

        nome = scanner.nextLine();
        salario = new BigDecimal(scanner.nextDouble());
        vendas = new BigDecimal(scanner.nextDouble());

        BigDecimal bonus = vendas.multiply(new BigDecimal("0.15"));

        total = salario.add(bonus);

        System.out.printf("TOTAL = R$ %.2f%n", total);

        scanner.close();

    }
}
