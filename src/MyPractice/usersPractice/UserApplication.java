package MyPractice.usersPractice;

import java.util.ArrayList;
import java.util.List;

public class UserApplication {

   private List <User> users = new ArrayList<>();

   public void add(User user){
      users.add(user);
   }

   public void greet(){
      users.forEach(User::greet);
   }
}
