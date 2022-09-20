package tdd;

public class Student {
    private String name;
    private double score;

    public Student(String name, double score){
        this.name = name;
        if (score > 0.0){
            if (score <= 100.0);
            this.score= score;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setScore(double score) {
        if (score > 0.0){
            if (score <= 100.0){
        this.score = score;}
        }
    }

    public double getScore() {
        return score;
    }

    public String getGrade(){
        String grade = " ";
        if (score >= 90){
            grade = "A";
        }
        else if (score >=80){
            grade ="B";
        }
        else if (score>=70){
            grade="C";
        }
        else if (score>=60){
            grade="D";
        }
        else { grade = "F";}
        return grade;
    }
}

