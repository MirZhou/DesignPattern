package abstract_factory;

public class MaleWhiteHuman extends AbstractWhiteHuman {
    @Override
    public void getGender() {
        System.out.println("白男");
    }
}
