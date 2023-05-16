public class Carga {
    private String descricaoCarga;
    private String prioridade;
    private double peso;

    public Carga(String descricaoCarga, String prioridade, double peso){
        this.descricaoCarga = descricaoCarga;
        this.prioridade = prioridade;
        this.peso = peso;
    }

    public String getDescricaoCarga() {
        return this.descricaoCarga;
    }

    public void setDescricaoCarga(String descricaoCarga) {
        this.descricaoCarga = descricaoCarga;
    }

    public String getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
