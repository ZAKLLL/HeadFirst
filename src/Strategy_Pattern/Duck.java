package Strategy_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 用组合代替继承/ 策略模式
 * @author: ZakL
 * @create: 2019-10-02 23:35
 **/
public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public Duck() {
        this(() -> System.out.println("默认的fly"), () -> System.out.println("默认的quack"));
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void quack() {
        this.quackBehavior.quack();
    }

    public void fly() {
        this.flyBehavior.fly();
    }

    abstract void display();
}
