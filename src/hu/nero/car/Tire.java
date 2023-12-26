package hu.nero.car;

public class Tire {
  private final short count = 4;
  private boolean isFlat = false;
  private short radius;

  public Tire(boolean isFlat, short radius) {
    this.isFlat = isFlat;
    this.radius = radius;
  }

  public boolean getIsFlat() {
    return isFlat;
  }

  public void setFlat(boolean isFlat) {
    this.isFlat = isFlat;
  }

  public short getRadius() {
    return radius;
  }

  public void setRadius(short radius) {
    this.radius = radius;
  }

  public short getCount() {
    return count;
  }
}
