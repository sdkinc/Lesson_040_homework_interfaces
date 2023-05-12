package characters;

import interfaces.CanFly;
import interfaces.CanRun;
import interfaces.CanSwim;

public class Duck implements CanFly, CanRun, CanSwim {

  private String name;

  public Duck(String name) {
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
    return "I`m " + getName();
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
