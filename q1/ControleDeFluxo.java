public class ControleDeFluxo {

    public static void carregarCaminhao(Pilha<Caminhao> pilhaCaminhaoes, Pilha<Carga> pilhaCargas,
            Pilha<Caminhao> carregados) {
        if (pilhaCaminhaoes.isEmpty()) {
            System.out.println("Sem caminhoes disponiveis");
            return;
        }
        if (pilhaCargas.isEmpty()) {
            System.out.println("Sem cargas aguardando");
            return;
        }

        Pilha<Caminhao> tempCaminhao = new Pilha<>();
        while (pilhaCaminhaoes.isEmpty() != true) {
            if (pilhaCaminhaoes.top().getCapacidade() < pilhaCargas.top().getPeso()) {
                tempCaminhao.push(pilhaCaminhaoes.pop());
            } else {
                System.out.println("Caminhoneiro " + pilhaCaminhaoes.top().getMotorista() + " esta transportando "
                        + pilhaCargas.top().getDescricaoCarga());
                pilhaCaminhaoes.top().setCarga(pilhaCargas.pop());
                carregados.push(pilhaCaminhaoes.pop());
                while (tempCaminhao.isEmpty() != true) {
                    pilhaCaminhaoes.push(tempCaminhao.pop());
                }
                return;
            }
        }

        while (tempCaminhao.isEmpty() != true) {
            pilhaCaminhaoes.push(tempCaminhao.pop());
        }

        System.out.println("Nenhum caminhao suportou a carga");
    }

    public static void main(String[] args) {
        Pilha<Caminhao> caminhoes = new Pilha<>();
        Pilha<Caminhao> carregados = new Pilha<>();
        Pilha<Carga> cargas = new Pilha<>();

        Caminhao x = new Caminhao("qwe123", 500, 520, "januario", "bau");
        Caminhao y = new Caminhao("qwe123", 500, 820, "linaudo", "bau");
        Caminhao z = new Caminhao("qwe123", 500, 920, "ze", "bau");

        Carga carga1 = new Carga("carregamento de madeira", "Media", 500);
        Carga carga2 = new Carga("carregamento de graos", "Media", 800);
        Carga carga3 = new Carga("carregamento de metais", "Media", 900);

        caminhoes.push(x);
        caminhoes.push(y);
        caminhoes.push(z);

        cargas.push(carga1);
        cargas.push(carga2);
        cargas.push(carga3);

        carregarCaminhao(caminhoes, cargas, carregados);
        carregarCaminhao(caminhoes, cargas, carregados);
        carregarCaminhao(caminhoes, cargas, carregados);
        // carregarCaminhao(caminhoes, cargas, carregados);

        System.out.println(carregados.size());

        System.out.println("\n\n");
        System.out.println(caminhoes.size());
    }
}
