package edu.brandeis.cosi12b.examples;

// A class to represent marketers
public class Marketer extends Employee {
    public Marketer(int years) {
      super(years);                         // Pass the years to parent constructor
    }
    public void advertise() {
        System.out.println("Act now while supplies last!");
    }

// overrides getSalary from Employee class
    public double getSalary() {
      double baseSalary = super.getSalary();
      return baseSalary + 5000.0;
    }
}

