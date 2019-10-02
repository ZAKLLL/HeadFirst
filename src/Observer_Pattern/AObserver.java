package Observer_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 观察者A
 * @author: ZakL
 * @create: 2019-10-02 23:56
 **/
public class AObserver extends Observer {

    public AObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("AObserver观察到订阅者状态发生变化:" + lastState + "-->" + subject.getI());
        lastState = subject.getI();
    }
}
