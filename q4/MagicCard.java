public class MagicCard {
    private String name;
    private String type;
    private int cost;
    private String effect;

    public MagicCard(String name, String type, int cost, String effect){
        this.name = name;
        this.type = type;
        this.cost = cost;
        this.effect = effect;
    }

    public String toString(){
        return "Name: " + name 
            + "\nType: " + type 
            + "\nCost: " + cost
            + "\nEffect: " + effect;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCost() {
        return this.cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getEffect() {
        return this.effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }
}
