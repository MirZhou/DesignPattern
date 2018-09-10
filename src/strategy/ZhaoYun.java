package strategy;

public class ZhaoYun{

    public static void main(String[] args) {
        Context context;

        System.out.println("----1-------");
        context = new Context(new BackDoor());
        context.operate();

        System.out.println("----2-------");
        context = new Context(new GivenGreenLight());
        context.operate();

        System.out.println("----3-------");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
