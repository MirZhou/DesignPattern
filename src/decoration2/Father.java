package decoration2;

public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new FourthGradeSchoolReport();

        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);

        sr.report();
        sr.sign("签名");
    }
}
