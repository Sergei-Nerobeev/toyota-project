package hu.nero.car;

public class Tank {
  private int levelOfFuelInTank;

  public Tank(int levelOfFuelInTank) {
    this.levelOfFuelInTank = levelOfFuelInTank;
  }

  public int getLevelOfFuelTank() {
    return levelOfFuelInTank;
  }

  public void setLevelOfFuelTank(int levelOfFuelTank) {
    this.levelOfFuelInTank = levelOfFuelTank;
  }
}
