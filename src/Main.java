import characters.*;
import interfaces.CanFly;

public class Main {

    /*
    Напишите интерфейсы "Умеет летать" CanFly с методом fly(), "Умеет бегать" CanRun с методом
    run и "умеет плавать" CanSwim с методом swim и реализуйте их в классе "Супермен" Superman.
     */
    public static void main(String[] args) {
        Superman superman = new Superman("Superman from Marvell!");
        System.out.println(superman + " and " + superman.fly());
        System.out.println(superman + " and " + superman.run());
        System.out.println(superman + " and " + superman.swim());
        System.out.println("============");

        CanFly fyableObject = superman;
        Human forest = new Human("soldier Forrest Gump!");
        System.out.print(forest + forest.run() + "\n");
        System.out.print(forest + forest.swim() + "\n");
        System.out.println("============");

        Duck duck = new Duck("Duck, Scrooge Duck!");
        System.out.println(duck + " and " + duck.fly());
        System.out.println(duck + " and " + duck.run());
        System.out.println(duck + " and " + duck.swim());
        System.out.println("============");

        Penguin penguin = new Penguin("Kovalski, sir!");
        System.out.println(penguin + " and " + penguin.run());
        System.out.println(penguin + " and " + penguin.swim());
        System.out.println(penguin.send());
        System.out.println(penguin.fly());
        System.out.println("============");

        Airplane airplane = new Airplane("F-14 «Tomcat»!");
        System.out.println(airplane + " and " + airplane.fly());
        System.out.println(airplane + " and " + airplane.swim());
        System.out.println("============");
    }
}
