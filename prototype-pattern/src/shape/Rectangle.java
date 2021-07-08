package shape;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/06
 */
public class Rectangle extends Shape {
    public Rectangle() {
        super();
        this.type = "shape.Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle.");
    }
}
