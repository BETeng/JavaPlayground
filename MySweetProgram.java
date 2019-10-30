import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {
  
  public static void main(String[] args){

    User me = new User();
    me.setFirstName("Brian");
    me.setLastName("Teng");

    User you = new User();
    you.setFirstName("chump");
    you.setLastName("change");

    
 List<User> users = new ArrayList<User>();
 users.add(you);
 users.add(me);

 System.out.println(users.get(0).getFullName());
  }
}