package Factory_Pattern.SimpleFactory;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 简单工厂
 * @author: ZakL
 * @create: 2019-10-03 12:44
 **/
public class SimplePizza_Factory {

    Pizza createPizza(String type) {
        switch (type) {
            case "CheesePizza":
                return new CheesePizza();
            case "VeggiePizza":
                return new VeggiePizza();
            default:
                return new Pizza() {
                    @Override
                    void prepare() {
                        System.out.println("DefaultPizza prepare");
                    }

                    @Override
                    void bake() {
                        System.out.println("DefaultPizza bake");
                    }

                    @Override
                    void cut() {
                        System.out.println("DefaultPizza cut");
                    }

                    @Override
                    void box() {
                        System.out.println("DefaultPizza box");
                    }

                    @Override
                    void dispaly() {
                        System.out.println("没有您选择的Pizza,为您提供默认Pizza");
                    }
                };

        }

    }
}
