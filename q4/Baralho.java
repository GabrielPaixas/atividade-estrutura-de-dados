public class Baralho {
    public void colocarCarta(MagicCard card, Pilha<MagicCard> baralho){
        if(card.getType().equals("terreno") || card.getType().equals("criatura") 
        || card.getType().equals("encantamento") || card.getType().equals("artefato")
        || card.getType().equals("planeswalker") || card.getType().equals("feitiço"))
        {
            if(!baralho.isEmpty()){
                System.out.println("\nBaralho precisa estar vazio para receber esse tipo de carta!");
            }else{
                baralho.push(card);
                System.out.println("\nCarata lançada:\n");
                System.out.println(card.toString());
            }
        }else{
            baralho.push(card);
            System.out.println("Carata lançada:\n");
            System.out.println(card.toString());
        }
    }

    public void removerCartaExpecifica(String nome, Pilha<MagicCard> baralho){
        Pilha<MagicCard> temp = new Pilha<>();

        while(!baralho.isEmpty()){
            if(baralho.top().getName().equalsIgnoreCase(nome)){
                baralho.pop();
            }else{
                temp.push(baralho.pop());
            }
        }
        while(!temp.isEmpty()){
            baralho.push(temp.pop());
        }
    }

}
