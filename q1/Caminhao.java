public class Caminhao {
    private String placa;
    private double peso;
    private double capacidade;
    private String motorista;
    private String tipoCarroceria;
    private Carga carga;

    public Caminhao(String placa, double peso, double capacidade, String motorista, String tipoCarroceria){
        this.placa = placa;
        this.peso = peso; 
        this.capacidade = capacidade;
        this.motorista = motorista;
        this.tipoCarroceria = tipoCarroceria;
    }

    public Caminhao(){}

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCapacidade() {
        return this.capacidade;
    }

    public void setCapacidade(double capacidade) {
        this.capacidade = capacidade;
    }

    public String getMotorista() {
        return this.motorista;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getTipoCarroceria() {
        return this.tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }
    
    public Carga getCarga() {
        return this.carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }
}
