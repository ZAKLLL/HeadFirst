package Decorder_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-03 00:48
 **/
public class DecorderB extends Decorder {

    public DecorderB(Component component) {
        this.component = component;
    }

    @Override
    public void doSomeThing() {
        component.doSomeThing();
        doMyMethond();
    }

    private void doMyMethond() {
        System.out.println("装饰器B");

    }
}
