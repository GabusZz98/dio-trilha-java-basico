import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Salario {
    public static void main(String[] args) throws Exception {

        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Declara variáveis
        int numeroFunc;
        BigDecimal valorHora, horasTrabalhadas, salario;

        // Lê o número do funcionario com um inteiro
        numeroFunc = scanner.nextInt();

        // Lê o valor da hora e as horas trabalhadas como BigDecimal
        valorHora = new BigDecimal(scanner.nextDouble());
        horasTrabalhadas = new BigDecimal(scanner.nextDouble());

        
        //Calcula o salário multiplicanddo valor da hora por horas trabalhadas
        //Arredonda para duas casas decimais
        salario = valorHora.multiply(horasTrabalhadas).setScale(2, RoundingMode.HALF_UP);

        // Imprime o número do funcionário
        System.out.println("NUMBER = " + numeroFunc);

        // Imprime o salário do funcionário
        System.out.println("SALARY = U$ " + salario);

        // Fecha o scanner para liberar recursos
        scanner.close();

    }
}
