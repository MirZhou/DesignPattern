package decoration3;

public class ConcreateDecorator2 extends Decorator {
    public ConcreateDecorator2(Component _component) {
        super(_component);
    }

    private void method() {
        System.out.println("装饰器2：method");
    }

    @Override
    void operation() {
        super.operation();
        this.method();
    }
}
