package factory;

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;

        try {
            human = (Human) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return (T) human;
    }
}
