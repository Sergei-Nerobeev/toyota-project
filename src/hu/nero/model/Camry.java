package hu.nero.model;

import hu.nero.car.Car;
import hu.nero.car.StartCarException;
import hu.nero.car.TransmissionType;
import hu.nero.car.TypeCar;

public class Camry extends Car {

  public Camry(String color, int maxSpeed, TransmissionType transmissionType, TypeCar typeCar, double price) {
    super(color, maxSpeed, transmissionType, typeCar, price);
  }

  @Override
  public void additionalOption() {

  }

  @Override
  public void startMoving() throws StartCarException {

  }
}
