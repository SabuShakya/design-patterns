package factory.payment;

import static factory.payment.PaymentType.*;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/06/27
 */
public class PaymentFactory {

    public static Payment get(PaymentType paymentType) {
        switch (paymentType) {
            case ESEWA:
                return new EsewaPayment();
            default:
                return new EsewaPayment();
        }
    }
}
