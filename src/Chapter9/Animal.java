package Chapter9;

public class Animal extends LivingThing{
    public Animal(int i){
        super("Gyration");
        System.out.println("Who dey give Joy");
    }
    public Animal(String arg){
        super(arg);
        System.out.println("Default");
    }
    public void speak(){
        System.out.println("you speak like a jew-man");
    }
}
