package Decorder_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-03 00:49
 **/
public class DecorderTest {
    public static void main(String[] args) {
        Component component = new DecorderB(new DecorderA(() -> System.out.println("被装饰的真正的方法")));
        component.doSomeThing();
    }
}
