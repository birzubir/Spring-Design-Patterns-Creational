package birzubir.spring.creational.factory.abstracts.creditcard;

import birzubir.spring.creational.factory.abstracts.ChargePaymentRequest;
import birzubir.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

public class CreditCardChargePaymentRequest implements ChargePaymentRequest {


    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Autowired
    public Long getFee() {
        return getAmount() * 5 / 100;
    }

    public PaymentMethod getMethod(){
        return PaymentMethod.CREDIT_CARD;
    }
}
