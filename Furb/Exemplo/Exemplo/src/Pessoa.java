public class Pessoa {
    public String nome;
    public float peso;
    public float altura;

    public Pessoa(String nome, float  peso, float altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;  
    }

    float calcularIMC() {
       // return peso / (altura * altura);
       return this.peso / (this.altura * this.altura);
    }
}
