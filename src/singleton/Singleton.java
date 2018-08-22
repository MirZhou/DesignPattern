package singleton;

public class Singleton {
    private static final Singleton SINGLETON = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingleton() {
        return SINGLETON;
    }

    public void doSomething() {
        System.out.println("该干啥干啥");
    }
}
