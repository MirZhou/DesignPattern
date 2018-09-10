package decoration2;

public class FourthGradeSchoolReport extends SchoolReport {
    @Override
    void report() {
        System.out.println("四年级成绩单");
    }

    @Override
    void sign(String name) {
        System.out.println("家长签名：" + name);
    }
}
