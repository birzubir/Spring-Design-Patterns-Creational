package birzubir.spring.creational.factory.abstracts;

import birzubir.spring.creational.factory.abstracts.bankaceh.BanakAcehChargePaymentRequest;
import birzubir.spring.creational.factory.abstracts.bankaceh.BankAcehCancelPaymentRequest;
import birzubir.spring.creational.factory.abstracts.bankaceh.BnakAcehGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankAcehPaymentFactory implements PaymentFactory {

    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new BanakAcehChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new BankAcehCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new BnakAcehGetBalancePaymentRequest();
    }
}
