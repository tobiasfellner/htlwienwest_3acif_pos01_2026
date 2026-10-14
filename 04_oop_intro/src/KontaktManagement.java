import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class KontaktManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Kontaktdaten einlesen
        Kontakt userInput = readContactFromUserInput(scanner);

        // 2. writeToCsv
        writeContactToFile("contact.csv" ,userInput);

        scanner.close();
    }

    public static Kontakt readContactFromUserInput(Scanner scanner){
        System.out.println("Vorname eingeben: ");
        String userInputVorname = scanner.nextLine();
        System.out.println("Nachname eingeben: ");
        String userInputNachname = scanner.nextLine();
        System.out.println("E-Mail eingeben: ");
        String userInputEmail = scanner.nextLine();

        Kontakt k = new Kontakt(userInputVorname, userInputNachname, userInputEmail);

        return k;
    }

    public static void writeContactToFile(String filename, Kontakt k){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            // writer.write(String.join(";", k.vorname, k.nachname, k.email));
            writer.write(k.vorname + ";" + k.nachname + ";"+k.email);
            writer.newLine();
        }catch (IOException e){
            System.out.println("Fehler beim Schreiben");
        }
    }
}
