package hu.nero.car;

public class Lamps {
  private boolean isActive = false;

  public Lamps(boolean isActive) {
    this.isActive = isActive;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }
}
