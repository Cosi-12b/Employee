public class EmployeeMain {

  public static void main(String[] args) {
    exampleOne();
    exampleTwo();
  }
  
  private static void exampleOne() {
    System.out.println("*** Employee:");
    Employee employee1 = new Employee(3);
    System.out.println(employee1);
        
    System.out.println("\n*** Secretary:");
    Secretary employee2 = new Secretary(1);
    System.out.println(employee2);
    employee2.takeDictation("CS12b example");
  }
  
  private static void exampleTwo() {
    System.out.print("\n*** Lawyer:");
    Lawyer employee3 = new Lawyer(15);
    System.out.println(employee3);
    employee3.sue();
     
    System.out.println("\n*** Legal Secretary: ");
    LegalSecretary employee4 = new LegalSecretary(15);
    System.out.println(employee4);
    employee4.takeDictation("CS12b example");
    employee4.fileLegalBriefs();
 
  }
}  
