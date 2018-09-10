package strategy;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy _strategy) {
        strategy = _strategy;
    }

    public void operate() {
        this.strategy.operate();
    }
}
