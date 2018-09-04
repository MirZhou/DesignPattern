package intermediary;

public class Client {
    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();

        System.out.println("------------采购售货员采购电脑------------");

        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);

        System.out.println("------------销售人员销售电脑------------");
        Sale sale  = new Sale(mediator);
        sale.sellIBMComputer(300);

        System.out.println("------------库房管理人员管理库存------------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
