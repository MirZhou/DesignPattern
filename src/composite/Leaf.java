package composite;

public class Leaf implements ILeaf {
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Leaf(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return String.format("名称：%s\t职位：%s\t薪水：%s", this.name, this.position, this.salary);
    }
}
