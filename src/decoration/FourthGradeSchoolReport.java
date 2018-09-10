package decoration;

public class FourthGradeSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("成绩单");
    }

    @Override
    public void sign(String name) {
        System.out.println("签字：" + name);
    }
}
