import java.util.List;

public class User {
  private String firstName;
  private String lastName;

  public String getFullName() {
    return getFirstName() + " " + getLastName();
  }

  public String output() {
    return "Hi my name is " + getFullName();
  }

  public String output(boolean nice) {
    if (nice) {
      return "You beautiful person";
    }
    return "You a freak. -" + getFullName();
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String fn) {
    firstName = fn;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String ln) {
    lastName = ln;
  }

  public static void printUsers(List<User> users) {
    for (User u : users) {
      System.out.println(u.getFullName());
    }
  }

  public static int searchList(List<User> users, User u){
    return searchList(users, u.getFullName());
  }

  public static int searchList(List<User> users, String fn, String ln) {
    return searchList(users, fn + " " + ln);
  }

  public static int searchList(List<User> users, String fullName) {
    for (int i = 0; i < users.size(); i++) {
      if (users.get(i).getFullName().equals(fullName)) {
        return i;
      }
    }
    return -1;
  }
  @Override
  public String toString(){
    return getFullName();
  }

  @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}

}