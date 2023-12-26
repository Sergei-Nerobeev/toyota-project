package hu.nero.car;

public class Car {
  private double price;
  private final String color;
  private final int maxSpeed;
  private Tire tire;
  private Tank tank;
  private Engine engine;
  private Electricity electricity;
  private Lamps lamps;
  private Gearbox gearbox;

  private boolean isDriveActive = false;

  public void replacement(Tire tire) {
    if (this.tire.equals(tire)) {
      System.out.println(tire + " could be replaced");
    }
  }
}
