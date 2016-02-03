// A class to represent secretaries
public class Secretary extends Employee {
  public Secretary(int years) {
    super(years); // Calls Parent constructor
  }
  public void takeDictation(String text) {
    System.out.println("Taking dictation of text: " + text);
  }

}