package Singleton_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-03 00:16
 **/
public class SingletonObject_byStaticClass {

    private SingletonObject_byStaticClass() {

    }

    private static class InstanceHolder {
        private static final SingletonObject_byStaticClass singletonObject_byStaticClass = new SingletonObject_byStaticClass();
    }

    public SingletonObject_byStaticClass getInstance() {
        return InstanceHolder.singletonObject_byStaticClass;
    }

}
