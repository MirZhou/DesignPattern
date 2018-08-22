package abstract_factory;

public class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getGender() {
        System.out.println("黑女");
    }
}
