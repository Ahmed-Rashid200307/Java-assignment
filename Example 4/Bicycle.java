public class Bicycle {
  
  public int gear;
  public int speed;

  public Bicycle (int gear, int speed) {
    this.gear = gear;
    this.speed = speed;
  }

  public void applyBrake(int decrement) {
    this.speed -= decrement;
  }

  public void speedUp(int increment) {
    this.speed += increment;
  }

  public String toString() {
    return ("No of gears are " + this.gear + "\nSpeed of the bicycle is " + this.speed);
  }
}
