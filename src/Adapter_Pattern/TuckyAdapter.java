package Adapter_Pattern;

import Strategy_Pattern.Duck;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-04 16:22
 **/
public  class TuckyAdapter implements MyDuck {

    private Tucky tucky;

    public TuckyAdapter(Tucky tucky) {
        this.tucky = tucky;
    }

    @Override
    public void fly() {
        tucky.fly();
    }

    @Override
    public void swim() {
        tucky.run();
    }
}
