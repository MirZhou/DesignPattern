package decoration;

public class Father {
    public static void main(String[] args) {
        SchoolReport report = new SugarFourthGradeSchoolReport();

        report.report();
        report.sign("签名");
    }
}
