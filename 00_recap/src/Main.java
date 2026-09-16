public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // Primitive Datentypen

        // Ganzzahlige
        // boolean = 1B
        // byte = 1B
        // short = 2B = 16Bit  == char '.'
        // int = 4B= 32bit
        // long = 8B = 64Bit

        // Gleitkommazahlen
        // float = 4B = 32Bit
        // double = 8B = 64Bit

        // Komplexe Datentypen
        // String "..."

        int i = 100;
        double d = 33.33333;

        // explizit
        // double in int
        int newI = (int)d;

        // implizit
        // int in double
        double newD = i;


        printAbc();
    }

    public static void printAbc(){
        final int SIZE = 26;
        final int START_LETTER = (int) 'a';

        // (i++) == (i = i+1) == (i +=1 )
        for (int i = 0; i < SIZE; i = i +2) {
            int currentLetterVal = START_LETTER + i;
            char currentLetter = (char) currentLetterVal;
            System.out.printf("%c ",currentLetter);
        }
    }
}
