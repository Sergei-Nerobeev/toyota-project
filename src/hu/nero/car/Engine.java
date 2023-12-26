package hu.nero.car;

public class Engine {
  private boolean isActive = false;

  public Engine(boolean isActive) {
    this.isActive = isActive;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }
}
