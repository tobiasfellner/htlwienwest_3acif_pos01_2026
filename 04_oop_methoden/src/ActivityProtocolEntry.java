import java.time.LocalDateTime;

public class ActivityProtocolEntry {
    LocalDateTime timestamp;
    String action;

    public ActivityProtocolEntry(String action){
        this.action = action;
        this.timestamp = LocalDateTime.now();
    }

    public String toString(){
        return timestamp + ": "+ action;
    }

    public String getCsvLine(){
        return String.join(";", timestamp.toString(), action);
    }
}
