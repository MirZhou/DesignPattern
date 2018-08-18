package proxy;

public class RealSubject implements Subject {
    // 实现方法
    @Override
    public void request() {
        System.out.println("实际业务逻辑处理");
    }
}
