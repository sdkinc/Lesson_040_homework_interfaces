public class Superman implements CanFly, CanRun, CanSwim {

  private String name;

  public Superman(String name) {
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
    return "I`m " + name;
  }

  @Override
  public String fly() {
    return "i believe, i can fly!";
  }

  @Override
  public String run() {
    return "i run!";
  }

  @Override
  public String swim() {
    return "i swim!";
  }
}