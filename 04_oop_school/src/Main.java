public class Main {
    public static void main(String[] args) {
        Benotung s1Pos = new Benotung("POS", 1);
        Benotung s1Deutsch = new Benotung("Deutsch", 2);

        Schueler s1 = new Schueler("Schueler", "AAA");
        s1.addNote(s1Pos);
        s1.addNote(s1Deutsch);

        Schueler s2 = new Schueler("Schueler", "BBB");

        Klasse k1 = new Klasse("3ACIF");
        k1.addSchueler(s1);
        k1.addSchueler(s2);

        System.out.println(k1.getText());
    }
}
