import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {
  
  public static void main(String[] args){
   
    User u = new User();
    u.setFirstName("brian");
    u.setLastName("teng");

    User u2 = new User();
    u2.setFirstName("david");
    u2.setLastName("tang");

    List<User> users = new ArrayList<User>();
    users.add(u);
    users.add(u2);

    // User.printUsers(users);

    System.out.println(u.output(false));

  }
}