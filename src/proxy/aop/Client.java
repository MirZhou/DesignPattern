package proxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三"); // 创建玩家

        InvocationHandler handler = new GamePlayIH(player); // 定义Handler
        System.out.println("开始时间：2018-01-01 10:35");

        ClassLoader cl = player.getClass().getClassLoader(); // 获得类的class loader.
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, new Class[]{IGamePlayer.class}, handler);
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();

        System.out.println("游戏结束时间：2018-01-01 11:00");

        Subject subject = new RealSubject();
        InvocationHandler handler1 = new MyInvocationHandler(subject);
        Subject proxy1 = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler1);
        proxy1.doSomething("Finish");

        Subject proxy2 = SubjectDynamicProxy.newProxyInstance(subject);
        proxy2.doSomething("Finish");
    }
}