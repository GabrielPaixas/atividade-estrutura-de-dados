public class GerenciarAcoes {
    public void desfazerAcoes(int quantidade, Pilha<Acao> acoes){
        if(quantidade > 16){
            System.out.println("Quantidade execiva de acoes");
        }else{
            for(int i = 0; i <= quantidade; i ++){
                acoes.pop();
            }
        }
    }
}
