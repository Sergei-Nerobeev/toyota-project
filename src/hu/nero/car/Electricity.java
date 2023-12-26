package hu.nero.car;

public class Electricity {
  private boolean isActive = false;

  public Electricity(boolean isActive) {
    this.isActive = isActive;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }
}
