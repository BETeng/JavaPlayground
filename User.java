import java.util.List;

public class User {
  public String firstName;
  public String lastName;
  public boolean verified = false;

  public void sayHello(){
    System.out.println("hi, im a user. my name is " + firstName+" " + lastName);
  }
}