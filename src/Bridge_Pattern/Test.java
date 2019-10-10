package Bridge_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-10 14:25
 **/
public class Test {
    public static void main(String[] args) {
        Shape greenShape = new Circle(1, 2, 3, new GreenCircle());
        Shape redShape = new Circle(1, 2, 3, new RedCircle());
        greenShape.draw();
        redShape.draw();
    }
}
