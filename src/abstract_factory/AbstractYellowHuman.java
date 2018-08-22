package abstract_factory;

public abstract class AbstractYellowHuman implements Human {
    public void getColor() {
        System.out.println("黄色");
    }

    public void talk() {
        System.out.println("黄话");
    }
}