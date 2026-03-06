import java.util.Scanner;

public class Aula{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PessoaExemplo pessoaExemplo = new PessoaExemplo(" ", 0, 0);
            
        float[] pessoaImc;
        pessoaImc = new float[3];
        String[] pessoaNome;
        pessoaNome = new String[3];
        
        for (int i = 0; i < pessoaImc.length; i++) {
            System.out.print("Imforme seu nome: ");
            pessoaExemplo.setNome(scanner.next());

            System.out.print("Imforme seu peso: ");
            // float pessoaPeso = Float.parseFloat(scanner.nextLine());
            pessoaExemplo.setPeso(scanner.nextFloat());

            System.out.print("Imforme sua altura: ");
            pessoaExemplo.setAltura(scanner.nextFloat());

            float resultadoIMC = pessoaExemplo.calcularIMC();

            pessoaNome[i] = pessoaExemplo.getNome();
            pessoaImc[i] = resultadoIMC;
        }
        for (int i = pessoaImc.length - 1; i >= 0; i--) {
            System.out.println("Nome: " + pessoaNome[i]);
            System.out.println("IMC: " + pessoaImc[i]);
        }
        scanner.close();
    }
}
