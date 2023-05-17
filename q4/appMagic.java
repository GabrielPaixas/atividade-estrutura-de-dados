public class appMagic {
    public static void main(String[] args) {
        Pilha<MagicCard> baralho = new Pilha<>();
        Baralho controle = new Baralho();

        MagicCard card1 = new MagicCard("Vitima da noite", "magica instantanea", 0, "Destrua a criatura alvo que não seja Vampiro, Lobisomem nem Zumbi.");
        MagicCard card2 = new MagicCard("Assombro Farpado", "criatura", 2, "Atropelar O poder e a resistência de Assombro Farpado" 
        + " sào ambos iguais ao número de cards de criatura no seu cemitério. \nNo inicio de sua manutenção, coloque" +
        " os dois cards do topo de seu grimório em seu cemitérto.");
        MagicCard card3 = new MagicCard("Vingança de Akroma", "feitiço", 4, "estrua todos os arte atos, cnaturas e encantamentos. Reciclar 3 (3, descarte este card: Compre um card.)");
    
        controle.colocarCarta(card2, baralho);
        controle.colocarCarta(card1, baralho);

        /*controle.removerCartaExpecifica("vitima da noite", baralho);
        controle.removerCartaExpecifica("assombro farpado", baralho); */

        baralho.clear();

        System.out.println(baralho.size());
        controle.colocarCarta(card3, baralho);
    }
}
