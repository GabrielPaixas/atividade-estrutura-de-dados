public class ControleDeFluxo {  
    private Caminhao caminhao;
    private Carga carga;

    Pilha<Caminhao> pilhaCaminhoes = new Pilha<>();

    Caminhao x = new Caminhao("qwe123", 500, 1000, "jocival", "bau");

    
    

    public static void main(String[] args) {
        Caminhao x = new Caminhao("qwe123", 500, 1000, "jocival", "bau");
        Pilha<Caminhao> pilhaCaminhoes = new Pilha<>();

        pilhaCaminhoes.push(x);
        

        System.out.println(pilhaCaminhoes.isEmpty());
    }
}
