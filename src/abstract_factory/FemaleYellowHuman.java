package abstract_factory;

public class FemaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getGender() {
        System.out.println("黄女");
    }
}
