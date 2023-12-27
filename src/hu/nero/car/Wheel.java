package hu.nero.car;

public class Wheel {
  private boolean isFlat;
  private  int radius;

  public Wheel() {
    this.isFlat = false;
    this.radius = 0;
  }

  public boolean isFlat() {
    return isFlat;
  }

  public int getRadius() {
    return radius;
  }
}
