package birzubir.spring.creational.factory.abstracts.gopay;

import birzubir.spring.creational.factory.abstracts.ChargePaymentRequest;
import birzubir.spring.creational.factory.abstracts.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

public class GopayChargePaymentRequest implements ChargePaymentRequest {


    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Autowired
    public Long getFee() {
        return 1000L;
    }

    public PaymentMethod getMethod(){
        return PaymentMethod.GOPAY;
    }
}
