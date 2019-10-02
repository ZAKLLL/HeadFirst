package Singleton_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 使用枚举的方式
 * @author: ZakL
 * @create: 2019-10-03 00:20
 **/
public class Singleton_ByEnum {
    private Singleton_ByEnum() {

    }

    private enum Singleton {
        INSTANCE;

        private final Singleton_ByEnum singleton_byEnum;

        Singleton() {
            singleton_byEnum = new Singleton_ByEnum();
        }
    }

    public Singleton_ByEnum getInstance() {
        return Singleton.INSTANCE.singleton_byEnum;
    }
}
