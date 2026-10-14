public class Auto {
    // Felder
    String marke;
    String modell;
    int ps;

    // Konstruktor
    public Auto(String marke, String bezeichnung){
        System.out.println("in Konstruktor von Auto");
        this.marke = marke;
        this.modell = bezeichnung;
        ps = 100;
    }
}
