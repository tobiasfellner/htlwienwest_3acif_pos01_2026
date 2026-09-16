import java.util.Scanner;

public class DecodeCaesar {
    public static void main(String[] args) {
        // Orginaltext und Verschiebung einlesen
        Scanner scanner = new Scanner(System.in);

        System.out.println("Verschlüsselter Text: ");
        String encrypted =  scanner.nextLine();

        System.out.println("Verschiebung: ");
        int shift = scanner.nextInt();
        scanner.nextLine(); // Zeilenumbruch verarbeiten

        String result = decrypt(encrypted, shift);
        System.out.printf("Ergebnis: %s", result);
        scanner.close();
    }

    public static String decrypt(String original, int shift){
        char[] arr = original.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)(arr[i] - shift);
        }

        return new String(arr);
    }

}
