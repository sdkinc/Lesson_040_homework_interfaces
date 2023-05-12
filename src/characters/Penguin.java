package characters;

import interfaces.Mega;

public class Penguin implements Mega {

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
    return "I`m " + getName();
  }

  @Override
  public String run() {
    return "i can run, sir!";
  }

  @Override
  public String swim() {
    return "i swim very fast, sir!";
  }

  @Override
  public String fly() {
    return "I Fly!!!!!!!!!!";
  }

  @Override
  public String send() {
    return "I SEND!!!";
  }
}
