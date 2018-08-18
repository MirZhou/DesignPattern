package proxy;

public class Client {
    public static void main(String[] args) {
        IGamePlayer proxy = new GamePlayerProxy("张三");

        System.out.println("开始时间：2018-01-01 10:35");
        proxy.login("zhangsan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("游戏结束时间：2018-01-01 11:00");

        Proxy _proxy = new Proxy(new RealSubject());
        _proxy.request();
    }
}