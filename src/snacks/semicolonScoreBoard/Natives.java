package snacks.semicolonScoreBoard;

import java.util.ArrayList;
import java.util.List;

public class Natives {

    private final String nameOfStudent;
    private List <Subject> subject;

    public Natives(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
        this.subject =  new ArrayList<>();
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }


    public void courseRegistration(String subject){

        this.subject.add(new Subject(subject));
    }

    public Subject getSubject(Subject subject){
        for (Subject subjectRep: this.subject){
            if (subjectRep.equals(subject)){
                return subjectRep;
            }else throw new IllegalArgumentException("subject not offered by student");
        }return null;
    }

    public String  getSubject(String subject){
        for (Subject subjectRep: this.subject){
            if (subjectRep.getName().equals(subject)){
                return subjectRep.getName();
            }else throw new IllegalArgumentException("subject not offered by student");
        }return null;
    }

    public Subject getSubject(){
        for (Subject subjectRep: this.subject){
            return subjectRep;
        }return null;
    }

    public int count(){
        return subject.size();
    }

    public String getSubject(int number){
        return subject.get(number-1).getName();
    }




}
