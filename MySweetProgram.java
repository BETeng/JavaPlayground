import java.util.ArrayList;
import java.util.List;

public class MySweetProgram {
  
  public static void main(String[] args){
    String[] firstNames = {"abby", "ben", "charles", "dick"};
    String[] lastNames = {"alonzo", "boof", "chap", "davids"};

    List<User> users = new ArrayList<User>();
 
    for(int i = 0; i < firstNames.length; i++){
      User u = new User();
      u.setFirstName(firstNames[i]);
      u.setLastName(lastNames[i]);
      users.add(u);
    }
    for(User u : users) {
      System.out.println(u.getFullName());
    }
  }
}