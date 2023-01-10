package snacks.Diary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {

    private String title;
    private String body;
    private LocalDateTime createdAt;
    private int id;

    public  Entry(int id, String title, String body){
        this.id = id;
        this.body = body;
        this.title = title;
        createdAt = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        String time = DateTimeFormatter.ofPattern("EEE, dd/MM/yyyy, hh:mm:ss: a").format(createdAt);
        return String.format("""
                ===========================
                Entry %s
                Written on %s
                Title: %s
                Body: %s
                ============================
                """,id,time,title,body);
    }

//    public void add(String title, String content){
//        this.body = content;
//        this.title = title;
//    }

}
