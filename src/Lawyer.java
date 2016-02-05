// A class to represent lawyers
public class Lawyer extends Employee {
    public Lawyer(int years) {
      super(years); // Calls Parent constructor
    }

    // overrides getVacationForm from Employee class
    public String getVacationForm() {
      return "pink";
    }
    
    // overrides getVacationDays from Employee class
    public int getVacationDays() {
      return 15; // 3 weeks vacation
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
    
    // Give lawyers $5K for each year at company
    public double getSalary() {
      //Why would this not work?
      //return super.getSalary() + 5000 * years;

      return super.getSalary() + 5000 * getYears();
      
    }
}

