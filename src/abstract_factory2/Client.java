package abstract_factory2;

public class Client {
    public static void main(String[] args) {
        // 定义工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();

        // 产生A1对象
        AbstractProductA a1 = creator1.createProductA();
        a1.shareMethod();
        a1.doSomething();

        // 产生A2对象
        AbstractProductA a2 = creator2.createProductA();
        a2.shareMethod();
        a2.doSomething();

        // 产生B1对象
        AbstractProductB b1 = creator1.createProductB();
        b1.shareMethod();
        b1.doSomething();

        // 产生B2对象
        AbstractProductB b2 = creator2.createProductB();
        b2.shareMethod();
        b2.doSomething();

    }
}
