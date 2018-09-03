package purchase_sale_stock;

import java.util.Random;

/**
 * 销售管理
 */
public class Sale {
    public void sellIBMComputer(int number) {
        Stock stock = new Stock(); // 访问库存

        Purchase purchase = new Purchase(); // 访问采购

        if (stock.getStockNumber() < number) {
            // 库存数量不够，需要采购
            purchase.buyIBMComputer(number);
        }

        System.out.println("销售IBM电脑" + number + "台");
    }

    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);

        System.out.println("IBM的电脑销售情况为：" + saleStatus);

        return saleStatus;
    }

    public void offSale() {
        Stock stock = new Stock();

        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");

    }
}
