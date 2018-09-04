package template_method_payment_check;

public class Client {
    public static void main(String[] args) {
        PaymentCheck aliPaymentCheck = new AliPaymentCheckImpl();
        PaymentCheck weixinPaymentCheck = new WeixinPaymentCheckImpl();

        System.out.println("=======支付宝支付检测=====");
        System.out.println("检测结果：" + aliPaymentCheck.execute());

        System.out.println("=======微信支付检测=====");
        System.out.println("检测结果：" + weixinPaymentCheck.execute());
    }
}
