package strategy;

public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("走后门");
    }
}
