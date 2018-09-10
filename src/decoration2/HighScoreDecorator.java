package decoration2;

public class HighScoreDecorator extends Decorator {
    protected HighScoreDecorator(SchoolReport _schoolReport) {
        super(_schoolReport);
    }

    private void reportHighScore() {
        System.out.println("汇报最高成绩");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
