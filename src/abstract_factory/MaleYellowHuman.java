package abstract_factory;

public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getGender() {
        System.out.println("黄男");
    }
}
