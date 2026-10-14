public class Kontakt {
    // Felder
    String vorname;
    String nachname;
    String email;

    // Konstruktor
    public Kontakt(String vorname, String nachname, String email){
        this.vorname = vorname;
        this.nachname = nachname;

        if(email.isBlank()){
            this.email = "unknown";
        }else{
            this.email = email;
        }
    }
}
