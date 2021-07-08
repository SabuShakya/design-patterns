import shape.Shape;
import shape.ShapeFactory;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/06
 */
public class ProtoMain {
    public static void main(String[] args) {
        /*by implementing Cloneable interface */
        ShapeFactory.initializeShapeFactory();
        Shape circle = ShapeFactory.getShape("shape.Circle");
        circle.setId(5L);
        Shape rectangle = ShapeFactory.getShape("shape.Rectangle");
        rectangle.draw();

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());

        /*custom clone implementation*/
        Human human1 = new Human("Erwan", "Le Tutour", 30);

        Human human2 = (Human) human1.clone();
    }
}
