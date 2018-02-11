// A class to represent secretaries
public class Secretary extends Employee {

  public Secretary() {
    super(0);                               // Assume Secretary has zero years
  }
  
  public Secretary(int years) {              // Method overload for Constructor
    super(years);
  }
  
  @Override 
  public int getSeniorityBonus(){
    return 0;
  }
  
  public void takeDictation(String text) {
    System.out.println("Taking dictation of text: " + text);
  }

}