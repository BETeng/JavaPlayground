public class Student extends User{
  public boolean verified = true;
  public String major; 


@Override
public void sayHello(){
  System.out.println("Hi im a student class override, my major is "+ major +". My name is "+firstName +" "+ lastName);
}
}