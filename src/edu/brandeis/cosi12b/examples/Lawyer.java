package edu.brandeis.cosi12b.examples;

// A class to represent lawyers
public class Lawyer extends Employee {
  
  private Client currentClient;

    public Lawyer(int years) {
      super(years); // Calls Parent constructor
    }
    
    // overrides getVacationForm from Employee class
    public String getVacationForm() {
      return "pink";
    }
    
    // overrides getVacationDays from Employee class
    public int getVacationDays() {
      return 15;               // 3 weeks vacation
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
    
    public int getSeniorityBonus() {
      return(getSeniorityBonus()+1);
    }
    
    public double getSalary() {
      return super.getSalary() + 5000 * getYears();
    }
    
    public void addClient(String name, int caseLoad) {
      Client newClient = new Client(name, caseLoad);
      currentClient = newClient;
    }


    
    public String toString() {
      String generic = super.toString();
      if (currentClient == null) {
        return(generic + " This lawyer has no Client");
      } else {
        return(generic + currentClient);
      }
    }
}


