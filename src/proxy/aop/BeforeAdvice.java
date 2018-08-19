package proxy.aop;

public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("打印前置通知！");
    }
}
