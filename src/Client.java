class Client {
  private String name;
  private int caseLoad;

  Client(String name, int caseLoad) {
    this.name = name;
    this.caseLoad = caseLoad;
  }

  public String toString() {
    return(String.format("Client: %s case: %d", name, caseLoad));
   }
}
