import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa(" ", 0);
            
            System.out.print("Imforme o nome do funcionário: ");
            pessoa.setNome(scanner.next());

            System.out.print("Imforme o salário do funcionário: ");
            pessoa.setSalario(scanner.nextDouble());

            double imposto = pessoa.calcularIrpf();

            System.out.printf("O Total de impostos a serem pagos pelo funcionário "+ pessoa.getNome() +" são R$ %.2f", imposto);

        scanner.close();
    }
}
