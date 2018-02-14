package edu.brandeis.cosi12b.examples;

public class EmployeeMain {

  public static void main(String[] args) {
   exampleOne();
//    exampleTwo();
//    exampleThree();
 //   exampleFour();
  }
  
  private static void exampleOne() {
    System.out.println("*** Employee:");
    Employee employee1 = new Employee();    
    System.out.println(employee1);
        
    System.out.println("\n*** Secretary:");
    Employee sec = new Secretary();
    System.out.println(sec);
    sec.takeDictation("CS12b example");
  }
  
  private static void exampleTwo() {
    System.out.print("\n*** Lawyer:");
    Lawyer employee3 = new Lawyer(15);
    System.out.println(employee3);
    employee3.sue();
     
    System.out.println("\n*** Legal Secretary: ");
    LegalSecretary employee4 = new LegalSecretary("Real Estate", 15);
    System.out.println(employee4);
    employee4.takeDictation("CS12b example");
    employee4.fileLegalBriefs();
  }
  
  private static void exampleThree() {
    LegalSecretary lsect = new LegalSecretary("Real Estate", 2);
    System.out.println(lsect);
    Lawyer myLawyer = new Lawyer(5);
    myLawyer.addClient("Brandeis", 4);
    System.out.println(myLawyer);
  }
  
  private static void exampleFour() {
    Lawyer lawyer = new Lawyer(15);
    Employee2 emp = new Employee2(30);
    System.out.println(lawyer);
    System.out.println(emp);
  }
  
}  
