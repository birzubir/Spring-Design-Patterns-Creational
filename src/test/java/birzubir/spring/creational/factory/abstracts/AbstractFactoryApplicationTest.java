package birzubir.spring.creational.factory.abstracts;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = AbstractFactoryApplication.class)
class AbstractFactoryApplicationTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    void testAbstractFactory() {
        PaymentFactory paymentFactoryCreditCard = applicationContext.getBean(CreditCardPaymentFactory.class);
        PaymentFactory paymentFactoryBcaKlikpay = applicationContext.getBean(BcaKlikpayPaymentFactory.class);
        PaymentFactory paymentFactoryGopa = applicationContext.getBean(GopayPaymentFactory.class);
        PaymentFactory paymentFactoryBsi = applicationContext.getBean(BsiPaymentFactory.class);
        PaymentFactory paymentFactoryBni = applicationContext.getBean(BniPaymentFactory.class);
        PaymentFactory paymentFactoryBankAcah = applicationContext.getBean(BankAcehPaymentFactory.class);

        charge(paymentFactoryCreditCard);
        charge(paymentFactoryBcaKlikpay);
        charge(paymentFactoryGopa);
        charge(paymentFactoryBsi);
        charge(paymentFactoryBni);
        charge(paymentFactoryBankAcah);
    }

    public void charge(PaymentFactory paymentFactory){
        ChargePaymentRequest request = paymentFactory.createChargeRequest();
        request.setId("xxx");
        request.setAmount(1000000L);

        // kirim ke payment gateway
        System.out.println(request);
    }

    public void cancel(PaymentFactory paymentFactory){
        CancelPaymentRequest request = paymentFactory.createCancelRequest();
        request.setId("xxx");

        // kirim ke payment gateway
        System.out.println(request);
    }
    public Long getBalance(PaymentFactory paymentFactory){
        try{
            GetBalancePaymentRequest request = paymentFactory.createGetBalanceRequest();
            request.setUserId("birkom");

            System.out.println(request);

            // send to payment gateway
            return 1000L;
        }catch (UnsupportedOperationException exception){
            return 0L;
        }
    }
}