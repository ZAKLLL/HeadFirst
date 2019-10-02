package Strategy_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 测试类
 * @author: ZakL
 * @create: 2019-10-02 23:41
 **/
public class TestDuck extends Duck {

    public TestDuck(FlyBehavior f, QuackBehavior q) {
        super(f, q);
    }

    public TestDuck() {
        super(); //这里不使用super()函数也可以,一定会去调用DUCK的无参构造函数
    }

    @Override
    void display() {
        System.out.println("TestDuck is DisPlay");
    }

    public static void main(String[] args) {
        FlyBehavior flyBehavior = () -> System.out.println("自定义的飞翔");
        QuackBehavior quackBehavior = () -> System.out.println("自定义的呱呱");
        TestDuck testDuck = new TestDuck();
//        TestDuck testDuck = new TestDuck(flyBehavior, quackBehavior);

        testDuck.display();
        testDuck.fly();
        testDuck.quack();
    }
}
