import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleFileWriter {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("helloworld.txt", true))){
            writer.write("Hello World");
            writer.newLine();
            // automatisch flush & close aufgerufen
        }catch (IOException e){
            System.out.println("Fehler beim Schreiben");
        }

    }
}
