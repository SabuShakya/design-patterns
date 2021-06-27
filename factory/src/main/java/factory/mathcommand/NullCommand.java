package factory.mathcommand;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/06/27
 */
public class NullCommand extends MathCommand {
    @Override
    public Double calculate(Double a, Double b) {
        return -1D;
    }
}
