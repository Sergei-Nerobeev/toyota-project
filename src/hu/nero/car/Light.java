package hu.nero.car;

public class Light {
  private boolean isActive = false;

  public Light(boolean isActive) {
    this.isActive = isActive;
  }

  public boolean isActive() {
    return isActive;
  }

}
