package modelo;

public class Piloto {
    private String nome;
    private int cpf;
    private Aeronave aeronaveAtual;

    public Piloto(){

    }
    public Piloto(String nome, int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Aeronave getAeronaveAtual() {
        return aeronaveAtual;
    }

    public void setAeronaveAtual(Aeronave aeronaveAtual) {
        this.aeronaveAtual = aeronaveAtual;
    }
    @Override
    public String toString() {
        return "Piloto [aeronaveAtual=" + aeronaveAtual + ", cpf=" + cpf + ", nome=" + nome + "]";
    }
    
}