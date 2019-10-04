package Command_Patten;

/**
 * @program: HeadFirst_DesignPattern
 * @description: 遥控器关闭命令类
 * @author: ZakL
 * @create: 2019-10-04 15:14
 **/
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
        System.out.println(this.light.getClass().getName() + "关灯成功");
    }

    @Override
    public void undo() {
        light.on();
        System.out.println(this.light.getClass().getName() + "撤销成功");
    }

    @Override
    public Light getLight() {
        return light;
    }
}
