// A class to represent marketers
public class Marketer extends Employee {
    public Marketer(int years) {
      super(years); // Calls Parent constructor
    }
    public void advertise() {
        System.out.println("Act now while supplies last!");
    }

// overrides getSalary from Employee class
    public double getSalary() {
      // return 60000.0;      // Raise
      double baseSalary = super.getSalary();
      return baseSalary + 5000.0;
    }
}

