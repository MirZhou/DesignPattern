package proxy.aop;

public class RealSubject implements Subject {
    // 实现方法
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}