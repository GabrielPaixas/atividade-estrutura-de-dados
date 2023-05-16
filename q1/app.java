public class app {
    public static void main(String[] args) {
        Pilha<Caminhao> caminhoes = new Pilha<>();
        Pilha<Caminhao> carregados = new Pilha<>();
        Pilha<Carga> cargas = new Pilha<>();
        Pilha<Carga> baixaPrioridadePilha = new Pilha<>();
        Pilha<Carga> altaPrioridadePilha = new Pilha<>();
        ControleDeFluxo fluxo = new ControleDeFluxo();

        Caminhao x = new Caminhao("qwe123", 500, 520, "januario", "bau");
        Caminhao y = new Caminhao("qwe123", 500, 820, "linaudo", "bau");
        Caminhao z = new Caminhao("qwe123", 500, 920, "ze", "bau");

        Carga carga1 = new Carga("carregamento de madeira", "baixa", 500);
        Carga carga2 = new Carga("carregamento de graos", "alta", 800);
        Carga carga3 = new Carga("carregamento de metais", "baixa", 900);

        caminhoes.push(x);
        caminhoes.push(y);
        caminhoes.push(z);

        cargas.push(carga1);
        cargas.push(carga2);
        cargas.push(carga3);

        fluxo.separarCargas(cargas, baixaPrioridadePilha, altaPrioridadePilha);

        System.out.println(carregados.size());

        System.out.println("\n\n");
        System.out.println(cargas.size());
        System.out.println(baixaPrioridadePilha.size());
        System.out.println(altaPrioridadePilha.size());
    }
}
