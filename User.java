import java.util.List;

public class User {
  private String firstName;
  private String lastName;

  public String getFullName(){
    return getFirstName() + " " + getLastName();
  }

  public String output(){
      return "Hi my name is " + getFullName();
  }
  public String output(boolean nice){
    if(nice){
      return "You beautiful person";
    }
    return "You a freak. -"+getFullName();
  }
  public String getFirstName(){
    return firstName.toUpperCase();
  }

  public void setFirstName(String fn){
    firstName = fn;
  }

  public String getLastName(){
    return lastName.toLowerCase();
  }

  public void setLastName(String ln){
    lastName = ln;
  }

  public static void printUsers(List<User> users){
    for(User u : users){
      System.out.println(u.getFullName());
    }
  }
}