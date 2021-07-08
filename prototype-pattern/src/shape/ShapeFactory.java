package shape;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sabu Shakya
 * @email <sabu.shakya@f1soft.com>
 * @createdDate 2021/07/08
 */
public class ShapeFactory {
    /*prototypes*/
//    private static shape.Shape[] shapes = new shape.Shape[]{
//            new shape.Circle(),
//            new shape.Rectangle()};
//
//    public static shape.Shape getShape(String type) {
//        for (int i = 0; i < shapes.length; i++) {
//            if (shapes[i].getType().equals(type))
//                return (shape.Shape) shapes[i].duplicate();
//
//        }
//        return null;
//    }

    private static final Map<String, Shape> shapeMap = new HashMap();

    /*prototypes map*/
    public static void initializeShapeFactory() {
        Circle circle = new Circle();
        circle.setId(1L);
        shapeMap.put(circle.getType(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId(2L);
        shapeMap.put(rectangle.getType(), rectangle);

        Square square = new Square();
        square.setId(3L);
        shapeMap.put(square.getType(), square);
    }

    /*return clone*/
    public static Shape getShape(String type) {
        Shape shape = shapeMap.get(type);
        return (Shape) shape.clone();
    }

}
