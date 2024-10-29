public class Main {
  public static void main(String[] args) {
    
    Rectangle rectangle = new Rectangle(0.6, 0.9);

    double area = rectangle.getArea();
    
    System.out.printf("The area of the rectangle is %d", area);
  }
}