package birzubir.spring.creational.factory.abstracts.bcaklikpay;

import birzubir.spring.creational.factory.abstracts.CancelPaymentRequest;
import birzubir.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BcaKlikpayCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod(){

        return PaymentMethod.BCA_KLIKPAY;
    }
}
