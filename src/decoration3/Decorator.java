package decoration3;

public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component _component) {
        component = _component;
    }

    @Override
    void operation() {
        this.component.operation();
    }
}
