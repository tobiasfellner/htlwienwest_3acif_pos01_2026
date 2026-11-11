import javax.management.modelmbean.ModelMBeanInfoSupport;

public class Auto {
    // Felder
    String marke;
    int anzTueren;
    Besitzer besitzer;

    int geschwindkeit;

    // Konstruktoren
    public Auto(String marke, int anzTueren){
        System.out.println("Auto: Default Konstruktor");
        this.marke = marke.toUpperCase();

        if(anzTueren < 2){
            anzTueren = 2;
        }

        this.anzTueren = anzTueren;
    }

    public Auto(String marke){
        this(marke, 3);
        this.besitzer = new Besitzer("xy");
    }

    public Auto(Besitzer besitzer){
        this("unkown");
        this.besitzer = besitzer;
    }

    // Methoden

    public void beschleunige(int val){
        geschwindkeit = geschwindkeit + val;
    }

    public void stoppe(){
        geschwindkeit = 0;
    }

    public void ausgabeGeschwindigkeit(){
        System.out.println("Geschwindigkeit: "+ this.geschwindkeit);
    }

    public boolean istInBewegung(){
        return geschwindkeit != 0;
    }
}
