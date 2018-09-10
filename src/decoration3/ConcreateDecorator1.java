package decoration3;

public class ConcreateDecorator1 extends Decorator {
    public ConcreateDecorator1(Component _component) {
        super(_component);
    }

    private void method() {
        System.out.println("装饰器1：method");
    }

    @Override
    void operation() {
        this.method();
        super.operation();
    }
}
