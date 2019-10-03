package Factory_Pattern.SimpleFactory;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-03 12:49
 **/
public class VeggiePizza extends Pizza {
    @Override
    void prepare() {
        System.out.println("VeggiePizza prepare");
    }

    @Override
    void bake() {
        System.out.println("VeggiePizza bake");
    }

    @Override
    void cut() {
        System.out.println("VeggiePizza cut");
    }

    @Override
    void box() {
        System.out.println("VeggiePizza box");
    }
}
