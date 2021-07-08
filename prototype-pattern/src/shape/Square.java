package shape;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/06
 */
public class Square extends Shape {

    public Square() {
        super();
        this.type = "shape.Square";
    }

    @Override
    public void draw() {
        System.out.println("Drawing shape.Square");
    }
}
