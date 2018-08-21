package factory2;

public class HumanFactory {
    public static <T extends Human> T createHuman(Class<T> c) {
        Human human = null;

        try {
            human = (Human) Class.forName(c.getName()).getDeclaredConstructor().newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return (T) human;
    }
}
