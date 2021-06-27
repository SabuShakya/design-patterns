package factory.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/06/27
 */
@Getter
@Setter
@AllArgsConstructor
public class PaymentRequest {

    private String product;

    private Double amount;
}
