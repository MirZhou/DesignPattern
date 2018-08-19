package proxy.mandatory;

public class GamePlayerProxy implements IProxy, IGamePlayer {
    private IGamePlayer gamePlayer;

    // 构造函数传递用户名
    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }

    // 代练杀怪
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    // 代练登录
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    // 代练升级
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    // 代练的代练暂时还没有，就是自己
    @Override
    public IGamePlayer getProxy() {
        return this;
    }

    @Override
    public void count() {
        System.out.println("升级总费用：150.00元");
    }
}
