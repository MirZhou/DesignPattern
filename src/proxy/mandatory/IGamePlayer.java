package proxy.mandatory;

public interface IGamePlayer {
    IGamePlayer getProxy();

    void killBoss();

    void login(String user, String password);

    void upgrade();
}
