public class Human implements CanRun, CanSwim {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Human(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "I`m " + getName();
  }

  @Override
  public String run() {
    return "run, Forrest, run!";
  }

  @Override
  public String swim() {
    return "swim, swim, swim!";
  }
}
