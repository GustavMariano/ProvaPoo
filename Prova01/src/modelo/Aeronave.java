package modelo;

public class Aeronave {
    private String modelo;
    private int capacidade;
    private Piloto piloto;
    
    public Aeronave(String modelo, int capacidade, Piloto piloto){
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.piloto = piloto;
        piloto.setAeronaveAtual(this);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    
}
