public class PessoaExemplo {

    private String nome;
    private float peso;
    private float altura;


    public PessoaExemplo(String nome, float peso, float altura){
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
        if (nome == null || nome == "") {
            throw new RuntimeException("Obrigatorio informar um nome");
        }
        this.nome = nome;
    }
    public void setPeso(float  peso) {
        if (peso < 0) {
            throw new RuntimeException("Peso inválido");
        }
        this.peso = peso;
    }
    public void setAltura(float altura) {
        if (altura < 0) {
            throw new RuntimeException("Altura inválida");
        }
        this.altura = altura;  
    }
}
