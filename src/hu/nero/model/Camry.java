package hu.nero.model;

import hu.nero.car.*;

public class Camry extends Car {

  public Camry(
      TypeCar typeCar, String color, int maxSpeed, TransmissionType transmissionType,
      double price, Wheel wheel, Wheel[] wheels, FuelTank fuelTank) {
    super(typeCar, color, maxSpeed, transmissionType, price, wheel, wheels, fuelTank);
  }

  public void additionalOption() {
    System.out.println("Usb port is active");
  }

  @Override
  public void startMoving() {
    if (wheel.getIsFlat() && fuelTank.isNotEmpty() && electricalSystem.isOn && engine.isOn()) {
      System.out.println("Car starts moving");
    }
    else {
      stopMoving();
    }
  }
}



