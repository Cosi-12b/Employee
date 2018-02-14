package edu.brandeis.cosi12b.examples;

// A class to represent employees in general

public class Employee {
    
    public int getHours() {
        return 40;                          // Base hours 40
    }
    public double getSalary() {
        return 40000.0;                     // Base Salary is 40K
    }
    public int getVacationDays() {
        return 10;                          // Base vacation on years
    }

    public String getVacationForm() {
        return "yellow";                    // use the yellow form
    }
    
    public String toString() {              // Pretty print of information
      return String.format("Employee: %d hours; salary $%8.2f, vacation days: %d", 
              getHours(), getSalary(), getVacationDays());
    }
    
}
