package purchase_sale_stock;

public class Client {
    public static void main(String[] args) {
        System.out.println("------------采购售货员采购电脑------------");

        Purchase purchase = new Purchase();
        purchase.buyIBMComputer(5);

        // 销售人员销售电脑
        Sale sale  = new Sale();
        sale.sellIBMComputer(300);

        // 库房管理人员管理库存
        Stock stock = new Stock();
        stock.clearStock();
    }
}
