import java.util.ArrayList;

public class Schueler {
    String vorname;
    String nachname;
    ArrayList<Benotung> benotungen = new ArrayList<>();

    public Schueler(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getText(){
        return vorname + " " + nachname;
    }

    public void addNote(Benotung note){
        this.benotungen.add(note);
    }

    public double getAvgNote(){
        if(benotungen.isEmpty()){
            return 0;
        }

        double count = 0;
        double sum = 0;
        for(Benotung note : benotungen){
            count ++;
            sum += note.note;
        }
        return sum / count;
    }
}
