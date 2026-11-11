import java.util.Random;

public class Member {
    String name;
    int code;
    boolean isActive;
    boolean isCheckedIn;

    public Member(String name){
        this.name = name;
        this.isActive = true;
        setNewCode();
    }

    public void setNewCode(){
        Random random = new Random();
        this.code = random.nextInt(1000, 9999);
    }

    public String getWelcomeMessage(){
        return String.format("Willkommen im Club, %s! Zugangscode: %d", name, code);
    }

    public boolean checkIn(int inputCode){
        if(code == inputCode && isActive && !isCheckedIn){
            isCheckedIn = true;
            return true;
        }else{
            return false;
        }
    }

    public void checkOut(){
        this.isCheckedIn = false;
    }

    // lock

    // unlock

    // ActivityProtocol
}
