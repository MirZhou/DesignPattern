package abstract_factory;

public abstract class AbstractWhiteHuman implements Human {
    public void getColor() {
        System.out.println("白色");
    }

    public void talk() {
        System.out.println("白话");
    }
}