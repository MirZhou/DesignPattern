package abstract_factory;

public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getGender() {
        System.out.println("黑男");
    }
}
