public class Pessoa {

    private String nome;
    private double salario;

    public Pessoa(String nome, double  salario){
        super();
        this.nome = nome;
        this.salario = salario;

    }

    public void setNome(String nome) {
        if (nome == null || nome == "") {
            throw new RuntimeException("Obrigatorio informar um nome");
        }
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSalario(double  salario) {
        if (salario < 0) {
            throw new RuntimeException("Idade inválido");
        }
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }
    public double calcularIrpf() {

        double impostoTotal = 0;
        double salarioBase = this.salario;

        if (salarioBase > 4664.68) {
            impostoTotal += (salarioBase - 4664.68) * 0.275;
            salarioBase = 4664.68;
        }

        if (salarioBase > 3751.05) {
            impostoTotal += (salarioBase - 3751.05) * 0.225;
            salarioBase = 3751.05;
        }

        if (salarioBase > 2826.65) {
            impostoTotal += (salarioBase - 2826.65) * 0.15;
            salarioBase = 2826.65;
        }

        if (salarioBase > 1903.98) {
            impostoTotal += (salarioBase - 1903.98) * 0.075;
        }

        return impostoTotal;
    }
}
