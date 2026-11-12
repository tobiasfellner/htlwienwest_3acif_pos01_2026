import java.util.ArrayList;

public class Klasse {
    String name;
    ArrayList<Schueler> schuelerList = new ArrayList<>();

    public Klasse(String name){
        this.name = name;
    }

    public void addSchueler(Schueler s){
        schuelerList.add(s);
    }

    public String getText(){
        StringBuilder sb = new StringBuilder();
        sb.append("- ");
        sb.append(this.name + "\r\n");

        for(int i=0; i<schuelerList.size();i++){
            Schueler s = schuelerList.get(i);
            sb.append("  - ");
            sb.append(s.getText());
            sb.append("\r\n");

            for(Benotung benotung : s.benotungen){
                sb.append("    - " + benotung.getText() + "\r\n");
            }
            sb.append(String.format("-------------------- Durchschnitt: %.1f%n", s.getAvgNote()));
        }

//        for(Schueler s : schuelerList){
//            sb.append("  -");
//            sb.append(s.getText());
//            sb.append("\r\n");
//        }

        return sb.toString();
    }
}
