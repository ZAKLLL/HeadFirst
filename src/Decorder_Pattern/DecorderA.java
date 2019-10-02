package Decorder_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-03 00:45
 **/
public class DecorderA extends Decorder {

    public DecorderA(Component component) {
        this.component=component;
    }
    @Override
    public void doSomeThing() {
        component.doSomeThing();
        doMyMethond();
    }

    private void doMyMethond() {
        System.out.println("装饰器A");
    }
}
