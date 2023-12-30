package hu.nero;

import hu.nero.car.*;
import hu.nero.model.Camry;

public class Runner {
  public static void main(String[] args) {
    Camry camry = new Camry(TypeCar.PASSENGERS_CAR,
                            "red",
                            260,
                            TransmissionType.AUTOMATIC,
                            15000.00,
                            new Wheel(),
                            new Wheel[4],
                            new FuelTank());

      camry.startMoving(); //TODO



  }
}
