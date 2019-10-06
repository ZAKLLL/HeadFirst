package Adapter_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 模拟测试用一直火鸡模拟为一只鸭被目标类调用
 * @author: ZakL
 * @create: 2019-10-05 16:21
 **/
public class Test {
    private MyDuck myDuck;

    public Test(MyDuck myDuck) {
        this.myDuck = myDuck;
    }

    public void doSomeThing() {
        myDuck.fly();
        myDuck.swim();
    }

    public static void main(String[] args) {
        new Test(new TuckyAdapter(new Tucky() {
            @Override
            public void fly() {
                System.out.println("Tucky is Flying");
            }

            @Override
            public void run() {
                System.out.println("Tucky is Running");
            }
        })).doSomeThing();
    }

}
