package edu.brandeis.cosi12b.examples;

// A class to represent employees in general

public class Employee2 {
    private int years;
    
    public Employee2(int years) {
      this.years = years;
    }
    public int getHours() {
        return 40;                          // Base hours 40
    }
    public double getSalary() {
        return 50000.0;                     // Base Salary is 50K
    }
    public int getVacationDays() {
        return 10 + getSeniorityBonus();    // Base vacation on years
    }
    public String getVacationForm() {
        return "yellow";                    // use the yellow form
    }

    public int getYears() {
      return years;
    }   
    
    public int getSeniorityBonus() {
      return getYears() * 2;
    }
    
    public String toString() {              // Pretty print of information
      return String.format("Employee with %d years; %d hours; salary $%8.2f , vacation days: %d", 
              years, getHours(), getSalary(), getVacationDays());
    }
    
}
