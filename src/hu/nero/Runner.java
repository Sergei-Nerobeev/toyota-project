package hu.nero;

import hu.nero.car.StartCarException;
import hu.nero.car.TransmissionType;
import hu.nero.car.TypeCar;
import hu.nero.model.Camry;

public class Runner {
  public static void main(String[] args) {
    Camry camry = new Camry("red", 260, TransmissionType.AUTOMATIC, TypeCar.PASSENGERS_CAR,15000.00);
    try {
      camry.startMoving();
    } catch (StartCarException exception) {
      System.out.println(exception);
    }

  }
}
