import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Funcionario funcionario = new Funcionario("", 0);
            
            System.out.print("Imforme o nome do funcionário: ");
            funcionario.setNome(teclado.next());

            System.out.print("Imforme o salário do funcionário: ");
            funcionario.setSalario(teclado.nextDouble());

            double imposto = funcionario.calcularIrpf();

            System.out.printf("O Total de impostos a serem pagos pelo funcionário "+ funcionario.getNome() +" são R$ %.2f", imposto);

        teclado.close();
    }
}
