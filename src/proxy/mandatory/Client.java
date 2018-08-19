package proxy.mandatory;

public class Client {
    public static void main(String[] args) {

        // 定义一个游戏的角色
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = player.getProxy();
        // 开始打游戏，记录时间戳
        System.out.println("开始时间是：2018-01-01 10:35");
        proxy.login("zhangSan","password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：2018-01-01 11:00");
    }
}
