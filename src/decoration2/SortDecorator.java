package decoration2;

public class SortDecorator extends Decorator {
    protected SortDecorator(SchoolReport _schoolReport) {
        super(_schoolReport);
    }

    private void reportSort() {
        System.out.println("成绩排名");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
