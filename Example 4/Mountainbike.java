public class Mountainbike extends Bicycle {
  
  public int seatHeight;

  public Mountainbike (int gear, int speed, int startHeight) {

    super(gear, speed);
    this.seatHeight = startHeight;
  }

  public void setHeight(int newValue) {
    this.seatHeight = newValue;
  }

  public String toString() {
    return (super.toString() + "\nSeat height is " + this.seatHeight);
  }
}
