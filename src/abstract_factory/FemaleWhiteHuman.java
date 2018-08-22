package abstract_factory;

public class FemaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getGender() {
        System.out.println("白女");
    }
}
