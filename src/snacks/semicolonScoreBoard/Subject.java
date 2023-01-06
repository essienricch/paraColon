package snacks.studentScore;

public class Subject {

    private  String name;
    private int subjectCode;

    private int scores;

    public Subject(String name, int subjectCode) {
        this.name = name;
        this.subjectCode = subjectCode;
    }

    public String getName() {
        return name;
    }

    public int getSubjectCode() {
        return subjectCode;
    }

    public int getScores() {
        return scores;
    }

    public void setScoreSheet(int score) {
        this.scores = score;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "name='" + name + '\'' +
                ", subjectCode=" + subjectCode +
                ", scoreSheet=" + scores +
                '}';
    }
}
