import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Member memberOne = new Member("Tobias");
        System.out.println(memberOne.getWelcomeMessage());

        Scanner scanner = new Scanner(System.in);
        String input = "";
        do{
            System.out.println("Aktion wählen (checkin/checkout/end):");
            input = scanner.nextLine();
            switch (input.toLowerCase()){
                case "checkin":
                    System.out.println("Code eingeben:");
                    int inputCode = Integer.parseInt(scanner.nextLine());
                    boolean checkInResult = memberOne.checkIn(inputCode);

                    if(checkInResult){
                        System.out.println("CheckIn erfolgreich");
                    }else{
                        System.out.println("CheckIn fehlgeschlagen");
                    }
                    break;
                case "checkout":
                    memberOne.checkOut();
                    System.out.println("CheckOut erfolgreich");
                    break;
            }


        }while(!input.equals("end"));


    }
}
