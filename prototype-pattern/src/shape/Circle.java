package shape;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/06
 */
public class Circle extends Shape {

    public Circle() {
        super();
        this.type = "shape.Circle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}
