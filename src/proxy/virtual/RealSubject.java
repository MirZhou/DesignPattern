package proxy.virtual;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("实际业务处理");
    }
}
