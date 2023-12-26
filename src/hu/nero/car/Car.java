package hu.nero.car;

import hu.nero.exception.StartCarException;

public abstract class Car {
  private double price;
  private final String color;
  private final int maxSpeed;
  private Tire tire;
  private Tank tank;
  private Engine engine;
  private Electricity electricity;
  private Light light;
  private Gearbox gearbox;
  private boolean driveIsActive = false;

  public Car(
      double price, String color, int maxSpeed, Tire tire, Tank tank, Engine engine, Electricity electricity,
      Light light, Gearbox gearbox, boolean driveIsActive) {
    this.price = price;
    this.color = color;
    this.maxSpeed = maxSpeed;
    this.tire = tire;
    this.tank = tank;
    this.engine = engine;
    this.electricity = electricity;
    this.light = light;
    this.gearbox = gearbox;
    this.driveIsActive = driveIsActive;
  }

  public void replacementTire(Tire tire) {
    if (this.tire.equals(tire)) {
      System.out.println(tire + " could be replaced");
    }
  }

  public void startCar() throws StartCarException {
    if (driveIsActive && tire.getCount() == 4 &&
        !tire.getIsFlat() && tank.getIsEmpty()
        && electricity.getIsActive() && engine.getIsActive()) {
      System.out.println("Drive on");
    }
    else {
      throw new StartCarException();
    }
  }
  public void stopCar() {
    if(driveIsActive) {
      System.out.println("Drive off");
    }
  }
  public void lightsOn(){
    if(light.isActive()) {
      System.out.println("Lights on");
    }
  }
}
