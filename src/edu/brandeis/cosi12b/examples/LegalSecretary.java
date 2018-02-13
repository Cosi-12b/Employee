package edu.brandeis.cosi12b.examples;

// A class to represent legal secretaries

public class LegalSecretary extends Secretary {
  String subExpertise;
  
  public LegalSecretary(String subExpertise, int years) {
    super(); // Calls Parent constructor
    this.subExpertise = subExpertise; 
  }

  public void fileLegalBriefs() {
      System.out.println("I could file all day!");
  }

  public double getSalary() {
    return super.getSalary() + 5000.0;
  }
  
  public String toString() {
    String generic = super.toString();
    return(generic + ", Legal Sec expertise: " + subExpertise);
  }
}

