public class Main {
    public static void main(String[] args) {
        System.out.println("vor Konstruktor");
        //baueAuto("BMW");
        Auto bmw1 = new Auto("BMW", "1er");
        System.out.println("nach Konstruktor");

        System.out.println(bmw1.marke);
        System.out.println(bmw1.ps);

        Auto bmw3;
    }

    public static void baueAuto(String brand){
        System.out.println("Ich habe ein Auto der Marke "+brand+"gebaut.");
    }
}
