package gymhum.de.model;

public class Option {
    
    boolean welcheOption; //true = option 1; false = option 2

    public Option(boolean welcheOption){
        setWelcheOption(welcheOption);
    }

    public void setWelcheOption(boolean welcheOption) {
        this.welcheOption = welcheOption;
    }

    public boolean getWelcheOption() {
        return welcheOption;
    }

}
