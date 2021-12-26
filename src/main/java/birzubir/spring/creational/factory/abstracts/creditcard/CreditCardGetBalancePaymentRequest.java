package birzubir.spring.creational.factory.abstracts.creditcard;

import birzubir.spring.creational.factory.abstracts.GetBalancePaymentRequest;
import birzubir.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class CreditCardGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    public PaymentMethod getMethod(){
        return PaymentMethod.CREDIT_CARD;
    }
}
