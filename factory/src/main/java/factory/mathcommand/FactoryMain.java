package factory.mathcommand;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/06/27
 */
public class FactoryMain {
    public static void main(String[] args) {
        String operator = "ADD";
        Double operand1 = 2.0;
        Double operand2 = 3.0;
        MathCommand mathCommand = MathCommandFactory.get(operator);

        Double result = mathCommand.calculate(operand1, operand2);
        System.out.println(result);
    }
}
