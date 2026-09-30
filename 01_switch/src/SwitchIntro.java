public class SwitchIntro {
    public static void main(String[] args) {
        int tag = 2;
//        if(tag == 1){
//            System.out.println("Montag");
//        }else if(tag == 2){
//            System.out.println("Dienstag");
//        }

        switch(tag){
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            default:
                System.out.println("sonst");
        }

        String input = "a";
        int magicNum = 123;

        switch (input){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                magicNum *= 2;
                System.out.println("Vokal");
                break;
            default:
                System.out.println("Konsunant, Zahl, Sonderzeichen, ...");
        }

        String resultOfInput = switch (input){
            case "a", "e", "i", "o", "u" -> "Vokal";
            default -> "";
        };
        System.out.println(resultOfInput);

    }
}
