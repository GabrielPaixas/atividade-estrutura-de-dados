package Q3;
public class GerenciarNotas {

    public void salvarNota(Pilha<Nota> notas, String nota) {
        Nota novaNota = new Nota(nota);

        notas.push(novaNota);
    }
}
