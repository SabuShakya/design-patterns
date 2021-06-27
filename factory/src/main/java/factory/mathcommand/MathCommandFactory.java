package factory.mathcommand;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/06/27
 */
public class MathCommandFactory {

    public static MathCommand get(String operator) {
        MathCommand mathCommand = null;
        switch (operator) {
            case "ADD":
                mathCommand = new AddCommand();
                break;
            case "SUB":
                mathCommand = new SubtractCommand();
                break;
            case "MUL":
                mathCommand = new MultiplyCommand();
                break;
            case "DIV":
                mathCommand = new DivCommand();
                break;
            default:
                mathCommand = new NullCommand();
                break;
        }
        return mathCommand;
    }
}
