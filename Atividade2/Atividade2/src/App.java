import java.util.Scanner;

public class App {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario[] listaFuncionario = new Funcionario[5];

        for (int i = 0; i < listaFuncionario.length; i++) {
            System.out.print("Imforme seu nome: ");
            String nome = scanner.next();

            System.out.print("Imforme o salário do funcionário: ");
            double salario = scanner.nextDouble();

            Funcionario funcionario = new Funcionario("", 0);
            funcionario.setNome(nome);
            funcionario.setSalario(salario);

            listaFuncionario[i] = funcionario;
        }
        for (int i = 0; i < listaFuncionario.length; i++) {
            System.out.println("Nome: " + listaFuncionario[i].getNome());
            System.err.println("Salario: " + listaFuncionario[i].getSalario());
            System.out.printf("O Total de impostos a serem pagos são R$ %.2f \n", listaFuncionario[i].getSalario());
        }    


        // double[] funcionarioIrpf;
        // funcionarioIrpf = new double[5];
        // String[] funcionarioNome;
        // funcionarioNome = new String[5];
        
        // for (int i = 0; i < funcionarioIrpf.length; i++) {
        //     System.out.print("Imforme seu nome: ");
        //     funcionario.setNome(scanner.next());

        //     System.out.print("Imforme o salário do funcionário: ");
        //     funcionario.setSalario(scanner.nextDouble());

        //     funcionarioNome[i] = funcionario.getNome();
        //     funcionarioIrpf[i] = funcionario.calcularIrpf();
        // }
        // for (int i = 0; i < funcionarioIrpf.length; i++) {
        //     System.out.println("Nome: " + funcionarioNome[i]);
        //     System.out.printf("O Total de impostos a serem pagos são R$ %.2f \n", funcionarioIrpf[i]);
        // }


        scanner.close();
    }
}
