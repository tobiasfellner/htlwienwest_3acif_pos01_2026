import java.io.*;

public class ExecutionCounter {
    public static void main(String[] args) {
        final String FILENAME = "cnt.counter";
        int counter = readCounterFromFile(FILENAME);
        writeCounterToFile(FILENAME, counter+1);
    }

    public static void writeCounterToFile(String fileName, int counter){
        try(BufferedWriter w = new BufferedWriter(new FileWriter(fileName))){
            // w.write(counter); // als int
            w.write(""+counter); // als string
        }catch (IOException e){
            System.out.println("Fehler beim Schreiben");
        }
    }

    public static int readCounterFromFile(String fileName){
        int result = 0;
        try(BufferedReader r = new BufferedReader(new FileReader(fileName))){
            result = Integer.parseInt(r.readLine());
        }catch (Exception e){
            System.out.println("Fehler beim Lesen");
        }
        return result;
    }

}
