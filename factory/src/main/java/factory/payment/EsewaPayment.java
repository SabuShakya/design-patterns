package factory.payment;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/06/27
 */
public class EsewaPayment extends Payment {

    @Override
    public Object pay(PaymentRequest paymentRequest) {
        return "Esewa payment for : " + paymentRequest.getProduct() + " of amount: " + paymentRequest.getAmount();
    }
}
