package snacks.Diary;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diary {

    private boolean isLocked;
    private String password;

    private List<Entry> activities;


    public Diary(String ownerName, String password){
        this.password = password;
        isLocked = true;
        activities = new ArrayList<>();
    }

    public boolean isLocked(){
        return isLocked;
    }

    public void unLockWith(String password) {
        boolean passwordMatches = password.equals(this.password);
        if (passwordMatches) isLocked = false;
    }

    public void lock() {
        isLocked = true;
    }

    public void write(String title, String body) {
       if (isLocked) throw new IllegalArgumentException("can-not write to a locked diary");
       writeIntoDiary(title, body);
    }

    private void writeIntoDiary(String title, String body) {
        int id = numberOfEvents() + 1;
        Entry newEntry = new Entry(id, title, body);
        activities.add(newEntry);
    }

    public int numberOfEvents() {
        return activities.size();
    }

    public Entry findEntryWithId(int id) {
        for (Entry entry: activities){
            if (entry.getId() == id) return entry;
        }
        return null;
    }
}
