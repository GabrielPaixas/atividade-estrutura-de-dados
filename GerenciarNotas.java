
/*Um aplicativo de notas precisa armazenar as notas do usuário em ordem cronológica
inversa, para que as notas mais recentes apareçam primeiro. Implemente uma solução
em Java que utilize pilhas para armazenar as notas e exibi-las em ordem inversa. */
public class GerenciarNotas {
    
    public void salvarNota(Pilha<Nota> notas, String nota){
        Nota novaNota = new Nota(nota);

        notas.push(novaNota);
    }
}
