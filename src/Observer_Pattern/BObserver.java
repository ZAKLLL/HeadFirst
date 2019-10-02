package Observer_Pattern;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-03 00:00
 **/
public class BObserver extends Observer {
    public BObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void update() {
        System.out.println("BObserver观察到订阅者状态发生变化:" + lastState + "-->" + subject.getI());
        lastState = subject.getI();
    }
}
