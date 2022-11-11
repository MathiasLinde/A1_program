public class DataSheet {
     private String name;
     private int ws;
     private int bs;
     private int strength;
     private int toughness;
     private int atk;
    public DataSheet(String name, int ws, int bs, int strength, int toughness, int atk){
        this.name = name;
        this.ws = ws;
        this.bs = bs;
        this.strength = strength;
        this.toughness = toughness;




    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWs() {
        return ws;
    }

    public void setWs(int ws) {
        this.ws = ws;
    }

    public int getBs() {
        return bs;
    }

    public void setBs(int bs) {
        this.bs = bs;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getToughness() {
        return toughness;
    }

    public void setToughness(int toughness) {
        this.toughness = toughness;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }



}
