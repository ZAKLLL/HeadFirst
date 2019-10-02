package Observer_Pattern;

import java.util.stream.IntStream;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-03 00:01
 **/
public class Test {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new AObserver(subject);
        new BObserver(subject);

        IntStream.range(0, 10).forEach(i->{
            subject.setI(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

}
