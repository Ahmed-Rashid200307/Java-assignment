public class Rectangle extends Shape{
  private double length;
  private double width;

  public Rectangle(double len,double wid) {
    this.length = len;
    this.width = wid;
  }

  public double getArea () {
    return this.length * this.width;
  }
}
