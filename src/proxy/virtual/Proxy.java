package proxy.virtual;

public class Proxy implements Subject {
    private Subject subject; // 要代理的实现类

    // 实现接口中定义的方法
    @Override
    public void request() {
        // 判断真实主题是否初始化
        if (this.subject == null) {
            this.subject = new RealSubject();
        }

        this.subject.request();

    }
}
