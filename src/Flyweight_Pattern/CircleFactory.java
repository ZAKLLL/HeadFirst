package Flyweight_Pattern;

import java.util.HashMap;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-06 15:14
 **/
public class CircleFactory {
    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String color) {
        synchronized (CircleFactory.class) {
            Shape shape = shapeMap.get(color);
            if (shape != null) return shape;
            shape = new Circle(color);
            shapeMap.put(color, shape);
            return shape;
        }
    }

    public static int getInstanceCount() {
        return shapeMap.keySet().size();
    }
}
