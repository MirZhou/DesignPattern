package intermediary;

import java.util.Random;

/**
 * 销售管理
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell", number);

        System.out.println("销售IBM电脑" + number + "台");
    }

    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);

        System.out.println("IBM的电脑销售情况为：" + saleStatus);

        return saleStatus;
    }

    public void offSale() {
        super.mediator.execute("sale.offsell");
    }
}
