package birzubir.spring.creational.factory.abstracts.bni;

import birzubir.spring.creational.factory.abstracts.CancelPaymentRequest;
import birzubir.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BniCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod(){
        return PaymentMethod.BNI;
    }
}
