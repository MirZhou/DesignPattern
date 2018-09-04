package intermediary;

public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        switch (str) {
            case "purchase.buy":
                // 采购电脑
                this.buyComputer((Integer) objects[0]);
                break;
            case "sale.sell":
                // 销售电脑
                this.sellComputer((Integer) objects[0]);
                break;
            case "sale.offsell":
                // 折价销售
                this.offSell();
                break;
            case "stock.clear":
                // 清仓处理
                this.clearStock();
                break;
        }
    }

    // 采购电脑
    private void buyComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();

        if (saleStatus <= 80)
            number /= 2;

        System.out.println("采购IBM电脑：" + number + "台");
        super.stock.increase(number);
    }

    // 销售电脑
    private void sellComputer(int number) {
        if (super.stock.getStockNumber() < number)
            super.purchase.buyIBMComputer(number);

        super.stock.decrease(number);
    }

    // 折价销售
    private void offSell() {
        System.out.println("折价销售IBM电脑" + super.stock.getStockNumber() + "台");
    }

    // 清仓处理
    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }
}
