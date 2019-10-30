public class User {
  private String firstName;
  private String lastName;

  public String getFullName(){
    return getFirstName() + " " + getLastName();
  }

  public String output(){
      return "Hi my name is" + firstName + " " + lastName;
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
}