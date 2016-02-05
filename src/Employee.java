// A class to represent employees in general

public class Employee {
    private int years;
    
    public Employee(int initialYears) {
      years = initialYears;
    }
    public int getHours() {
        return 40;                           // Base hours 40
    }
    public double getSalary() {
        return 50000.0;                     // Base Salary is 50K
    }
    public int getVacationDays() {
        return 10 + 2 * years;              // Base vacation on years
    }
    public String getVacationForm() {
        return "yellow";                    // use the yellow form
    }
    
    public String toString() {              // Pretty print of information
      return String.format("%d years; %d hours; salary $%8.2f , vacation days: %d", 
              years, getHours(), getSalary(), getVacationDays());
    }
    
    public int getYears() {
      return years;
    }
    
}
