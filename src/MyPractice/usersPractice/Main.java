package MyPractice.usersPractice;

public class Main {

    public static void main(String[] args) {

        UserApplication myGreetApp = new UserApplication();
        User user = new User("Sarah");
        User user1 = new User("Bisola");
        User user2 = new User("Blessing");
        User user3 = new User("Winner");
        myGreetApp.add(user);
        myGreetApp.add(user1);
        myGreetApp.add(user2);
        myGreetApp.add(user3);
        myGreetApp.add(new User("ifeanyi"));
        myGreetApp.greet();

    }
}
