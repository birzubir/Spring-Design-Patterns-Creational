package birzubir.spring.creational.factory.abstracts;

import birzubir.spring.creational.factory.abstracts.bsi.BsiCancelPaymentRequest;
import birzubir.spring.creational.factory.abstracts.bsi.BsiChargePaymentRequest;
import birzubir.spring.creational.factory.abstracts.bsi.BsiGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BsiPaymentFactory implements PaymentFactory{

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new BsiChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new BsiCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new BsiGetBalancePaymentRequest();
    }
}
