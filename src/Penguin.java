public class Penguin implements CanRun, CanSwim {

  private String name;

  public Penguin(String name) {
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
  public String run() {
    return "i can run, sir!";
  }

  @Override
  public String swim() {
    return "i swim very fast, sir!";
  }
}
