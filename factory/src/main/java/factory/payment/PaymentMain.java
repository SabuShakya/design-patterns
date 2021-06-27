package factory.payment;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/06/27
 */
public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = PaymentFactory.get(PaymentType.ESEWA);
        Object resp = payment.pay(new PaymentRequest("Internet", 500.0));
        System.out.println(resp.toString());
    }
}
