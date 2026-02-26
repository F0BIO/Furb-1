import java.util.Scanner;

public class Aula01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa(" ", 0, 0);
        Pessoa pessoa2 = new Pessoa(" ", 0, 0);
        Pessoa pessoa3 = new Pessoa(" ", 0, 0);
            
        System.out.print("Imforme seu nome: ");
        pessoa.nome = scanner.next();

        System.out.print("Imforme seu peso: ");
        // float pessoaPeso = Float.parseFloat(scanner.nextLine());
        pessoa.peso = scanner.nextFloat();

        System.out.print("Imforme sua altura: ");
        pessoa.altura = scanner.nextFloat();

        float resultadoIMC = pessoa.calcularIMC();

        System.out.print("Imforme seu nome: ");
        pessoa2.nome = scanner.next();

        System.out.print("Imforme seu peso: ");
        // float pessoaPeso = Float.parseFloat(scanner.nextLine());
        pessoa2.peso = scanner.nextFloat();

        System.out.print("Imforme sua altura: ");
        pessoa2.altura = scanner.nextFloat();

        float resultadoIMC2 = pessoa2.calcularIMC();

        System.out.print("Imforme seu nome: ");
        pessoa3.nome = scanner.next();

        System.out.print("Imforme seu peso: ");
        // float pessoaPeso = Float.parseFloat(scanner.nextLine());
        pessoa3.peso = scanner.nextFloat();

        System.out.print("Imforme sua altura: ");
        pessoa3.altura = scanner.nextFloat();
        System.out.println("");
        float resultadoIMC3 = pessoa3.calcularIMC();
        System.out.println("Pessoa: " + pessoa3.nome);
        System.out.println("Calculo do IMC: " + resultadoIMC3);
        System.out.println("");
        System.out.println("Pessoa: " + pessoa2.nome);
        System.out.println("Calculo do IMC: " + resultadoIMC2);
        System.out.println("");
        System.out.println("Pessoa: " + pessoa.nome);
        System.out.println("Calculo do IMC: " + resultadoIMC);

        scanner.close();
    }
}
