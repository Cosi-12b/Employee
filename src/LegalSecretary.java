// A class to represent legal secretaries
public class LegalSecretary extends Secretary {
    public LegalSecretary(int years) {
      super(years); // Calls Parent constructor
    }

    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }

    public double getSalary() {
//    return 5500; // Raise
      return super.getSalary() + 5000.0;
    }
}

