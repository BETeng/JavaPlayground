import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {
  
  public static void main(String[] args){
   
    User u = new User();
    u.setFirstName("brian");
    u.setLastName("teng");

    User u2 = new User();
    u2.setFirstName("david");
    u2.setLastName("beng");

    List<User> users = new ArrayList<User>();
    users.add(u);
    users.add(u2);

    User search = new User();
    search.setFirstName("david");
    search.setLastName("beng");

   User found = User.findUser(users, search);

   System.out.println(found);
  }
}