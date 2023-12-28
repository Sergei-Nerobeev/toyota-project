package hu.nero.car;

public class PassengersCar extends Car {
  private boolean cruiseControlOn;

  public PassengersCar(String color, int maxSpeed, TransmissionType transmissionType, double price) {
    super(color, maxSpeed, transmissionType, price);
    this.cruiseControlOn = true;
  }

  public boolean isCruiseControlOn() {
    return cruiseControlOn;
  }
}
