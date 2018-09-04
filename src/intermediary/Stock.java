package intermediary;

/**
 * 库存管理
 */
public class Stock extends AbstractColleague {
    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator _mediator) {
        super(_mediator);
    }

    // 增加库存
    public void increase(int number) {
        COMPUTER_NUMBER += number;

        System.out.println("库存数量：" + COMPUTER_NUMBER);
    }

    // 减少库存
    public void decrease(int number) {
        COMPUTER_NUMBER -= number;

        System.out.println("库存数量：" + COMPUTER_NUMBER);

    }

    // 获得库存数量
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    // 清空库存
    public void clearStock() {
        System.out.println("清理存货数量为：" + COMPUTER_NUMBER);

        super.mediator.execute("stock.clear", COMPUTER_NUMBER);
    }
}
