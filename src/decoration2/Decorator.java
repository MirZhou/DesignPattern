package decoration2;

public abstract class Decorator extends SchoolReport {
    private final SchoolReport schoolReport;

    protected Decorator(SchoolReport _schoolReport) {
        this.schoolReport = _schoolReport;
    }

    @Override
    public void report() {
        this.schoolReport.report();
    }

    @Override
    public void sign(String name) {
        this.schoolReport.sign(name);
    }
}
