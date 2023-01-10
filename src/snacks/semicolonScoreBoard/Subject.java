package snacks.semicolonScoreBoard;

public class Subject {

    private final String name;

    private int scores;

    public Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public int getScores() {
        return scores;
    }

    public void setScoreSheet(int score) {
        this.scores = score;
    }

}
