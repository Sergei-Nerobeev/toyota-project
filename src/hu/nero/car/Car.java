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
  private Light light;
  private boolean cruiseControl;
  private boolean roofState;
  private int cargoCapacity;
  private boolean usbPort;
  private boolean miniFridge;
  private boolean spareWheel;
  private boolean powerOutlet;

  public Car(String color, int maxSpeed, TransmissionType transmissionType, double price) {
    this.color = color;
    this.maxSpeed = maxSpeed;
    this.transmissionType = transmissionType;
    this.price = price;
    this.wheels = new Wheel[4];
    this.fuelTank = new FuelTank();
    this.engine = new Engine();
    this.electricalSystem = new ElectricalSystem();
    this.light = new Light();

    for (int i = 0; i < 4; i++) {
      wheels[i] = new Wheel();

    }
    this.cruiseControl = false;
    this.roofState = false;
    this.cargoCapacity = 0;
    this.usbPort = false;
    this.miniFridge = false;
    this.spareWheel = false;
    this.powerOutlet = false;
  }

  public abstract void additionalOption(); // interface?

  public abstract void startMoving() throws StartCarException;

  public void stopMoving() {
    isMoving = false;
  }

  public void tornOnLight() {
    light.tornOn();
  }

}
