package hello;
import java.time.LocalDate;

public class Greeting {

    private final long id;
    private final String date;
    private final String time;

    private final String content;

    public Greeting(long id, String content, String date, String time) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }
}
