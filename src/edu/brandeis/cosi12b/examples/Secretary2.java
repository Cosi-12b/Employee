package edu.brandeis.cosi12b.examples;

// A class to represent secretaries
public class Secretary2 extends Employee2 {

  public Secretary2() {
    super(0);                               // Assume Secretary has zero years
  }
  
  public Secretary2(int years) {              // Method overload for Constructor
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