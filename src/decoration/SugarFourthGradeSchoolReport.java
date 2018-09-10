package decoration;

public class SugarFourthGradeSchoolReport extends FourthGradeSchoolReport {
    private void reportHighScore() {
        System.out.println("报高分");
    }

    private void reportSort() {
        System.out.println("成绩排名");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
