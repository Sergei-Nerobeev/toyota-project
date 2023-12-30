package hu.nero.car;

public abstract class Car {
  private String color;
  private int maxSpeed;
  private TypeCar typeCar;
  private TransmissionType transmissionType;
  private boolean isMoving;
  private double price;
  protected Wheel wheel;
  private Wheel[] wheels;
  protected FuelTank fuelTank;
  protected Engine engine;
  protected ElectricalSystem electricalSystem;
  private Light light;
  private boolean cruiseControl;
  private boolean roofState;
  private int cargoCapacity;
  private boolean usbPort;
  private boolean miniFridge;
  private boolean spareWheel;
  private boolean powerOutlet;

  public Car(TypeCar typeCar, String color, int maxSpeed, TransmissionType transmissionType, double price,
             Wheel wheel, Wheel[] wheels, FuelTank fuelTank) {

    this.typeCar = typeCar;
    this.color = color;
    this.maxSpeed = maxSpeed;
    this.transmissionType = transmissionType;
    this.price = price;
    this.wheel = new Wheel();
    this.wheels = new Wheel[0];
    this.fuelTank = new FuelTank();
    this.engine = new Engine();
    this.electricalSystem = new ElectricalSystem();
    this.light = new Light();

    this.cruiseControl = false;
    this.roofState = false;
    this.cargoCapacity = 0;
    this.usbPort = false;
    this.miniFridge = false;
    this.spareWheel = false;
    this.powerOutlet = false;
  }

  public abstract void additionalOption(); // interface?

  public void startMoving() throws StartCarException {

    }

  public void stopMoving() {
    isMoving = false;
    System.out.println("Car is not moving");
  }

  public void tornOnLight() {
    light.tornOn();
  }

}



