public class EmployeeMain {

  public static void main(String[] args) {
    exampleOne();
    exampleTwo();
  }
  
  private static void exampleOne() {
    System.out.println("*** Employee:");
    Employee employee1 = new Employee();
    System.out.print(employee1.getHours() + ", ");
    System.out.printf("$%.2f, ", employee1.getSalary());
    System.out.print(employee1.getVacationDays() + ", ");
    System.out.println(employee1.getVacationForm());
        
    System.out.println("\n*** Secretary:");
    Secretary employee2 = new Secretary();
    System.out.print(employee2.getHours() + ", ");
    System.out.printf("$%.2f, ", employee2.getSalary());
    System.out.print(employee2.getVacationDays() + ", ");
    System.out.println(employee2.getVacationForm());
    employee2.takeDictation("CS12b example");
  }
  
  private static void exampleTwo() {
    System.out.print("\n*** Lawyer:");
    Lawyer employee3 = new Lawyer();
    System.out.print(employee3.getHours() + ", ");
    System.out.printf("$%.2f, ", employee3.getSalary());
    System.out.print(employee3.getVacationDays() + ", ");
    System.out.println(employee3.getVacationForm());
    employee3.sue();
     
    System.out.println("\n*** Legal Secretary: ");
    LegalSecretary employee4 = new LegalSecretary();
    System.out.print(employee4.getHours() + ", ");
    System.out.printf("$%.2f, ", employee4.getSalary());
    System.out.print(employee4.getVacationDays() + ", ");
    System.out.println(employee4.getVacationForm());
    employee4.takeDictation("CS12b example");
    employee4.fileLegalBriefs();
 
  }
}  
