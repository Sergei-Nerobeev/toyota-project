package hu.nero.car;

public enum TypeCar {
  PASSENGERS_CAR(true), CABRIOLET(true), CARGO_VAN(0);
  private boolean cruiseControl;
  private int cargoCapacity;
  private boolean roofState;

  TypeCar() {
  }

  TypeCar(int cargoCapacity) {
    this.cargoCapacity = 0;
  }

  TypeCar(boolean roofState) {
    this.roofState = false;
  }

  public boolean isRoofState() {
    return roofState;
  }
}
