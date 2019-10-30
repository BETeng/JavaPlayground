public class User {
  private String firstName;
  public String lastName;

  public String output(){
      return "Hi my name is" + firstName + " " + lastName;
  }
  public String getFirstName(){
    return firstName.toUpperCase();
  }

  public void setFirstName(String fn){
    firstName = fn;
  }
}