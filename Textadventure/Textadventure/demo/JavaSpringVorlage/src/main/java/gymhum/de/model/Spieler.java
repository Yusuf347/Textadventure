package gymhum.de.model;

public class Spieler {
    //false Spieler 1; true Spieler 2

    boolean Spieler;
    boolean gewonnen;

    public Spieler(boolean Spieler, boolean gewonnen){
        setSpieler(false);
        setGewonnen(false);
    }

    public void setSpieler(boolean spieler) {
        Spieler = spieler;
    }
    public boolean getSpieler() {
        return Spieler;
    }

    public void setGewonnen(boolean gewonnen) {
        this.gewonnen = gewonnen;
    }
    public boolean getGewonnen() {
        return gewonnen;
    }

}
