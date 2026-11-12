public class Person {
    String vorname;
    String mittelname;
    String nachname;

    Person(String vorname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
        this.mittelname = "";
    }

    Person(String vorname, String mittelname, String nachname){
        this.vorname = vorname;
        this.nachname = nachname;
        this.mittelname = mittelname;
    }

    public String getCsvString(){
//        return vorname + ";" + nachname;
//        return String.format("%s;%s", vorname, nachname);
        return String.join(";", nachname, vorname, mittelname);
    }

    Person(){

    }
}
