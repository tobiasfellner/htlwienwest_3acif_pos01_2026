import java.util.Scanner;

public class CaesarChiffre {
    public static void main(String[] args) {
        // Orginaltext und Verschiebung einlesen
        Scanner scanner = new Scanner(System.in);

        System.out.println("Originaltext: ");
        String original =  scanner.nextLine();

        System.out.println("Verschiebung: ");
        int shift = scanner.nextInt();
        scanner.nextLine(); // Zeilenumbruch verarbeiten

        String result = shift(original, shift);
        System.out.printf("Ergebnis: %s", result);
        scanner.close();
    }

    public static String shift(String original, int shift){
        char[] arr = original.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)(arr[i] + shift);
        }

        return new String(arr);
    }

}
