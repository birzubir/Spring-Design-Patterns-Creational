package birzubir.spring.creational.factory.abstracts.bsi;

import birzubir.spring.creational.factory.abstracts.GetBalancePaymentRequest;
import birzubir.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BsiGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    public PaymentMethod getMethod(){
        return PaymentMethod.BSI;
    }
}
