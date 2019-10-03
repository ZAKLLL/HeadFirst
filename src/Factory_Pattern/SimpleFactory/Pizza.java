package Factory_Pattern.SimpleFactory;

/**
 * @program: HeadFirst_DesignPattern
 * @description:
 * @author: ZakL
 * @create: 2019-10-03 12:45
 **/
public abstract class Pizza {
    abstract void prepare();

    abstract void bake();

    abstract void cut();

    abstract void box();

    void dispaly() {
        System.out.println("This is your pizza Thx");
    }

}
