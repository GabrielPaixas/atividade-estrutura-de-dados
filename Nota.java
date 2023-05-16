
/*Um aplicativo de notas precisa armazenar as notas do usuário em ordem cronológica
inversa, para que as notas mais recentes apareçam primeiro. Implemente uma solução
em Java que utilize pilhas para armazenar as notas e exibi-las em ordem inversa. */
public class Nota {
    private String notas;

    public Nota(String notas){
        this.notas = notas;
    }

    public String getNotas() {
        return this.notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
