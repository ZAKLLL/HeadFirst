package Factory_Pattern.SimpleFactory;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 简单披萨商店
 * @author: ZakL
 * @create: 2019-10-03 12:52
 **/
public abstract class SimplePizzaStone {

    private SimplePizza_Factory simplePizza_factory;

    public SimplePizzaStone(SimplePizza_Factory simplePizza_factory) {
        this.simplePizza_factory = simplePizza_factory;
    }

    public void orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.dispaly();
        pizza.bake();
        pizza.box();
        pizza.cut();
        pizza.prepare();
    }

    Pizza createPizza(String type) {
        return simplePizza_factory.createPizza(type);
    }

}
