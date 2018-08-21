package factory2;

public class BlackHumanFactory extends AbstractHumanFactory {
    @Override
    Human createHuman() {
        return new BlackHuman();
    }
}
