class solarSystem {}
class Earth extends solarSystem {}
class Mars extends solarSystem {}

public class Moon extends Earth {
  public static void main(String[] args) {
    
    solarSystem s = new solarSystem();
    Earth e = new Earth();
    Mars m = new Mars();

    System.out.println(s instanceof solarSystem);
    System.out.println(e instanceof solarSystem);
    System.out.println(e instanceof Earth);
    System.out.println(m instanceof solarSystem);
  }
}