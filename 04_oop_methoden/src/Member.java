import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Member {
    String name;
    int code;
    boolean isActive;
    boolean isCheckedIn;
    ArrayList<ActivityProtocolEntry> logs = new ArrayList<>();

    public Member(String name){
        this.name = name;
        this.isActive = true;
        logs.add(new ActivityProtocolEntry("Neues Mitglied erstellt: Name="+name));
        setNewCode();
    }

    public void setNewCode(){
        Random random = new Random();
        this.code = random.nextInt(1000, 9999);
        logs.add(new ActivityProtocolEntry("Neuer code "+ code + "gesetzt"));
    }

    public String getWelcomeMessage(){
        return String.format("Willkommen im Club, %s! Zugangscode: %d", name, code);
    }

    public boolean checkIn(int inputCode){
        if(code == inputCode && isActive && !isCheckedIn){
            isCheckedIn = true;
            logs.add(new ActivityProtocolEntry("Erfolgreicher CheckIn"));
            return true;
        }else{
            logs.add(new ActivityProtocolEntry("CheckIn fehlgeschlagen"));
            return false;
        }
    }

    public void checkOut(){
        this.isCheckedIn = false;
        logs.add(new ActivityProtocolEntry("CheckOut erfolgreich"));

    }

    public void lock(){
        this.isActive = false;
        logs.add(new ActivityProtocolEntry("Mitglied gesperrt"));

    }

    public void unlock(){
        this.isActive = true;
        logs.add(new ActivityProtocolEntry("Mitglied reaktiviert"));
    }
    // ActivityProtocol
}
