package snacks.studentScore;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private final String nameOfStudent;
    private List <Subject> subject;

    public Student(String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
        this.subject =  new ArrayList<>();
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }


    public void courseRegistration(Subject subject){
        this.subject.add(subject);
    }

    public Subject getSubject(Subject subject){
        for (Subject subjectRep: this.subject){
            if (subjectRep.equals(subject)){
                return subjectRep;
            }
        }return null;
    }

    public Subject getSubject(String subject){
        for (Subject subjectRep: this.subject){
            if (subjectRep.getName().equals(subject)){
                return subjectRep;
            }
        }return null;
    }

    public Subject getSubject(){
        for (Subject subjectRep: this.subject){
            return subjectRep;
        }return null;
    }


}
