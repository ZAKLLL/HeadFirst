package Bridge_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 绿色圈的具体实现
 * @author: ZakL
 * @create: 2019-10-10 14:18
 **/
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}
