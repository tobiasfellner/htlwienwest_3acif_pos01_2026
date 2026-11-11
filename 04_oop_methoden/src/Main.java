import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Member memberOne = new Member("Tobias");
        System.out.println(memberOne.getWelcomeMessage());

        Scanner scanner = new Scanner(System.in);
        String input = "";
        do{
            System.out.println("Aktion wählen (checkin/checkout/lock/unlock/end):");
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

                case "lock":
                    memberOne.lock();
                    System.out.println("Member erfolgreich gesperrt");
                    break;

                case "unlock":
                    memberOne.unlock();
                    System.out.println("Member erfolgreich aktiviert");
                    break;
            }

        }while(!input.equals("end"));

        printLogs(memberOne);
        saveToFile(memberOne,  "memberOneActivity.log");

    }

    public static void printLogs(Member member){
        System.out.println("===================================== Aktivitätsprotokoll");
        for (int i = 0; i < member.logs.size(); i++) {
            ActivityProtocolEntry log = member.logs.get(i);
            System.out.println(log.toString());
        }
    }

    public static void saveToFile(Member member, String filename){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))){
            for (int i = 0; i < member.logs.size(); i++) {
                ActivityProtocolEntry log = member.logs.get(i);
                writer.write(log.getCsvLine());
                writer.newLine();
            }
        }catch (IOException e){
            System.out.println("Fehler beim Schreiben!");
        }
    }


}
