package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 订阅者
 * @author: ZakL
 * @create: 2019-10-02 23:49
 **/
public class Subject {
    List<Observer> observers = new ArrayList<>();
    private int i = 0;

    public void setI(int i) {
        this.i = i;
        //通知订阅者
        notifyAllObservers();
    }

    public int getI() {
        return i;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    private void notifyAllObservers() {
        observers.forEach(Observer::update);
    }

}
