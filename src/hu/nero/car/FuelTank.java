package hu.nero.car;

public class FuelTank {
  private double fuelLevel;

  public FuelTank() {
    this.fuelLevel = 0.0;
  }
  public boolean isNotEmpty(){
    return fuelLevel >= 0.0;
  }
}
