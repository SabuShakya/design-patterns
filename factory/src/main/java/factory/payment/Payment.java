package factory.payment;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/06/27
 */
public abstract class Payment {

    public abstract Object pay(PaymentRequest paymentRequest);
}
