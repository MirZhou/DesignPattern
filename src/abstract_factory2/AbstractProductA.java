package abstract_factory2;

public abstract class AbstractProductA {
    // 共有方法
    public void shareMethod() {
        System.out.println("产品A共有方法");
    }

    // 相同方法，不同实现
    public abstract void doSomething();
}
