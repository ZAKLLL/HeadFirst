package Singleton_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 双重检查模式
 * @author: ZakL
 * @create: 2019-10-03 00:12
 **/
public class SingletonObject {
    //使用volatile防止重排序
    private volatile static SingletonObject singletonObject;

    private SingletonObject() {

    }

    //double check
    public static SingletonObject getSingletonObject() {
        if (singletonObject == null) {
            synchronized (SingletonObject.class) {
                singletonObject = new SingletonObject();
            }
        }
        return singletonObject;
    }

}
