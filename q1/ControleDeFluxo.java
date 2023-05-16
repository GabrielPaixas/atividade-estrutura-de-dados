public class ControleDeFluxo {

    public void carregarCaminhao(Pilha<Caminhao> pilhaCaminhaoes, Pilha<Carga> pilhaCargas,
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

    public void separarCargas(Pilha<Carga> cargas, Pilha<Carga> baixaPrioridade, Pilha<Carga> altaPrioridade){
        while(cargas.isEmpty() != true){
            if(cargas.top().getPrioridade().equals("alta")){
                altaPrioridade.push(cargas.pop());
            }else{
                baixaPrioridade.push(cargas.pop()); 
            }
        }
    }
}
