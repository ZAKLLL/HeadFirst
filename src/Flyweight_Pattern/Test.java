package Flyweight_Pattern;

import java.util.concurrent.CountDownLatch;
import java.util.stream.IntStream;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-06 15:19
 **/
/*
   需要注意的是遮掩这样获得的实例中对该实例进行操作可能会引发原子性问题
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(10);
        IntStream.range(0, 10).forEach(i -> new Thread(() -> {
            CircleFactory.getShape("BLUE");
            CircleFactory.getShape("RED");
            CircleFactory.getShape("ORANGE");
            countDownLatch.countDown();
        }).start());
        countDownLatch.await();
        System.out.println("------------------");
        System.out.println(CircleFactory.getInstanceCount());
    }


}
