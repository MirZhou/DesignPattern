package template_method_payment_check;

import java.util.Map;

public abstract class PaymentCheck {
    // 参数检测
    abstract boolean checkParam();

    // 获取订单类型
    abstract String getOrderType();

    // 获取订单
    abstract Map<String, String> getOrder();

    abstract String getCheckResult(boolean flag);

    /**
     * 执行检测
     *
     * @return 检测结果
     */
    public String execute() {
        boolean flag = this.checkParam();

        if (flag) {
            String orderType = this.getOrderType();

            if ("RECHARGE".equalsIgnoreCase(orderType)) {
                // 充值单
                Map<String,String> rechargeOrder = this.getOrder();
            } else {
                // 订单
                Map<String,String> order = this.getOrder();
            }

        }

        return this.getCheckResult(flag);
    }
}