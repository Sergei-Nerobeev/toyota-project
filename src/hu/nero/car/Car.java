package hu.nero.car;

public abstract class Car {
  private String color;
  private int maxSpeed;
  private TransmissionType transmissionType;
  private boolean isMoving;
  private double price;
  private Wheel[] wheels;
  private FuelTank fuelTank;
  private Engine engine;
  private ElectricalSystem electricalSystem;
  private Lights lights;

  public Car(String color, int maxSpeed, TransmissionType transmissionType, double price) {
    this.color = color;
    this.maxSpeed = maxSpeed;
    this.transmissionType = transmissionType;
    this.price = price;
    this.wheels = new Wheel[4];
    this.fuelTank = new FuelTank();
    this.engine = new Engine();
    this.electricalSystem = new ElectricalSystem();
    this.lights = new Lights();

    for (int i = 0; i < 4; i++) {
      wheels[i] = new Wheel();

    }
  }
}
