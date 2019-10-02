package Observer_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-02 23:50
 **/
public abstract class Observer {
    Subject subject;
    int lastState = 0;
    abstract void update();

}
