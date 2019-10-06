package TemplateMethod_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 模拟咖啡虫泡流程
 * @author: ZakL
 * @create: 2019-10-05 16:27
 **/
public class OldCoffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourlnCup();
        addSugarAndMilk();
    }

    private void addSugarAndMilk() {
        System.out.println("addSugarAndMilk to Coffee");
    }

    private void pourlnCup() {
        System.out.println("pourln Coffee");
    }

    private void brewCoffeeGrinds() {
        System.out.println("brewCoffeeGrinds");
    }

    private void boilWater() {
        System.out.println("boilWater");
    }
}
