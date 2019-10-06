package TemplateMethod_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-05 16:38
 **/
public class NewCoffee extends CaffeineBeverage {
    @Override
    public void hook() {
        //do Nothing
    }

    @Override
    public void addCondiments() {
        System.out.println("添加一些可乐");
    }

    @Override
    public void brew() {
        System.out.println("NewCoffee brew");
    }
}
