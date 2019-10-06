package TemplateMethod_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 模拟茶叶冲泡流程
 * @author: ZakL
 * @create: 2019-10-05 16:31
 **/
public class OldTea {
    void prepareRecipe() {
        boilWater();
        steepTeaBag();
        pourInCup();
        addLemon();
    }

    void boilWater() {
        System.out.println("Bolling water");
    }

    void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    void addLemon() {
        System.out.println("Adding Lemon");
    }


}
