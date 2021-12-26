package birzubir.spring.creational.factory.abstracts;

import birzubir.spring.creational.factory.abstracts.bni.BniCancelPaymentRequest;
import birzubir.spring.creational.factory.abstracts.bni.BniChargePaymentRequest;
import birzubir.spring.creational.factory.abstracts.bni.BniGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BniPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new BniChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new BniCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new BniGetBalancePaymentRequest();
    }
}
