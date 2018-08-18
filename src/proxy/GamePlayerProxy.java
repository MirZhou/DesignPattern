package proxy;

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(String _name) {
        try {
            this.gamePlayer = new GamePlayer(this, _name);
        } catch (Exception ex) {
            System.out.println("异常：" + ex.getMessage());
        }
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
