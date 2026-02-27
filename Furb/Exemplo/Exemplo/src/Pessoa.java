public class Pessoa {

    private String nome;
    private float peso;
    private float altura;


    public Pessoa(String nome, float peso, float altura){
        super();
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;

    }

    float calcularIMC() {
       // return peso / (altura * altura);
       return this.peso / (this.altura * this.altura);
    }

    public String getNome() {
        return this.nome;
    }

    public float getPeso() {
        return this.peso;
    }

    public float getAltura() {
        return this.altura;
    }    
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(float  peso) {
        this.peso = peso;
    }
    public void setAltura(float altura) {
        this.altura = altura;  
    }
}
