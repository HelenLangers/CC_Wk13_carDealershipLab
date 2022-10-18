package carcomponents;

public class Tyres {

    private int numberOfTyres;
    private String compound;

    public Tyres(int numberOfTyres, String compound){
        this.numberOfTyres = numberOfTyres;
        this.compound = compound;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public String getCompound() {
        return compound;
    }

    public void setCompound(String compound) {
        this.compound = compound;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }
}
