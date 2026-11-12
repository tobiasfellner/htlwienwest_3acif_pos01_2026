public class Benotung {
    String fach;
    int note;

    public Benotung(String fach, int note){
        this.fach = fach;
        this.note = note;

        if(this.note <= 0){
            this.note = 1;
        }

        if(this.note >= 5){
            this.note = 5;
        }
    }

    public String getText(){
        return String.format("%s: %d", fach, note);
    }
}
