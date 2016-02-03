// A class to represent employees in general

public class Employee {
    private int years;
    
    public Employee(int initialYears) {
      years = initialYears;
    }
    public int getHours() {
        return 40;           // works 40 hours/week
    }
    public double getSalary() {
        return 50000.0;      // Raise 50K
    }
    public int getVacationDays() {
        return 10 + 2 * years;  // New formula
    }
    public String getVacationForm() {
        return "yellow";     // use the yellow form
    }
    
    public String toString() {
      return String.format("%d years; %d hours; salary $%8.2f , vacation days: %d", 
              years, getHours(), getSalary(), getVacationDays());
    }
}
