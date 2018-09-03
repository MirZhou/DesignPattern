package purchase_sale_stock;

/**
 * 库存管理
 */
public class Stock {
    private static int COMPUTER_NUMBER = 100;

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
        System.out.println("库存数量：" + COMPUTER_NUMBER);

        Purchase purchase = new Purchase();
        Sale sale = new Sale();

        System.out.println("清理存货数量为：" + COMPUTER_NUMBER);

        // 要求折价销售
        sale.offSale();

        // 采购售货员停止采购
        purchase.refuseBuyIBM();
    }
}
