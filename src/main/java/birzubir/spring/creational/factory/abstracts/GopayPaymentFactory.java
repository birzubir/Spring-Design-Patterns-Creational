package birzubir.spring.creational.factory.abstracts;


import birzubir.spring.creational.factory.abstracts.gopay.GopayCancelPaymentRequest;
import birzubir.spring.creational.factory.abstracts.gopay.GopayChargePaymentRequest;
import birzubir.spring.creational.factory.abstracts.gopay.GopayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GopayPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new GopayGetBalancePaymentRequest();
    }
}
