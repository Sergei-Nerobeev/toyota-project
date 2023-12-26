package hu.nero.car;

public class Tire {
  private boolean flatTire = false;
  private short radius;

  public Tire(boolean flatTire, short radius) {
    this.flatTire = flatTire;
    this.radius = radius;
  }

  public boolean isFlatTire() {
    return flatTire;
  }

  public void setFlatTire(boolean flatTire) {
    this.flatTire = flatTire;
  }

  public short getRadius() {
    return radius;
  }

  public void setRadius(short radius) {
    this.radius = radius;
  }

}
