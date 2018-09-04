package template_method_payment_check;

import java.util.Map;

public class AliPaymentCheckImpl extends PaymentCheck {
    @Override
    boolean checkParam() {
        return true;
    }

    @Override
    String getOrderType() {
        return "order";
    }

    @Override
    Map<String, String> getOrder() {
        return null;
    }

    @Override
    String getCheckResult(boolean flag) {
        if(flag)
            return "success";
        else
            return "failed";
    }
}
