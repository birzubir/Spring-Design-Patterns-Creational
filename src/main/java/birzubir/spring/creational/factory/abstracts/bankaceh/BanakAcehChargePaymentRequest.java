package birzubir.spring.creational.factory.abstracts.bankaceh;

import birzubir.spring.creational.factory.abstracts.ChargePaymentRequest;
import birzubir.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

public class BanakAcehChargePaymentRequest implements ChargePaymentRequest {


    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Autowired
    public Long getFee() {

        return 6000L;
    }

    public PaymentMethod getMethod(){
        return PaymentMethod.BANK_ACEH;
    }
}
