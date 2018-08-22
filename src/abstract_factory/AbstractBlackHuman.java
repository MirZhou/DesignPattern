package abstract_factory;

public abstract class AbstractBlackHuman implements Human {
    public void getColor() {
        System.out.println("黑色");
    }

    public void talk() {
        System.out.println("黑话");
    }
}