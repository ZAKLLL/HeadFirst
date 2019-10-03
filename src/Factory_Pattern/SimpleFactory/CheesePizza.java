package Factory_Pattern.SimpleFactory;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-03 12:47
 **/
public class CheesePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("CheesePizza prepare");
    }

    @Override
    void bake() {
        System.out.println("CheesePizza bake");
    }

    @Override
    void cut() {
        System.out.println("CheesePizza cut");
    }

    @Override
    void box() {
        System.out.println("CheesePizza box");
    }
}
