package composite;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        IRoot ceo = new Root(" 王 大麻子", " 总经理", 100000); //产生 三个 部门 经理， 也就是 树枝 节点
        IBranch developDep = new Branch("刘大瘸子", " 研发 部门 经理", 10000);
        IBranch salesDep = new Branch(" 马 二 拐子", " 销售 部门 经理", 20000);
        IBranch financeDep = new Branch(" 赵 三 驼 子", " 财务 部 经理", 30000); //再把 三个 小组长 产生 出来

        IBranch firstDevGroup = new Branch(" 杨 三 乜 斜", " 开发 一组 组长", 5000);
        IBranch secondDevGroup = new Branch(" 吴 大 棒槌", " 开发 二 组 组长", 6000);

        ILeaf a = new Leaf(" a", " 开发 人员", 2000);
        ILeaf b = new Leaf(" b", " 开发 人员", 2000);
        ILeaf c = new Leaf(" c", " 开发 人员", 2000);
        ILeaf d = new Leaf(" d", " 开发 人员", 2000);
        ILeaf e = new Leaf(" e", " 开发 人员", 2000);
        ILeaf f = new Leaf(" f", " 开发 人员", 2000);
        ILeaf g = new Leaf(" g", " 开发 人员", 2000);
        ILeaf h = new Leaf(" h", " 销售 人员", 5000);
        ILeaf i = new Leaf(" i", " 销售 人员", 4000);
        ILeaf j = new Leaf(" j", " 财务 人员", 5000);
        ILeaf k = new Leaf(" k", " CEO 秘书", 8000);

        ILeaf zhengLaoLiu = new Leaf("郑老六", "研发部副总", 20000);

        ceo.add(developDep);
        ceo.add(salesDep);
        ceo.add(financeDep);

        developDep.add(firstDevGroup);
        developDep.add(secondDevGroup);
        developDep.add(zhengLaoLiu);

        firstDevGroup.add(a);
        firstDevGroup.add(b);
        firstDevGroup.add(c);
        secondDevGroup.add(d);
        secondDevGroup.add(e);
        secondDevGroup.add(f);
        secondDevGroup.add(g);

        salesDep.add(h);
        salesDep.add(i);

        financeDep.add(j);

        ceo.add(k);

        // 打印结果
        System.out.println(ceo.getInfo());

        getAllSubordinateInfo(ceo.getSubordinateInfo());



    }

    private static void getAllSubordinateInfo(ArrayList subordinateList) {
        for (Object obj : subordinateList) {
            if (obj instanceof Leaf) {
                ILeaf employee = (ILeaf)obj;

                System.out.println(employee.getInfo());
            }else{
                IBranch branch  = (IBranch) obj;

                getAllSubordinateInfo(branch.getSubordinateInfo());
            }
        }
    }
}
