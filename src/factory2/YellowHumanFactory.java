package factory2;

public class YellowHumanFactory extends AbstractHumanFactory {
    @Override
    Human createHuman() {
        return new YellowHuman();
    }
}
