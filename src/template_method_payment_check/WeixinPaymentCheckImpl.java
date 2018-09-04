package template_method_payment_check;

import java.util.Map;

public class WeixinPaymentCheckImpl extends PaymentCheck {
    @Override
    boolean checkParam() {
        return false;
    }

    @Override
    String getOrderType() {
        return "recharge";
    }

    @Override
    Map<String, String> getOrder() {
        return null;
    }

    @Override
    String getCheckResult(boolean flag) {
        if (flag)
            return "<xml><return_code>SUCCESS</return_code></xml>";
        else
            return "<xml><return_code>FAIL</return_code><return_msg>校验失败</return_msg></xml>";
    }
}
