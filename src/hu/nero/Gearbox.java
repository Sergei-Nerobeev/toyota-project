package hu.nero;

public class Gearbox {
  private String type;

  public Gearbox(String type) {
    this.type = type;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return type;
  }
}
