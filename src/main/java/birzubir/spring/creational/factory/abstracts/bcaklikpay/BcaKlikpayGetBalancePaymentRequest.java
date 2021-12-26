package birzubir.spring.creational.factory.abstracts.bcaklikpay;

import birzubir.spring.creational.factory.abstracts.GetBalancePaymentRequest;
import birzubir.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BcaKlikpayGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    public PaymentMethod getMethod(){
        return PaymentMethod.BCA_KLIKPAY;
    }
}
