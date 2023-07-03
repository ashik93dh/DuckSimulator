import Behaviour.FlyWithWings;

public class Main {
    public static void main(String[] args) {
        Duck duck=new ModelDuck();

        duck.display();
        duck.performFly();
        duck.setFlyBehaviour(new FlyWithWings());
        duck.performFly();
    }
}