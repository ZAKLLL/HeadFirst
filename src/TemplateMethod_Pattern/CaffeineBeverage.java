package TemplateMethod_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 咖啡因模板抽象类
 * @author: ZakL
 * @create: 2019-10-05 16:32
 **/
public abstract class CaffeineBeverage {
    final void prepareRecipe() {

        boilWater();
        brew();
        pourInCup();
        addCondiments();
        hook(); //钩子函数，由实现类自定义进行功能扩展用
    }

    public abstract void hook();

    //对于不同实现类对应的某些不同操作，提供抽象方法，由子类自行定制
    public abstract void addCondiments();

    public abstract void brew();

    //将两个类重复的代码部分在模板方法中先进行实现，避免具体实现类重复实现
    private void pourInCup() {
        System.out.println("pourInCup");
    }

    private void boilWater() {
        System.out.println("boilWater");
    }


}
