package TemplateMethod_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-05 16:40
 **/
public class NewTea extends CaffeineBeverage {
    @Override
    public void hook() {
        System.out.println("New Coffee's extends method");
    }

    @Override
    public void addCondiments() {
        System.out.println("add some hamburger");
    }

    @Override
    public void brew() {
        System.out.println("New Tea brew");
    }
}
