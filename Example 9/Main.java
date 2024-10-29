interface one {
  public void print_geek();
}

interface Two {
  public void print_for();
}

interface Main extends one, Two {
  public void print_geek();
}

class Child implements Three {
  public void print_geek() {
    System.out.println("Geeks");
  };

  public void print_for() {System.out.println("for");}
}

class Main {
  public static void main(String[] args) {
    Child c = new Child();
    c.print_geek();
    c.print_for();
    c.print_geek();
  }
}