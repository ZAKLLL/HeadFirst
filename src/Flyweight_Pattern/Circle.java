package Flyweight_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-06 15:04
 **/
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        System.out.println(color+"的Circle被创建");
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.format("Color: %s, X: %d ,y: %d ,radius: %d", color, x, y, radius);
    }

}
