package factory2;

public class WhiteHumanFactory extends AbstractHumanFactory {
    @Override
    Human createHuman() {
        return new WhiteHuman();
    }
}
