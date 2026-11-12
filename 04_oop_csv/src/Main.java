import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Vorname, Nachname vom Benutzer abfragen
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vorname eingeben: ");
        String inputVorname = scanner.nextLine();

        System.out.println("Nachname eingeben: ");
        String inputNachname = scanner.nextLine();

        // 2. Person erstellen in persons-Liste hinzufügen
        ArrayList<Person> persons = new ArrayList<>();
        Person p = new Person(inputVorname, inputNachname);
        persons.add(p);

        // 3. Liste in eine csv schreiben => eigene Methode in main
        export(persons, "persons.csv");
        ArrayList<Person> importPersons = importPersons("persons2.csv");

    }

    public static void export(ArrayList<Person> persons, String filename){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))){
            for(Person p : persons){
                writer.write(p.getCsvString());
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Schreiben fehlgeschlagen! "+ e.getMessage());
        }
    }

    public static ArrayList<Person> importPersons(String filename) {
        ArrayList<Person> persons = new ArrayList<Person>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            String line = reader.readLine();
            while(line != null){
                //line = "Vorname;Nachname" => Person(vorname=Vorname, nachname=Nachname)
                String[] splitted = line.split(";");

                if(splitted.length == 2){
                    Person newPerson = new Person(splitted[0], splitted[1]);
                    persons.add(newPerson);
                }

                line = reader.readLine();
            }

        }catch (IOException e){
            System.out.println("Fehler beim lesen");
        }
        return persons;
    }
}
