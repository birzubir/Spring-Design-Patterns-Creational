package birzubir.spring.creational.factory.abstracts.bankaceh;

import birzubir.spring.creational.factory.abstracts.GetBalancePaymentRequest;
import birzubir.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;

public class BnakAcehGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    public PaymentMethod getMethod(){

        return PaymentMethod.BANK_ACEH;
    }
}
