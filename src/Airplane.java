public class Airplane implements CanFly, CanSwim {

  private String name;

  public Airplane(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "It's " + getName();
  }

  @Override
  public String fly() {
    return "this metal coffin with wings can fly!";
  }

  @Override
  public String swim() {
    return "this metal coffin with can swim, but not long time...";
  }
}
