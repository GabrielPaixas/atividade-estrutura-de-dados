public class GerenciarNotas {
    public void salvarNota(String nota, Pilha<Nota> notas){
        notas.push(new Nota(nota));
    }
}
