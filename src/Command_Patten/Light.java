package Command_Patten;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 模拟灯泡具有开启和关闭的功能
 * @author: ZakL
 * @create: 2019-10-04 15:09
 **/
public class Light {
    private static boolean isOn = false;

    public void on() {
        isOn = true;
    }

    public void off() {
        isOn = false;
    }

    public boolean getLightState() {
        return isOn;
    }
}
