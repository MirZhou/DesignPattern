package decoration3;

public class Client {
    public static void main(String[] args) {
        Component component = new ConcreateComponent();
        component = new ConcreateDecorator1(component);
        component = new ConcreateDecorator2(component);

        component.operation();
    }
}
