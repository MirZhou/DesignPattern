package factory2;

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色");
    }

    @Override
    public void talk() {
        System.out.println("白人说话");
    }
}
